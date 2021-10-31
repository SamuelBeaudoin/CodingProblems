public class Exercise {
    public int maximumSubarray(int[] arr){
        
        int globalSum = Integer.MIN_VALUE;
        int localSum = 0;
        for(int element : arr){;
            localSum = Math.max(element, localSum + element);
            globalSum = Math.max(globalSum, localSum);
        }
        return globalSum;
        
    }
}
