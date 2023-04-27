package ma.emsi.patientssmvc;

import ma.emsi.patientssmvc.entities.Patient;
import ma.emsi.patientssmvc.repositories.PatientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class PatientssmvcApplication {

    public static void main(String[] args) {
        SpringApplication.run(PatientssmvcApplication.class, args);
    }
    //@Bean
    CommandLineRunner commandLineRunner(PatientRepository patientRepository){
        return args -> {
            patientRepository.save(new Patient(null,"soukayna",new Date(),false,128));
            patientRepository.save(new Patient(null,"elkhalil",new Date(),false,777));
            patientRepository.save(new Patient(null,"mohammed",new Date(),false,120));
            patientRepository.save(new Patient(null,"hayba",new Date(),false,865));

            patientRepository.findAll().forEach(p->{
                System.out.println(p.getNom());
            });
        };
    }
}
