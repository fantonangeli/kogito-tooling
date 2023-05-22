package org.jboss.errai.ioc.client;

import javax.enterprise.context.Dependent;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.uberfire.ext.layout.editor.client.api.LayoutDragComponent;
import org.uberfire.ext.plugin.client.perspective.editor.layout.editor.MarkdownLayoutDragComponent;

public class Type_factory__o_u_e_p_c_p_e_l_e_MarkdownLayoutDragComponent__quals__j_e_i_Any_j_e_i_Default extends Factory<MarkdownLayoutDragComponent> { public Type_factory__o_u_e_p_c_p_e_l_e_MarkdownLayoutDragComponent__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(MarkdownLayoutDragComponent.class, "Type_factory__o_u_e_p_c_p_e_l_e_MarkdownLayoutDragComponent__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true));
    handle.setAssignableTypes(new Class[] { MarkdownLayoutDragComponent.class, Object.class, LayoutDragComponent.class });
  }

  public MarkdownLayoutDragComponent createInstance(final ContextManager contextManager) {
    final MarkdownLayoutDragComponent instance = new MarkdownLayoutDragComponent();
    setIncompleteInstance(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void invokePostConstructs(final MarkdownLayoutDragComponent instance) {
    MarkdownLayoutDragComponent_setup(instance);
  }

  public native static void MarkdownLayoutDragComponent_setup(MarkdownLayoutDragComponent instance) /*-{
    instance.@org.uberfire.ext.plugin.client.perspective.editor.layout.editor.MarkdownLayoutDragComponent::setup()();
  }-*/;
}