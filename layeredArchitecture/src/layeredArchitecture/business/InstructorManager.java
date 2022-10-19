package layeredArchitecture.business;

import java.util.List;
import layeredArchitecture.dataAccess.InstructorDao;
import layeredArchitecture.entities.Instructor;
import layeredArchitecture.logging.BaseLogger;

public class InstructorManager {
	private InstructorDao instructorDao;
	private BaseLogger[] loggers;
	private List<Instructor> instructors;
	
	public InstructorManager(InstructorDao instructorDao, BaseLogger[] loggers ) {
		this.instructorDao = instructorDao;
		this.loggers = loggers;
		instructors = instructorDao.fetchInstructors();
	}
	
	public void add(Instructor instructor) throws Exception {
		if (instructors.stream().anyMatch(c -> c.getName().equalsIgnoreCase(instructor.getName()))) {
			throw new Exception("Instructor name can't be same.");
		}

		instructorDao.add(instructor);

		for (BaseLogger logger : loggers) {
			logger.log(instructor.getName());
		}
	}
}
