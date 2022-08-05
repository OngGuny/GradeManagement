
public class Sort {
	public Student[] array;
	private int count;

	public Sort(Student[] array, int count) {
		this.array = array;
		this.count = count;
	}
// j 와 j+1 을 비교하는것 
	public void bubbleSort() {
		for (int i= 0; i<count -1 ; i++) {
			for(int j =0; j<count-1;j++) {
				if(this.array[j].getTot()<this.array[j+1].getTot()) {
					this.swap(i, j+1);
				}
			}
		}
	}
// i 와 j 를 비교하는게 선택정렬
	public void selectionSort() {
			for (int i= 0; i<count -1 ; i++) {
				for(int j =i+1; j<count;j++) {
					if(this.array[i].getTot()<this.array[j].getTot()) {
						this.swap(i,j); //배열 받았더니 오류떠서 숫자를보냄 
					}
				}

			}
			}
	//학생과 학생을 바꾸려면 학생이 필요함 
	private void swap(int front, int back) {
		Student temp = this.array[front];
		this.array[front] = this.array[back];
		this.array[back] = temp;
		
	}
}

