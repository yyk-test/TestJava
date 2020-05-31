package Annotations;

public class MainTest {

    public static void main(String[] args) {
        DummyData data = new DummyData();
        System.out.println(SingleValProcessor.getValue(data));

        String test = null;
        if(test!=null)
        System.out.println(test.equals("null"));
    }
}
