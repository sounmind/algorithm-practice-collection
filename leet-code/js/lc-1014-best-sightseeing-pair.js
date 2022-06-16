/**
 * @param {number[]} values
 * @return {number}
 */
var maxScoreSightseeingPair = function (values) {
  let maxScore = 0;
  let bestSightseeingSpotSoFar = 0;

  values.forEach((value) => {
    maxScore = Math.max(maxScore, bestSightseeingSpotSoFar + value);
    bestSightseeingSpotSoFar = Math.max(bestSightseeingSpotSoFar, value) - 1;
  });

  return maxScore;
};
