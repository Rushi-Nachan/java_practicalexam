import java.util.Scanner;

public class DuplicateElementRemoveinArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Size Of Array");
        int size = sc.nextInt();
        
        int arr[] = new int[size];
        System.out.println("Enter A Array Element");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Array Element After Removing Duplicate Element");
        for(int i=0;i<size;i++){
            boolean isDuplicate = false;
            for(int j=i+1;j<size;j++){
                if(arr[i]==arr[j]){
                    isDuplicate = true;
                    break;
                }
            }
            if(!isDuplicate){
                System.out.print(arr[i]+" ");
            }
        }
    

    }
}
