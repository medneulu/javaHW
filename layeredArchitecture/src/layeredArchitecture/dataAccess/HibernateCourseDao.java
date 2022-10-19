package layeredArchitecture.dataAccess;

import java.util.List;

import layeredArchitecture.entities.Course;

public class HibernateCourseDao implements CourseDao{

	@Override
	public void add(Course course) {
		System.out.println("Course " + course.getName() + " added to database using Hibernate");		
	}

	@Override
	public List<Course> fetchCourses() {
		return null;
	}

}
