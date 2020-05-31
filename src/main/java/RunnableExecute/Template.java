package RunnableExecute;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Template {
    public ExecutorService executorService = Executors.newSingleThreadExecutor();
    Runnable fn;

    public Template(Runnable fn) {
        this.fn = fn;
    }

    public void exe() {
        if(fn == null) {
            System.out.println("wrong");
        }
        System.out.println("In TEMPLATE");
        executorService.execute(fn);
        System.out.println("fu name: "+ fn.getClass().getName());
//        throw new RuntimeException("Exception");
        System.out.println("fu simplename: "+ fn.getClass().getSimpleName());
        System.out.println(String.format("%s", 1000L));
        executorService.shutdown();
        System.out.println("Job done");
    }
}
