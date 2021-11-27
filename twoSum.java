 //O(n)
public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> checker = new HashMap<>();
        int[] indexArray = new int[2];

        for(int i = 0; i<nums.length; i++){
            if(checker.containsKey(target-nums[i])){
                indexArray[0] = i;
                indexArray[1] = checker.get(target-nums[i]);
            }else{
                checker.put(nums[i], i);
            }
        }

        return indexArray;


    }
