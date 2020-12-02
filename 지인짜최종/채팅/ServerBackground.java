import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ServerBackground extends Thread{

	//�޼��� �ְ�ޱ�
	ServerSocket serverSocket;
	Socket socket;
	ServerGui gui;
	String msg;
	ClientBackground client;
	Map<String, DataOutputStream> clientsMap = new HashMap<String, DataOutputStream>();

	public final void setGui(ServerGui gui) {
		this.gui = gui;
	}

	public void setting() throws IOException {
		Collections.synchronizedMap(clientsMap);
		serverSocket = new ServerSocket(9000);
		while(true) {
			System.out.println("���������...");
			socket = this.serverSocket.accept(); // ��� ����ڸ� �޾ƾߵ�
			System.out.println(socket.getInetAddress()+"���� �����߽��ϴ�.");
			//���⼭ ������ ����
			Receiver receiver = new Receiver(client.socket);
			receiver.start();
		}
	}

	public static void main(String[] args) throws IOException {
		ServerBackground serverBackground = new ServerBackground();
		serverBackground.setting();
	}
	public void addClient(String nick, DataOutputStream out) throws IOException {
		sendMessage(nick + "���� �����ϼ̽��ϴ�.");
		clientsMap.put(nick, out);
	}
	public void removeClient(String nick) {
		sendMessage(nick + "���� �����̽��ϴ�.");
		clientsMap.remove(nick);
	}

	public void sendMessage(String msg) {
		Iterator<String> it = clientsMap.keySet().iterator();
		String key = "";
		while (it.hasNext()){
			key = it.next();
			try{
				clientsMap.get(key).writeUTF(msg);
				System.out.println(msg);

			}catch(IOException e){
				e.printStackTrace();
			}
		}
	}	

	class Receiver extends Thread {
		DataInputStream in;
		DataOutputStream out;
		String nick;

	public Receiver(Socket socket) throws IOException {
			out = new DataOutputStream(socket.getOutputStream());
			in = new DataInputStream(socket.getInputStream());
			nick = in.readUTF();
			addClient(nick, out);
		}

		public void run() {
			try{			
				while(in!=null){
					msg=in.readUTF();
					sendMessage(msg);
					gui.appendMsg(msg);	
				}
			}catch(IOException e){
				removeClient(nick);
			}
		}
	}
}
 