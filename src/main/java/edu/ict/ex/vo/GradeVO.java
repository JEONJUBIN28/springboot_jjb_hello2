package edu.ict.ex.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class GradeVO {
	private int kor;
	private int eng;
	private int math;

	public int getTotal() {
		return kor + eng + math;
	}

	public double getAvg() {
		return getTotal() / 3.0;
	}
	
	public char getGrade() {
	      char grade = '가';
	      
	      double avg = (kor + eng + math) / 3.0;
	      
	      if (avg >= 90) {
	         grade = '수';
	      } else if (avg >= 80) {
	         grade = '우';
	      } else {
	         grade = '가';
	      }

	      return grade;
	   }

}
