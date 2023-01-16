import java.util.*;
public class common_elements_in_three_sortedArrays {
//User function Template for Java
    ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3) 
    {
        // code here 
        ArrayList<Integer> ls=new ArrayList<Integer>();
        int m=0,n=0,o=0;
        int max=0;
        while(m<n1 && n<n2 && o<n3){
            if(A[m]==B[n] && A[m]==C[o]){
                if(!ls.contains(A[m]))
                    ls.add(A[m]);
                o++;
                m++;
                n++;
            }
            else{
                max=Math.max(Math.max(A[m],B[n]),C[o]);
                if(A[m]<max){
                    m++;
                }
                if(B[n]<max){
                    n++;
                }
                if(C[o]<max){
                    o++;
                }
            }
        }
        return ls;
    }

    // Method 2: Without using ArrayList
    // Can also be done with 1 prev variable maintained for the final array

    void findCommon(int ar1[], int ar2[], int ar3[])
    {

        // Initialize starting indexes for ar1[],
        // ar2[] and ar3[]
        int i = 0, j = 0, k = 0;
        int n1 = ar1.length;
        int n2 = ar2.length;
        int n3 = ar3.length;

        // Declare three variables prev1,
        // prev2, prev3 to track previous
        // element
        int prev1, prev2, prev3;

        // Initialize prev1, prev2,
        // prev3 with INT_MIN
        prev1 = prev2 = prev3 = Integer.MIN_VALUE;

        while (i < n1 && j < n2 && k < n3) {
            // If ar1[i] = prev1 and i < n1,
            // keep incrementing i
            while (i < n1 && ar1[i] == prev1)
                i++;

            // If ar2[j] = prev2 and j < n2,
            // keep incrementing j
            while (j < n2 && ar2[j] == prev2)
                j++;

            // If ar3[k] = prev3 and k < n3,
            // keep incrementing k
            while (k < n3 && ar3[k] == prev3)
                k++;

            if (i < n1 && j < n2 && k < n3) {

                // If x = y and y = z, print any of
                // them, update prev1 prev2, prev3
                // and move ahead in each array
                if (ar1[i] == ar2[j] && ar2[j] == ar3[k]) {
                    System.out.print(ar1[i] + " ");
                    prev1 = ar1[i];
                    prev2 = ar2[j];
                    prev3 = ar3[k];
                    i++;
                    j++;
                    k++;
                }

                // If x < y, update prev1
                // and increment i
                else if (ar1[i] < ar2[j]) {
                    prev1 = ar1[i];
                    i++;
                }

                // If y < z, update prev2
                // and increment j
                else if (ar2[j] < ar3[k]) {
                    prev2 = ar2[j];
                    j++;
                }

                // We reach here when x > y
                // and z < y, i.e., z is
                // smallest update prev3
                // and increment k
                else {
                    prev3 = ar3[k];
                    k++;
                }
            }
        }
    }

    // Method 3: Using frequency count array
    public static void commonElements3(int[] arr1,int[] arr2,int[] arr3, int n1,int n2, int n3)
    {
        // creating a max variable
        // for storing the maximum
        // value present in the all
        // the three array
        // this will be the size of
        // array for calculating the
        // frequency of each element
        // present in all the array
        int max = Integer.MIN_VALUE;

        // deleting duplicates in linear time
        // for arr1
        int res1 = 1;
        for (int i = 1; i < n1; i++) {
            max = Math.max(arr1[i], max);
            if (arr1[i] != arr1[res1 - 1]) {
                arr1[res1] = arr1[i];
                res1++;
            }
        }

        // deleting duplicates in linear time
        // for arr2
        int res2 = 1;
        for (int i = 1; i < n2; i++) {
            max = Math.max(arr2[i], max);
            if (arr2[i] != arr2[res2 - 1]) {
                arr2[res2] = arr2[i];
                res2++;
            }
        }

        // deleting duplicates in linear time
        // for arr3
        int res3 = 1;
        for (int i = 1; i < n3; i++) {
            max = Math.max(arr3[i], max);
            if (arr3[i] != arr3[res3 - 1]) {
                arr3[res3] = arr3[i];
                res3++;
            }
        }

        // creating an array for finding frequency
        int[] freq = new int[max + 1];

        // calculating the frequency of
        // all the elements present in
        // all the array
        for (int i = 0; i < res1; i++)
            freq[arr1[i]]++;
        for (int i = 0; i < res2; i++)
            freq[arr2[i]]++;
        for (int i = 0; i < res3; i++)
            freq[arr3[i]]++;

        // iterating till max and
        // whenever the frequency of element
        // will be three we print that element
        for (int i = 0; i <= max; i++)
            if (freq[i] == 3)
                System.out.print(i + " ");
    }

    // Method 4: Using hashset
    static void findCommon(int a[], int b[], int c[], int n1, int n2,int n3)
    {
        // three sets to maintain frequency of elements
        HashSet<Integer> uset = new HashSet<>();
        HashSet<Integer> uset2 = new HashSet<>();
        HashSet<Integer> uset3 = new HashSet<>();
        for (int i = 0; i < n1; i++) {
            uset.add(a[i]);
        }
        for (int i = 0; i < n2; i++) {
            uset2.add(b[i]);
        }
        // checking if elements of 3rd array are present in
        // first 2 sets
        for (int i = 0; i < n3; i++) {
            if (uset.contains(c[i]) && uset2.contains(c[i])) {
                // using a 3rd set to prevent duplicates
                if (uset3.contains(c[i]) == false)
                    System.out.print(c[i]+" ");
                uset3.add(c[i]);
            }
        }
    }
}