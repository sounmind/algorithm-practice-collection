function solution(orders, course) {
  const counter = {};

  let courseIndex = 0;
  while (courseIndex !== course.length) {
    const courseLength = course[courseIndex++];
    console.log("course length:", courseLength);

    let orderIndex = 0;
    while (orderIndex !== orders.length) {
      const currentOrder = orders[orderIndex++];
      console.log("current order:", currentOrder);

      for (let i = 0; i <= currentOrder.length - courseLength; i++) {
        const currentCourse = currentOrder
          .slice(i, i + courseLength)
          .split("")
          .sort()
          .join("");
        console.log(currentCourse);

        if (counter[currentCourse]) {
          counter[currentCourse] += 1;
        } else {
          counter[currentCourse] = 1;
        }
      }
    }
  }

  console.log(counter);
}

console.log(
  solution(["ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH"], [2, 3, 4])
); // 

// console.log(solution(["XYZ", "XWY", "WXA"], [2, 3, 4])); // ["WX", "XY"]

// console.log(
//   solution(["ABCDE", "AB", "CD", "ADE", "XYZ", "XYZ", "ACD"], [2, 3, 5])
// ); // ["ACD", "AD", "ADE", "CD", "XYZ"]

console.log(solution(["XYZ", "XWY", "WXA"], [2, 3, 4])); // ["XYZ", "XWY", "WXA"], [2, 3, 4]
