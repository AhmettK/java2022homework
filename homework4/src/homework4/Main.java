package homework4;

import homework4.business.CourseManager;
import homework4.core.logging.DatabaseLogger;
import homework4.core.logging.FileLogger;
import homework4.core.logging.Logger;
import homework4.dataAccess.HibernateCourseDao;
import homework4.dataAccess.JdbcCourseDao;
import homework4.entities.Category;
import homework4.entities.Course;
import homework4.entities.Teacher;

public class Main {

	public static void main(String[] args) throws Exception {
		Teacher teacher=new Teacher(1,"Engin","Demiroð");
		Category category =new Category(1,"Programlama");
		Course course=new Course(1,"Java",category.getName(),teacher.getFirstName(),teacher.getLastName(),50);
		
		Logger[] loggers=new Logger[]{new FileLogger(),new DatabaseLogger()};
		
		CourseManager courseManager=new CourseManager(new HibernateCourseDao(),loggers);
		courseManager.add(course);

	}

}
