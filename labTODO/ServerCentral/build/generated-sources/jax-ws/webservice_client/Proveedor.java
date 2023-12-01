
package webservice_client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para proveedor complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="proveedor"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://webservice/}usuario"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="departamento" type="{http://webservice/}departamento" minOccurs="0"/&gt;
 *         &lt;element name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="salidasAsociadas" type="{http://webservice/}salidasTuristicas" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="web" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "proveedor", propOrder = {
    "departamento",
    "descripcion",
    "salidasAsociadas",
    "web"
})
public class Proveedor
    extends Usuario
{

    protected Departamento departamento;
    protected String descripcion;
    @XmlElement(nillable = true)
    protected List<SalidasTuristicas> salidasAsociadas;
    protected String web;

    /**
     * Obtiene el valor de la propiedad departamento.
     * 
     * @return
     *     possible object is
     *     {@link Departamento }
     *     
     */
    public Departamento getDepartamento() {
        return departamento;
    }

    /**
     * Define el valor de la propiedad departamento.
     * 
     * @param value
     *     allowed object is
     *     {@link Departamento }
     *     
     */
    public void setDepartamento(Departamento value) {
        this.departamento = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Define el valor de la propiedad descripcion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcion(String value) {
        this.descripcion = value;
    }

    /**
     * Gets the value of the salidasAsociadas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the salidasAsociadas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSalidasAsociadas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SalidasTuristicas }
     * 
     * 
     */
    public List<SalidasTuristicas> getSalidasAsociadas() {
        if (salidasAsociadas == null) {
            salidasAsociadas = new ArrayList<SalidasTuristicas>();
        }
        return this.salidasAsociadas;
    }

    /**
     * Obtiene el valor de la propiedad web.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeb() {
        return web;
    }

    /**
     * Define el valor de la propiedad web.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeb(String value) {
        this.web = value;
    }

}
