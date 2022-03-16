package se.sogeti.sogeti_project.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import se.sogeti.sogeti_project.models.User;
import se.sogeti.sogeti_project.repository.UserRepository;

@Component
public class InitialData implements CommandLineRunner {

@Autowired
UserRepository userRepository;
    @Override
    public void run(String... args) throws Exception {

        userRepository.save(new User("Abbe","Mohamud","m.abbe@sogeti.se","abb","jasgq"));
        userRepository.save(new User("Jaime","Torrealba","t.jaime@sogeti.se","jai","dffdgg"));
        userRepository.save(new User("Laurita","Owanta","l.owanta@sogeti.se","lol","ghdsfhy"));
        userRepository.save(new User("Maria","Svensson","m.svensson@sogeti.se","mia","fhehgue"));
        userRepository.save(new User("Charles","Rudahusha","crud@sogeti.se","crud","gsggs"));

    }
}
