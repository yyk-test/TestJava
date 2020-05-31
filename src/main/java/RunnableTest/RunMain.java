package RunnableTest;

public class RunMain {
    public static void main(String[] args) {
        RunTask rt8 = new RunTask();
        Thread t1 = new Thread(rt8.testCase);
        Thread t2 = new Thread(rt8.testCase);

        t1.run();
        t2.run();
    }
}
