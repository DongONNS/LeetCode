package letecodePractice;

public class FIrstBadVersion {
    public class Solution extends VersionControl {
        public int firstBadVersion(int n) {
            int left = 1,right = n;
            int result = 0;
            while(left <= right){
                int mid = left+(right-left)/2;
                if(isBadVersion(mid)){
                    result = mid;
                }
                else left = mid + 1;
            }
        }
        return result;
    }
}
