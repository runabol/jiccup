package com.creactiviti.jiccup;

public class A extends HtmlElement {

  public A(Html... aChildren) {
    super("a", aChildren);
  }
  
  public A href (String aValue) {
    return (A) attr("href", aValue);
  }

}
