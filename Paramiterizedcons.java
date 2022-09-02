// using Parameterized constructor.
package testprogram;

public class Paramiterizedcons {
		int age;
		String name;
		Paramiterizedcons(int a,String n){
			age=a;
			name=n;
		}
		void show() {
			System.out.println(age+" "+ name );}
		
		public static void main(String[] args) {
			Paramiterizedcons a=new Paramiterizedcons(20,"Rohit");
			Paramiterizedcons d=new Paramiterizedcons(30,"Arnab");
		a.show();
		d.show();
		
	}

}
