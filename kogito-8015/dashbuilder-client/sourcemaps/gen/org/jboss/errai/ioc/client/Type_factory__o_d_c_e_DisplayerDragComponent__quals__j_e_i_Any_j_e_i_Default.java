package org.jboss.errai.ioc.client;

import javax.enterprise.context.Dependent;
import org.dashbuilder.client.editor.DisplayerDragComponent;
import org.dashbuilder.displayer.GlobalDisplayerSettings;
import org.dashbuilder.displayer.client.GlobalDisplayerSettingsImpl;
import org.dashbuilder.displayer.client.PerspectiveCoordinator;
import org.dashbuilder.displayer.client.widgets.DisplayerErrorWidget;
import org.dashbuilder.displayer.client.widgets.DisplayerViewer;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ioc.client.container.SyncBeanManager;
import org.uberfire.client.mvp.PlaceManager;
import org.uberfire.client.mvp.PlaceManagerImpl;
import org.uberfire.ext.layout.editor.client.api.LayoutDragComponent;

public class Type_factory__o_d_c_e_DisplayerDragComponent__quals__j_e_i_Any_j_e_i_Default extends Factory<DisplayerDragComponent> { public Type_factory__o_d_c_e_DisplayerDragComponent__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(DisplayerDragComponent.class, "Type_factory__o_d_c_e_DisplayerDragComponent__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true));
    handle.setAssignableTypes(new Class[] { DisplayerDragComponent.class, Object.class, LayoutDragComponent.class });
  }

  public DisplayerDragComponent createInstance(final ContextManager contextManager) {
    final SyncBeanManager _beanManager_0 = (SyncBeanManager) contextManager.getInstance("Producer_factory__o_j_e_i_c_c_SyncBeanManager__quals__j_e_i_Any_j_e_i_Default");
    final PlaceManager _placeManager_2 = (PlaceManagerImpl) contextManager.getInstance("Type_factory__o_u_c_m_PlaceManagerImpl__quals__j_e_i_Any_j_e_i_Default");
    final GlobalDisplayerSettings _globalDisplayerSettings_4 = (GlobalDisplayerSettingsImpl) contextManager.getInstance("Type_factory__o_d_d_c_GlobalDisplayerSettingsImpl__quals__j_e_i_Any_j_e_i_Default");
    final PerspectiveCoordinator _perspectiveCoordinator_3 = (PerspectiveCoordinator) contextManager.getInstance("Type_factory__o_d_d_c_PerspectiveCoordinator__quals__j_e_i_Any_j_e_i_Default");
    final DisplayerViewer _viewer_1 = (DisplayerViewer) contextManager.getInstance("Type_factory__o_d_d_c_w_DisplayerViewer__quals__j_e_i_Any_j_e_i_Default");
    final DisplayerDragComponent instance = new DisplayerDragComponent(_beanManager_0, _viewer_1, _placeManager_2, _perspectiveCoordinator_3, _globalDisplayerSettings_4);
    registerDependentScopedReference(instance, _beanManager_0);
    registerDependentScopedReference(instance, _viewer_1);
    setIncompleteInstance(instance);
    final DisplayerErrorWidget DisplayerDragComponent_displayError = (DisplayerErrorWidget) contextManager.getInstance("Type_factory__o_d_d_c_w_DisplayerErrorWidget__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, DisplayerDragComponent_displayError);
    DisplayerDragComponent_DisplayerErrorWidget_displayError(instance, DisplayerDragComponent_displayError);
    setIncompleteInstance(null);
    return instance;
  }

  native static DisplayerErrorWidget DisplayerDragComponent_DisplayerErrorWidget_displayError(DisplayerDragComponent instance) /*-{
    return instance.@org.dashbuilder.client.editor.DisplayerDragComponent::displayError;
  }-*/;

  native static void DisplayerDragComponent_DisplayerErrorWidget_displayError(DisplayerDragComponent instance, DisplayerErrorWidget value) /*-{
    instance.@org.dashbuilder.client.editor.DisplayerDragComponent::displayError = value;
  }-*/;
}