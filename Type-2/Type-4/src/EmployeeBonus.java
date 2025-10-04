class Employee{
    void getBonus(){

    }
}
class Manager extends Employee{
    void getBonus(){
        System.out.println("2% Bonus");
    }

}
class Developer extends Employee {
    void getBonus() {
        System.out.println("1% Bonus");
    }
}
public class EmployeeBonus {
    public static void main(String[] args) {
        Manager mg=new Manager();
        mg.getBonus();
        Developer dp=new Developer();
        dp.getBonus();

    }
}
