import java.util.ArrayList;
import java.util.Hashtable;
import java.util.InputMismatchException;
//import java.util.InputMismatchException;
import java.util.Scanner;
public class Test {
	private static Scanner scanner;

	public static void main(String args[]) {
        // init Hashtable
		Integer choice;
		Hashtable<Integer, ArrayList<String>> hashTable = new Hashtable<Integer, ArrayList<String>>();
		HashOrder hash = new HashOrder();
        do{
        	scanner = new Scanner(System.in);
        	System.out.println("-----------------------------");
        	System.out.println("1: Them du lieu vao hashTable");
        	System.out.println("2: Loai du lieu khoi hashTable");
        	System.out.println("3: In ra hashTable");
        	System.out.println("4: Xoa toan bo hashTable");
        	System.out.println("5: Thoat");
        	System.out.println("Ban muon lam gi?: ");
        	System.out.println("-----------------------------");
        	try {
                choice = scanner.nextInt();
                if (choice == 1) {
                	hash.addData(hashTable);          
                }
                else if(choice == 2) {
                	hash.removeData(hashTable);
                }
                else if(choice == 3) {
                	 // show Hashtable using method keySet()
                    
                    for (Integer key : hashTable.keySet()) {
                        ArrayList<String> value = hashTable.get(key);                       
                        System.out.println(key + " = " + value);
                    }
                }
                else if(choice == 4) {
                	//try{
                		hash.removeAll(hashTable);
                	//}
                	//catch(ConcurrentModificationException e) {
                		//System.out.println("Wrong!");
                	//}
                }
                else if(choice == 5){
                	break;
                }
                else {
                	System.out.println("NHAP SAI !!!");
                }
        	}
        	catch(InputMismatchException e) {
        		System.out.println("NHAPSAI !!!");
        	}
    		
        }while(true);

    }

}
