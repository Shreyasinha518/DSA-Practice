import java.util.*;
class Course{
    String name;
    String code;
    Course(String name,String code){
        this.name=name;
        this.code=code;

    }
    Course(){}
    void setCourse (String name,String code){
        this.name=name;
        this.code=code;
    }
    String getCourse(){
        return name+" | "+code;
    }

    }
public class courses {
    public static void main(String args[]){
        Scanner in =new Scanner(System.in);
        Course c1=new Course();
        System.out.println("Enter the course name:");
        String name1=in.nextLine();
        System.out.println("Enter the course code:");
        String code1=in.nextLine();
        System.out.println("Enter the course name:");
        String name2=in.nextLine();
        System.out.println("Enter the course code:");
        String code2=in.nextLine();
        c1.setCourse(name1,code1);
        Course c2=new Course();
        c2.setCourse(name2,code2);
        System.out.printf("Courses:\n %s \n %s",c1.getCourse(),c2.getCourse());

    }
}
