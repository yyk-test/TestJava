package TryCatchTest;

public class TCReturnTest {

    public static int test(int i){
        try {
            System.out.println("in try");
            if(i == 1)
            throw new NullPointerException();
        } catch (Exception e) {
            System.out.println("in catch");
            return 1;
        }
        return 2;
    }
}
