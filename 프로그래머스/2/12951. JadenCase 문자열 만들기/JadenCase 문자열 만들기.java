class Solution {
    public String solution(String s) {
        char[] array_s = new char[s.length()];
        String str = s.toLowerCase();
            
        for(int i = 0; i < array_s.length; i++){
            if(i == 0 || (i > 1 && str.charAt(i-1) == ' ')){
                array_s[i] = Character.toUpperCase(str.charAt(i));
                continue;
            }
            array_s[i] = str.charAt(i);
        }

        return new String(array_s);    
    }
}