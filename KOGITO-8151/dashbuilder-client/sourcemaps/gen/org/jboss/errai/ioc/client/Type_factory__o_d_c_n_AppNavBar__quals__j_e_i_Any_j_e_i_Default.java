package org.jboss.errai.ioc.client;

import javax.enterprise.context.ApplicationScoped;
import org.dashbuilder.client.RuntimeClientLoader;
import org.dashbuilder.client.navbar.AppNavBar;
import org.jboss.errai.ioc.client.container.Context;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ioc.client.container.Proxy;
import org.jboss.errai.ioc.client.container.ProxyHelper;
import org.jboss.errai.ioc.client.container.ProxyHelperImpl;
import org.uberfire.client.workbench.WorkbenchLayout;
import org.uberfire.client.workbench.WorkbenchLayoutImpl;

public class Type_factory__o_d_c_n_AppNavBar__quals__j_e_i_Any_j_e_i_Default extends Factory<AppNavBar> { private class Type_factory__o_d_c_n_AppNavBar__quals__j_e_i_Any_j_e_i_DefaultProxyImpl extends AppNavBar implements Proxy<AppNavBar> {
    private final ProxyHelper<AppNavBar> proxyHelper = new ProxyHelperImpl<AppNavBar>("Type_factory__o_d_c_n_AppNavBar__quals__j_e_i_Any_j_e_i_Default");
    public void initProxyProperties(final AppNavBar instance) {

    }

    public AppNavBar asBeanType() {
      return this;
    }

    public void setInstance(final AppNavBar instance) {
      proxyHelper.setInstance(instance);
    }

    public void clearInstance() {
      proxyHelper.clearInstance();
    }

    public void setProxyContext(final Context context) {
      proxyHelper.setProxyContext(context);
    }

    public Context getProxyContext() {
      return proxyHelper.getProxyContext();
    }

    public Object unwrap() {
      return proxyHelper.getInstance(this);
    }

    public boolean equals(Object obj) {
      obj = Factory.maybeUnwrapProxy(obj);
      return proxyHelper.getInstance(this).equals(obj);
    }

    @Override public void setHide(boolean hide) {
      if (proxyHelper != null) {
        final AppNavBar proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.setHide(hide);
      } else {
        super.setHide(hide);
      }
    }

    @Override public int hashCode() {
      if (proxyHelper != null) {
        final AppNavBar proxiedInstance = proxyHelper.getInstance(this);
        final int retVal = proxiedInstance.hashCode();
        return retVal;
      } else {
        return super.hashCode();
      }
    }
  }
  public Type_factory__o_d_c_n_AppNavBar__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(AppNavBar.class, "Type_factory__o_d_c_n_AppNavBar__quals__j_e_i_Any_j_e_i_Default", ApplicationScoped.class, false, null, true));
    handle.setAssignableTypes(new Class[] { AppNavBar.class, Object.class });
  }

  public AppNavBar createInstance(final ContextManager contextManager) {
    final AppNavBar instance = new AppNavBar();
    setIncompleteInstance(instance);
    final WorkbenchLayoutImpl AppNavBar_wbLayout = (WorkbenchLayoutImpl) contextManager.getInstance("Type_factory__o_u_c_w_WorkbenchLayoutImpl__quals__j_e_i_Any_j_e_i_Default");
    AppNavBar_WorkbenchLayout_wbLayout(instance, AppNavBar_wbLayout);
    final RuntimeClientLoader AppNavBar_loader = (RuntimeClientLoader) contextManager.getInstance("Type_factory__o_d_c_RuntimeClientLoader__quals__j_e_i_Any_j_e_i_Default");
    AppNavBar_RuntimeClientLoader_loader(instance, AppNavBar_loader);
    setIncompleteInstance(null);
    return instance;
  }

  public Proxy createProxy(final Context context) {
    final Proxy<AppNavBar> proxyImpl = new Type_factory__o_d_c_n_AppNavBar__quals__j_e_i_Any_j_e_i_DefaultProxyImpl();
    proxyImpl.setProxyContext(context);
    return proxyImpl;
  }

  native static WorkbenchLayout AppNavBar_WorkbenchLayout_wbLayout(AppNavBar instance) /*-{
    return instance.@org.dashbuilder.client.navbar.AppNavBar::wbLayout;
  }-*/;

  native static void AppNavBar_WorkbenchLayout_wbLayout(AppNavBar instance, WorkbenchLayout value) /*-{
    instance.@org.dashbuilder.client.navbar.AppNavBar::wbLayout = value;
  }-*/;

  native static RuntimeClientLoader AppNavBar_RuntimeClientLoader_loader(AppNavBar instance) /*-{
    return instance.@org.dashbuilder.client.navbar.AppNavBar::loader;
  }-*/;

  native static void AppNavBar_RuntimeClientLoader_loader(AppNavBar instance, RuntimeClientLoader value) /*-{
    instance.@org.dashbuilder.client.navbar.AppNavBar::loader = value;
  }-*/;
}