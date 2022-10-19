/*Program to check if two integer arrays are permutations of each other*/
public class Permutation {
    public static void main(String[] args) {
        int a1[]={1,2,3,4,5},a2[]={5,4,1,2,3};
        Permutation obj=new Permutation();
        boolean result=obj.permutation(a1,a2);
        if(result)
        System.out.println("Array 1 and Array 2 are permutations of each other");
        else
        System.out.println("Array 1 and Array 2 are not permutations of each other");
    }
    public boolean permutation(int[] array1,int[] array2){
        int sum1=0,product1=1,sum2=0,product2=1;
        if(array1.length==array2.length){
            for(int i=0;i<array1.length;i++){
                sum1+=array1[i];
                sum2+=array2[i];
                product1*=array1[i];
                product2*=array2[i];
            }
            if(sum1==sum2 && product1==product2)
                return true;
        }
        return false;
    }
}
