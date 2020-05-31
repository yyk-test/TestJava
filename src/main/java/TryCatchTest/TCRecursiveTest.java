package TryCatchTest;

public class TCRecursiveTest {
    static public void TCRecCall(int j) throws IllegalAccessException {
        if(j == 0) {
            System.out.println("at bottom");
            return;
        }
        System.out.println("start of a loop");
        for(int i = 0; i < 2; i++) {

            try {
                System.out.println(i + " and j is : " + j);
                if(j == 1) {
                    throw new IllegalAccessException();
                }
                System.out.println("=========> Going to j-1: " + (j-1));
                TCRecCall(j-1);
            } catch (Exception ex) {
                System.out.println("Caught in call " + j);
            }
        }
    }
}
