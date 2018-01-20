package karamo.db

import org.springframework.beans.factory.annotation.Autowired
import karamo.dto.UrlRedirect;

@groovy.transform.CompileStatic
class UrlRedirectDBImpl implements karamo.serviceInterfaces.UrlRedirectService {
    @Autowired
    UrlRedirectEntityRepository repo;


    public String addRedirect(String userId, String Url) throws Exception {
        print 'adding redirect'
        UrlRedirectEntity r=new UrlRedirectEntity();
        r.userId=userId
        r.numVisits=0l
        r.url=Url

        repo.save(r)
        return r.id;
    }

    public String incrementAndGetUrl(String id)  {
//        long id=Long.parseLong(str_id)
        UrlRedirectEntity r=repo.findOne(id)
        if(r==null)
            throw new Exception("Url Redirect does not exist !!")
        r.numVisits++;
        repo.save(r);
        return r.url;

    }
    public UrlRedirect GetUrl(String id) {
        UrlRedirectEntity r=repo.findOne(id)
        if(r==null)
            return null;
        return r.toDto();
    }

    public List<karamo.dto.UrlRedirect> getUrlsForUser(userId)
    {
        return null;
    }

}
