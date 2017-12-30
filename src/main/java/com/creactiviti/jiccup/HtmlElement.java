package com.creactiviti.jiccup;

public interface HtmlElement {
  
  String render();
  
  default HtmlElement attr (String name, String value) { 
    return this;
  }
  
}
