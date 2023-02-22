package homework4.dataAccess;


import homework4.entities.Course;

public class HibernateCourseDao implements CourseDao{

	@Override
	public void add(Course course) {
		System.out.println("Hibernate ile veritabanýna eklendi: "+course.getName());
		
	}

}
