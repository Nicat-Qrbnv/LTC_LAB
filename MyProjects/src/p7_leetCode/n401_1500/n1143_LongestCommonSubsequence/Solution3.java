package p7_leetCode.n401_1500.n1143_LongestCommonSubsequence;

class Solution3 {
    public static void main(String[] args) {
        String t1 = "mhunuzqrkzsnidwbun";
        String t2 = "szulspmhwpazoxijwbq";
        System.out.println(longestCommonSubsequence(t1, t2));
    }

    public static int dfs(int i , String str1 , int j , String str2 , Integer[][] dp){

        if((i < 0) || (j < 0)){
            return 0;
        }

        if(dp[i][j] != null){
            return dp[i][j];
        }

        if(str1.charAt(i) == str2.charAt(j)){
            int longest = 1 + dfs((i - 1), str1, (j - 1), str2, dp);
            dp[i][j] = longest;
            return longest;
        }

        int removeFromStr1 = dfs((i - 1), str1, j, str2, dp);
        int removeFromStr2 = dfs(i, str1, (j - 1), str2, dp);
        int longest = Math.max(removeFromStr1, removeFromStr2);
        dp[i][j] = longest;

        return dp[i][j];
    }

    public static int longestCommonSubsequence(String str1 , String str2) {
        int len1 = str1.length();
        int len2 = str2.length();
        return dfs((len1 - 1), str1, (len2 - 1), str2, (new Integer[len1][len2]));
    }
}
