function solution(k, scores) {
  const announcedResults = [];
  let honorGround = [];

  for (let i = 0; i < scores.length; i++) {
    const score = scores[i];

    honorGround.push(score);
    honorGround = honorGround.sort((a, b) => b - a).slice(0, k);
    announcedResults.push(honorGround.at(-1));
  }

  return announcedResults;
}

console.log(solution(3, [10, 100, 20, 150, 1, 100, 200])); // [10, 10, 10, 20, 20, 100, 100]
console.log(solution(4, [0, 300, 40, 300, 20, 70, 150, 50, 500, 1000])); // [0, 0, 0, 0, 20, 40, 70, 70, 150, 300]
