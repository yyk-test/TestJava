package InterfaceReturnTest;

public class InvocationTest {
    public InterfaceReturner interfaceReturner;

    public InvocationTest() {
        this.interfaceReturner = new InterfaceReturnerImpl();
    }

    public TestContext invokeContext() {
        return interfaceReturner.getContext();
    }
}
