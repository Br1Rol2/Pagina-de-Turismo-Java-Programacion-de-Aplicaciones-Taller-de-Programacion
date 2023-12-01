
package webservice_client;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.5
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "UsuarioNoExisteException", targetNamespace = "http://webservice/")
public class UsuarioNoExisteException_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private UsuarioNoExisteException faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public UsuarioNoExisteException_Exception(String message, UsuarioNoExisteException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public UsuarioNoExisteException_Exception(String message, UsuarioNoExisteException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: webservice_client.UsuarioNoExisteException
     */
    public UsuarioNoExisteException getFaultInfo() {
        return faultInfo;
    }

}
