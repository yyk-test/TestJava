import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.ObjectMapper;


public class Test1 {

    static public class Student{
        @JsonProperty("name")
        public String name;

        @JsonProperty("age")
        public int age;

        @JsonProperty("nick")
        public String nick;

        public Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getNick() {
            return nick;
        }

        public void setNick(String nick) {
            this.nick = nick;
        }
    }
    static public void main(String[] args) throws JsonProcessingException {
        Comparator<Student> sc = Comparator.comparing(Student::getName, String.CASE_INSENSITIVE_ORDER.reversed());
        Student s1 = new Student("a", 1);
        Student s2 = new Student("b", 2);
        List<Student> ll = Arrays.asList(s1,s2);


        String s = "ssss";

        System.out.println(Arrays.asList(s.trim().split(",")));

        s1.setNick("hahah");
        ObjectMapper mapper = new ObjectMapper();
        String t = mapper.writeValueAsString(s1);
        System.out.println(t);

        char[] crr = new char[]{'l', 'k'};
        System.out.println(crr.toString());

    }
}
