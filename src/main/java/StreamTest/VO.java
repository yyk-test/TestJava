package StreamTest;

public class VO {
    public String key;
    public String value;

    public VO(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public String toString() {
        System.out.println( "VO{" +
                "key='" + key + '\'' +
                ", value='" + value + '\'' +
                '}');
        return null;
    }
}
