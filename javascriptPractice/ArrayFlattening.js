// arr - [1, [2, [3, 4], 5], 6];
// Output: [1, 2, 3, 4, 5, 6]

arr = [1, [2, [3, 4], 5], 6];

function ArrayFlattening(arr) {
  let result = [];
  arr.forEach((item) => {
    if (Array.isArray(item)) {
      result = result.concat(ArrayFlattening(item)); //Recursion Call
    } else {
      result.push(item); //Base Case
    }
  });
  return result;
}

const ArrayFlatten = ArrayFlattening(arr);
console.log(ArrayFlatten);
