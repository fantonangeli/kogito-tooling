package org.dashbuilder.displayer.client.widgets.filter;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class DateParameterEditorView_BinderImpl_GenBundle_default_InlineClientBundleGenerator implements org.dashbuilder.displayer.client.widgets.filter.DateParameterEditorView_BinderImpl_GenBundle {
  private static DateParameterEditorView_BinderImpl_GenBundle_default_InlineClientBundleGenerator _instance0 = new DateParameterEditorView_BinderImpl_GenBundle_default_InlineClientBundleGenerator();
  private void styleInitializer() {
    style = new org.dashbuilder.displayer.client.widgets.filter.DateParameterEditorView_BinderImpl_GenCss_style() {
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
        return "style";
      }
      public String getText() {
        return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? ((".GD0PFO4BER{float:" + ("right")  + ";width:" + ("275px")  + ";}.GD0PFO4BDR{margin-right:" + ("-1px")  + ";}")) : ((".GD0PFO4BER{float:" + ("left")  + ";width:" + ("275px")  + ";}.GD0PFO4BDR{margin-left:" + ("-1px")  + ";}"));
      }
      public java.lang.String calendarIcon() {
        return "GD0PFO4BDR";
      }
      public java.lang.String datePicker() {
        return "GD0PFO4BER";
      }
    }
    ;
  }
  private static class styleInitializer {
    static {
      _instance0.styleInitializer();
    }
    static org.dashbuilder.displayer.client.widgets.filter.DateParameterEditorView_BinderImpl_GenCss_style get() {
      return style;
    }
  }
  public org.dashbuilder.displayer.client.widgets.filter.DateParameterEditorView_BinderImpl_GenCss_style style() {
    return styleInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static org.dashbuilder.displayer.client.widgets.filter.DateParameterEditorView_BinderImpl_GenCss_style style;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      style(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("style", style());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'style': return this.@org.dashbuilder.displayer.client.widgets.filter.DateParameterEditorView_BinderImpl_GenBundle::style()();
    }
    return null;
  }-*/;
}
