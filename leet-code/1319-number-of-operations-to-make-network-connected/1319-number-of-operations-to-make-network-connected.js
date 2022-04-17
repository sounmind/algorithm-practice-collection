/**
 * @param {number} n
 * @param {number[][]} connections
 * @return {number}
 */
var makeConnected = function (n, connections) {
  if (connections.length < n - 1) {
    return -1;
  }
  
  const graph = makeGraph(connections);
  const visited = [];
  let totalNetworks = 0;

  for (let i = 0; i < n; i++) {
    totalNetworks += traverseByDFS(i) ? 1 : 0;
  }

  return totalNetworks - 1;

  function traverseByDFS(vertex) {
    if (visited[vertex]) {
      return false;
    }

    visited[vertex] = true;

    if (graph.hasOwnProperty(vertex)) {
      graph[vertex].forEach(traverseByDFS);
    }

    return true;
  }
};

/**
 * @param {number[][]} connections
 * @return {{ [vertex: number]: number[] }}
 */
function makeGraph(connections) {
  const graph = {};

  connections.forEach(([source, target]) => {
    if (graph.hasOwnProperty(source)) {
      graph[source].push(target);
    } else {
      graph[source] = [target];
    }

    if (graph.hasOwnProperty(target)) {
      graph[target].push(source);
    } else {
      graph[target] = [source];
    }
  });

  return graph;
}