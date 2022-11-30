class Solution {
    public boolean checkPowersOfThree(int n) {
        if(n==0){
            return true;
        }
        
        int l=n%3;
        if(l==2){
            return false;
        }
        
        return checkPowersOfThree(n/3);
        
    }
}