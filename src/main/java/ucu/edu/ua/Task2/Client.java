package ucu.edu.ua.Task2;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString @AllArgsConstructor @Getter @NoArgsConstructor
public class Client {
    private static int counter;
    private int id = counter++;
    private String name; 
    private LocalDate dob;
    private String gender;

    public Client(String name, LocalDate dob, String gender) {
        this.id = counter++;
        this.name = name;
        this.dob = dob;
        this.gender = gender;
    }
}
