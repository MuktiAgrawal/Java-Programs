import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ActivitySelection {

    static void activitySelection(ArrayList<Activity1> activityList) {
        Comparator<Activity1> finishTimeComparator = new Comparator<Activity1>() {
            @Override
            public int compare(Activity1 o1, Activity1 o2) {
                return o1.getFinishTIme() - o2.getFinishTIme();
            }
        };
        Collections.sort(activityList, finishTimeComparator);
        Activity1 previousActivity = activityList.get(0);
        System.out.println("\n\nRecommended Schedule:\n" + activityList.get(0));

        for (int i = 1; i < activityList.size(); i++) {
            Activity1 activity = activityList.get(i);
            if (activity.getStartTime() >= previousActivity.getFinishTIme()) {
                System.out.println(activity);
                previousActivity = activity;
            }
        }
    }
}
