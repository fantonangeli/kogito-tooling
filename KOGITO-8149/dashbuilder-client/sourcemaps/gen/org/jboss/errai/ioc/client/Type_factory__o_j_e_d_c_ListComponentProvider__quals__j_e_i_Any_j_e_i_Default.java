package org.jboss.errai.ioc.client;

import javax.enterprise.context.Dependent;
import org.jboss.errai.databinding.client.ListComponentProvider;
import org.jboss.errai.ioc.client.api.ContextualTypeProvider;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;

public class Type_factory__o_j_e_d_c_ListComponentProvider__quals__j_e_i_Any_j_e_i_Default extends Factory<ListComponentProvider> { public Type_factory__o_j_e_d_c_ListComponentProvider__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(ListComponentProvider.class, "Type_factory__o_j_e_d_c_ListComponentProvider__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true));
    handle.setAssignableTypes(new Class[] { ListComponentProvider.class, Object.class, ContextualTypeProvider.class });
  }

  public ListComponentProvider createInstance(final ContextManager contextManager) {
    final ListComponentProvider instance = new ListComponentProvider();
    setIncompleteInstance(instance);
    setIncompleteInstance(null);
    return instance;
  }
}