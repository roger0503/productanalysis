package ProductSystem.productapp;

public class Message {
	 private String message;
	 private String sender;
	 private String receiver;
	public Message() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Message(String message, String sender, String receiver) {
		super();
		this.message = message;
		this.sender = sender;
		this.receiver = receiver;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getSender() {
		return sender;
	}
	public void setSender(String sender) {
		this.sender = sender;
	}
	public String getReceiver() {
		return receiver;
	}
	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}
	@Override
	public String toString() {
		return "Message [message=" + message + ", sender=" + sender + ", receiver=" + receiver + "]";
	}
	 
}
