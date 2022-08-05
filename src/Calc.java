
public class Calc {
private Student [] array;
public Calc(Student[] array) {
	this.array = array;
	
}
// calc 메소드가 카운트를 받는다. 
public void calc(int count) {
	for(int i =0; i< count ; i++) {
		Student student = this.array[i];
		int tot = this.calcTotal(student.getKor(), student.getEng(), student.getMat(), student.getEdp()) ;// 각 점수는 private니까 게터세터가 가져와서 calctotal에게 넘겨주면된다. 
		double avg = calcAvg(tot, 4);
		char grade = calcGrade(avg);
		student.setTot(tot);
		student.setAvg(avg);
		student.setGrade(grade); // 읽어 들이려면 get  
	}
	
}
// 총점만 구하는 메소드, 외부접근 막고 내부에서만 계산  private로 만듦. 여기 calc에서만 사용
	private int calcTotal(int kor,int eng, int mat, int edp) { // 국영수전산 받아서 계산 / 메소드 끼리 지역변수 겹치면안됨. count 를 위에먼저써서. 이걸 해결하려면 카운트를 위로 뺴면됨  
	return kor+eng+mat+edp;
}
	// 과목수와 총점이 넘어오면 그 몫을 double 로 반환하겠다. 
	private double calcAvg(int tot,int su ) {
		return tot/(double)su;
	}
	private char calcGrade(double avg) {
		return (avg<=100 && avg>=90)?'A':
			(avg<90&&avg>=80)?'B':
				(avg<80&&avg>=70)?'C':
					(avg<70&&avg>=60)?'D':'F';
	}
	
	
}
