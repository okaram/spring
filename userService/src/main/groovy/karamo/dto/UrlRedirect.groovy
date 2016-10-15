package karamo.dto

import groovy.transform.CompileStatic
import groovy.transform.ToString

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id;

@CompileStatic
@ToString
public class UrlRedirect {

	String id;
    String userId;
    String url;

	Long numVisits;
}
