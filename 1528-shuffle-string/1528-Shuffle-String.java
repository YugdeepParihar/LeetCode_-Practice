class Solution {
    public String restoreString(String s, int[] indices) {
        StringBuilder ans= new StringBuilder();
        for(int i=0, j=0;i<indices.length;i++){
            for(int k=0;k<indices.length;k++){
                if(j==indices[k]){
                ans.append(s.charAt(k));
                j++;
             }   
          }
        }
        return ans.toString();
    }
}