public class series_function_overloading {
    void series()
    {
        int i=0,count=0;
        while(count<10)
        {
            count++;
            i+=2;
            System.out.println(i);
        }
    }
    void series(int count)
    {
        int i=0;
        while(count>0)
        {
            count--;
            i+=2;
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        series_function_overloading obj=new series_function_overloading();
        obj.series();
        obj.series(10);
    }
}
