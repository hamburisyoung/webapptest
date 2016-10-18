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


@Controller
public class controller {
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
        if (!isIP(system_url)){
            return new ModelAndView("index","message","url格式错误");
        }
        else {
            //create the file-route
            String path_route = "./webapptest_file/BOCOMM" + system_name+"("+system_url+")";
            System.out.println("system_url is :" + path_route);
            File path_filelog = new File(path_route);
            if (!path_filelog.exists()) {
                //create the file
                path_filelog.mkdirs();
                System.out.println("|------------->first time to log :create a new route for file success");

                /********************cmd ***************/
                Runtime runtime = Runtime.getRuntime();
                String cmd_str = "open ./1/123";
                runtime.exec(cmd_str);
                /***************************************/
            }

            return new ModelAndView("result", "message", "BOCOMM"+system_name+"("+system_url+")");
        }
    }

    private boolean isIP(String system_url) {
        boolean b = false;
        if(system_url.matches("\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}")){
            String s[] = system_url.split("\\.");
            if(Integer.parseInt(s[0])<255)
                if(Integer.parseInt(s[1])<255)
                    if(Integer.parseInt(s[2])<255)
                        if(Integer.parseInt(s[3])<255)
                            b = true;
        }
        return b;
    }

    @RequestMapping(value ="/check",method = RequestMethod.GET)
    public ModelAndView check(@RequestParam ("system_number") String system_number){
        String path_route = "./webapptest_file/"+system_number;
        System.out.println("system_url is :"+path_route);
        String Filename="over.txt";
        File file = new File(path_route,Filename);
        if (!file.exists()) {
            return new ModelAndView("check", "message", "扫描还没有结束，请稍后查询");
        }
        else
            return  new ModelAndView("check","message","已完成");
    }

}
