package g53sqm.chat.server;


public class Runner
{
	static Server server;
	final static int PORT = 9001;
	
	public static void main(String[] args){
		server = new Server(PORT);
		server.listen();
	}
	
	
}
