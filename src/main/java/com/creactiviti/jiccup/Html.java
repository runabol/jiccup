package com.creactiviti.jiccup;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Html implements HtmlElement {
  
  private final String tag;
  private final HtmlElement[] children;
  private final Map<String, String> attributes = new LinkedHashMap<>();
  
  public Html (String aTag, HtmlElement... aChildren) {
    children = aChildren;
    tag = aTag;
  }

  @Override
  public HtmlElement attr (String name, String value) {
    attributes.put(name, value);
    return this;
  }
  
  @Override
  public String render() {
    StringBuilder sb = new StringBuilder();
    
    sb.append("<").append(tag);
    
    for(Entry<String, String> attr : attributes.entrySet()) {
      sb.append(" ")
        .append(attr.getKey())
        .append("=")
        .append(attr.getValue());
    }
    
    sb.append(">");
    
    for(HtmlElement element : children) {
      sb.append(element.render());
    }
    
    sb.append("</").append(tag).append(">");
    
    return sb.toString();
  }

}
