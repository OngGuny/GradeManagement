import java.util.Scanner;

//캡슐화 적용
public class Input {
	private Student[] array;
	private Scanner sc;
	
	public Input(Student [] array) {
		this.array=array;
		this.sc= new Scanner(System.in);
	}
		
		//어차피 인풋클래스 생성자 호출할꺼다. 
		public int input() {
			String io = null; //지역변수 초기값은 0,null 로 준다
			int count = 0;
			
			do {
			count++;
			System.out.print("Stu_no : "); String Stu_no = this.sc.nextLine();
			System.out.print("Name : ");	String name  = this.sc.nextLine();
			System.out.print("Korean : ");	int kor = this.sc.nextInt();
			System.out.print("English : "); int eng = this.sc.nextInt();
			System.out.print("Math: ");	int mat = this.sc.nextInt();
			System.out.print("EDPS : ");	int edp = this.sc.nextInt();
			this.sc.nextLine(); // delete buffer 
			this.array[count-1]= new Student(Stu_no, name, kor, eng, mat, edp);
			
			System.out.print("Continue?(I/O) :  ");
			io = this.sc.next();
			
		}while(io.equals("I")||io.equals("I"));
			return count;
		
		}
}
