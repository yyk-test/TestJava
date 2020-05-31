package ProjectCodeGenerator;

public class CrappyProjectCode {
    public String getCodeForName(final String name) {
        if (name == null || name.length() == 0) {
            return "";
        }

        String safeName = name.toLowerCase();
        safeName = safeName.replaceAll("[^0-9a-z-]", "-");
        safeName.replaceAll("[-][-]+", "-");
        return safeName;
    }
}
