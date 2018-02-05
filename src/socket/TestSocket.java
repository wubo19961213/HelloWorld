package socket;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class TestSocket {

	public static void main(String[] args) throws UnknownHostException {
		// TODO Auto-generated method stub
		InetAddress host = InetAddress.getLocalHost();
		String ip = host.getHostAddress();
		System.out.println(ip);
	}

}
