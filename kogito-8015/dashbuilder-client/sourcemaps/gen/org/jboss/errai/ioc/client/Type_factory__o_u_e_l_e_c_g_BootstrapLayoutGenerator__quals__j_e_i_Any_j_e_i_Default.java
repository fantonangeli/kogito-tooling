package org.jboss.errai.ioc.client;

import javax.enterprise.context.Dependent;
import org.jboss.errai.common.client.dom.elemental2.Elemental2DomUtil;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.uberfire.ext.layout.editor.client.generator.AbstractLayoutGenerator;
import org.uberfire.ext.layout.editor.client.generator.BootstrapLayoutGenerator;
import org.uberfire.ext.layout.editor.client.generator.BootstrapLayoutGeneratorDriver;
import org.uberfire.ext.layout.editor.client.generator.LayoutGenerator;
import org.uberfire.ext.layout.editor.client.infra.LayoutEditorCssHelper;

public class Type_factory__o_u_e_l_e_c_g_BootstrapLayoutGenerator__quals__j_e_i_Any_j_e_i_Default extends Factory<BootstrapLayoutGenerator> { public Type_factory__o_u_e_l_e_c_g_BootstrapLayoutGenerator__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(BootstrapLayoutGenerator.class, "Type_factory__o_u_e_l_e_c_g_BootstrapLayoutGenerator__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true));
    handle.setAssignableTypes(new Class[] { BootstrapLayoutGenerator.class, AbstractLayoutGenerator.class, Object.class, LayoutGenerator.class });
  }

  public BootstrapLayoutGenerator createInstance(final ContextManager contextManager) {
    final BootstrapLayoutGenerator instance = new BootstrapLayoutGenerator();
    setIncompleteInstance(instance);
    final BootstrapLayoutGeneratorDriver BootstrapLayoutGenerator_bootstrapDriver = (BootstrapLayoutGeneratorDriver) contextManager.getInstance("Type_factory__o_u_e_l_e_c_g_BootstrapLayoutGeneratorDriver__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, BootstrapLayoutGenerator_bootstrapDriver);
    BootstrapLayoutGenerator_BootstrapLayoutGeneratorDriver_bootstrapDriver(instance, BootstrapLayoutGenerator_bootstrapDriver);
    final LayoutEditorCssHelper AbstractLayoutGenerator_cssPropertiesHelper = (LayoutEditorCssHelper) contextManager.getInstance("Type_factory__o_u_e_l_e_c_i_LayoutEditorCssHelper__quals__j_e_i_Any_j_e_i_Default");
    AbstractLayoutGenerator_LayoutEditorCssHelper_cssPropertiesHelper(instance, AbstractLayoutGenerator_cssPropertiesHelper);
    final Elemental2DomUtil AbstractLayoutGenerator_elemental2Util = (Elemental2DomUtil) contextManager.getInstance("Type_factory__o_j_e_c_c_d_e_Elemental2DomUtil__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, AbstractLayoutGenerator_elemental2Util);
    AbstractLayoutGenerator_Elemental2DomUtil_elemental2Util(instance, AbstractLayoutGenerator_elemental2Util);
    setIncompleteInstance(null);
    return instance;
  }

  native static LayoutEditorCssHelper AbstractLayoutGenerator_LayoutEditorCssHelper_cssPropertiesHelper(AbstractLayoutGenerator instance) /*-{
    return instance.@org.uberfire.ext.layout.editor.client.generator.AbstractLayoutGenerator::cssPropertiesHelper;
  }-*/;

  native static void AbstractLayoutGenerator_LayoutEditorCssHelper_cssPropertiesHelper(AbstractLayoutGenerator instance, LayoutEditorCssHelper value) /*-{
    instance.@org.uberfire.ext.layout.editor.client.generator.AbstractLayoutGenerator::cssPropertiesHelper = value;
  }-*/;

  native static BootstrapLayoutGeneratorDriver BootstrapLayoutGenerator_BootstrapLayoutGeneratorDriver_bootstrapDriver(BootstrapLayoutGenerator instance) /*-{
    return instance.@org.uberfire.ext.layout.editor.client.generator.BootstrapLayoutGenerator::bootstrapDriver;
  }-*/;

  native static void BootstrapLayoutGenerator_BootstrapLayoutGeneratorDriver_bootstrapDriver(BootstrapLayoutGenerator instance, BootstrapLayoutGeneratorDriver value) /*-{
    instance.@org.uberfire.ext.layout.editor.client.generator.BootstrapLayoutGenerator::bootstrapDriver = value;
  }-*/;

  native static Elemental2DomUtil AbstractLayoutGenerator_Elemental2DomUtil_elemental2Util(AbstractLayoutGenerator instance) /*-{
    return instance.@org.uberfire.ext.layout.editor.client.generator.AbstractLayoutGenerator::elemental2Util;
  }-*/;

  native static void AbstractLayoutGenerator_Elemental2DomUtil_elemental2Util(AbstractLayoutGenerator instance, Elemental2DomUtil value) /*-{
    instance.@org.uberfire.ext.layout.editor.client.generator.AbstractLayoutGenerator::elemental2Util = value;
  }-*/;
}