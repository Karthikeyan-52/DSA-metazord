class Solution {
    String removeDuplicates(String s) {
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            set.add(ch);
        }
        String str ="";
        for(char i:set){
           str+=i;
        }
        return str;
    }
}
    