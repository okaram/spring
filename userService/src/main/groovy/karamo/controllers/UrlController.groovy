package karamo.controllers

import karamo.serviceInterfaces.UrlRedirectService
import karamo.serviceInterfaces.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.ResponseBody

import karamo.dto.UrlRedirect;

@Controller
@RequestMapping("url")
@groovy.transform.CompileStatic
public class UrlController {
	@Autowired
	UrlRedirectService urlRedirectService;

	@RequestMapping("/addUrl/{username}/{url}")
	public @ResponseBody String addUrl(@RequestParam("username") String username, @RequestParam("password") String password)
	{
		return urlRedirectService.addRedirect(username,password);
	}	
	
	@RequestMapping("/getUrlsForUser/{username}")
	public @ResponseBody List<UrlRedirect> validateLogin(@RequestParam("username") String username)
	{
		return null;
	}

}
	
