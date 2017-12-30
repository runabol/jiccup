package com.creactiviti.jiccup;

public interface Html {
  
  String render();
  
  default Html attr (String name, String value) { 
    return this;
  }
  
}
