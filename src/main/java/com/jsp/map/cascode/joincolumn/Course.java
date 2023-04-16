package com.jsp.map.cascode.joincolumn;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
@Entity
public class Course {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
  private int id;
  private String name;
  private int duration;
  
  @ManyToMany
  @JoinTable(name="my_course_student",
  joinColumns = @JoinColumn(name="course"),
  inverseJoinColumns = @JoinColumn(name="student"))
 
  List<Student> students;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getDuration() {
	return duration;
}

public void setDuration(int duration) {
	this.duration = duration;
}

public List<Student> getStudents() {
	return students;
}

public void setStudents(List<Student> students) {
	this.students = students;
}
  

}
