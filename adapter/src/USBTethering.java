import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class USBTethering implements Network {

    USB usb_port;

    public USBTethering(USB usb_port){
        this.usb_port = usb_port;
    }

    @Override
    public void sendMessage(String message) {
        usb_port.write(message.getBytes(StandardCharsets.UTF_8));
    }

    @Override
    public String receiveMessage() {
        return Arrays.toString(usb_port.read());
    }
}
