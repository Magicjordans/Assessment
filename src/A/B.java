package A;

import java.util.ArrayList;
import java.util.Scanner;

public class B {
	public static void main(String[] args) {
	    Scanner number = new Scanner(System.in); 
	    System.out.println("Enter the number"); //takes user input 
	    
	    String Unum = number.nextLine();
	    
	    String [] Digits1 = {" ","_"," _","__"};
	    String [] Digits2 = {"|","_|","|_|","|_"," |","_|"};
	    String [] Digits3 = {"|","|_","_|"," |","|_|"," _|","  |"};
	    
	    
	    ArrayList<String> outputs1 = new ArrayList<String>();
	    ArrayList<String> outputs2 = new ArrayList<String>();
	    ArrayList<String> outputs3 = new ArrayList<String>();
	    
	    for(int i  = 1; i < 10 ;i++) {
	    	
	    	if(i ==1) {
	    		outputs1.add(Digits1[0]);
	    		
	    		outputs2.add(Digits2[0]);
	    		
	    		outputs3.add(Digits3[0]);
	    		}
	    	if (i==2) {
	    		outputs1.add(Digits1[3]);
	    		outputs2.add(Digits2[1]);
	    		outputs3.add(Digits3[1]);
	    		
	    	}
	    	if (i==3) {
	    		outputs1.add(Digits1[1]);
	    		outputs2.add(Digits2[1]);
	    		outputs3.add(Digits3[2]);
	    		
	    	}
	    	if (i==4) {
	    		outputs1.add(Digits1[0]);
	    		outputs2.add(Digits2[2]);
	    		outputs3.add(Digits3[6]);
	    		
	    	}
	    	if (i==5) {
	    		outputs1.add(Digits1[2]);
	    		outputs2.add(Digits2[3]);
	    		outputs3.add(Digits3[5]);
	    		
	    	}
	    	if (i==6) {
	    		outputs1.add(Digits1[2]);
	    		outputs2.add(Digits2[3]);
	    		outputs3.add(Digits3[4]);
	    		
	    	}
	    	if (i==7) {
	    		outputs1.add(Digits1[1]);
	    		outputs2.add(Digits2[4]);
	    		outputs3.add(Digits3[3]);
	    		
	    	}
	    	if (i==8) {
	    		outputs1.add(Digits1[2]);
	    		
	    		outputs2.add(Digits2[2]);
	    		
	    		outputs3.add(Digits3[4]);
	    		
	    	}
	    	if (i==9) {
	    		outputs1.add(Digits1[2]);
	    		
	    		outputs2.add(Digits2[2]);
	    		
	    		outputs3.add(Digits3[5]);
	    		
	    		
	    	}
	    	
	    	
	    	
	    }
	    for(int i  = 0; i < Unum.length();i++) {
	    	char x = Unum.charAt(i);
	    	if(x =='1') {
	    		System.out.print(outputs1.get(0));
	    		System.out.print(" ");
	    	}
	    	if(x =='2') {
	    		System.out.print(outputs1.get(1));
	    		System.out.print(" ");
	    	}
	    	if(x =='3') {
	    		System.out.print(outputs1.get(2));
	    		System.out.print(" ");
	    	}
	    	if(x =='4') {
	    		System.out.print(outputs1.get(3));
	    		System.out.print(" ");
	    	}
	    	if(x =='5') {
	    		System.out.print(outputs1.get(4));
	    		System.out.print(" ");
	    	}
	    	if(x =='6') {
	    		System.out.print(outputs1.get(5));
	    		System.out.print(" ");
	    	}
	    	if(x =='7') {
	    		System.out.print(outputs1.get(6));
	    		System.out.print(" ");
	    	}
	    	if(x =='8') {
	    		System.out.print(outputs1.get(7));
	    	}
	    	if(x =='9') {
	    		System.out.print(outputs1.get(8));
	    		System.out.print(" ");
	    	}
	    	
	    }
	    System.out.print(System.getProperty("line.separator"));
	    for(int i  = 0; i < Unum.length();i++) {
	    	char x = Unum.charAt(i);
	    	if(x =='1') {
	    		System.out.print(outputs2.get(0));
	    		System.out.print(" ");
	    	}
	    	if(x =='2') {
	    		System.out.print(outputs2.get(1));
	    		System.out.print(" ");
	    	}
	    	if(x =='3') {
	    		System.out.print(outputs2.get(2));
	    		System.out.print(" ");
	    	}
	    	if(x =='4') {
	    		System.out.print(outputs2.get(3));
	    		System.out.print(" ");
	    	}
	    	
	    	if(x =='5') {
	    		System.out.print(outputs2.get(4));
	    		System.out.print(" ");
	    	}
	    	if(x =='6') {
	    		System.out.print(outputs2.get(5));
	    		System.out.print(" ");
	    	}
	    	if(x =='7') {
	    		System.out.print(outputs2.get(6));
	    		System.out.print(" ");
	    	}
	    	if(x =='8') {
	    		System.out.print(outputs2.get(7));
	    		System.out.print(" ");
	    	}
	    	if(x =='9') {
	    		System.out.print(outputs2.get(8));
	    		System.out.print(" ");
	    	}
	    	
	    }
	    System.out.print(System.getProperty("line.separator"));
	    
	    for(int i  = 0; i < Unum.length();i++) {
	    	char x = Unum.charAt(i);
	    	
	    	if(x =='1') {
	    		System.out.print(outputs3.get(0));
	    		System.out.print(" ");
	    	}
	    	if(x =='2') {
	    		System.out.print(outputs3.get(1));
	    		System.out.print(" ");
	    	}
	    	if(x =='3') {
	    		System.out.print(outputs3.get(2));
	    		System.out.print(" ");
	    	}
	    	if(x =='4') {
	    		System.out.print(outputs3.get(3));
	    		System.out.print(" ");
	    	}
	    	if(x =='5') {
	    		System.out.print(outputs3.get(4));
	    		
	    		System.out.print(" ");
	    	}
	    	if(x =='6') {
	    		System.out.print(outputs3.get(5));
	    		System.out.print(" ");
	    	}
	    	if(x =='7') {
	    		System.out.print(outputs3.get(6));
	    		System.out.print(" ");
	    	}
	    	if(x =='8') {
	    		System.out.print(outputs3.get(7));
	    		System.out.print(" ");
	    	}
	    	if(x =='9') {
	    		System.out.print(outputs3.get(8));
	    		System.out.print(" ");
	    	}
	    	
	    	
	    }
	    
	}
}
