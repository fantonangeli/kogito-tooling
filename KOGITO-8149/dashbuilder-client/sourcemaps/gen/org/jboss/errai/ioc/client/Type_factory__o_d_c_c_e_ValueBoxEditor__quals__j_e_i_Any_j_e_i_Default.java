package org.jboss.errai.ioc.client;

import com.google.gwt.editor.client.Editor;
import com.google.gwt.editor.client.HasEditorErrors;
import com.google.gwt.editor.client.LeafValueEditor;
import com.google.gwt.user.client.TakesValue;
import com.google.gwt.user.client.ui.IsWidget;
import java.lang.annotation.Annotation;
import javax.enterprise.context.Dependent;
import javax.enterprise.event.Event;
import org.dashbuilder.common.client.editor.LeafAttributeEditor;
import org.dashbuilder.common.client.editor.ValueBoxEditor;
import org.dashbuilder.common.client.editor.ValueBoxEditor.View;
import org.dashbuilder.common.client.editor.ValueBoxEditorView;
import org.dashbuilder.common.client.event.ValueChangeEvent;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;

public class Type_factory__o_d_c_c_e_ValueBoxEditor__quals__j_e_i_Any_j_e_i_Default extends Factory<ValueBoxEditor> { public Type_factory__o_d_c_c_e_ValueBoxEditor__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(ValueBoxEditor.class, "Type_factory__o_d_c_c_e_ValueBoxEditor__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true));
    handle.setAssignableTypes(new Class[] { ValueBoxEditor.class, Object.class, IsWidget.class, LeafAttributeEditor.class, HasEditorErrors.class, Editor.class, LeafValueEditor.class, Editor.class, TakesValue.class });
  }

  public ValueBoxEditor createInstance(final ContextManager contextManager) {
    final Event<ValueChangeEvent> _valueChangeEvent_1 = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { ValueChangeEvent.class }, new Annotation[] { });
    final View _view_0 = (ValueBoxEditorView) contextManager.getInstance("Type_factory__o_d_c_c_e_ValueBoxEditorView__quals__j_e_i_Any_j_e_i_Default");
    final ValueBoxEditor instance = new ValueBoxEditor(_view_0, _valueChangeEvent_1);
    registerDependentScopedReference(instance, _valueChangeEvent_1);
    registerDependentScopedReference(instance, _view_0);
    setIncompleteInstance(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void invokePostConstructs(final ValueBoxEditor instance) {
    instance.init();
  }
}