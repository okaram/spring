package karamo;

import javax.persistence.*;
import groovy.transform.ToString

@Entity
@ToString
public class UrlRedirect {
	@Id 
	@GeneratedValue 
	Long id;

    Long userId;
    String url;

	Long numVisits;
}
