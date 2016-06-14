package karamo;

import javax.persistence.*;
import groovy.transform.ToString

@Entity
@ToString
public class User {
	@Id 
	@GeneratedValue 
	Long id;

	String username, password;
}
