// 4. Remove Duplicates from Sorted Array (Easy)
let arr = [1, 1, 2, 4, 3, 4, 2, 3, 1];

function removeDuplicates(arr) {
  let uniqueArr = [];
  let seen = {}; // Hash map to track seen values

  for (let i = 0; i < arr.length; i++) {
    if (!seen[arr[i]]) {
      // If arr[i] is not seen, add it
      uniqueArr.push(arr[i]);
      seen[arr[i]] = true; // Mark as seen
    }
  }

  return uniqueArr;
}

console.log(removeDuplicates(arr)); // Output: [1, 2, 4, 3]
