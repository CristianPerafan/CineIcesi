import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import exceptions.PasswordNotMatchException;
import exceptions.UserNotFoundException;
import model.Users;

class TestUsers {

	private Users users;
	
	public void setupScenary1() {
		users = new Users();
		users.addUser("Johan", "123");
	}
	
	@Test
	void testLogin() throws UserNotFoundException, PasswordNotMatchException {
		setupScenary1();
		System.out.println();
		System.out.println(users.validate("Johan", "234"));
	}

}
