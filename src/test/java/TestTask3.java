import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import ucu.edu.ua.Task3.*;
public class TestTask3 {
    @Test
    public void testProxy() {
        MyImage image = new ProxyImage("./test.png");
        image.display();
        assertEquals(true, image instanceof ProxyImage);
    }
}
