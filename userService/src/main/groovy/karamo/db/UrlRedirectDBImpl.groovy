package karamo.db

import org.springframework.beans.factory.annotation.Autowired


@groovy.transform.CompileStatic
class UrlRedirectDBImpl implements karamo.serviceInterfaces.UrlRedirectService {
    @Autowired
    UrlRedirectRepository repo;

    public void addRedirect(String userId, String Url) throws Exception {
        UrlRedirect r=new UrlRedirect();
        r.userId=userId
        r.numVisits=0l
        r.url=Url

        repo.save(r)
    }

    public String incrementAndGetUrl(String str_id)  {
        long id=Long.parseLong(str_id)
        UrlRedirect r=repo.findOne(id)
        if(r==null)
            throw new Exception("Url Redirect does not exist !!")
        r.numVisits++;
        repo.save(r);
        return r.url;

    }
    public UrlRedirect GetUrl(String str_id) {
        long id=Long.parseLong(str_id)
        UrlRedirect r=repo.findOne(id)
        return r;
    }

    public List<karamo.dto.UrlRedirect> getUrlsForUser(userId)
    {
        return null;
    }

}
