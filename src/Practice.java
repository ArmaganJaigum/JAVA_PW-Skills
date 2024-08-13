public class Practice {

    static boolean IsPossible(int[] a, int k, int dist){
        int kidsPlaced = 1;
        int lastKid = a[0];
        for(int i = 1; i < a.length; i++){
            if (a[i] - lastKid >= dist){
                kidsPlaced++;
                lastKid= a[i];
            }
        }
        return kidsPlaced >= k;
    }

    static int raceTrack(int[] a, int k){
        if (k > a.length) return -1;
        int str = 0, end = (int) 1e9;
        int ans = -1;
        while (str <= end){
            int mid = str + (end - str)/2;
            if (IsPossible(a,k,mid)){
                ans = mid;
                str = mid+1;
            } else {
                end = mid -1;
            }
        }
        return ans;
    }


    public static void main(String[] args){
        Student s = new Student();

    }
}