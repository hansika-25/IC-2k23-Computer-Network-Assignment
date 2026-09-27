class Solution {

    public int findJudge(int n, int[][] trust) {

        int[] score = new int[n + 1];

        for (int[] t : trust) {
            int person = t[0];
            int judge = t[1];

            // Person trusts someone, so decrease their score
            score[person]--;

            // Someone trusts the judge, so increase judge's score
            score[judge]++;
        }

        // The judge trusts nobody and is trusted by everyone else
        for (int i = 1; i <= n; i++) {
            if (score[i] == n - 1) {
                return i;
            }
        }

        return -1;
    }
}