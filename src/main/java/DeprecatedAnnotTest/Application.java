package DeprecatedAnnotTest;

import DeprecatedAnnotTest.TestServiceImpl;

public class Application {
    public static void main(String[] args) {
        TestServiceImpl t = new TestServiceImpl();
        t.read();
    }
}
