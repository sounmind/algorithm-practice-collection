function solution(orders, course) {
  const counter = {};
  const result = [];

  orders.forEach((order) => {
    makeCombinations(order)
      .filter((combi) => combi.length >= 2)
      .forEach((combi) => {
        combi = [...combi].sort().join("");
        counter[combi] ? (counter[combi] += 1) : (counter[combi] = 1);
      });
  });

  course.forEach((courseLength) => {
    const combinations = Object.keys(counter).filter(
      (key) => key.length === courseLength
    );

    const maxOrderCount = Math.max(
      ...combinations.map((combi) => counter[combi])
    );

    if (maxOrderCount < 2) {
      return;
    }

    combinations.forEach((combi) => {
      if (counter[combi] === maxOrderCount) {
        result.push(combi);
      }
    });
  });

  console.log(counter);

  return result.sort();
}

function makeCombinations(string) {
  const result = [];
  let index = 0;

  while (index < string.length) {
    const char = string.charAt(index);
    const container = [char];

    for (const combi of result) {
      container.push(combi + char);
    }

    result.push(...container);

    index += 1;
  }

  return result;
}

console.log(
  solution(["ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH"], [2, 3, 4])
); // ["AC", "ACDE", "BCFG", "CDE"]

console.log(solution(["XYZ", "XWY", "WXA"], [2, 3, 4])); // ["WX", "XY"]

console.log(
  solution(["ABCDE", "AB", "CD", "ADE", "XYZ", "XYZ", "ACD"], [2, 3, 5])
); // ["ACD", "AD", "ADE", "CD", "XYZ"]

console.log(solution(["XYZ", "XWY", "WXA"], [2, 3, 4])); // ["XYZ", "XWY", "WXA"], [2, 3, 4]
