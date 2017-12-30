package com.creactiviti.jiccup;

public interface Html {
  
  String render();
  
  default Html attr (String name, String value) { 
    return this;
  }

  default Html id (String aId) {
    return attr("id", aId);
  }
  
  default Html cssClass (String... aClassNames) {
    return attr("class", String.join(" ", aClassNames));
  }
  
}
