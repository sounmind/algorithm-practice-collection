/**
 * @param {number[]} difficulty
 * @param {number[]} profit
 * @param {number[]} worker
 * @return {number}
 */
var maxProfitAssignment = function (difficulties, profits, workerCapabilities) {
  const profitAndDifficulty = [...profits].map((profit, index) => [
    profit,
    difficulties[index],
  ]);
  const sortedProfitAndDifficulty = [...profitAndDifficulty].sort(
    (a, b) => b[0] - a[0]
  );
  const sortedWorkerCapabilities = workerCapabilities.sort((a, b) => b - a);
  const workLength = sortedProfitAndDifficulty.length;
  const workerLength = workerCapabilities.length;

  let totalProfit = 0;
  let workIndex = 0;
  let workerIndex = 0;

  while (workIndex < workLength && workerIndex < workerLength) {
    const workerCapability = sortedWorkerCapabilities[workerIndex];
    const work = sortedProfitAndDifficulty[workIndex];
    const [workProfit, workDifficulty] = work;

    if (workDifficulty > workerCapability) {
      workIndex += 1;
    } else {
      totalProfit += workProfit;
      workerIndex += 1;
    }
  }

  return totalProfit;
};
