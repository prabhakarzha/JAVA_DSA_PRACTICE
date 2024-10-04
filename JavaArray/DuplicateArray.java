public class DuplicateArray {

  public static int removeDuplicates(int[] nums) {
    if (nums.length == 0) {
      return 0; // Handle the case of an empty array
    }

    int count = 1; // Start with the first element being unique

    for (int i = 1; i < nums.length; i++) {
      if (nums[i] != nums[count - 1]) { // Compare with the last unique element
        nums[count] = nums[i]; // Assign unique value
        count++; // Move to the next position for the next unique element
      }
    }
    return count; // Return the count of unique elements
  }

  public static void main(String[] args) {
    int nums[] = { 1, 1, 2 };
    System.out.println(removeDuplicates(nums));
  }
}
