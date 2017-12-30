package com.creactiviti.jiccup;

import static com.creactiviti.jiccup.Elements.*;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Starter {
  
  @ResponseBody
  @RequestMapping("/")
  public String render () {
    return page ().render();
  }
  
  private Html page () {
    return html (
        head (
          stylesheet("https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"),
          stylesheet("/starter-template.css"),
          title("Starter Template for Bootstrap")
        ),
        body(
           navigation(),
           div(
             css("container"),
             div(css("starter-template"),
                   h1(content("Bootstrap starter template")),
                   p(css("lead"),content("Use this document as a way to quickly start any new project.<br> All you get is this text and a mostly barebones HTML document."))
             )
           )
        )
    );
  }
  
  private Html navigation () {
    return                
      nav(
        css("navbar","navbar-inverse","navbar-fixed-top"),
        div(
            css("container"),
            div(
              css("navbar-header"),
              button(css("navbar-toggle","collapsed"),span(css("sr-only"),content("Toggle navigation")),attr("type", "button")),
              a(href("/"),content("Project name"),css("navbar-brand"))
            ),
            div(
               id("navbar"),
               css("collapse","navbar-collapse"),
               ul(
                 css("nav","navbar-nav"),
                 li(a(href("/"),css("active"),content("Home"))),
                 li(a(href("#about"),content("About"))),
                 li(a(href("#contact"),content("Contact")))
               )
            )
         )
       );
  }
  
}
