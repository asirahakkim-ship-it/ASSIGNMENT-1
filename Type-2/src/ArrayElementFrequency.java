public class ArrayElementFrequency {
    public static void main(String[] args) {
        int arr[]={2,4,2,6,2,9,6};
        int free=0;
        int value=6;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==value){
                free++;
            }
        }
        System.out.println("Frequency Element" +" " +free);
    }
}
