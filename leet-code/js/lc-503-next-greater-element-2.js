/**
 * @param {number[]} nums
 * @return {number[]}
 */
 var nextGreaterElements = function(nums) {
   const merged = [...nums, ...nums];
   const result = [];

   for (let i = 0; i < nums.length; i++) {
     const current = nums[i];
     const position = nums.indexOf(current);

     let hasFound = false;
     for (let j = position + 1; j < merged.length; j++) {
      if (current < merged[j]) {
        hasFound = true;
        nums[i] = Number.MIN_VALUE;
        result.push(merged[j]);
        break;
      }
     }

     if (hasFound === false) {
       result.push(-1);
     }
   }

   return result;
};

console.log(nextGreaterElements([100,1,11,1,120,111,123,1,-1,-100]));
// [120,11,120,120,123,123,-1,100,100,100]
