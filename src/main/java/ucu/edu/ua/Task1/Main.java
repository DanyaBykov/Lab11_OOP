package ucu.edu.ua.Task1;

public class Main {
    public static void main(String[] args) {
        User student = User.builder()
                                        .age(33)
                                        .firstName("Danya")
                                        .lastName("Bykov")
                                        .build();
        System.out.println(student);
    }
}