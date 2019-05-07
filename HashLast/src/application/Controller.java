package application;

import java.net.URL;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller implements Initializable{

	@FXML
	   	private Button addToHash;
	  
	@FXML
	   	private Button deleteHash;
	
	@FXML
		private Button removeFromHash;
	
	@FXML
   		private TextField myTextField;
	// 20 buttons
	@FXML
		private Button button1,button2,button3,button4,button5,button6,button7,button8,button9,button10,button11,button12,button13,button14,button15,button16,button17,button18,button19,button20;
	Hashtable<Integer, ArrayList<String>> hashTable = new Hashtable<Integer, ArrayList<String>>();
	HashOrder hash = new HashOrder();
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
	}
	public void setIt(Button button,String str) {
		button.setText(str);
	}

	
	public void addHash(ActionEvent event) {
		String str = myTextField.getText();
		hash.addData(hashTable, str);
		if(hashTable.size()==1) {
			ArrayList<String> arr = hashTable.get(hash.hashCode(str));
			if (arr.size()==1) setIt(button1,str);
			if (arr.size()==2) setIt(button2,str);	
			if (arr.size()==3) setIt(button3,str);
			if (arr.size()==4) setIt(button4,str);
		}
		if(hashTable.size()==2) {
				if (hash.hashCode(str)== hash.hashCode(button1.getText()) ) {
					ArrayList<String> arr = hashTable.get(hash.hashCode(str));
					if (arr.size()==2) setIt(button2,str);	
					if (arr.size()==3) setIt(button3,str);
					if (arr.size()==4) setIt(button4,str);
				}
				else{
					ArrayList<String> arr = hashTable.get(hash.hashCode(str));
					if (arr.size()==2) setIt(button6,str);	
					if (arr.size()==3) setIt(button7,str);
					if (arr.size()==4) setIt(button8,str);
				}
			
		}
		//setIt(button1,str);
		System.out.println("Added: "+ str);
		for (Integer key : hashTable.keySet()) {
            ArrayList<String> value = hashTable.get(key);                       
            System.out.println(key + " = " + value);
        }
		
	}
	
	
}
