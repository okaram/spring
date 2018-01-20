package karamo.db

import groovy.transform.CompileStatic;

import javax.persistence.*;
import groovy.transform.ToString

@Entity
@ToString
@CompileStatic
public class User {
	@Id
	String username;
	String hashedPassword;

	static String hashPassword(String password) {
		return password;
	}
	void setPassword(String password) {
		hashedPassword=hashPassword(password);
	}

	public boolean checkPassword(String password)
	{
		return hashPassword(password).equals(hashedPassword);
	}

	static String getHashedPassword(String password)
	{
		return password; //eventually, hash :)
	}
}
