import java.util.HashMap;
import java.util.Map;


public class D51Ensyu {
    public static void main(String[] args) {
        D51Student student = new D51Student(args[0], args[1]);
        System.out.println("学生番号: " + student.getID());
        System.out.println("氏名: " + student.getName());
    }
}
class D51Student {
    private String ID;
    private String Name;

    public D51Student(String ID, String Name) {
        this.ID = ID;
        this.Name = Name;
    }
    // mainに値を渡したいためgetter
    public String getID() {
        return ID;
    }
    public String getName() {
        return Name;
    }
}

//        Map<String, String> student = new HashMap<>();
//        student.put("s24000", "山田太郎");
//        if (student.containsKey(args[0])) {
//            System.out.println("学籍番号: " + args[0]);
//            System.out.println("氏名: " + args[1]);
//        }
//    }
//    public static void D51Student (Map<String, String> student) {
//    }
//}