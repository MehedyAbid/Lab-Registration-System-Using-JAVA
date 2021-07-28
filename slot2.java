import java.util.ArrayList;

public class slot2 {
   static ArrayList<Student> s2 = new ArrayList<Student>();
    static int getSeat(){
        return 6-s2.size();
    }
    static void print() {
        for (int i = 0; i < s2.size(); i++) {
            System.out.println("Name : " +s2.get(i).name+"  Sid : "+s2.get(i).sid);
        }
    }
}
