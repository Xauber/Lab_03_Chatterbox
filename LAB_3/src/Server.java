import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Server {
	private static Socket s;
	private Scanner in;
	private PrintWriter out;
	
	/*
	 * Constructor
	 */
	public Server(Socket socket) {
		s = socket;
	}
	
	public static void main (String[] args) throws IOException {
		Server server = new Server(s);
		server.run();
		
	}
	
	public void run() throws IOException{
		ServerSocket ss = new ServerSocket(9999);
		Socket s = ss.accept();
		System.out.println("A client is connected.");
		
		in = new Scanner(s.getInputStream());
		while(true) {
			//read message from client
			if (in.hasNextLine()) {
				String message = in.nextLine();
				System.out.println("Client: " + message);
				in.close();
			}
			else {
				//answer the client
				System.out.println("test");
				String message = "Hello Client!";
				out.print(message);
				out.flush();
				//s.close();
			}
		}
		/*while(true) {
			if(!in.hasNextLine()) {
				//answer the client
				String message = writeMessage();
				out.print(message);
				out.flush();
				s.close();
			}
			String command = in.next();
			if(command.equals("QUIT")) {return;}
			else {
				String message = readMessage();
				if(!message.isEmpty() && message != null) {
					System.out.println(message);
				} else {
					System.out.println("No message currently :(");
				}
			}
		}*/
		
	}

	private String readMessage() throws IOException{
		in = new Scanner(s.getInputStream());
		String input = "";
		while (in.hasNextLine())
        {
           input = in.nextLine();
        } 
		return input;
	}
	
	private String writeMessage() {
		String message = "Hello back!";
		return message;
	}
}
