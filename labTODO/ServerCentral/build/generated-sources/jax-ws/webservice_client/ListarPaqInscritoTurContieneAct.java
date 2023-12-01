
package webservice_client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para listarPaqInscritoTurContieneAct complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="listarPaqInscritoTurContieneAct"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="mailTurista" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nombreActividad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listarPaqInscritoTurContieneAct", propOrder = {
    "mailTurista",
    "nombreActividad"
})
public class ListarPaqInscritoTurContieneAct {

    protected String mailTurista;
    protected String nombreActividad;

    /**
     * Obtiene el valor de la propiedad mailTurista.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMailTurista() {
        return mailTurista;
    }

    /**
     * Define el valor de la propiedad mailTurista.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMailTurista(String value) {
        this.mailTurista = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreActividad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreActividad() {
        return nombreActividad;
    }

    /**
     * Define el valor de la propiedad nombreActividad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreActividad(String value) {
        this.nombreActividad = value;
    }

}
