package logica;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import logica.ActividadTuristica;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-11-20T17:34:34", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Departamento.class)
public class Departamento_ { 

    public static volatile SingularAttribute<Departamento, String> descripcion;
    public static volatile CollectionAttribute<Departamento, ActividadTuristica> actTur;
    public static volatile SingularAttribute<Departamento, String> nombreDepartamento;
    public static volatile SingularAttribute<Departamento, String> url;

}