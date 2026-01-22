public class CommonSubsequence {

    public int commonSubsequence(String text1, String text2) {
        int[][] dp = new int[text1.length() + 1][text2.length() + 1];

        for (int i = 1; i <= text1.length(); i++) {
            for (int j = 1; j <= text2.length(); j++) {
                if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    //compare two values and give the larger
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[text1.length()][text2.length()];
    }

    public static void main(String[] args){
    //  String text1 = "bond";
    //  String text2 = "bond";

        String text1 = "alucards";
        String text2 = "alliances";
    //
    //  String text1 = "cannon ball";
    //  String text2 = "ferris";

        System.out.println("Input: text1 = " + text1 + ", text2 = " + text2);

        CommonSubsequence cs = new CommonSubsequence();
        int output = cs.commonSubsequence(text1, text2);

        System.out.println("Output: " + output);
    }


}
/*
Sources:
https://www.youtube.com/watch?v=Hdr64lKQ3e4
https://www.youtube.com/watch?v=oNoILrFOx2k
https://www.youtube.com/watch?v=ASoaQq66foQ
https://www.youtube.com/watch?v=7uQ1Lehw7_k
 */
