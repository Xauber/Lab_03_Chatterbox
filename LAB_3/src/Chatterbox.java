import java.io.InputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket; 
import java.util.Scanner; 
import java.io.BufferedReader;


public class Chatterbox {

	public static void main(String[] args) {
		Chatterbox simple = new Chatterbox(8057);
		simple.startServer();
		
		// 1. How do you set up am Internet connection between two computers in Java?
	
		// 2. Write a method to read from a Connection in Java.

		// 3. Write a method to write to a Connection in Java.
		
		
	}
	
	private BufferedReader bufferedReader;
	//private Scanner scanner;
	//private char[] buffers;
	//private PrintWriter printWriter;
	private int port;
	private ServerSocket socket;
	private Socket client;
	

	public Chatterbox(int port) {
		this.port = port;
	}
	
	public void startServer() {
		try {
			socket = openServerSocket(port);
			client = waitForLogin(socket);
			setupStreams(client);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		while(true) {
			String message = readMessage (bufferedReader); //former bufferedReader
			System.out.println(message);
			
		}
	}

	private ServerSocket openServerSocket(int port) throws IOException{
		return null;
	}

	private String readMessage(BufferedReader bReader) {
		return null;
	}
	
	private Socket waitForLogin(ServerSocket serverSocket) throws IOException {
		return null;
		
	}
	
	private void setupStreams(Socket socket) throws IOException {
	
	}
}
	
	
