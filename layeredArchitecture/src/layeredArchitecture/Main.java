package layeredArchitecture;

import layeredArchitecture.business.InstructorManager;
import layeredArchitecture.business.CategoryManager;
import layeredArchitecture.business.CourseManager;

import layeredArchitecture.dataAccess.CategoryDao;
import layeredArchitecture.dataAccess.CourseDao;
import layeredArchitecture.dataAccess.HibernateCategoryDao;
import layeredArchitecture.dataAccess.HibernateCourseDao;
import layeredArchitecture.dataAccess.InstructorDao;
import layeredArchitecture.dataAccess.JdbcInstructorDao;
import layeredArchitecture.entities.Category;
import layeredArchitecture.entities.Course;
import layeredArchitecture.entities.Instructor;

import layeredArchitecture.logging.BaseLogger;
import layeredArchitecture.logging.ConsoleLogger;
import layeredArchitecture.logging.DatabaseLogger;
import layeredArchitecture.logging.FileLogger;
import layeredArchitecture.logging.MailLogger;

public class Main {

	public static void main(String[] args) {
		BaseLogger[] loggers = {new DatabaseLogger(), new ConsoleLogger(), new FileLogger(), new MailLogger()};
		
		Course course = new Course(1452, "Java Programming Language 2022", 15, "This course will teach you Java.");
		CourseManager courseManager = new CourseManager(new HibernateCourseDao(), loggers);
		try {
			courseManager.add(course);
		} catch (Exception exception) {
			System.out.println(exception);
		}
		System.out.println("-----------------------------");

		Category category = new Category(14124, "Senior");
		CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(), loggers);
		try {
			categoryManager.add(category);
		} catch (Exception exception) {
			System.out.println(exception);
		}
		System.out.println("-----------------------------");

		Instructor instructor = new Instructor(41411, "Engin Demiroğ", "medine-profile-image");
		InstructorManager instructorManager = new InstructorManager(new JdbcInstructorDao(), loggers);
		try {
			instructorManager.add(instructor);
		} catch (Exception exception) {
			System.out.println(exception);
		}
	}

}
