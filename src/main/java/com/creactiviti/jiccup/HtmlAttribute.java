package com.creactiviti.jiccup;

public class HtmlAttribute implements Attribute {

  private final String name;
  private final String value;
  
  public HtmlAttribute (String aName, String aValue) {
    name = aName;
    value = aValue;
  }
  
  @Override
  public String render() {
    StringBuilder b = new StringBuilder();
    return b.append(name)
            .append("=")
            .append("\"")
            .append(value)
            .append("\"").toString();
  }
  
}
