public class ArrSecHigh {
    public static void main(String[] args) {
    
        int[] arr = {341,12,56,55,11,111,6};
        
        int h = Integer.MIN_VALUE;
        int sh = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length;i++){
            if(arr[i]>h){
                sh=h;
                h=arr[i];
            }
            else if(arr[i]>sh){
                sh=arr[i];
            }
        }
        System.out.println("The second highest number is: " + sh);
    }
}
