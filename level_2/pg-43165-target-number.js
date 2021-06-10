function solution(numbers, target) {
  const container = [0];
  let treeIndex = 0;
  let numIndex = 0;

  function makeTree(treeIndex, numIndex) {
    if (numIndex === numbers.length) {
      return;
    }

    if (container[treeIndex * 2 + 1] === undefined) {
      container[treeIndex * 2 + 1] = container[treeIndex] - numbers[numIndex];
      makeTree(treeIndex * 2 + 1, numIndex + 1);
    }

    if (container[treeIndex * 2 + 2] === undefined) {
      container[treeIndex * 2 + 2] = container[treeIndex] + numbers[numIndex];
      makeTree(treeIndex * 2 + 2, numIndex + 1);
    }
  }

  makeTree(treeIndex, numIndex);

  return container
    .slice(Math.pow(2, numbers.length))
    .filter((num) => num === target).length;
}

console.log(solution([1, 1, 1, 1, 1], 3) === 5);
