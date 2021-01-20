package JSB.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.text.DateFormat;
import java.util.Date;

@Controller
public class IndexController {

    //호출방법 : http://localhost:8080/first
    @GetMapping("/first")
    public String first(){
        return "first";
    }

    @GetMapping("/today")
    public ModelAndView today() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("today");
        mv.addObject("today", getToday());
        return mv;
    }

    //날짜와 시간을 자세히 출력하는 형식 객체 정의
    private String getToday() {
        Date date = new Date();
        DateFormat dateFormat = DateFormat.getDateTimeInstance(
                DateFormat.LONG, DateFormat.LONG);

        //date 객체를 dateFormat 객체를 통해 자세한 날짜와 시간으로 변환
        String formattedDated = dateFormat.format(date);

        return formattedDated;
    }
}
