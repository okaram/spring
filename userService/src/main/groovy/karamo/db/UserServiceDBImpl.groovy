package karamo.db

import karamo.serviceInterfaces.UserService;
import org.springframework.beans.factory.annotation.Autowired

public class UserServiceDBImpl implements UserService {

	@Autowired
	UserRepository repo;

	public void addUser(String username, String password)
	{
		List<User> users=repo.findByUsername(username);
		if(!users.isEmpty())
			throw new java.lang.IllegalArgumentException("That user already exists");
		User u=new User();
		u.username=username;
		u.setPassword(password);

		repo.save(u);
	}	
	
	public boolean validateLogin( String username, String password)
	{
		List<User> u=repo.findByUsername(username);
		return !u.isEmpty() && u[0].checkPassword(password);	
	}
}