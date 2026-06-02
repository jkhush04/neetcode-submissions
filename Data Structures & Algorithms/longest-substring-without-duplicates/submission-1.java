class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0) return 0;
        HashMap<Character, Integer> hm=new HashMap<>();
        int count=0;
        int max=0;
        for(int i=0;i<s.length();i++){
            int j=i;
            while(j<s.length()){
            if(!hm.containsKey(s.charAt(j))){
                hm.put(s.charAt(j),1);
                count++;
            }
            else{
                max=Math.max(max,count);
                count=0;
                hm.clear();
                break;
            }
            j++;
            }
        if(count==s.length()){
           max=Math.max(max,count);
           break;
        }

        }
    return max;
    }
}
