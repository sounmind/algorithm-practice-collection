function solution(records) {
  const messages = [];
  const idMemo = {};

  records.forEach((record) => {
    const [action, id, nickname] = record.split(" ");

    if (action === "Enter") {
      if (idMemo[id]) {
        const prevNickname = idMemo[id];
        idMemo[id] = nickname;
        changeNickname(messages, id, prevNickname, nickname);
        messages.push({ id, message: `${nickname}님이 들어왔습니다.` });
      } else {
        messages.push({ id, message: `${nickname}님이 들어왔습니다.` });
        idMemo[id] = nickname;
      }
    } else if (action === "Leave") {
      messages.push({ id, message: `${idMemo[id]}님이 나갔습니다.` });
    } else if (action === "Change") {
      const prevNickname = idMemo[id];
      idMemo[id] = nickname;
      changeNickname(messages, id, prevNickname, nickname);
    }
  });

  return messages.map((messageObj) => messageObj.message);
}

function changeNickname(array, id, prevName, newName) {
  array.forEach((messageObj) => {
    if (messageObj.id === id) {
      messageObj.message = messageObj.message.replace(prevName, newName);
    }
  });
}

console.log(
  solution([
    "Enter uid1234 Muzi",
    "Enter uid4567 Prodo",
    "Leave uid1234",
    "Enter uid1234 Prodo",
    "Change uid4567 Ryan",
  ])
);

// [
//   "Prodo님이 들어왔습니다.",
//   "Ryan님이 들어왔습니다.",
//   "Prodo님이 나갔습니다.",
//   "Prodo님이 들어왔습니다.",
// ];
