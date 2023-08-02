package ProductSystem.productapp;

public class Mailer {
	
	MessageRepo messageRepo;
	
	public Mailer(MessageRepo messageRepo) {
		this.messageRepo=messageRepo; 
	}
	
	public Message getMessages(String sender) {
		return messageRepo.getMessage(sender); 
	 } 
}
