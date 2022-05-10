public class freqcounter2 {
    int getMax(int[] a) {
        int n =a.length ;
        int max = a[0];
        for(int i = 1; i<n; i++) {
            if(a[i] > max)
                max = a[i];
        }
        return max; //maximum element from the array
    }
    public static int getMin(int[] data) {
        int max = data[0];
        for (int j : data) {
            if (j < max)
                max = j;
        }
        return max;
    }
    void countSort(int[] a )
    {   int n = a.length ;
        int max = getMax(a);
        int min = getMin(a) ;
        int y = max-min + 1 ;
        int[] count = new int [max+1]; //create count array with size [max+1]

        for (int i = 0; i <= max; ++i)
        {
            count[i] = 0; // Initialize count array with all zeros
        }

        for (int i = 0; i < n; i++) // Store the count of each element
        {
            count[a[i]]++;
        }
        System.out.println();
        System.out.println("freq" + java.util.Arrays.toString(count)) ;


    }
    void printArray(int a[], int n)
    {
        int i;
        for (i = 0; i < n; i++)
            System.out.print(a[i] + " ");
    }
    public static void main(String args[])
    {
        int a[] = {1,2,3,4,5,6,7,1,2,3,4};
        int n = a.length;
        freqcounter2 c1 = new freqcounter2();
        System.out.println("\nArray elements are - ");
        c1.printArray(a, n);
        c1.countSort(a);

    }
}
