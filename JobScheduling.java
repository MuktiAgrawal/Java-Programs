import java.util.Arrays;

public class JobScheduling {
    public static void findOptimalSchedule(Job[] jobs) {
        int n = jobs.length;
        Arrays.sort(jobs, (a, b) -> b.profit - a.profit);

        int maxDeadline = 0;
        for (Job job : jobs) {
            if (job.deadline > maxDeadline) {
                maxDeadline = job.deadline;
            }
        }

        String[] schedule = new String[maxDeadline];
        Arrays.fill(schedule, " ");

        int totalProfit = 0;
        for (Job job : jobs) {
            for (int i = job.deadline - 1; i >= 0; i--) {
                if (schedule[i].equals(" ")) {
                    schedule[i] = job.id;
                    totalProfit += job.profit;
                    break;
                }
            }
        }

        System.out.println("Optimal Schedule:");
        for (int i = 0; i < maxDeadline; i++) {
            if (!schedule[i].equals(" ")) {
                System.out.println("Job " + schedule[i] + " - Profit: "
                        + jobs[Integer.parseInt(schedule[i].substring(1)) - 1].profit);
            }
        }

        System.out.println("Maximum Earned Profit: " + totalProfit);

        // Check if all jobs are executed
        boolean[] executed = new boolean[n];
        Arrays.fill(executed, false);
        for (int i = 0; i < maxDeadline; i++) {
            if (!schedule[i].equals(" ")) {
                executed[Integer.parseInt(schedule[i].substring(1)) - 1] = true;
            }
        }

        boolean allJobsExecuted = true;
        for (boolean jobExecuted : executed) {
            if (!jobExecuted) {
                allJobsExecuted = false;
                break;
            }
        }

        if (allJobsExecuted) {
            System.out.println("All jobs are executed.");
        } else {
            System.out.println("Not all jobs are executed.");
        }
    }

    public static void main(String[] args) {
        Job[] jobs = {
                new Job("J1", 5, 200),
                new Job("J2", 3, 180),
                new Job("J3", 3, 190),
                new Job("J4", 2, 300),
                new Job("J5", 4, 120),
                new Job("J6", 2, 100)
        };

        findOptimalSchedule(jobs);
    }
}