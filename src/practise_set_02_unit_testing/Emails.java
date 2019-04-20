package practise_set_02_unit_testing;

import java.util.List;
import java.util.ArrayList;

public class Emails {
	private String text;
	
	public Emails(String text) {
		this.text = text;
	}
	
	
	public List<String> getUsers(){
		int pos = 0;
		List<String> users = new ArrayList<String>();
		
		while(true) {
			int at = text.indexOf('@', pos);
			if(at == -1) break;
			
			// Look backwards from at
			int back = at - 1;
			while (back >= 0 &&
			(Character.isLetterOrDigit(text.charAt(back)) || text.charAt(back)=='.')) {
				back--;
			}
			// Now back is before start of username
			String user = text.substring(back + 1, at);
			if (user.length() > 0) users.add(user);
			// Advance pos for next time
			pos = at + 1;
			
		}
		
		return users;
	}
}
