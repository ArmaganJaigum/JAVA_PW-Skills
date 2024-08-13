public class leetcodeTest {
    static int mySqrt(int x) {
        if(x == 0 || x == 1) return x;
        int str = 1, end = x;
        int ans = -1;
        while(str <= end){
            int mid = str + (end - str)/2;
            if(mid * mid == x){
                ans = mid;
            }
            else if(mid * mid > x){
                end = mid -1;
            } else {
                str = mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int x = 4;
        System.out.println(mySqrt(x));
    }
}