package Week2.SearchSingleElement;

class TUF {
    public static int findSingleElement(int nums[]) {
            int n = nums.length;
            int elem = 0;
            for (int i = 0; i < n; i++) {
                elem = elem ^ nums[i];
        }
        
        return elem;
    }

    public static void main(String args[]) {

        int arr[] = {1,1,2,3,3,4,4,8,8};
        
        int elem = findSingleElement(arr);
        System.out.println("The single occurring"
         +" element is " + elem);

    }
}
