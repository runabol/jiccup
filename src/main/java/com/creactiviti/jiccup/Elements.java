package com.creactiviti.jiccup;

public abstract class Elements {

  public static Element html (Html... aChildren) {
    return element("html",aChildren);
  }
  
  public static Element nav (Html... aChildren) {
    return element("nav",aChildren);
  }
  
  public static Element ul (Html... aChildren) {
    return element("ul",aChildren);
  }
  
  public static Element li (Html... aChildren) {
    return element("li",aChildren);
  }
  
  public static Element div (Html... aChildren) {
    return element("div",aChildren);
  }
  
  public static Element a (Html... aChildren) {
    return element("a",aChildren);
  }
  
  public static Element span (Html... aChildren) {
    return element("span",aChildren);
  }
  
  public static Element button (Html... aChildren) {
    return element("button",aChildren);
  }
  
  public static Element title (String aTitle) {
    return element("title",content(aTitle));
  }
  
  public static Element head (Html... aChildren) {
    return element("head",aChildren);
  }
  
  public static Element link (Html... aChildren) {
    return element("link",aChildren);
  }
  
  public static Element stylesheet (String aHref) {
    return link(attr("rel","stylesheet"),href(aHref));
  }
  
  public static Attribute attr (String aName, String aValue) {
    return new HtmlAttribute(aName, aValue);
  }
  
  public static Element body (Html... aChildren) {
    return element("body",aChildren);
  }
  
  public static Element h1 (Html... aChildren) {
    return element("h1",aChildren);
  }
  
  public static Element p (Html... aChildren) {
    return element("p",aChildren);
  }
  
  public static Element content (String aContent) {
    return () -> aContent;
  }
  
  public static Attribute href (String aValue) {
    return attr("href", aValue);
  }
  
  public static Attribute cssClass (String... aClassNames) {
    return attr("class", String.join(" ", aClassNames));
  }
  
  public static Attribute id (String aId) {
    return attr("id", aId);
  }
  
  public static Element element (String aName, Html... aChildren) {
    return new HtmlElement (aName,aChildren);
  }
  
}
