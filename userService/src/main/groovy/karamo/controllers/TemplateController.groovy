package karamo.controllers

import com.fasterxml.jackson.core.JsonParser
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.ResponseBody
import org.thymeleaf.context.Context

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Controller
@RequestMapping("templates")
@groovy.transform.CompileStatic
class TemplateController {
    @RequestMapping("/greeting")
    public String greeting(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }

    @Autowired
    org.thymeleaf.spring4.SpringTemplateEngine templateEngine;
    @RequestMapping("/t2")
    @ResponseBody
    public String t2() {

        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(JsonParser.Feature.ALLOW_SINGLE_QUOTES, true);
        String json = "{'name':'Orlando', 'pt': {'x':1,'y':2}}";


        // convert JSON string to Map
        Object map = mapper.readValue(json, new TypeReference<Map<String, Object>>(){});

        Map<String,Object> vars=new HashMap<>();
        vars.put("a","A");
        vars.put("pt",new java.awt.Point(10,21));
        Context context = new Context()
        context.setVariable('name','Orlando')
        context.setVariable('vars',map);

        return templateEngine.process('greeting',context)
    }
}
