package RunnableTest;

import java.util.Properties;

public class RunTask {
    final Runnable testCase = () -> {
        System.out.println("in testcase");
        System.out.println(System.currentTimeMillis());
    };
}
