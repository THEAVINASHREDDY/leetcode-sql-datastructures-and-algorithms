class Solution {
    public int maximumWealth(int[][] accounts) {
        int ans=0;
        for(int i=0; i<accounts.length; i++){
            for(int j=1; j<accounts[i].length; j++){
                accounts[i][j]=accounts[i][j]+accounts[i][j-1];
            }
            ans=Math.max(ans, accounts[i][accounts[i].length-1]);
    
        }
        return ans;
        
    }
}