package karamo.db;

import javax.persistence.*;
import groovy.transform.ToString
import groovy.transform.CompileStatic;

import karamo.dto.UrlRedirect;

@Entity
@CompileStatic
@ToString
public class UrlRedirectEntity {
	@Id 
	@GeneratedValue 
	String id;

    String userId;
    String url;

	Long numVisits;

	UrlRedirect toDto() {
		UrlRedirect r=new UrlRedirect();
		r.id=id;
		r.url=url;
		r.userId=userId;
		r.numVisits=numVisits;
		return r;
	}
}
