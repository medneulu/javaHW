package layeredArchitecture.dataAccess;
import java.util.List;

import layeredArchitecture.entities.Course;

public interface CourseDao {
	public void add(Course course);

	public List<Course> fetchCourses();
}
