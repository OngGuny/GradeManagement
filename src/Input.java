import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

//캡슐화 적용
public class Input {
	private Student[] array;
	private Scanner sc;
	private File file; //ctrl+shitf+o 
	private BufferedReader br;
	
	public Input(Student [] array) {
		this.array=array;
		try {
			this.file=new File(file,"C:\\temp\\sungjuk_utf81.dat");
			this.br = new BufferedReader(new FileReader(this.file));
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found");
		}
	}
		
		public int fileInput() {
			int count =0;
			String line = null;
			while(true)
			{
				count++;
				try {
					line = this.br.readLine();
//					System.out.println(line);
					// 1101    한송이    78    87   83   78
					String [] lines = line.split("\\s+");    // 한칸이상 띄웠을 때.  기준으로 나누어 표시
					System.out.println(lines[0]);      
					System.out.println(lines[1]);      
					System.out.println(lines[2]);      
					System.out.println(lines[3]);      
					System.out.println(lines[4]);      
					System.out.println(lines[5]);      
				} catch (IOException e) {
					// TODO: Auto-generated catch block
				e.printStackTrace();
				}
				if(line == null) break;
			}
			return count-1;
		}

	
	
		//어차피 인풋클래스 생성자 호출할꺼다. 
 		public int input() {
 			int count = 0;
			String io = null; //지역변수 초기값은 0,null 로 준다
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
			this.sc.nextLine(); // delete buffer 
			
		}while(io.equals("I")||io.equals("i"));
			return count;
		
		}
}
// 많은 자료들 파일로 넣으려고 한다면 INPUT만 바꾸면 ㄴ된다. 
