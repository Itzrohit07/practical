package testprogram;

public class copyconst {

		int age;
		String name;
	
		copyconst(int a,String n){
			age=a;
			name=n;
		}
		copyconst(){}
	void show() {
	System.out.println(age+" "+name );
		}
	
	public static void main(String[]args) {
		copyconst s1=new copyconst(20,"Rohit");
		copyconst s2=new copyconst();
		s2.age=s1.age;
		s2.name=s1.name;
		
		s1.show();
		s2.show();
	}
		
			
			
				

	

}

