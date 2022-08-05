
public class Main {
public static void main(String[] args) {
	System.out.println("Grade Manage_Pro Start");
	Student [] array = new Student[100]; 
	Input input = new Input(array);
//	input.input(array);  이젠 이렇ㄱ ㅔ말고 인풋클래스의 생성자를 이용해보자 .
	int count = input.input();
	
	Calc calc = new Calc(array);
	calc.calc(count);

	Sort sort = new Sort(array,count);
	sort.bubbleSort();
	
	Output output = new Output(); //아무것도 안넣고 아웃풋메소드가 알아서출력
	output.print(array, count);
	
	System.out.println("Grade Manage_Pro End");
}
}
