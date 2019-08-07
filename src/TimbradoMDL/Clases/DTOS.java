package TimbradoMDL.Clases;

import Common.Activation;
import static Common.JavonetHelper.Convert;
import static Common.JavonetHelper.getGetObjectName;
import static Common.JavonetHelper.getReturnObjectName;
import static Common.JavonetHelper.ConvertToConcreteInterfaceImplementation;
import Common.JavonetHelper;
import Common.MethodTypeAnnotation;
import com.javonet.Javonet;
import com.javonet.JavonetException;
import com.javonet.JavonetFramework;
import com.javonet.api.NObject;
import com.javonet.api.NEnum;
import com.javonet.api.keywords.NRef;
import com.javonet.api.keywords.NOut;
import com.javonet.api.NControlContainer;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Iterator;
import java.lang.*;
import TimbradoMDL.Clases.*;

public class DTOS {
  protected NObject javonetHandle;

  public DTOS() {
    try {
      javonetHandle = Javonet.New("TimbradoMDL.Clases.DTOS");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public DTOS(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }

  public static class EdiFactResponse {
    protected NObject javonetHandle;
    /** GetFiled */
    @MethodTypeAnnotation(type = "GetField")
    public java.lang.String getCodigoError() {
      try {
        java.lang.String res = javonetHandle.get("CodigoError");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public void setCodigoError(java.lang.String param) {
      try {
        javonetHandle.set("CodigoError", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public java.lang.String getDescripcionError() {
      try {
        java.lang.String res = javonetHandle.get("DescripcionError");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public void setDescripcionError(java.lang.String param) {
      try {
        javonetHandle.set("DescripcionError", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public java.lang.String getXMLT() {
      try {
        java.lang.String res = javonetHandle.get("XMLT");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public void setXMLT(java.lang.String param) {
      try {
        javonetHandle.set("XMLT", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public java.lang.Boolean getTimbradoOk() {
      try {
        java.lang.Boolean res = javonetHandle.get("TimbradoOk");
        if (res == null) return false;
        return res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return false;
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public void setTimbradoOk(java.lang.Boolean param) {
      try {
        javonetHandle.set("TimbradoOk", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }

    public EdiFactResponse() {
      try {
        javonetHandle = Javonet.New("TimbradoMDL.Clases.DTOS+EdiFactResponse");
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }

    public EdiFactResponse(NObject handle) {
      this.javonetHandle = handle;
    }

    public void setJavonetHandle(NObject handle) {
      this.javonetHandle = handle;
    }
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
