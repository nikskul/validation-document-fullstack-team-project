package App.com.repository;

import org.springframework.data.repository.CrudRepository;

import App.com.model.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {
    
}
