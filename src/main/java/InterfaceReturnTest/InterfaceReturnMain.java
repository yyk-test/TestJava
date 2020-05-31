package InterfaceReturnTest;

public class InterfaceReturnMain {
    public static void main(String[] args) {
        InterfaceReturner interfaceReturner = new InterfaceReturnerImpl();
        TestContext testContext = interfaceReturner.getContext();
        System.out.println(testContext.toString());
    }
}
