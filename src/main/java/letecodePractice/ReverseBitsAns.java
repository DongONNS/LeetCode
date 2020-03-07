package letecodePractice;

public class ReverseBitsAns {
    public int reverseBits(int n){
        int ans = 0;
        for(int bitsSize = 31;n!=0;n = n>>>1,bitsSize--){
            ans += (n & 1) << bitsSize;
        }
        return ans;
    }
}
