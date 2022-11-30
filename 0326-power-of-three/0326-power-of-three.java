class Solution {
    public boolean isPowerOfThree(int n) {
        if(n==1){
            return true;
        }
        return q(3, n);
        
    }
    static boolean q(long some, int n){
        if(some>n){
            return false;
        }
        else if(some==n){
            return true;
        }
        return q(some*3, n);
    }
}