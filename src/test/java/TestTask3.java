import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doNothing;

import ucu.edu.ua.Task3.*;
public class TestTask3 {
    @Test
    public void testProxyImage() {
        MyImage image = mock(ProxyImage.class);
        doNothing().when(image).display();
        image.display();
        assertEquals(true, image instanceof ProxyImage);
    }
}
