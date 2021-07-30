function solution(records) {
  const messages = [];
  const idMemo = {};

  records.forEach((record) => {
    const [action, id, nickname] = record.split(" ");
    const memoId = idMemo[id];

    if (action === "Enter") {
      if (memoId) {
        const prevNickname = memoId.nickname;
        memoId.nickname = nickname;

        changeNickname(memoId.indexes, messages, prevNickname, nickname);

        memoId.indexes.push(messages.length);
      } else {
        idMemo[id] = { nickname, indexes: [messages.length] };
      }

      messages.push(`${nickname}님이 들어왔습니다.`);
    } else if (action === "Leave") {
      memoId.indexes.push(messages.length);
      messages.push(`${memoId.nickname}님이 나갔습니다.`);
    } else if (action === "Change") {
      const prevNickname = memoId.nickname;
      memoId.nickname = nickname;

      changeNickname(memoId.indexes, messages, prevNickname, nickname);
    }
  });

  return messages;
}

function changeNickname(indexes, messages, prevName, newName) {
  indexes.forEach((index) => {
    messages[index] = messages[index].replace(prevName, newName);
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

// function solution(records) {
//   const messages = [];
//   const idMemo = {};

//   records.forEach((record, index) => {
//     const [action, id, nickname] = record.split(" ");
//     const memoId = idMemo[id];

//     if (action === "Enter") {
//       if (memoId) {
//         const prevNickname = memoId.nickname;
//         memoId.nickname = nickname;

//         changeNickname(memoId.indexes, messages, prevNickname, nickname);

//         memoId.indexes.push(index);
//       } else {
//         idMemo[id] = { nickname, indexes: [index] };
//       }

//       messages.push(`${nickname}님이 들어왔습니다.`);
//     } else if (action === "Leave") {
//       memoId.indexes.push(index);
//       messages.push(`${memoId.nickname}님이 나갔습니다.`);
//     } else if (action === "Change") {
//       const prevNickname = memoId.nickname;
//       memoId.nickname = nickname;

//       changeNickname(memoId.indexes, messages, prevNickname, nickname);

//       memoId.indexes.push(index);
//     }
//   });

//   return messages;
// }

// function changeNickname(indexes, messages, prevName, newName) {
//   indexes.forEach((index) => {
//     messages[index] = messages[index].replace(prevName, newName);
//   });
// }
