package Mxm.Demo;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;

public class TestSocketChannelServer {

	public static void main(String[] args) {
		System.out.println("begin...");
		server();
		System.out.println("end...");
	}

	public static void server() {
		ServerSocket serverSocket = null;
		InputStream in = null;
		try {
			serverSocket = new ServerSocket(8085);
			int recvMsgSize = 0;
			byte[] recvBuf = new byte[1024];
			while (true) {
				Socket clntSocket = serverSocket.accept();
				SocketAddress clientAddress = clntSocket.getRemoteSocketAddress();
				System.out.println("Handling client at " + clientAddress);
				in = clntSocket.getInputStream();
				while ((recvMsgSize = in.read(recvBuf)) != -1) {
					byte[] temp = new byte[recvMsgSize];
					System.arraycopy(recvBuf, 0, temp, 0, recvMsgSize);
					System.out.println(new String(temp));
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (serverSocket != null) {
					serverSocket.close();
				}
				if (in != null) {
					in.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
