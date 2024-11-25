import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import ucu.edu.ua.Task1.*;


public class TestTask1 {
    @Test
    public void testTask1() {
        User student = User.builder()
                                        .age(33)
                                        .firstName("Danya")
                                        .lastName("Bykov")
                                        .build();
        assertEquals("User(age=33, firstName=Danya, lastName=Bykov, grades=[], group=null)", student.toString());
    }
}
