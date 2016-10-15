package karamo.db;

import javax.persistence.*;
import groovy.transform.ToString
import groovy.transform.CompileStatic;

@Entity
@CompileStatic
@ToString
public class UrlRedirect {
	@Id 
	@GeneratedValue 
	long realId;

	String getId() {
		return realId.toString();
	}

    String userId;
    String url;

	Long numVisits;
}
