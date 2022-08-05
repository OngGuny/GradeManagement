
public class Student {
	private String stu_no, name;
	private int kor, eng, mat, edp, tot;
	private double avg;
	private char grade;
 // 멤버변수 생성자 getter/setter 
	// toString 도 툴사용 
	public Student() {}

	@Override//object의 자식이다. object의 tostring을 제정할꺼야 
	public String toString() {
		return String.format("Student [stu_no=%-10s\t, name=%10s\t, kor=%5d, eng=%5d, mat=%5d, edp=%5d, tot=%5d, avg=%8.2f, grade=%3c\n]",
				stu_no, name, kor, eng, mat, edp, tot, avg, grade);
	}

	public Student(String stu_no, String name, int kor, int eng, int mat, int edp) {
		this.stu_no = stu_no;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		this.edp = edp;
	}//ot grade avg 는 받아서 계산하는거라 안받음 

	public String getStu_no() {
		return stu_no;
	}

	public void setStu_no(String stu_no) {
		this.stu_no = stu_no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMat() {
		return mat;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}

	public int getEdp() {
		return edp;
	}

	public void setEdp(int edp) {
		this.edp = edp;
	}

	public int getTot() {
		return tot;
	}

	public void setTot(int tot) {
		this.tot = tot;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	public char getGrade() {
		return grade;
	}

	public void setGrade(char grade) {
		this.grade = grade;
	}
	
	
	
}// 총 9개 변수  t
