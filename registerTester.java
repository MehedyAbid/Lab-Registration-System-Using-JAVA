import  java.util.Scanner;
public class registerTester{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       // Student s = new Student();
        Registration r = new Registration();
        while (true) {
            System.out.println("Enter 1 for student login");
            System.out.println("Enter 2 for faculty login");
            System.out.println("Enter 3 for student registration");
            int choice=sc.nextInt();
            sc.nextLine();
            if (choice==1){
                System.out.println("please enter email");
                String l=sc.nextLine();
                System.out.println("please enter password");
                String k= sc.nextLine();
                int i=r.look(l);
                if(r.look(l)>-1) {
                    System.out.println("Succeded");
                    if(slot1.getSeat()!=0 && slot2.getSeat()!=0) {
                        System.out.println("1 Section-01 Sunday: 12:30 pm 1.00 pm " + slot1.getSeat() + " Seats Remaining");
                        System.out.println("2 Section-02 Sunday:  2:30 pm 4.00 pm " + slot2.getSeat() + " Seats Remaining");
                        System.out.println("Enter 1 to choose Slot 1 or  2 to choose Slot 2");
                        int v = sc.nextInt();
                        sc.nextLine();
                        if (v == 1) {
                            slot1.s1.add(r.a.get(i));
                        } else {
                            slot2.s2.add(r.a.get(i));
                        }
                    }
                    else if(slot1.getSeat()==0){
                        System.out.println("2 Section-02 Sunday:  2:30 pm 4.00 pm " + slot2.getSeat() + " Seats Remaining");
                        System.out.println("Enter 1");
                        int v = sc.nextInt();
                        sc.nextLine();
                        slot2.s2.add(r.a.get(i));
                    }
                    else{
                        System.out.println("1 Section-01 Sunday: 12:30 pm 1.00 pm " + slot1.getSeat() + " Seats Remaining");
                        int v = sc.nextInt();
                        sc.nextLine();
                        slot1.s1.add(r.a.get(i));
                    }
                }

                else {
                    System.out.println("Please register first");
                    continue;
                }
            }
            if(choice==3){
                Student s = new Student();
            System.out.println("please enter name");
            s.name = sc.nextLine();
            System.out.println("please enter sid");
            s.sid = sc.nextLine();
            System.out.println("please enter email");
            s.email = sc.nextLine();
            System.out.println("please enter password");
            s.pass = sc.nextLine();
            r.a.add(s);
            }
            if(choice==2){
                System.out.println("Please enter 1 to see Section 1 list or enter 2 to see Section 2 students list");
                int p=sc.nextInt();
                sc.nextLine();
                if(p==1){
                    System.out.println("Slot 1 Students list");
                    slot1.print();
                }
                else {
                    System.out.println("Slot 2 Students list");
                    slot2.print();
                }
            }
           // r.print();
            System.out.println("please enter 1 to continue and 0 to close");
            int x=sc.nextInt();
            sc.nextLine();
            if(x==0) break;
        }
    }
}
