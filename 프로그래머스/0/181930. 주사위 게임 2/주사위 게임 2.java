class Solution {
    public int solution(int a, int b, int c) {
       
        double res = 0;
        
        /* 모두 동일 */
        if (a == b && b == c) {
            res = (3*a) * (3 * Math.pow(a,2)) * (3 * Math.pow(a,3));  
        } 
        
        /* 모두 다름*/
        else if (a != b && b != c && a != c) {
            res = a + b + c;
        }
        
        /* 하나만 다름 */
        else {
            res = (a + b + c) * (Math.pow(a,2) + Math.pow(b,2) + Math.pow(c,2));
        }
        
        return (int)res;
        
    }
}