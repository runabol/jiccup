package com.creactiviti.jiccup;

import java.util.List;

public interface HtmlElement {
  
  String render();
  
  default HtmlElement attr (String name, String value) { 
    return this;
  }
}
