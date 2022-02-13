/**
 * @param {number[]} difficulty
 * @param {number[]} profit
 * @param {number[]} worker
 * @return {number}
 */
var maxProfitAssignment = function(difficulty, profit, worker) {
    let n = difficulty.length;
    let sum = 0;
    
    for (const w of worker) {
        let max = 0;
        
        for (let i = 0; i < n; i++) {
            if (difficulty[i] > w) continue;
            
            max = Math.max(max, profit[i]);
        }
        sum += max;
    }
    
    return sum;
};
