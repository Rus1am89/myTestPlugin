package ut.ru.rustamandyarzhanov.tutorial.myTestPlugin;

import org.junit.Test;
import ru.rustamandyarzhanov.tutorial.myTestPlugin.api.MyPluginComponent;
import ru.rustamandyarzhanov.tutorial.myTestPlugin.impl.MyPluginComponentImpl;

import static org.junit.Assert.assertEquals;

public class MyComponentUnitTest {
    @Test
    public void testMyName() {
        MyPluginComponent component = new MyPluginComponentImpl(null);
        assertEquals("names do not match!", "myComponent", component.getName());
    }
}