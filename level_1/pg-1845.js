function solution(nums) {
  const maxPokemonTypes = nums.length / 2;
  const pokemonTypesLength = new Set(nums).size;

  if (pokemonTypesLength >= maxPokemonTypes) {
    return maxPokemonTypes;
  }

  return pokemonTypesLength;
}

console.log(solution([3, 1, 2, 3])); // 2
console.log(solution([3, 3, 3, 2, 2, 4])); // 3
console.log(solution([3, 3, 3, 2, 2, 2])); // 2
