package karamo;

public interface UrlRedirectService {

    public void addRedirect(String username, String Url) throws Exception
    
    public String incrementAndGetUrl(Long id)
    public UrlRedirect GetUrl(Long id)
}