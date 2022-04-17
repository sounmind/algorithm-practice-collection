/**
 * @param {number} n
 * @param {number[][]} edges
 * @param {number} source
 * @param {number} destination
 * @return {boolean}
 */
var validPath = function (n, edges, source, destination) {
  const graph = {};
  const visited = new Set();

  edges.forEach(([origin, target]) => {
    if (graph[origin]) {
      graph[origin].add(target);
    } else {
      graph[origin] = new Set([target]);
    }

    if (graph[target]) {
      graph[target].add(origin);
    } else {
      graph[target] = new Set([origin]);
    }
  });

  function depthFirstSearch(start) {
    const adjacentTargets = graph[start];

    visited.add(start);

    if (adjacentTargets?.size > 0) {
      adjacentTargets.forEach((target) => {
        if (!visited.has(target)) {
          depthFirstSearch(target);
        }
      });
    }
  }

  depthFirstSearch(source);

  return visited.has(destination);
};