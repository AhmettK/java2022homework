package homework4.entities;

public class Course {
	private int id;
	private String name;
	private String courseCategory;
	private String courseTeacherFirstName;
	private String courseTeacherLastName;
	private double price;
	
	public Course() {
	}

	public Course(int id, String name, String courseCategory, String courseTeacherFirstName,
			String courseTeacherLastName,double price) {
		this.id = id;
		this.name = name;
		this.courseCategory = courseCategory;
		this.courseTeacherFirstName = courseTeacherFirstName;
		this.courseTeacherLastName = courseTeacherLastName;
		this.price=price;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

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

	public String getCourseCategory() {
		return courseCategory;
	}

	public void setCourseCategory(String courseCategory) {
		this.courseCategory = courseCategory;
	}

	public String getCourseTeacherFirstName() {
		return courseTeacherFirstName;
	}

	public void setCourseTeacherFirstName(String courseTeacherFirstName) {
		this.courseTeacherFirstName = courseTeacherFirstName;
	}

	public String getCourseTeacherLastName() {
		return courseTeacherLastName;
	}

	public void setCourseTeacherLastName(String courseTeacherLastName) {
		this.courseTeacherLastName = courseTeacherLastName;
	}
	

}
