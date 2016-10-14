package com.control;

/**
 * Created by hambur on 2016/10/13.
 */

        import org.springframework.stereotype.Controller;
        import org.springframework.web.bind.annotation.RequestMapping;
        import org.springframework.web.bind.annotation.RequestMethod;
        import java.io.*;
        import java.util.HashMap;
        import java.util.Map;

        import com.mashape.unirest.http.HttpResponse;
        import com.mashape.unirest.http.JsonNode;
        import com.mashape.unirest.http.Unirest;
        import org.apache.commons.logging.Log;
        import org.apache.commons.logging.LogFactory;
        import org.springframework.stereotype.Controller;
        import org.springframework.web.bind.annotation.PathVariable;
        import org.springframework.web.bind.annotation.RequestMapping;
        import org.springframework.web.bind.annotation.RequestParam;
        import org.springframework.web.bind.annotation.ResponseBody;
        import org.springframework.web.multipart.MultipartFile;
        import org.springframework.web.servlet.ModelAndView;

/**
 * Created by dzkan on 2016/3/8.
 */
@Controller
public class controller {
    public int SID=0;
    @RequestMapping(value = "/webapptest", method = RequestMethod.GET)
    @ResponseBody
    public String webapptest() {
            String message = "the right adress is localhost:8080";
            return message;
    }
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(){
        return "index";
    }

    @RequestMapping(value = "/submit") //method = RequestMethod.GET)
    public ModelAndView submit(@RequestParam("name") String system_name,@RequestParam("url") String system_url ) throws IOException {
        System.out.println("system_name is :"+system_name);
        System.out.println("system_url is :"+system_url);

        //create the file-route
        String path_route="./webapptest_file/"+system_name;
        File path_filelog= new File(path_route);
        if ( !path_filelog.exists() )
        {
            path_filelog.mkdirs();
            System.out.println("|------------->first time to log :create a new route for file success");
        }
        Runtime runtime=Runtime.getRuntime();
            /************************cmd *******************************************/
            String cmd_str = "open ./1/123";
            runtime.exec(cmd_str);
        return new ModelAndView("result","message", SID++);
    }
    @RequestMapping(value ="/check",method = RequestMethod.GET)
    public String check(){
        return  "check";
    }
}