import GitTest.GitConnection;

import java.util.HashMap;
import java.util.Map;

public class Test2 {
    public static void main(String[] args) {
        GitConnection a = new GitConnection();
        GitConnection b = new GitConnection();
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
    }
}
