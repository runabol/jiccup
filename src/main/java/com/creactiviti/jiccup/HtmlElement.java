package com.creactiviti.jiccup;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * @author Arik Cohen
 * @since Dec 29, 2017
 */
public class HtmlElement implements Html {
  
  private final String tag;
  private final Html[] children;
  private final Map<String, String> attributes = new LinkedHashMap<>();
  
  public HtmlElement (String aTag, Html... aChildren) {
    children = aChildren;
    tag = aTag;
  }

  @Override
  public Html attr (String name, String value) {
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
        .append("\"")
        .append(attr.getValue())
        .append("\"");
    }
    
    sb.append(">");
    
    sb.append("\n");
    
    for(Html element : children) {
      sb.append(element.render());
    }
    
    sb.append("</").append(tag).append(">");
    
    sb.append("\n");
    
    return sb.toString();
  }

}
