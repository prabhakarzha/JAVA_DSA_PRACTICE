const arr = [1, 2, 3, 4, 5, 6];
let sum = 0;
function sumArray(arr) {
  for (let i = 0; i < arr.length; i++) {
    sum += arr[i];
  }
  return sum;
}
const total = sumArray(arr);
console.log(total);
