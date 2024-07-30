package uz.pdp.liquebase.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.liquebase.entity.Person;

import java.util.UUID;

public interface PersonRepo extends JpaRepository<Person, UUID> {
}
