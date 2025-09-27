public class EvenIndex {
    public static void main(String[] args) {
        int even[]={10,20,30,40,50,60};
        System.out.println("Even Values and Even Index");
        for(int i=0; i<even.length; i++) {
            if (i % 2 == 0 && even[i] % 2 == 0) {
                System.out.println(even[i]);
            }
        }
    }
}
