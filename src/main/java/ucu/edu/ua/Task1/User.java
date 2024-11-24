package ucu.edu.ua.Task1;

import java.util.List;

import lombok.Getter;
import lombok.Singular;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter @SuperBuilder @ToString
public class User {
    private int age;
    private String firstName;
    private String lastName;
    @Singular
    private List<String> grades;
    private String group;

    public User(int age, String firstName, String lastName, List<String> grades, String group) {
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
        this.grades = grades;
        this.group = group;
    }
}
