import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ActivitySelectionProblem {
    public static List<Activity1> selectActivities(int[] start, int[] finish) {
        int n = start.length;
        Activity1[] activities = new Activity1[n];

        for (int i = 0; i < n; i++) {
            activities[i] = new Activity1(start[i], finish[i]);
        }

        // Sort activities based on finish times
        Arrays.sort(activities, (a, b) -> a.finish - b.finish);

        List<Activity1> selectedActivities = new ArrayList<>();
        selectedActivities.add(activities[0]);
        int prevFinishTime = activities[0].finish;

        for (int i = 1; i < n; i++) {
            if (activities[i].start >= prevFinishTime) {
                selectedActivities.add(activities[i]);
                prevFinishTime = activities[i].finish;
            }
        }

        return selectedActivities;
    }

    public static void main(String[] args) {
        int[] start = { 1, 2, 3, 4, 7, 8, 9, 9, 11, 12 };
        int[] finish = { 3, 5, 4, 7, 10, 9, 11, 13, 12, 14 };

        List<Activity1> schedule = selectActivities(start, finish);

        System.out.println("Selected Activities:");
        for (Activity1 activity : schedule) {
            System.out.println("Activity from " + activity.start + " to " + activity.finish);
        }
        System.out.println("Maximum no. of activities that can be performed are " + schedule.size());
    }
}
