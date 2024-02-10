import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Activity1> activityList = new ArrayList<Activity1>();
        activityList.add(new Activity1("A1", 0, 6));
        activityList.add(new Activity1("A2", 3, 4));
        activityList.add(new Activity1("A3", 1, 2));
        activityList.add(new Activity1("A4", 5, 8));
        activityList.add(new Activity1("A5", 5, 7));
        activityList.add(new Activity1("A6", 8, 9));

        ActivitySelection.activitySelection(activityList);
    }
}
