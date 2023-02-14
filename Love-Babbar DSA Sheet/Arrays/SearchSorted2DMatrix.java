public class SearchSorted2DMatrix {
    // Time complexity O(m+n)
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length;
        int n=matrix[0].length;
        int i=0;
        while(i<m){
            if(target>=matrix[i][0] && target<=matrix[i][n-1])
                break;
            i++;
        }
        if(i==m){
            return false;
        }
        else{
            for(int j=0;j<n;j++){
                if(matrix[i][j]==target){
                    return true;
                }
            }
        }
        return false;
    }

    // Time complexity: O(log m+log n) = O(log mn)
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length;
        int n=matrix[0].length;
        int low=0,high=m-1,mid=0;
        while(low<=high){
            mid=(low+high)/2;
            if(target>=matrix[mid][0] && target<=matrix[mid][n-1])
                break;
            else if(target<=matrix[mid][0]){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        low=0;
        high=n-1;
        int mid2=0;
        while(low<=high){
            mid2=(low+high)/2;
            if(target==matrix[mid][mid2]){
                return true;
            }
            else if(target<matrix[mid][mid2]){
                high=mid2-1;
            }
            else{
                low=mid2+1;
            }
        }
        return false;
    }
}
