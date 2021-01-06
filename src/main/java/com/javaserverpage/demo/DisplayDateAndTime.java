package com.javaserverpage.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

@Controller
public class DisplayDateAndTime {
    @RequestMapping("/")
    public String index(){
        return "index.jsp";
    }


    @RequestMapping("/date")
    public String displayDate(Model model) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDateTime now = LocalDateTime.now();
        model.addAttribute("date",dtf.format(now));

        return "date.jsp";

    }


    @RequestMapping("/time")
    public String displayTime(Model model) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        model.addAttribute("time",dtf.format(now));
        return "time.jsp";

    }
}
