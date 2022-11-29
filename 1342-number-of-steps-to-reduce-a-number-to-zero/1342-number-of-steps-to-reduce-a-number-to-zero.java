class Solution {
    public int numberOfSteps(int num) {
        return know(num, 0);
        
    }
    private static int know(int num, int steps){
        if(num==0){
            return steps;
        }
        
        else if(num%2==0){
            return know(num/2, steps+1);
        }
        
        else{
            return know(num-1, steps+1);
        }
    }
}