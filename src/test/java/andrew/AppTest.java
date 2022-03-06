package andrew;

import org.junit.Assert;
import org.junit.Test;

public class AppTest {
    @Test
    public void testApp() {
        //
    }

    @Test
    public void greet() {
        String msg = App.greet("Andrew");
        Assert.assertEquals("Hello Andrew!", msg);
    }
}
