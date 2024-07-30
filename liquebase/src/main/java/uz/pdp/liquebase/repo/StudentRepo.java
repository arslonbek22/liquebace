package uz.pdp.liquebase.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.liquebase.entity.Student;

import java.util.UUID;

public interface StudentRepo extends JpaRepository<Student, UUID> {
}
