class Solution {
    public int maxOperations(int[] nums, int k) {
          Map<Integer, Integer> numCount = new HashMap<>();
        int count = 0;
        for (int num : nums) {
            int complement = k - num;
            if (numCount.getOrDefault(complement, 0) > 0) {
                count++;
                numCount.put(complement, numCount.get(complement) - 1);
            } else {
                numCount.put(num, numCount.getOrDefault(num, 0) + 1);
            }
        }
         return count;
    }
}
