package karamo;

import javax.persistence.*;
import groovy.transform.ToString

@Entity
@ToString
public class User {
	@Id 
	@GeneratedValue 
	Long id;

	String username, hashedPassword;

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
