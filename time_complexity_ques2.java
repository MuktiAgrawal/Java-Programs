public class time_complexity_ques2 {
    public void array_pairs(int arr[]) // Time complexity: O(n(n+1))=O(n^2+n)=O(n^2)
    {
        for(int i=0;i<arr.length;i++) // O(n)
        {
            for(int j=0;j<arr.length;j++) // O(n)
            {
                System.out.print(arr[i]+""+arr[j]+"\t"); //O(1)
            }
            System.out.println(); //O(1)
        }
    }
    public static void main(String[] args) {
        time_complexity_ques2 o=new time_complexity_ques2();
        int [] a={1,5,3,4};
        o.array_pairs(a);
    }
}

