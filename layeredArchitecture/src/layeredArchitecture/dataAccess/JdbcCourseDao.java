package layeredArchitecture.dataAccess;

import java.util.List;

import layeredArchitecture.entities.Course;

public class JdbcCourseDao implements CourseDao{

	@Override
	public void add(Course course) {
		System.out.println("Course " + course.getName() + " added to database using Jdbc");		
	}

	@Override
	public List<Course> fetchCourses() {
		return null;
	}

}
