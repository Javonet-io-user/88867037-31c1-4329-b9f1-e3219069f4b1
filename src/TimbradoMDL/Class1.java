package TimbradoMDL;

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
import TimbradoMDL.*;
import TimbradoMDL.Clases.*;

public class Class1 {
  protected NObject javonetHandle;

  public Class1() {
    try {
      javonetHandle = Javonet.New("TimbradoMDL.Class1");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Class1(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public DTOS.EdiFactResponse TimbraTFD(
      java.lang.String RFC, java.lang.String Agente, java.lang.String XML) {
    try {
      Object res = javonetHandle.invoke("TimbraTFD", RFC, Agente, XML);
      if (res == null) return null;
      return new DTOS.EdiFactResponse((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String Base64Decode(java.lang.String base64EncodedData) {
    try {
      java.lang.String res =
          Javonet.getType("TimbradoMDL.Class1").invoke("Base64Decode", base64EncodedData);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
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
