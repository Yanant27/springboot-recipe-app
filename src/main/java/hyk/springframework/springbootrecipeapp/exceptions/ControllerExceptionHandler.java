package hyk.springframework.springbootrecipeapp.exceptions;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

@Slf4j
@ControllerAdvice
public class ControllerExceptionHandler {
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(java.lang.NumberFormatException.class)
    public ModelAndView handleBadRequest(Exception exception) {
        log.error("Handling ControllerExceptionHandler");
        log.error(exception.getMessage());
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("error/400badrequest");
        modelAndView.addObject("exception", exception);
        return modelAndView;
    }
}
