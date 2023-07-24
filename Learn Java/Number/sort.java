import java.util.*;
public class sort {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int[] arr = {};
    int temp = 0; // Swapping the data
    int ans = 0; // Checking Data 
    int choice =0;
    
    
    exit: for(int i =1; i<arr.length;i++){ // Ascending Order
            if(arr[i-1]>arr[i]){
                ans = 1;
                break exit;
            }
            else ans =-1; 
    } 
    if(!(ans ==-1)){
                exit_1: for(int i =1; i<arr.length;i++){ // Descending Order
                    if(arr[i-1]<arr[i]){
                        ans = 1;
                        break exit_1;
                    }
                    else ans =-2; 
            }
    }

    System.out.println(" ");
    System.out.println("     Ajay Negi");
    switch (ans) {
            case -1: System.out.println("Data is already sorted in ascending order");
                     System.out.println(" ");
                     System.out.println("For sorting in descending order enter: 2");
                     choice = input.nextInt();
                     while(choice!=2){
                         System.out.println("You have enter the worng Input");
                         System.out.println("For sorting in descending order enter: 2");
                         choice = input.nextInt();
                     }
                break;

            case -2: System.out.println("Data is already sorted in Descending Order");
                     System.out.println(" ");
                     System.out.println("For sorting in ascending order enter: 1");
                     choice = input.nextInt();
                     while(choice!=1){
                         System.out.println("You have enter the worng Input");
                         System.out.println("For sorting in descending order enter: 2");
                         choice = input.nextInt();
                     }       
                break;
        
            default: System.out.println("This is unsorted data");
                     System.out.println(" ");
                     System.out.println("For sorting in ascending order enter: 1\nFor sorting in descending order enter: 2");
                     choice = input.nextInt();
                     while(choice!=1 && choice!=2){
                         System.out.println("You have enter the worng Input");
                         System.out.println("For sorting in ascending order enter: 1\nFor sorting in descending order enter: 2");
                         choice = input.nextInt();
                     }
                break;
    }

    switch (choice) {

        case 1: System.out.print("Sorted data in ascending order : "); //Ascending Order

                for (int i = 0; i < arr.length; i++) {  
                    for (int j = i + 1; j < arr.length; j++) { // Inner nested loop pointing 1 index ahead
                        temp = 0;

                        // Checking elements
                        if (arr[j] < arr[i]) { 
                            // Swapping
                            temp = arr[i];
                            arr[i] = arr[j];
                            arr[j] = temp;
                        }
                    }

                    System.out.print(arr[i] + " ");
                }
                break;


        case 2: System.out.print("Sorted data in descending order : "); //Descending Order

                for (int i = 0; i < arr.length; i++) {  
                    for (int j = i + 1; j < arr.length; j++) { // Inner nested loop pointing 1 index ahead
                        temp = 0;

                        // Checking elements
                        if (arr[i] < arr[j]) { 
                            // Swapping
                            temp = arr[i];
                            arr[i] = arr[j];
                            arr[j] = temp;
                        }
                    }

                    System.out.print(arr[i] + " ");
                }
                break;
    }
}
}