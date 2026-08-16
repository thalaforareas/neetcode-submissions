class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder filtered = new StringBuilder();
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                filtered.append(Character.toLowerCase(ch));
            }
        }
        
        String t = filtered.toString();
        String rev = filtered.reverse().toString();
        
        return t.equals(rev);
    }
}