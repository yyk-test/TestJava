package EnumSingletonTest;

public enum EnumSingleton {
    INSTANCE, ANOTHER_INSTANCE;

    private String s = "hello";

    public void show() {
        System.out.println(s);
    }
}
