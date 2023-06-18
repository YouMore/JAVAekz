public interface USBConnection {
    void connect();
    void write(byte[] message);
    byte[] read();
}