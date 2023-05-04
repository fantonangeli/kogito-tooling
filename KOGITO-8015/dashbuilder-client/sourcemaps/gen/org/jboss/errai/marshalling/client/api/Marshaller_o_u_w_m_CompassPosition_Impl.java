package org.jboss.errai.marshalling.client.api;

import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;
import org.uberfire.workbench.model.CompassPosition;

public class Marshaller_o_u_w_m_CompassPosition_Impl implements GeneratedMarshaller<CompassPosition> {
  private CompassPosition[] EMPTY_ARRAY = new CompassPosition[0];
  public CompassPosition[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  public CompassPosition demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    CompassPosition entity = obj != null ? Enum.valueOf(CompassPosition.class, obj.get("^EnumStringValue").isString().stringValue()) : a0.isString() != null ? Enum.valueOf(CompassPosition.class, a0.isString().stringValue()) : null;
    return entity;
  }

  public String marshall(CompassPosition a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    return a0 != null ? ((((((("{\"" + "^EncodedType") + "\":\"") + "org.uberfire.workbench.model.CompassPosition") + "\",\"") + "^EnumStringValue") + "\":\"") + a0.name()) + "\"}" : "null";
  }

  private void lazyInit() {

  }
}