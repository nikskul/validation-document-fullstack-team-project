package App.com.loader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import App.com.model.Student;
import App.com.repository.StudentRepository;

@Component
public class DatabaseLoader implements CommandLineRunner {

	private final StudentRepository repository;

	@Autowired
	public DatabaseLoader(StudentRepository repository) {
		this.repository = repository;
	}

	@Override
	public void run(String... strings) throws Exception {
		this.repository.save(new Student("Frodo", "Baggins", "ring bearer"));
		this.repository.save(new Student("Иван", "Иванов", "Тестовый студент"));
    }
}
	
