class Students{
    String name;
    int rollNo;
    int marks;
    Students(String name,int rollNo, int marks){
        this.name=name;
        this.rollNo=rollNo;
        this.marks=marks;
    }
    Students(Students o){
        this.name=o.name;
        this.rollNo=o.rollNo;
        this.marks=o.marks;
    }
    void display(){
        System.out.println("Name:"+name+ "RollNo:"+rollNo+ "Marks:" +marks);
    }
}
public class StudentRecord {
    public static void main(String[] args) {
        Students obj1 = new Students("Asira", 01, 85);
        Students obj2 = new Students(obj1);
        obj1.display();
        obj2.display();

    }
}
