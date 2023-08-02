package ProductSystem.productapp;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Test;

public class MailerTest {

	@Test 
	public void testGetMessages() { 
		MessageRepo messageRepo=mock(MessageRepo.class); 
		Message obj = new Message("Hello","A","B"); 
		Message obj1 = new Message("Hey There","C","D"); 
		
		when(messageRepo.getMessage("A")).thenReturn(obj); 
		when(messageRepo.getMessage("C")).thenReturn(obj1); 
		
		Mailer m=new Mailer(messageRepo); 
		Message message = m.getMessages("A"); 
		
		String sender = message.getSender(); 
		String receiver = message.getReceiver(); 
		assertEquals("A",sender);
		}
	}
