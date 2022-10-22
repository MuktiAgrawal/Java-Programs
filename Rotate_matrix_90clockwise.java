public class Rotate_matrix_90clockwise {
    public static void main(String[] args) {
        int[][] a={{1,2,3},{4,5,6},{7,8,9}};
        int [][] b={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int [][] c={{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
        Rotate_matrix_90clockwise obj=new Rotate_matrix_90clockwise();
        // obj.rotateMatrix(a);
        // obj.rotateMatrix(b);
        obj.rotateMatrix(c);
    }
    boolean rotateMatrix(int[][] matrix) {
        // TODO
        int n=matrix.length;
        for(int layer=0;layer<n/2;layer++){
            int first=layer;
            int last=n-layer-1;
            System.out.println("First "+first+" Last "+last);
            for(int i=first;i<last;i++)
            {
                System.out.println("i="+i);
                int temp=matrix[first][i];
                matrix[first][i]=matrix[last-i+first][first];
                matrix[last-i+first][first]=matrix[last][last-i+first];
                matrix[last][last-i+first]=matrix[i][last];
                matrix[i][last]=temp;
                for(int k=0;k<matrix.length;k++){
                    for(int j=0;j<matrix[0].length;j++){
                        System.out.print(matrix[k][j]+" ");
                    }
                    System.out.println();
                }
                System.out.println();
            }
        }
        System.out.println("Matrix after 90 degree clockwise rotation");
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        return true;
    }
}
