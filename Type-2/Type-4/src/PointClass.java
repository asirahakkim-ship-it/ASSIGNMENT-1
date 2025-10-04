class Point{
    int x,y;
    Point(int x, int y){
        this.x=x;
        this.y=y;
    }
    Point(Point p){
        this.x=p.x;
        this.y=p.y;
    }
    void display(){
        System.out.println(+x+","+y );
    }
}
public class PointClass {
    public static void main(String[] args) {
        Point p1=new Point(2,4);
        Point p2=new Point(p1);
        Point p3=new Point(p2);
        p1.display();
        p2.display();
        p3.display();
    }

}
