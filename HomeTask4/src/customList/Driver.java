package customList;
import java.util.*;
public class Driver
{
    public static void main(String[] args) 
    {
        MyList<Integer> list = new MyList<>();
        boolean b = true;
        Scanner sc =  new Scanner(System.in);
        while(b) {
        	System.out.println("Select your operation from 1 to 4");
        	System.out.println("1. Add element to list");
        	System.out.println("2. Remove element from list");
        	System.out.println("3. Size Of List");
        	System.out.println("4. Access element with index");
        	System.out.println("5. Print list");
        	int c = sc.nextInt();
        	switch(c) {
        	case 1 : 
        		System.out.println("Enter number to be added");
        		list.addElement(sc.nextInt());
        	System.out.println("Do you want to continue?");
        	if(sc.next().charAt(0) == 'y') {
        		b = true;
        		break;
        	} else {
        		System.out.println("Thank you for using my List!!");
        		b = false;
        		break;
        	}
        	case 2 : 
        		System.out.println("Enter number to be deleted");
        		list.removeElement(sc.nextInt());
        	System.out.println("Do you want to continue?");
        	if(sc.next().charAt(0) == 'y') {
        		System.out.println("Thank you for using my List!!");
        		b = true;
        		break;
        	} else {
        		b = false;
        		break;
        	}
        	case 3 : System.out.println("The size of list is "+list.size());
        	System.out.println("Do you want to continue?");
        	if(sc.next().charAt(0) == 'y') {
        		b = true;
        		break;
        	} else {
        		System.out.println("Thank you for using my List!!");
        		b = false;
        		break;
        	}	
        	case 4 :
        		System.out.println("Enter index : Indexing starts from 0");
        		System.out.println("The element is "+list.getElement(sc.nextInt()));
        	System.out.println("Do you want to continue?");
        	if(sc.next().charAt(0) == 'y') {
        		b = true;
        		break;
        	} else {
        		System.out.println("Thank you for using my List!!");
        		b = false;
        		break;
        	}
        	case 5 : System.out.println("The list is "+list);
        	System.out.println("Do you want to continue?");
        	if(sc.next().charAt(0) == 'y') {
        		b = true;
        		break;
        	} else {
        		System.out.println("Thank you for using my List!!");
        		b = false;
        		break;
        	}
        	}
        
    }
    }
}