package homework4.dataAccess;

import homework4.entities.Course;

public class JdbcCourseDao implements CourseDao{

	@Override
	public void add(Course course) {
		System.out.println("JDBC ile veritabanýna eklendi: "+course.getName());
		
	}

}
