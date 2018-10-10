package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayStudentlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1 = new Student(10,"Vel",25);
		Student s2 = new Student(20,"Arun",30);
		Student s3 = new Student (30,"Kumar",29);
		
		List<Student> details = new ArrayList<>();
		details.add(s1);
		details.add(s2);
		details.add(s3);
		
		Iterator<Student> names = details.iterator();
		while(names.hasNext())
		{
			Student st =(Student) names.next();
			
			System.out.println("The Student rollno is :"+st.rollno+" and name is : "+st.name+ " age is :"+st.age);
		}

	}

}
