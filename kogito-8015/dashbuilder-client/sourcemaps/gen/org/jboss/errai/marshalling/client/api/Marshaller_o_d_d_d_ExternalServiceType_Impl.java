package org.jboss.errai.marshalling.client.api;

import org.dashbuilder.dataset.def.ExternalServiceType;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;

public class Marshaller_o_d_d_d_ExternalServiceType_Impl implements GeneratedMarshaller<ExternalServiceType> {
  private ExternalServiceType[] EMPTY_ARRAY = new ExternalServiceType[0];
  public ExternalServiceType[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  public ExternalServiceType demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    ExternalServiceType entity = obj != null ? Enum.valueOf(ExternalServiceType.class, obj.get("^EnumStringValue").isString().stringValue()) : a0.isString() != null ? Enum.valueOf(ExternalServiceType.class, a0.isString().stringValue()) : null;
    return entity;
  }

  public String marshall(ExternalServiceType a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    return a0 != null ? ((((((("{\"" + "^EncodedType") + "\":\"") + "org.dashbuilder.dataset.def.ExternalServiceType") + "\",\"") + "^EnumStringValue") + "\":\"") + a0.name()) + "\"}" : "null";
  }

  private void lazyInit() {

  }
}