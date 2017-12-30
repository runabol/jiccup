package com.creactiviti.jiccup;

public class HtmlElement implements Element {
  
  private final String tag;
  private final Html[] children;
  
  public HtmlElement (String aTag, Html... aChildren) {
    children = aChildren;
    tag = aTag;
  }

  @Override
  public String render() {
    StringBuilder sb = new StringBuilder();
    
    sb.append("<").append(tag);
    
    for(Html html : children) {
      if(html instanceof Attribute) {
        sb.append(" ")
          .append(html.render());
      }
    }
    
    sb.append(">");
    
    sb.append("\n");
    
    for(Html html : children) {
      if(html instanceof Element) {
        sb.append(html.render());
      }
    }
    
    sb.append("</").append(tag).append(">");
    
    sb.append("\n");
    
    return sb.toString();
  }

}
