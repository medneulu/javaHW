package layeredArchitecture.dataAccess;
import layeredArchitecture.entities.Instructor;
import java.util.List;

public interface InstructorDao {
	public void add(Instructor instructor);

	public List<Instructor> fetchInstructors();
}
