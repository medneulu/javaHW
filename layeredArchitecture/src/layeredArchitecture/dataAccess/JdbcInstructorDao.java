package layeredArchitecture.dataAccess;

import java.util.List;

import layeredArchitecture.entities.Instructor;

public class JdbcInstructorDao implements InstructorDao{

	@Override
	public void add(Instructor instructor) {
		System.out.println("Instructor" + instructor.getName() + " added to database using Jdbc");		
	}

	@Override
	public List<Instructor> fetchInstructors() {
		return null;
	}

}
