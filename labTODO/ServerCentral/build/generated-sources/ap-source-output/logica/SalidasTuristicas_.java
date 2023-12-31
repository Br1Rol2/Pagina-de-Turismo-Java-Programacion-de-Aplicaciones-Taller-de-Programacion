package logica;

import java.time.LocalDate;
import java.time.LocalTime;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import logica.ActividadTuristica;
import logica.Inscripcion_general;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-11-20T17:34:34", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(SalidasTuristicas.class)
public class SalidasTuristicas_ { 

    public static volatile SingularAttribute<SalidasTuristicas, String> imagenSalida;
    public static volatile SingularAttribute<SalidasTuristicas, LocalDate> fechaAlta;
    public static volatile SingularAttribute<SalidasTuristicas, Long> cantVisitas;
    public static volatile SingularAttribute<SalidasTuristicas, LocalTime> hora;
    public static volatile SingularAttribute<SalidasTuristicas, String> lugar;
    public static volatile SingularAttribute<SalidasTuristicas, LocalDate> fechaSalida;
    public static volatile SingularAttribute<SalidasTuristicas, Integer> cantInscritos;
    public static volatile CollectionAttribute<SalidasTuristicas, Inscripcion_general> inscripciongeneral;
    public static volatile SingularAttribute<SalidasTuristicas, String> nombreSalida;
    public static volatile SingularAttribute<SalidasTuristicas, Integer> cantidadMaximaTuristas;
    public static volatile SingularAttribute<SalidasTuristicas, ActividadTuristica> actividadAsociada;

}