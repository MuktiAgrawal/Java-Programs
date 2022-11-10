public class ThreeInOne {
    private int numberOfStacks=3;
    private int stackCapacity;
    private int[] values;
    private int[] sizes;

    public ThreeInOne(int stackSize){
        stackCapacity=stackSize;
        values=new int[stackSize*numberOfStacks];
        sizes=new int[numberOfStacks];
    }

    public boolean isFull(int stackNum){
        if(sizes[stackNum]==stackCapacity)
            return true;
        else
            return false;
    }
    public boolean isEmpty(int stackNum){
        if(sizes[stackNum]==0)
            return true;
        else
            return false;
    }
    private int indexOfTop(int stackNum){
        int offset=stackCapacity*stackNum;
        return offset+sizes[stackNum]-1;
    }
    public void push(int stackNum,int value){
        if(!isFull(stackNum)){
            int top=indexOfTop(stackNum);
            values[++top]=value;
            sizes[stackNum]++;
            System.out.println(value+" successfully inserted to stack "+stackNum);
        }
        else{
            System.out.println("Stack "+stackNum+" is full");
        }
    }
    public int pop(int stackNum){
        if(!isEmpty(stackNum)){
            int top=indexOfTop(stackNum);
            int value=values[top];
            values[top]=0;
            sizes[stackNum]--;
            return value;
        }
        else{
            System.out.println("Stack "+stackNum+" is empty");
            return -1;
        }
    }
    public int peek(int stackNum){
        if(!isEmpty(stackNum)){
            return values[indexOfTop(stackNum)];
        }
        else{
            System.out.println("Stack "+stackNum+" is empty");
            return -1;
        }
    }
}
