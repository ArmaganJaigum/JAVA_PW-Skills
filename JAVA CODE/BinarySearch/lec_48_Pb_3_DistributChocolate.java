package BinarySearch;

public class lec_48_Pb_3_DistributChocolate {

    static boolean isDevisionPossible(int[] a, int m, int mxChocolateAllowed){
        int numOfStudents = 1;
        int choc = 0;  // Number of Chocolate Current Students have
        for(int i = 0; i < a.length; i++){
            if(a[i] > mxChocolateAllowed) return false;
            if(choc + a[i] <= mxChocolateAllowed){
                choc += a[i];
            } else {
                numOfStudents++;
                choc = a[i];
            }
        }
        return numOfStudents <= m;
//        if(numOfStudents > m) return false;      // Other wise we write this one
//        return true;
    }

    static int distributeChocolate(int[] a, int m){
        if (a.length < m) return -1;
        int ans = 0, str = 1, end = (int)1e9;
        while (str <= end) {
            int mid = str + (end - str) / 2;
            if (isDevisionPossible(a, m, mid)){
                ans = mid;
                end = mid - 1;
            } else {
                str = mid + 1;
            }
        }
        return ans;
    }

    static boolean isPossible(int[] a, int k, int dist){
        int kidsPlaced = 1;
        int lastKid = a[0];
        for (int i = 1; i < a.length; i++){
            if (a[i] - lastKid >= dist){
                kidsPlaced++;
                lastKid = a[i];
            }
        }
        return kidsPlaced >= k;
    }

    static int raceTack(int[] a, int k){
        if(k > a.length) return -1;
        int str = 0, end = (int) 1e9;
        int ans = -1;
        while (str <= end){
            int mid = str + (end-str)/2;
            if(isPossible(a, k, mid)){     // can k kids be placed such that no 2 kids have distance lesser than mid
                ans = mid;
                str = mid+1;
            } else {
                end = mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
//        int[] a = {12, 34, 67, 90};
//        int m = 2;   // nu of students
//        System.out.println(distributeChocolate(a,m));

        int[] a = {1, 2, 4, 8, 9};
        int k = 3;
        System.out.println(raceTack(a, k));
    }
}
