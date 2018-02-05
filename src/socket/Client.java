package socket;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Socket s = new Socket("127.0.0.1",8888);
			OutputStream os = s.getOutputStream();
			os.write(2321);
			os.close();
			//System.out.println(s);
			s.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
