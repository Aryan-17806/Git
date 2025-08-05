import java.util.Scanner;

public class first{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int [] arr = new int[n];
        for(int i = 0 ; i < n ; i ++) arr[i] = input.nextInt();
        input.close();
        MergeSort(arr);
        print(arr);
    }   
        public static void print(int[] arr) {
            for(int i = 0 ; i < arr.length ; i++) System.out.print(arr[i] + " ");
        }
        public static void MergeSort(int[] arr) {
            int n = arr.length;
            if(n == 1) return;
            int [] a = new int[n/2];
            int [] b = new int[n - n/2];
            // a.length = n/2 & b.length = n - n/2
            for(int i = 0 ; i < a.length ; i++) a[i] = arr[i];
            for(int i = 0 ; i < b.length ; i++) b[i] = arr[i+n/2];
            MergeSort(a);
            MergeSort(b);
            merge(a,b,arr);
            a = null; b = null;
        }
        public static void merge(int [] left,int [] right,int [] result) {
                int i = 0 , j = 0 , k = 0;
                while(i < left.length && j < right.length){
                    if(left[i] <= right[j]) result[k++] = left[i++];
                    else result[k++] = right[j++];
                }
                while (i < left.length) result[k++] = left[i++];
                while (j < right.length) result[k++] = right[j++];
        }
}