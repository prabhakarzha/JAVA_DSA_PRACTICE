// All zero move to end
// let arr=[0,1,0,3,12];
// output=[1,3,12,0,0];

let arr = [0, 1, 0, 3, 12];
function moveZeroes(arr) {
  let index = 0; // Pointer for placing non-zero elements

  for (let i = 0; i < arr.length; i++) {
    if (arr[i] !== 0) {
      [arr[i], arr[index]] = [arr[index], arr[i]]; // Swap
      index++; // Move pointer forward
    }
  }
}
var result = moveZeroes(arr);
console.log(result);
