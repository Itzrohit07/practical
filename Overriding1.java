package testprogram;
    class Exam{
    	int marks() {
    return 0;
   }
    }
class comp extends Exam{
	int marks() {
	return 70;
   }
}
class math extends Exam{
	 int marks() {
	 return 70;
   }
}
class science extends Exam{
	int marks() {
		return 50;
	}
}
class eng extends Exam{
	int marks() {
		return 90;
	}
}
class Overriding1{
   public static void main(String[] args) {
	comp m=new comp();
	math c=new math();
	science s=new science();
	eng e=new eng();
	System.out.println("computer marks is:"+m.marks());
	System.out.println("math marks is:"+c.marks());
	s.marks();
	e.marks();

	}

}
