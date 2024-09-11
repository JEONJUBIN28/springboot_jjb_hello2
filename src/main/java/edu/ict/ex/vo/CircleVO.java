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
public class CircleVO {
	private double rediuse;

	
	public double getCicle() {
		return (rediuse*rediuse)*Math.PI;
	}
	
}
