class Solution {
    public boolean isPalindrome(int x) {
        int original = x;
        int reverse = 0;
        while(x>0){
            reverse = x%10 + reverse*10;
            x= x/10;
        }
        return reverse==original ? true : false;
    }
}