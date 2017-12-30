package com.creactiviti.jiccup;

public class Jiccup {

  public static Html html (Html... aChildren) {
    return new HtmlElement ("html",aChildren);
  }
  
  public static Html nav (Html... aChildren) {
    return new HtmlElement ("nav",aChildren);
  }
  
  public static Html ul (Html... aChildren) {
    return new HtmlElement ("ul",aChildren);
  }
  
  public static Html li (Html... aChildren) {
    return new HtmlElement ("li",aChildren);
  }
  
  public static Html div (Html... aChildren) {
    return new HtmlElement ("div",aChildren);
  }
  
  public static A a (Html... aChildren) {
    return new A (aChildren);
  }
  
  public static Html span (Html... aChildren) {
    return new HtmlElement ("span",aChildren);
  }
  
  public static Html button (Html... aChildren) {
    return new HtmlElement ("button",aChildren);
  }
  
  public static Html title (String aTitle) {
    return new HtmlElement ("title",content(aTitle));
  }
  
  public static Html head (Html... aChildren) {
    return new HtmlElement ("head",aChildren);
  }
  
  public static Html link (Html... aChildren) {
    return new HtmlElement ("link",aChildren);
  }
  
  public static Html stylesheet (String aHref) {
    return link().attr("rel", "stylesheet")
                 .attr("href", aHref);
  }
  
  public static Html body (Html... aChildren) {
    return new HtmlElement ("body",aChildren);
  }
  
  public static Html h1 (Html... aChildren) {
    return new HtmlElement ("h1",aChildren);
  }
  
  public static Html p (Html... aChildren) {
    return new HtmlElement ("p",aChildren);
  }
  
  public static Html content (String aContent) {
    return () -> aContent;
  }
  
}
