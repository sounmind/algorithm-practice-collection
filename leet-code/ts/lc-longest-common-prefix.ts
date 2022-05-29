const longestCommonPrefix = function (strs: string[]) {
  const origin = strs[0];
  const rest = strs.slice(1);

  if (strs.length === 1) {
    return origin;
  }

  let index = 0;

  while (index < origin.length) {
    if (rest.some((str) => str[index] !== origin[index])) {
      break;
    }

    index += 1;
  }

  return origin.slice(0, index);
};
