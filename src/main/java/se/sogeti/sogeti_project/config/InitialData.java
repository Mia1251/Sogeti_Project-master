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

        userRepository.save(new User("Abbe","Mohamud","m.abbe@sogeti.se", "CSO", 2 ,"abb","jasgq"));
        userRepository.save(new User("Jaime","Torrealba Olguin","t.jaime@sogeti.se", "CFO", 9 ,"jai","dffdgg"));
        userRepository.save(new User("Laurita","Owanta","l.owanta@sogeti.se", "CPM", 5 ,"lol","ghdsfhy"));
        userRepository.save(new User("Maria","Svensson","m.svensson@sogeti.se", "COO", 3 ,"mia","fhehgue"));
        userRepository.save(new User("Charles","Rudahusha","crud@sogeti.se", "CPM", 1 ,"crud","gsggs"));

    }
}
