package org.jboss.errai.ioc.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class Type_factory__o_d_r_c_s_SelectorDropDownItemView__quals__j_e_i_Any_j_e_i_Default_o_d_r_c_s_SelectorDropDownItemViewTemplateResource_default_InlineClientBundleGenerator implements org.jboss.errai.ioc.client.Type_factory__o_d_r_c_s_SelectorDropDownItemView__quals__j_e_i_Any_j_e_i_Default.o_d_r_c_s_SelectorDropDownItemViewTemplateResource {
  private static Type_factory__o_d_r_c_s_SelectorDropDownItemView__quals__j_e_i_Any_j_e_i_Default_o_d_r_c_s_SelectorDropDownItemViewTemplateResource_default_InlineClientBundleGenerator _instance0 = new Type_factory__o_d_r_c_s_SelectorDropDownItemView__quals__j_e_i_Any_j_e_i_Default_o_d_r_c_s_SelectorDropDownItemViewTemplateResource_default_InlineClientBundleGenerator();
  private void getContentsInitializer() {
    getContents = new com.google.gwt.resources.client.TextResource() {
      // jar:file:/home/fantonan/.m2/repository/org/dashbuilder/dashbuilder-renderer-default/0.0.0/dashbuilder-renderer-default-0.0.0-sources.jar!/org/dashbuilder/renderer/client/selector/SelectorDropDownItemView.html
      public String getText() {
        return "<li data-field=\"item\">\n  <a data-field=\"itemAnchor\">\n    <span data-field=\"itemText\" class=\"text\"></span>\n    <span data-field=\"itemIcon\" class=\"glyphicon glyphicon-ok check-mark selector-dditem-icon\"></span>\n  </a>\n</li>\n";
      }
      public String getName() {
        return "getContents";
      }
    }
    ;
  }
  private static class getContentsInitializer {
    static {
      _instance0.getContentsInitializer();
    }
    static com.google.gwt.resources.client.TextResource get() {
      return getContents;
    }
  }
  public com.google.gwt.resources.client.TextResource getContents() {
    return getContentsInitializer.get();
  }
  private void getStyleInitializer() {
    getStyle = new com.google.gwt.resources.client.CssResource() {
      private boolean injected;
      public boolean ensureInjected() {
        if (!injected) {
          injected = true;
          com.google.gwt.dom.client.StyleInjector.inject(getText());
          return true;
        }
        return false;
      }
      public String getName() {
        return "getStyle";
      }
      public String getText() {
        return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? ((".selector-dditem{cursor:" + ("pointer")  + ";}.selector-dditem-icon{margin-right:" + ("5px")  + ";cursor:" + ("pointer")  + ";float:" + ("left")  + ";}")) : ((".selector-dditem{cursor:" + ("pointer")  + ";}.selector-dditem-icon{margin-left:" + ("5px")  + ";cursor:" + ("pointer")  + ";float:" + ("right")  + ";}"));
      }
    }
    ;
  }
  private static class getStyleInitializer {
    static {
      _instance0.getStyleInitializer();
    }
    static com.google.gwt.resources.client.CssResource get() {
      return getStyle;
    }
  }
  public com.google.gwt.resources.client.CssResource getStyle() {
    return getStyleInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static com.google.gwt.resources.client.TextResource getContents;
  private static com.google.gwt.resources.client.CssResource getStyle;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      getContents(), 
      getStyle(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("getContents", getContents());
        resourceMap.put("getStyle", getStyle());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'getContents': return this.@org.jboss.errai.ioc.client.Type_factory__o_d_r_c_s_SelectorDropDownItemView__quals__j_e_i_Any_j_e_i_Default.o_d_r_c_s_SelectorDropDownItemViewTemplateResource::getContents()();
      case 'getStyle': return this.@org.jboss.errai.ioc.client.Type_factory__o_d_r_c_s_SelectorDropDownItemView__quals__j_e_i_Any_j_e_i_Default.o_d_r_c_s_SelectorDropDownItemViewTemplateResource::getStyle()();
    }
    return null;
  }-*/;
}
