package uz.pdp.liquebase.runner;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import uz.pdp.liquebase.entity.Person;
import uz.pdp.liquebase.entity.Student;
import uz.pdp.liquebase.repo.PersonRepo;
import uz.pdp.liquebase.repo.StudentRepo;

@RequiredArgsConstructor

public class MyRunner /*implements CommandLineRunner*/ {

    private final PersonRepo personRepo;
    private final StudentRepo studentRepo;

    /*@Override*/
    public void run(String... args) throws Exception {
        Person build = Person.builder()
                .age(12)
                .firstName("Eshmat")
                .lastName("Toshmatov")
                .build();
        personRepo.save(build);

        Student it = Student.builder()
                .reting(12)
                .yunalish("IT")
                .build();
        studentRepo.save(it);


    }
}
