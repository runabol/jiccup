package com.creactiviti.jiccup;

public class Jiccup {

  public static Element html (Html... aChildren) {
    return new HtmlElement ("html",aChildren);
  }
  
  public static Element nav (Html... aChildren) {
    return new HtmlElement ("nav",aChildren);
  }
  
  public static Element ul (Html... aChildren) {
    return new HtmlElement ("ul",aChildren);
  }
  
  public static Element li (Html... aChildren) {
    return new HtmlElement ("li",aChildren);
  }
  
  public static Element div (Html... aChildren) {
    return new HtmlElement ("div",aChildren);
  }
  
  public static Element a (Html... aChildren) {
    return new HtmlElement ("a",aChildren);
  }
  
  public static Element span (Html... aChildren) {
    return new HtmlElement ("span",aChildren);
  }
  
  public static Element button (Html... aChildren) {
    return new HtmlElement ("button",aChildren);
  }
  
  public static Element title (String aTitle) {
    return new HtmlElement ("title",content(aTitle));
  }
  
  public static Element head (Html... aChildren) {
    return new HtmlElement ("head",aChildren);
  }
  
  public static Element link (Html... aChildren) {
    return new HtmlElement ("link",aChildren);
  }
  
  public static Element stylesheet (String aHref) {
    return link(attr("rel","stylesheet"),href(aHref));
  }
  
  public static Attribute attr (String aName, String aValue) {
    return new HtmlAttribute(aName, aValue);
  }
  
  public static Element body (Html... aChildren) {
    return new HtmlElement ("body",aChildren);
  }
  
  public static Element h1 (Html... aChildren) {
    return new HtmlElement ("h1",aChildren);
  }
  
  public static Element p (Html... aChildren) {
    return new HtmlElement ("p",aChildren);
  }
  
  public static Element content (String aContent) {
    return () -> aContent;
  }
  
  public static Attribute href (String aValue) {
    return new HtmlAttribute("href", aValue);
  }
  
  public static Attribute cssClass (String... aClassNames) {
    return new HtmlAttribute("class", String.join(" ", aClassNames));
  }
  
  public static Attribute id (String aId) {
    return new HtmlAttribute("id", aId);
  }
  
}
