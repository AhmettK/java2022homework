package homework4.business;


import homework4.core.logging.Logger;
import homework4.dataAccess.CourseDao;
import homework4.entities.Course;

public class CourseManager {
	CourseDao _courseDao;
	Logger[] _loggers;

	public CourseManager(CourseDao courseDao, Logger[] loggers) {
		_courseDao = courseDao;
		_loggers = loggers;
	}

	public void add(Course course) throws Exception {
		boolean result = nameValid(course.getName());
		
		if (course.getPrice() >= 0 && result) {
			_courseDao.add(course);
		} else {
			throw new Exception("Kurs fiyat� 0dan b�y�k olmal� veya kurs ismi farkl� olmal�");
		}

		for (Logger logger : _loggers) {
			logger.log();
		}
	}
	
	//Kurs isimleri simule edilmi�tir.
	String[] names= {"Sql","C#","Angular","React"};

	public boolean nameValid(String courseName) {
		for(String name:names) {
			if(courseName==name) {
				return false;
			}
		}
		return true;

	}

}
