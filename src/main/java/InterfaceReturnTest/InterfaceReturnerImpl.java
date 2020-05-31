package InterfaceReturnTest;

public class InterfaceReturnerImpl implements InterfaceReturner {

    @Override
    public TestContext getContext() {
        return new TestContextImpl("Smith", "Raceface");
    }
}
