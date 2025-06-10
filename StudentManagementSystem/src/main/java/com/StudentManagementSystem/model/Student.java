package com.StudentManagementSystem.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="student")
public class Student {
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    private String name;
	    private int birthDay;
	    private int birthMonth;
	    private int birthYear;
	    private Integer age;
	    
	    public Student() {
			super();
			
		}
	    
		public Student(Long id, String name, int birthDay, int birthMonth, int birthYear, Integer age) {
			super();
			this.id = id;
			this.name = name;
			this.birthDay = birthDay;
			this.birthMonth = birthMonth;
			this.birthYear = birthYear;
			this.age = age;
		}
		
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getBirthDay() {
			return birthDay;
		}
		public void setBirthDay(int birthDay) {
			this.birthDay = birthDay;
		}
		public int getBirthMonth() {
			return birthMonth;
		}
		public void setBirthMonth(int birthMonth) {
			this.birthMonth = birthMonth;
		}
		public int getBirthYear() {
			return birthYear;
		}
		public void setBirthYear(int birthYear) {
			this.birthYear = birthYear;
		}
		public Integer getAge() {
			return age;
		}
		public void setAge(Integer age) {
			this.age = age;
		} 
	
	    
	

}
