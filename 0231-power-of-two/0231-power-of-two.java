class Solution {
    public boolean isPowerOfTwo(int n) {
         if(n==1){
            return true;
        }
        return p(2, n);
        
        
    }
    static boolean p(long some, int n){
        if(some>n){
            return false;
        }
        else if(some==n){
            return true;
        }
       return p(some*2, n);
    }
}