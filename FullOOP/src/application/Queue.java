package application;

import java.util.LinkedList;
import javax.swing.JOptionPane;

public class Queue {
	public  LinkedList <String> queue = new LinkedList <String>();
    
    //Return size of List
    public int size() {
        return queue.size();
      }
    
    //List is empty?
    public boolean isEmpty() {
        return size() == 0;
      }

    public boolean isFull() {
    	return size() == 13;
    }
    
    public void enQueue(String str) {
    	if(isFull())
    		JOptionPane.showMessageDialog(null,"Queue is FULL!");
    	/*System.out.print("Enter a string: ");
        str=scanner.nextLine();*/
        queue.addLast(str);
    }
    
    public void deQueue() {
		if(isEmpty())
    		JOptionPane.showMessageDialog(null,"Queue is EMPTY!");
		int i;
		int dem=1;
		for(i=0; i< queue.size(); i++) {
			if(queue.get(i) == "")
			dem++;
		}
		queue.remove(dem);
		queue.addFirst("");
    }
		
		
		
    
   /* public String peek() {
    	if (isEmpty()) 
    	      throw new RuntimeException("Queue Empty");
    	return queue.peekFirst();
    }*/
    
    public void deleteQueue() {
    	queue.clear();
    }
	 
	
}
