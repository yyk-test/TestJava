package RunnableExecute;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestFunction {

    String name = "apple pie";
    ExecutorService executorService = Executors.newSingleThreadExecutor();

    public void execute() {
        System.out.println("in TestFunction        " + name);
    }

    public TestFunction() {
        Template temp = new Template(() -> execute());
        final Runnable task = new Runnable() {
            @Override
            public void run() {
                temp.exe();
            }
        };

        executorService.execute(task);
        executorService.shutdown();
    }

}
