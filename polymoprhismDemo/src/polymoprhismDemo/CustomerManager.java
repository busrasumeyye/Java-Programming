package polymoprhismDemo;

public class CustomerManager {
	private BaseLogger logger;
	public CustomerManager(BaseLogger logger) {
		this.logger = logger;
		
	}
	public void add() {
		System.out.println("Müşteri eklendi");
		this.logger.log("log mesajı");
		//DatabaseLogger logger = new DatabaseLogger();
		//logger.Log("Log mesajı");
		//new yapmak demek database loggera daha fazla bağımlı olması
	} //cpnstructor new yapınca kullanılıyor

}
