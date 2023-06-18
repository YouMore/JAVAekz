
import java.nio.charset.Charset;

public class USB implements USBConnection {

    private byte[] buffer;
    private int port;

    public USB(int port)
    {
        this.port = port;
    }

    @Override
    public void connect() {
        System.out.println("Connecting via USB...");
    }

    @Override
    public void write(byte[] message) {
        System.out.println("Writing data via USB...");
        System.out.println(new String(message, Charset.forName("UTF-8")));
    }

    @Override
    public byte[] read() {
        System.out.println("Reading data via USB...");
        return new byte[] {112, 114, 105, 118, 101, 116};
    }
}
