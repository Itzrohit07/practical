package testprogram;

  class staticvariable1 {
	int rollno;
	String name;
	float fee;
	static String collage="GMS";
     
	staticvariable1(int rollno,String name,float fee){
     this.rollno=rollno;
     this.name=name;
     this.fee=fee;
	}
	void Display() {
		System.out.println(rollno+" "+fee+" "+collage);
	}
     
	public static void main(String[] args) {
	
	staticvariable1 s1=new staticvariable1(111,"Rohit",20000);
	staticvariable1 s2=new staticvariable1(777,"Pritam",30000);
	
	s1.Display();
	s2.Display();
	
	}

}
 
