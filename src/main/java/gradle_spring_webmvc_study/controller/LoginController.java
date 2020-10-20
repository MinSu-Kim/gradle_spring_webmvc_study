package gradle_spring_webmvc_study.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import gradle_spring_webmvc_study.dto.JobCode;
import gradle_spring_webmvc_study.dto.Login;
import gradle_spring_webmvc_study.dto.OsCode;

@Controller
public class LoginController {

    @GetMapping("/login")
    public ModelAndView form(Login login){
        String[] favoriteOsNames = {"윈도우10", "리눅스", "유닉스"};
        List<String> tools = Arrays.asList("Eclipse", "IntelliJ", "VSCode");
        
        ModelAndView mav =  new ModelAndView();
        mav.addObject("favoriteOsNames", favoriteOsNames);
        mav.addObject("tools", tools);
        mav.setViewName("login/form");
        return mav;
    }
    
    @GetMapping("/result")
    public String result(@ModelAttribute("login") Login login){
        return "login/result";
    }
    
    @ModelAttribute("jobCodes")
    public List<JobCode> getJobCodes() {
        List<JobCode> jobCodes = new ArrayList<>();
        jobCodes.add(new JobCode("A", "사용자"));
        jobCodes.add(new JobCode("B", "개발자"));
        jobCodes.add(new JobCode("C", "관리자"));
       return jobCodes;
    }
    
    @ModelAttribute("loginTypes")
    public List<String> getLoginTypes() {
        List<String> loginTypes = new ArrayList<>();
        loginTypes.add("일반회원");
        loginTypes.add("기업회원");
        loginTypes.add("헤드헌터회원");
       return loginTypes;
    }
    
    @ModelAttribute("osCodeNames")
    public List<OsCode> getOsCodeNames() {
        List<OsCode> osCodeNames = Arrays.asList(
                new OsCode("w", "윈도우10"),
                new OsCode("l", "리눅스"),
                new OsCode("u", "유닉스"));
       return osCodeNames;
    }
    
}
