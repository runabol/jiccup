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
                 div(
                   h1(content("Bootstrap starter template")),
                   p(content("Use this document as a way to quickly start any new project.<br> All you get is this text and a mostly barebones HTML document.")).cssClass("lead")
                 ).cssClass("starter-template")
               ).cssClass("container")
            )
           ).render();
  }
  
  private Html navigation () {
    return                
      nav(
        div(
            div(
              button(
                span(content("Toggle navigation")).cssClass("sr-only")
              ).attr("type", "button").cssClass("navbar-toggle","collapsed"),
              a(content("Project name")).href("/").cssClass("navbar-brand")
            ).cssClass("navbar-header"),
            div(
               ul(
                 li(a(content("Home")).href("/")).cssClass("active"),
                 li(a(content("About")).href("#about")),
                 li(a(content("Contact")).href("#contact"))
               ).cssClass("nav","navbar-nav")
            ).id("navbar").cssClass("collapse","navbar-collapse")
         ).cssClass("container")
       ).cssClass("navbar","navbar-inverse","navbar-fixed-top");
  }
  
}
