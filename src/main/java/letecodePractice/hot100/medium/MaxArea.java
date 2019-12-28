package letecodePractice.hot100.medium;

public class MaxArea {
    public static void main(String[] args) {
        int[] arr = {1,8,6,2,5,4,8,3,7};
        int maxArea = maxArea(arr);
        System.out.println(maxArea);
    }
    public static int maxArea(int[] height) {
        int maxArea = 0;
        int l = 0;
        int r = height.length-1;

        while(l<r){
            int s = height[l]>=height[r]?height[r]*(r-l):height[l]*(r-l);
            maxArea = maxArea>=s?maxArea:s;
            if(height[l]>=height[r])    r--;
            else    l++;
        }
        return maxArea;
    }
}
