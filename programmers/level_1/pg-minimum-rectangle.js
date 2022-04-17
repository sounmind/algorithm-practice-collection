function solution(sizes) {
  const widths = [sizes[0][0]];
  const heights = [sizes[0][1]];

  for (let i = 1; i < sizes.length; i++) {
    const [width, height] = sizes[i];

    const maxWidth = Math.max(...widths, width);
    const maxHeight = Math.max(...heights, height);
    const reversedMaxWidth = Math.max(...widths, height);
    const reversedMaxHeight = Math.max(...heights, width);

    if (maxWidth * maxHeight < reversedMaxWidth * reversedMaxHeight) {
      widths.push(width);
      heights.push(height);
    } else {
      widths.push(height);
      heights.push(width);
    }
  }

  return Math.max(...widths) * Math.max(...heights);
}

console.log(
  solution([
    [60, 50],
    [30, 70],
    [60, 30],
    [80, 40],
  ]) === 4000
);

console.log(
  solution([
    [10, 7],
    [12, 3],
    [8, 15],
    [14, 7],
    [5, 15],
  ]) === 120
);

console.log(
  solution([
    [14, 4],
    [19, 6],
    [6, 16],
    [18, 7],
    [7, 11],
  ]) === 133
);
