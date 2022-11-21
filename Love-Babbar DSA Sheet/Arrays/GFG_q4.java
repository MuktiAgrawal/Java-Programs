//{ Driver Code Starts.
    import java.io.*;  
    class GFG_q4 {
    
        public static void main (String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
            while(t-->0){
                int n = Integer.parseInt(br.readLine().trim());
                int arr[] = new int[n];
                String inputLine[] = br.readLine().trim().split(" ");
                for(int i=0; i<n; i++){
                    arr[i] = Integer.parseInt(inputLine[i]);
                }
                Array_sort_0_1_2 ob=new Array_sort_0_1_2();
                ob.sort012(arr, n);
                StringBuffer str = new StringBuffer();
                for(int i=0; i<n; i++){
                    str.append(arr[i]+" ");
                }
                System.out.println(str);
            }
        }
    }
    
    
    // } Driver Code Ends