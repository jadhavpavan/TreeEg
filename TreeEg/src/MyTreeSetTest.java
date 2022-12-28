import java.util.Scanner;

public class MyTreeSetTest {

	public static void main(String[] args) {



		ChemicalElement gold = new ChemicalElement(79,"Gold","Au",196.97f); //R
		ChemicalElement silver = new ChemicalElement(47,"Silver","Ag",107.87f); //L
		ChemicalElement radium = new ChemicalElement(88,"Radium","Ra",226.03f); //R
	
		ChemicalElement calcium = new ChemicalElement(20,"Calcium","Ca",40.08f); // L L
		ChemicalElement tin  = new ChemicalElement(50,"Tin","Sn",118.711f);// L R
		
		ChemicalElement lead = new ChemicalElement(82,"Lead","Pb",207.2f); // R L
		ChemicalElement uranium  = new ChemicalElement(92,"Uranium","U",238.29f);// R R

		
		Scanner sc=new Scanner(System.in);
		
		MyTreeSet ts=new MyTreeSet();
		
		int choice=0;
		
		do {
			System.out.println("1. Insert an Element ");
			System.out.println("2. Delete an Element ");
			System.out.println("3. InOrder Traversal");
			System.out.println("4. PreOrder Traversal");
			System.out.println("5. PostOrder Traversal");
			System.out.println("6. Exit");
			System.out.println("Enter choice : ");
			choice = sc.nextInt();
			
			switch(choice) {
			case 1: 
				ts.insert(); break; 
			case 3:
				ts.inOrder(ts.root); break;
			case 6: break;
		}
		} while(choice!=6);
		
		}
		

}




class MyTreeSet{
	ChemicalElement root=null,temp;
	
	void insert() {
		create();
		if(root == null) {
			root=temp;
		}
		else {
			search(root);
		}
	}
	
	void create() {
		System.out.println("Enter atomic number- ");
		Scanner sc=new Scanner(System.in);
		int tempatomicnumber = sc.nextInt();
		
		temp = new ChemicalElement();
		temp.atomicNumber=tempatomicnumber;
	
		temp.left=null;
		temp.right=null;
	}
	
	void search(ChemicalElement ce) {
		if((temp.atomicNumber > ce.atomicNumber) && (ce.right != null))
			search(ce.right);
		if((temp.atomicNumber > ce.atomicNumber) && (ce.right == null))
			ce.right=temp;
		if((temp.atomicNumber < ce.atomicNumber) && (ce.left != null))
			search( ce.left);
		if((temp.atomicNumber < ce.atomicNumber) && (ce.left == null))
			ce.left=temp;
	}
	
	void inOrder(ChemicalElement ce) {
		if(root == null ) {
			System.out.println("List is empty.......");
			return;
		}
		else {
			if(ce.left != null)
				inOrder(ce.left);
			System.out.println("DATA- "+ce);
			
			if(ce.right != null)
				inOrder(ce.right);
		}
	}
	
	
	
}