package DeprecatedAnnotTest;

public class TestServiceImpl implements TestService{

    private TestService service;

    @Override
    public void write() {
        System.out.println("write, yes");
    }

    @Deprecated
    @Override
    public void read() {
        System.out.println("read, yes");
    }

    @Override
    public void print() {
        service.print();
    }
}
