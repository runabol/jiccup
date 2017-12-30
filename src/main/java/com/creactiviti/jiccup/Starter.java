package com.creactiviti.jiccup;

import static com.creactiviti.jiccup.Jiccup.*;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Starter {
  
  @ResponseBody
  @RequestMapping("/")
  public String render () {
    return html (
            head (
              stylesheet("https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"),
              stylesheet("/starter-template.css"),
              title("Starter Template for Bootstrap")
            ),
            body(
               navigation(),
               div(
                 cssClass("container"),
                 div(cssClass("starter-template"),
                       h1(content("Bootstrap starter template")),
                       p(cssClass("lead"),content("Use this document as a way to quickly start any new project.<br> All you get is this text and a mostly barebones HTML document."))
                 )
               )
            )
           ).render();
  }
  
  private Html navigation () {
    return                
      nav(
        cssClass("navbar","navbar-inverse","navbar-fixed-top"),
        div(
            cssClass("container"),
            div(
              cssClass("navbar-header"),
              button(cssClass("navbar-toggle","collapsed"),span(cssClass("sr-only"),content("Toggle navigation")),attr("type", "button")),
              a(href("/"),content("Project name"),cssClass("navbar-brand"))
            ),
            div(
               id("navbar"),
               cssClass("collapse","navbar-collapse"),
               ul(
                 cssClass("nav","navbar-nav"),
                 li(a(href("/"),cssClass("active"),content("Home"))),
                 li(a(href("#about"),content("About"))),
                 li(a(href("#contact"),content("Contact")))
               )
            )
         )
       );
  }
  
}
