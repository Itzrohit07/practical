
package testprogram;

 class Objectmethod1{

		int age;
		String name;
		void input(int a,String n) {
			age=a;
			name=n;
		}
		
 }
  public class Objmethod1{
	public static void main(String[]args) {
	Objectmethod1 a=new Objectmethod1();
	Objectmethod1 b=new Objectmethod1();			
				
	a.age=10;
	a.name="Arnab";
	
	b.age=20;
	b.name="pritam";
				
				
	System.out.println(a.age+" "+a.name);
	System.out.println(b.age+" "+b.name);			
			}
		

	}
 

