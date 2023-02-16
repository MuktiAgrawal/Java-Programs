import java.util.*;
public class SpirallyTraverseMatrix {
    static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c)
    {
        ArrayList<Integer> ls=new ArrayList<Integer>();
        int top=0, down=r-1,left=0,right=c-1;
        int dir=0;
        while(top<=down && left<=right){
            if(dir==0){
                for(int i=left;i<=right;i++){
                    ls.add(matrix[top][i]);
                }
                top++;
            }
            else if(dir==1){
                for(int i=top;i<=down;i++){
                    ls.add(matrix[i][right]);
                }
                right--;
            }
            else if(dir==2){
                for(int i=right;i>=left;i--){
                    ls.add(matrix[down][i]);
                }
                down--;
            }
            else if(dir==3){
                for(int i=down;i>=top;i--){
                    ls.add(matrix[i][left]);
                }
                left++;
            }
            dir=(dir+1)%4;
        }
        return ls;
    }

    // The below approach works only for square matrix
    // for(int i=0;i<r/2+1;i++){
    //     for(int j=i;j<c-i;j++){
    //         ls.add(matrix[i][j]);
    //     }
    //     for(int j=i+1;j<r-i;j++){
    //         ls.add(matrix[j][c-i-1]);
    //     }
    //     for(int j=c-i-2;j>=i;j--){
    //         ls.add(matrix[r-i-1][j]);
    //     }
    //     for(int j=r-i-2;j>i;j--){
    //         ls.add(matrix[j][i]);
    //     }
    // }


    static ArrayList<Integer> spirallyTraverse2(int matrix[][], int r, int c)
    {
        // code here 
        ArrayList<Integer> ls=new ArrayList<Integer>();
        int top=0, down=r-1,left=0,right=c-1;
        while(top<=down && left<=right){
            for(int i=left;i<=right;i++){
                ls.add(matrix[top][i]);
            }
            ++top;
            for(int i=top;i<=down;i++){
                ls.add(matrix[i][right]);
            }
            --right;
            if(top<=down){
                for(int i=right;i>=left;i--){
                    ls.add(matrix[down][i]);
                }
                --down;
            }
            if(left<=right){
                for(int i=down;i>=top;i--){
                    ls.add(matrix[i][left]);
                }
                left++;
            }
        }
        return ls;
    }
}
