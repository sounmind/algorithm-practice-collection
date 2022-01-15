function countBattleships (board: string[][]): number {
  const [rowLength, colLength] = [board.length, board[0].length];
  let count = 0;

  for (let i = 0; i < rowLength; i++) {
    for (let j = 0; j < colLength; j++) {
      const cell = board[i][j];
      const rightCell = board?.[i + 1]?.[j];
      const bottomCell = board[i]?.[j + 1];

      if (cell === "X") {

        if (rightCell && rightCell === "X") {
          continue;
        }

        if (bottomCell && bottomCell === "X") {
          continue;
        }

        count += 1;
      }
    }
  }

  return count;
}
