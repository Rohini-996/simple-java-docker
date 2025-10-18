import java.io.*;
import java.net.*;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws IOException {
        int port = 9090; // 👈 Your port number
        ServerSocket server = new ServerSocket(port);
        System.out.println("✅ Server started on port " + port);

        // Wait for a client connection
        Socket socket = server.accept();
        System.out.println("🔗 Client connected!");

        // Send current date and time to client
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        Date currentDate = new Date();
        out.println("Hello from Dockerized Java app! Current date: " + currentDate);

        // Clean up
        socket.close();
        server.close();
        System.out.println("✅ Connection closed.");
    }
}
