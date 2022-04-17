/**
 * @param {number[]} prices
 * @return {number}
 */
var maxProfit = function(prices) {
  // NOTE: add profit whenever the price grow more than before. And then its sum will be maxProfit
  let maxProfit = 0;
  let previousPrice = prices[0];

  for (let i = 1; i < prices.length; i++) {
    const currentPrice = prices[i];
    const profit = currentPrice - previousPrice;

    if (profit > 0) {
      maxProfit += profit;
    }

    previousPrice = prices[i];
  }

  return maxProfit;
};