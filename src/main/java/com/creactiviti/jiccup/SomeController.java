package com.creactiviti.jiccup;

import static com.creactiviti.jiccup.Jiccup.*;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SomeController {
  
  @ResponseBody
  @RequestMapping("/")
  public String render () {
    return html (
            head (
              stylesheet("https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css")
            ),
            body(h1(content("hello world")))
           )
           .render();
  }
  
}
