package ProjectCodeGenerator;

public class ProjectCode {
    public String getCodeForName(final String name) {
        if (name == null || name.length() == 0) {
            return "";
        }

        String safeName = name.toLowerCase();
        safeName = safeName.replaceAll("[^0-9a-z-]", "-");
        safeName = safeName.replaceAll("-+", "-");
        safeName = safeName.replaceAll("^-+", "");
        safeName = safeName.replaceAll("-+$", "");
        return safeName;
    }
}
