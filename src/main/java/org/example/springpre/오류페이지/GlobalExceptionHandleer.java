package org.example.springpre.오류페이지;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandleer {



    private static final Logger logger = LoggerFactory.getLogger(GlobalExceptionHandleer.class);
    @ExceptionHandler(Exception.class)
    public String handException(Exception e, Model model){
        logger.error("server Error", e);
        System.out.println(e);
        model.addAttribute("errorMessage", e.getMessage());
        return "error";
    }

}
