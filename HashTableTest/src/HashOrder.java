import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Scanner;

public class HashOrder extends HashFunction{

	private Scanner scanner;
	private String str;
	public HashOrder() {
		// TODO Auto-generated constructor stub
	}
	public void addData(Hashtable<Integer, ArrayList<String>> h) {
		System.out.println("Nhap du lieu: ");
		scanner = new Scanner(System.in);
		String str;
		do {
		str = scanner.nextLine();
		}while(str.length()==0);
		HashFunction hash = new HashFunction();
		int ping = 0;
		// ping : check if the key had or not ( 0 for no, 1 for yes )
		for (Integer key : h.keySet()) {
			if (key == hash.hashCode(str)) 
			{
				ping =1;
			} 
		}
		// if no key, then create key, array , add
		if (ping == 0) {
		h.put(hash.hashCode(str), new ArrayList<String>());
		h.get(hash.hashCode(str)).add(str);
		}
		// if had key, then check( if the data had created or not? ) 0 for no, 1 for yes
		// if the data had created, don't add more
		// if the data hadn't created, add it
		else if(ping == 1) {
			int j=0;
			int check = 0;			
			for (Integer key : h.keySet()) {
                ArrayList<String> value1 = h.get(key);
                if(value1.size()==0) {
                	do {
                		if (value1.get(j).equals(str)==true) {
                			System.out.println("Du lieu da ton tai!!!");
                			check = check +1;
                			break;
                		}
                		j++;
                	}while(true);
                }
            }
			if(check == 0) h.get(hash.hashCode(str)).add(str);
		}
	}
	public void removeData(Hashtable<Integer, ArrayList<String>> h) {
		System.out.println("Ban muon loai bo du lieu gi?");
		scanner = new Scanner(System.in);
		do {
			str = scanner.nextLine();
		}while(str.length()==0);
		HashFunction hash = new HashFunction();
		int ping = 0;
		// ping : check if the key had or not ( 0 for no, 1 for yes )
		for (Integer key : h.keySet()) {
			if (key == hash.hashCode(str)) {
				ping =1;
			} 
		}
		// if ping = 0, can not remove
		if (ping == 0) {
			System.out.println("Chua ton tai du lieu nay");
		}
		// if ping = 1, find the data and remove it 
		else if (ping == 1)
		{
			for (Integer key : h.keySet()) {
                ArrayList<String> value = h.get(key);
                int i = 0;
                do {
                	
                	if (value.get(i).equals(str)==true) {                	
                		h.get(key).remove(str);
                		System.out.print("Da loai bo du lieu: " + str);
                	}
                	i++;
                	
                }while(i<value.size());
                if (value.size() == 0) {
                	h.remove(key);
                }
            }

			
		}
	}

}
