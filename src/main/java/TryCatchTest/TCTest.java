package TryCatchTest;


public class TCTest {
    public static void main(String[] args) {
//        StringBuilder sb = new StringBuilder();
//        try {
//            for (int i = 0; i < 10; i++) {
//                try {
//                    sb.append("=====\"" + "i: " + i);
//                    sb.append("  res:");
//                    sb.append(10/i);
//                    sb.append("\",=========");
////                    if(i == 5) {
////                        throw new IllegalAccessException();
////                    }
//                } catch(ArithmeticException e) {
//                    System.out.println("inner t.c." + e);
//                }
//            }
//        } catch(Exception e) {
//            System.out.println("outer t.c." + e);
//        }
//        System.out.println(sb.toString());

//        TCRecursiveTest instance = new TCRecursiveTest();
//        try {
//            instance.TCRecCall(3);
//        } catch (Exception ex) {
//            System.out.println("---> OOOOUUUUTTTER:");
//        }


        TCReturnTest t = new TCReturnTest();
        System.out.println(t.test(2));
    }
}
