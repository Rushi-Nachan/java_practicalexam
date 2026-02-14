import java.util.Scanner;

public class SecondLarjestElmentArray {
    

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter A Size Of array");
        int size =sc.nextInt();
        int arr[] = new int [size];
        System.out.println("Enter A array Element");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("Second Largest Element is: "+arr[size-2]);
    }
}
