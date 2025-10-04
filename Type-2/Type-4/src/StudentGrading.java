class Person{
    String name="Asira";
    int age=19;
    void display(){
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
    }
}
class Student extends Person{
    int marks=90;
    String grade="A";
    void display1(){
        System.out.println("Marks:"+marks);
        System.out.println("Grade:"+grade);
    }
}
class GraduateStudent extends Student{
    String researchTopic="JAVA";
    void display2(){
        System.out.println("ResearchTopic:"+researchTopic);
    }

}
public class StudentGrading {
    public static void main(String[] args) {
        GraduateStudent GS=new GraduateStudent();
        GS.display();
        GS.display1();
        GS.display2();

    }
}
