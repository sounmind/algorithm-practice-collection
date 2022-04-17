// file = head, number, tail(possibly contains number)
// 1) head 기준으로 사전 순으로 정렬, 대소문자 구분 없음
// 2) head가 같을 경우, number의 숫자 순으로 정렬, 숫자 앞의 0은 무시되며 012와 12는 같은 값
// 3) head, number가 같은 경우, 원래 입력에 주어진 순서를 유지한다.

function solution(files) {
  const splittedFiles = [...files].map(getSplittedFileName);

  splittedFiles.sort(([headA, numStrA], [headB, numStrB]) => {
    if (headA.toLowerCase() < headB.toLowerCase()) {
      return -1;
    }

    if (headA.toLowerCase() > headB.toLowerCase()) {
      return 1;
    }

    return Number(numStrA) - Number(numStrB);
  });

  return splittedFiles.map((splittedFile) => splittedFile.join(""));
}

function getSplittedFileName(fileName) {
  let [head, numStr, tail] = ["", "", ""];
  let hasNumberStarted = false;

  for (let i = 0; i < fileName.length; i++) {
    const char = fileName[i];

    if (char !== " " && !Number.isNaN(Number(char))) {
      hasNumberStarted = true;
      numStr += char;
    } else if (hasNumberStarted) {
      tail = fileName.slice(i);
      break;
    } else {
      head += char;
    }
  }

  return [head, numStr, tail];
}

console.log(
  solution([
    "img12.png",
    "img10.png",
    "img02.png",
    "img1.png",
    "IMG01.GIF",
    "img2.JPG",
  ])
); // ["img1.png", "IMG01.GIF", "img02.png", "img2.JPG", "img10.png", "img12.png"]

console.log(
  solution([
    "F-5 Freedom Fighter",
    "B-50 Superfortress",
    "A-10 Thunderbolt II",
    "F-14 Tomcat",
  ])
); // 	["A-10 Thunderbolt II", "B-50 Superfortress", "F-5 Freedom Fighter", "F-14 Tomcat"]

console.log(solution(["a13", "A012", "A0011", "A10.txt", "a9.txc"]));
console.log(solution(["MUZI01.zip", "muzi1.png"]));
console.log(
  solution(["muzi00000.txt", "MUZI0.txt", "muzi000.txt", "muzi0.TXT"])
);
console.log(solution(["muzi2, MIZI2"]));
