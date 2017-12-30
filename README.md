# Jiccup

Jiccup is a [Hiccup](https://github.com/weavejester/hiccup)-inpsired library for representing HTML in Java. 

Warning: This project is still in an experimental phase. 

# Requirements

Java 1.8+

# Install

```
<dependency>
  <groupId>com.creactiviti</groupId>
  <artifactId>jiccup</artifactId>
  <version>0.0.1-SNAPSHOT</version>
</dependency>

<repositories>
   <repository>
      <id>maven-snapshots</id>
      <url>http://oss.sonatype.org/content/repositories/snapshots</url>
      <layout>default</layout>
      <releases>
         <enabled>false</enabled>
      </releases>
      <snapshots>
         <enabled>true</enabled>
      </snapshots>
   </repository>
</repositories>
```

# Syntax

## Hello World

Here is a basic example of Jiccup's syntax:

```
import static com.creactiviti.jiccup.Elements.*;

...

html (
  body(
    h1(content("Hello World"))
  )
);
```

Which will render the following HTML: 

```
<html>
  <body>
   <h1>Hello World</h1>
  </body>
</html>
```

## Bootstrap Example

```
import static com.creactiviti.jiccup.Elements.*;

...

html (
    head (
      stylesheet("https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"),
      stylesheet("/starter-template.css"),
      title("Starter Template for Bootstrap")
    ),
    body(
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
       )
       div(
         css("container"),
         div(css("starter-template"),
               h1(content("Bootstrap starter template")),
               p(css("lead"),content("Use this document as a way to quickly start any new project.<br> All you get is this text and a mostly barebones HTML document."))
         )
       )
    )
)
```

Which renders bootstrap's [starter](https://getbootstrap.com/docs/3.3/examples/starter-template/) template.

# Spring Integration

See [Spring Boot Starter Jiccup](https://github.com/creactiviti/spring-boot-starter-jiccup)

# License

Jiccup is released under version 2.0 of the Apache License.