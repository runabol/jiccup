package com.creactiviti.jiccup;

import static com.creactiviti.jiccup.Jiccup.*;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SomeController {
  
  @ResponseBody
  @RequestMapping("/")
  public HtmlElement render () {
    return html (
            head (
              stylesheet("https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"),
              stylesheet("/starter-template.css"),
              title("Starter Template for Bootstrap")
            ),
            body(
               nav(
                 div(
                    div(
                      button(
                        span(content("Toggle navigation")).attr("class", "sr-only")
                      ).attr("type", "button").attr("class", "navbar-toggle collapsed"),
                      a(content("Project name"))
                    ).attr("class", "navbar-header")
                 ).attr("class", "container")
               ).attr("class", "navbar navbar-inverse navbar-fixed-top")
            )
           );
  }
  
}
