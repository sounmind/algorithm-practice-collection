// 1번부터 번호 순서대로 한 사람씩 차례대로 단어를 말합니다.
// 마지막 사람이 단어를 말한 다음에는 다시 1번부터 시작합니다.
// 앞사람이 말한 단어의 마지막 문자로 시작하는 단어를 말해야 합니다.
// 이전에 등장했던 단어는 사용할 수 없습니다.
// 한 글자인 단어는 인정되지 않습니다.

function solution(n, words) {
  const answer = [];
  let round = 1;

  for (let i = 0; i < worlds.length; i++) {
    if (i % n === 0) {
      round += 1;
    }
  }

  return answer; // 가장 먼저 탈락하는 사람의 번호, 그 사람이 자신의 몇 번째 차례에 탈락하는지
}

console.log(solution(3, [
  "tank", "kick", "know", "wheel", "land", 
  "dream", "mother", "robot", "tank"
])); // [3, 3]

console.log(solution(5, [
  "hello", "observe", "effect", "take", 
  "either", "recognize", "encourage", "ensure", 
  "establish", "hang", "gather", "refer", 
  "reference", "estimate", "executive"
])); // [0, 0]

console.log(solution(2, [
  "hello", "one", "even", "never",
  "now", "world", "draw"
])) // [1, 3]