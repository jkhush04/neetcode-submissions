class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int arr[]=new int[2];
        for (int i=0;i<numbers.length;i++){
            
            int temp=target-numbers[i];
            int j=i+1;
            while(j<numbers.length){
                if(numbers[j]==temp){
                    arr[0]=i+1;
                    arr[1]=j+1;

                    break;
                }
            j++;
            }
        }
    return arr;
    }
}
