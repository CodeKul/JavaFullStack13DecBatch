package statickeyword;
//static method
public class Student {
    int rollNo;
    String name;
    static String schoolName = "St. Mary School,Pune";

    static void updateSchoolName(String s){
        schoolName = s;
    }
    void show(){
        System.out.println(rollNo +" : "+name+" : "+schoolName);
    }
}
class StudentImpl{

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Jay";
        s1.rollNo = 5;
        Student s2 = new Student();
        s2.rollNo = 6;
        s2.name = "Akshata";
        Student.updateSchoolName("ST Mehata School,Mumbai");
        s1.show();
        s2.show();
    }
}
