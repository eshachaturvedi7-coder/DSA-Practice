// class Solution {
//     public int fib(int n) {
//         if(n==0){
//             return 0;
//         }
//         if(n==1){
//             return 1;
//         }
//         return fib(n-1)+fib(n-2);
//     }
// }



// class Solution {
//     public int fib(int n) {
//         if(n<=1) return n;

//         int prev2=0,prev1 = 1;

//         for(int i=2;i<=n;i++){

//             int curri = prev1+prev2;
//             prev2 = prev1;
//             prev1= curri;
//         }
//         return prev1;
//     }
// }



class Solution {
    public int fib(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        return f(n,dp);
    }
    int f(int n,int[] dp){
        if(n==0) return 0;
        if(n==1) return 1;
        if(dp[n]!=-1) return dp[n];
        return dp[n] = f(n-1,dp)+f(n-2,dp);
    }
}