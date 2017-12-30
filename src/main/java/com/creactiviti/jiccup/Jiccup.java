package com.creactiviti.jiccup;

public class Jiccup {

  public static HtmlElement html (HtmlElement... aChildren) {
    return new Html ("html",aChildren);
  }
  
  public static HtmlElement head (HtmlElement... aChildren) {
    return new Html ("head",aChildren);
  }
  
  public static HtmlElement link (HtmlElement... aChildren) {
    return new Html ("link",aChildren);
  }
  
  public static HtmlElement stylesheet (String aHref) {
    return link().attr("rel", "stylesheet")
                 .attr("href", aHref);
  }
  
  public static HtmlElement body (HtmlElement... aChildren) {
    return new Html ("body",aChildren);
  }
  
  public static HtmlElement h1 (HtmlElement... aChildren) {
    return new Html ("h1",aChildren);
  }
  
  public static HtmlElement content (String aContent) {
    return () -> aContent;
  }
  
}
