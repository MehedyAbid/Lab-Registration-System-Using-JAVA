import java.util.ArrayList;

public class slot1 {
    static ArrayList<Student> s1 = new ArrayList<Student>();
    static int getSeat(){
        return 6-s1.size();
    }
    static void print() {
        for (int i = 0; i < s1.size(); i++) {
            System.out.println("Name : " +s1.get(i).name+"  Sid : "+s1.get(i).sid);
        }
    }
}
