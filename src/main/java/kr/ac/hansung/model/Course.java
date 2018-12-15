package kr.ac.hansung.model;

import javax.validation.constraints.NotEmpty;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class Course {
		
		private int year;
		
		private int semester;
		
		@NotEmpty(message="The code cannot be empty")
		private String code;
		
		@NotEmpty(message="The name cannot be empty")
		private String name;
		
		@NotEmpty(message="The level cannot be empty")
		private String level;

		private int credit;

}
