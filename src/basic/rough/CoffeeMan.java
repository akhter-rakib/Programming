package basic.rough;

import java.awt.*;
import java.net.URI;

public class CoffeeMan {
    public static void main(String[] args) throws Exception {

        URI u = new URI("https://drive.google.com/open?id=1ZyY07hrwHoeTNb5LjV6Q_glG96CpZMbB");
        Desktop d = Desktop.getDesktop();
        d.browse(u);

    }
}
