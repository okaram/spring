package karamo.serviceInterfaces

import karamo.dto.UrlRedirect;

public interface UrlRedirectService {

    public String addRedirect(String username, String Url) throws Exception
    
    public String incrementAndGetUrl(String id)
    public UrlRedirect GetUrl(String id)
}