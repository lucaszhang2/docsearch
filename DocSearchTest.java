import static org.junit.Assert.*;
import org.junit.*;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class DocSearchTest {
    @Test
    public void testSearch() throws URISyntaxException, IOException{
        Handler h = new Handler("technical");
        URI search = new URI("https://technical/search");
        URI rootPath = new URI("https://technical/");
        assertEquals(h.handleRequest(search), "Don't know how to handle that path!");
    }
}
