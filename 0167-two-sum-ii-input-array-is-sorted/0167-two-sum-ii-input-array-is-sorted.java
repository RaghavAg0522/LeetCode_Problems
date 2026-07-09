class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l = 0;
        int r = numbers.length - 1;

        while (l < r) {
            int currS = numbers[l] + numbers[r];

            if (currS == target) {
                return new int[]{l + 1, r + 1};
            } else if (currS > target) {
                r--;
            } else {
                l++;
            }
        }

        return new int[]{};
    }
}