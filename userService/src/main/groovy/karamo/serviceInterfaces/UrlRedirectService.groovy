package karamo.serviceInterfaces

import karamo.db.UrlRedirect;

public interface UrlRedirectService {

    public void addRedirect(String username, String Url) throws Exception
    
    public String incrementAndGetUrl(String id)
    public UrlRedirect GetUrl(String id)
}