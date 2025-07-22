function rotateRight(arr, k) {
  k = k % arr.length; // Handle large k values
  const rotated = [];

  // Push last k elements first
  for (let i = arr.length - k; i < arr.length; i++) {
    rotated.push(arr[i]);
  }

  // Push remaining elements
  for (let i = 0; i < arr.length - k; i++) {
    rotated.push(arr[i]);
  }

  return rotated;
}

const arr = [1, 2, 3, 4, 5];
console.log(rotateRight(arr, 2)); // Output: [4, 5, 1, 2, 3].
