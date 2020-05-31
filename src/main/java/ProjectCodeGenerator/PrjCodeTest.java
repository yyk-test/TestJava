package ProjectCodeGenerator;

public class PrjCodeTest {
    public static void main(String[] args) {
        ProjectCode code = new ProjectCode();
        String name = "   -----   -test--test---";
        String result = code.getCodeForName(name);
        System.out.println(result);

        CrappyProjectCode ccode = new CrappyProjectCode();
        String cresult = ccode.getCodeForName(name);
        System.out.println(cresult);
    }
}
