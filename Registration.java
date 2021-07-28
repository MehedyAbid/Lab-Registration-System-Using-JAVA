import java.util.ArrayList;
public class Registration {
    ArrayList<Student> a = new ArrayList<Student>();

    void print() {
        for (int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i).name);
            System.out.println(a.get(i).sid);
            System.out.println(a.get(i).email);
            System.out.println(a.get(i).pass);
        }
    }

    int look(String s) {
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i).email.contains(s)) {
                return i;
            }
        }
        return -1;
    }
}