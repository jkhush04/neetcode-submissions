class Solution {

    public String encode(List<String> strs) {
        if (strs.isEmpty()) return "";
        StringBuilder sb=new StringBuilder();
        for(int i=0;i< strs.size();i++){
            sb.append(strs.get(i).length()).append("#").append(strs.get(i));
        }
    return sb.toString();
    }

    public List<String> decode(String str) {
        int i=0;
        List<String> list=new ArrayList<>();
      while(i<str.length()){
       int j=i;
       while(str.charAt(j)!='#'){
        j++;
       }
       int len=Integer.parseInt(str.substring(i,j));
        j++; 
        list.add(str.substring(j,j+len));
        i=j+len;
      }
    return list;
    } 
}
