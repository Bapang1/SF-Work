//Java Class Configuration use
package com.sp.container;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sp.beans.Student;
import com.sp.configFile.SpringConfig;

public class SpringContainer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	ApplicationContext context =new AnnotationConfigApplicationContext(SpringConfig.class);
	//Student stu =(Student)context.getBean("stdId");
//	Student stu =context.getBean(Student.class);
//	stu.display();
	Student stu =(Student)context.getBean("stdId0");
	stu.display();
	System.out.println("--------------------------");
	Student stu1 =(Student)context.getBean("stdId1");
	stu1.display();
	}

}
