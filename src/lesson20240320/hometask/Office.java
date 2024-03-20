package lesson20240320.hometask;

public class Office {


    public static void main(String[] args) {
        JobActions manager = new JobActions() {
            @Override
            public void doTask(Task task) {
                System.out.println("We need to do: " + task.getName());
            }

            @Override
            public void haveRest() {
                System.out.println("Drinking coffee...");
            }
        };

        JobActions worker = new JobActions() {
            @Override
            public void doTask(Task task) {
                System.out.println("Doing " + task.getName());
            }

            @Override
            public void haveRest() {
                System.out.println("Smoking...");
            }
        };

        JobActions lazyWorker = new JobActions() {
            @Override
            public void doTask(Task task) {
                haveRest();
            }

            @Override
            public void haveRest() {
                System.out.println("Doing nothing...");
            }
        };

        JobActions.Task task = new JobActions.Task("Implement REST IPA", "API description");
        manager.doTask(task);
        manager.haveRest();
        worker.doTask(task);
        worker.haveRest();
        lazyWorker.doTask(task);
        lazyWorker.haveRest();
    }


}
