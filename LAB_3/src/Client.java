import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Client {
	private static Socket socket;
	public static void main (String[] args) throws UnknownHostException, IOException {
		String ip = "127.0.0.1";
		int port = 9999;
		socket = new Socket(ip, port);
		
		
		OutputStream outstream = socket.getOutputStream();
		
		
		PrintWriter out = new PrintWriter(outstream);
		//send message to server
		String message = "Hello Server!";
		out.print(message);
		out.flush();
		
		readMessage();
		/*while(true) {
			//read message from server
			if (in.hasNextLine()) {
				String answer = in.nextLine();
				System.out.println("Server: " + answer);
			}
		}
		
		/*while(true) {
			String message = writeMessage();
			//System.out.print(message);
			out.flush();
			break;
		}
		*/
		
		//read server's response
		/*while (in.hasNextLine())
        {
           String input = in.nextLine();
           System.out.println(input);
        }*/
		
	}

	private static void readMessage() throws IOException {
		InputStream instream = socket.getInputStream();
		Scanner in = new Scanner(instream);
		
			//read message from server
			
			String answer = in.nextLine();
			System.out.println("Server: " + answer);
			in.close();
			
		
	}

	public static String writeMessage() {
		
		String message = "Hello Server!";
		return message;
		
	}
}
