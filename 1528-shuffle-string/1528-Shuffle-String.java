class Solution {
    public String restoreString(String s, int[] indices) {
        HashMap<Integer, Character> temp = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            temp.put(indices[i], s.charAt(i));
        }
        StringBuilder ans = new StringBuilder();
               for (int i = 0; i < s.length(); i++) {
            ans.append(temp.get(i));
        }

        return ans.toString();
    }
}