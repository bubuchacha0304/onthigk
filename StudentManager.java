package hocsinh;

import java.util.Arrays;

public class StudentManager {
	private Student[] students;
	private int size;
	
	public StudentManager() {
		students=new Student[5];
		size = 0;
	}
	private int findIndexById(String id) {
		for(int i=0;i<size ;i++) {
			if(students[i].getId().equals(id)) {
				return i;
			}
		}
		return -1;
	}
	
	public boolean addStudent(Student s) {
		if(s == null) {
			return false;
		}
		if(findIndexById(s.getId()) != -1) {
			System.out.println("ID da ton tai!");
			return false;
		}
		if(size == students.length){
			students=Arrays.copyOf(
					students,students.length *2);
		}
		students[size++]=s;
		return true;
	}
	
	public boolean removeStudent(String id) {
		int index= findIndexById(id);
		if( index== -1) {
			return false;
		}
		
		for(int i=index; i < size -1;i++) {
			students[i] = students[i+1];
		}
		students[--size]= null;
		return true;
	}
	
	public boolean updateStudent(String id ,Student newInfo) {
		int index=findIndexById(id);
		if(index == -1 || newInfo == null) {
			return false ;
		}
		
		int newIndex = findIndexById(newInfo.getId());
		if(newIndex != -1 && newIndex != index) {
			System.out.println("ID moi daton tai !");
			return false;
		}
		students[index]= newInfo;
		return true;
	}
	
	public Student[] searchByName(String name) {
		if(name == null) {
			return new Student[0];
		}
		Student[] result = new Student[size];
		int count =0;
		
		for (int i=0;i <size ;i++) {
			if(students[i].getName().toLowerCase()
					.contains(name.trim().toLowerCase())) {
				
			}
		}
		return Arrays.copyOf(result, count);
	}
	
	public void sortByGpa() {
		for(int i=0;i<size -1;i++) {
			for(int j=i+1;j < size;j++) {
				if(students[i].getGpa() > students[j].getGpa()) {
					Student temp=students[i];
					students[i]= students[j];
					students[j]= temp;
				}
			}
		}
	}
	
	public void displayAll() {
		if(size ==0) {
			System.out.println("Danh sach rong !");
			return;
		}
		for(int i=0;i<size;i++) {
			System.out.println(students[i]);
		}
	}
}
