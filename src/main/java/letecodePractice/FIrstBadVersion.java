package letecodePractice;

public class FIrstBadVersion extends VersionControl {
    public int firstBadVersion(int n) {
        int left = 1,right = n;
        int result = 0;
        while(left <= right){
            int mid = left+(right-left)/2;
            if(isBadVersion(mid)) {
                if(!isBadVersion(mid-1)){
                    result = mid;
                    break;
                }
                right = mid - 1;
            }
            else left = mid + 1;
        }
        return result;
    }
}
abstract class VersionControl{
    public boolean isBadVersion(int n){
        return false;
    }
}