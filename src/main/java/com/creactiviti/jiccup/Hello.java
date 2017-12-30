package com.creactiviti.jiccup;

import static com.creactiviti.jiccup.Elements.*;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Hello {
  
  @ResponseBody
  @RequestMapping("/hi")
  public String render () {
    return html (
            body(
                h1(content("Hello World"))
              )
           ).render();
  }
  
  
  
}
