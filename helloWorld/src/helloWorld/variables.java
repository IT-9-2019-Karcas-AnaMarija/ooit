package helloWorld;

public class variables {

	public static void main(String[] args) {
		
		double firstNum;
		firstNum=1;
		double secondNumber=5;
		int result= (int) (firstNum/secondNumber);
		System.out.println(result);
		
		double doubleResult= firstNum/secondNumber;
		System.out.print(doubleResult);
		
		
		boolean alwaysTrue=true;
		boolean secondBoolean= false;
		
		String name="Petar";
		String lastName= "petrovic";
		System.out.print(name + " "+ lastName+ "Njegos");
		
		if (firstNum>0)
			System.out.println("num is positive ");
		else if (firstNum<0)
			System.out.println("lba bla");
		
		int i =1;
		/*while(i<=10){
			System.out.println(i);
			i++;
			
		}*/
		//1. zadatak
		int a=1;
		int zbir=1;
		while (a<=5){
			zbir*=a;
			a++;
		}
		System.out.println(zbir);
		
		
		
	}

}
