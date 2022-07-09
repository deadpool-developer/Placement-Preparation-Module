package Week1.mergeTwoSortedArray;

public class merge {

    //GAP Sorting Algorithm --> Enhanced version of insertion sort
    public void merges(long arr1[], long arr2[], int n, int m) 
    {
        // code here
        int gap =(int) Math.ceil((double)(n + m) / 2.0);
        
        while(gap>0){
            int i = 0, j = gap;
            while(j<(n+m)){
                if(j<n && arr1[i] > arr1[j]){
                    arr1[i] = arr1[i] ^ arr1[j];
                    arr1[j] = arr1[i] ^ arr1[j];
                    arr1[i] = arr1[i] ^ arr1[j];
                }
                if(j>=n && i<n && arr1[i] > arr2[j-n]){
                    arr1[i] = arr1[i] ^ arr2[j-n];
                    arr2[j-n] = arr1[i] ^ arr2[j-n];
                    arr1[i] = arr1[i] ^ arr2[j-n];
                }
                if(j>=n && i>=n && arr2[i-n] > arr2[j-n]){
                    arr2[i-n] = arr2[i-n] ^ arr2[j-n];
                    arr2[j-n] = arr2[i-n] ^ arr2[j-n];
                    arr2[i-n] = arr2[i-n] ^ arr2[j-n];
                }
                j++;
                i++;
            }
            if(gap == 1){
                gap = 0;
            }
            else gap = (int) Math.ceil((double) (gap) / 2.0);
        }
    }
    public static void main(String[] args) {
        long arr1[] = {1,3,5,7};
        long arr2[] = {0,2,6,8,9};
        merge m = new merge();
        m.merges(arr1, arr2, 4, 5);
        for(int i = 0; i < arr1.length; i++){
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        for(int i = 0; i < arr2.length; i++){
            System.out.print(arr2[i] + " ");
        }
       
    }
}
