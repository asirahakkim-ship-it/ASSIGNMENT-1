public class SecondLargestElement {
    public static void main(String[] args) {
        int sec[]={14,28,19,33,45,12};
        int first=0;
        int second=0;
        for(int i=0; i<sec.length; i++){
            if(sec[i]>first){
                second=first;
                first=sec[i];
            }
        }
        System.out.println("Second Maximum" +" "+second);


    }
}
