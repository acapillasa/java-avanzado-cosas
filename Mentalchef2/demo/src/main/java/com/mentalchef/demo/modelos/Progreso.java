package com.mentalchef.demo.modelos;

import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "progreso")
public class Progreso {

    @EmbeddedId
    private ProgresoId id;

    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "fecha_respuesta", updatable = false)
    private Date fechaRespuesta;

    @Column(name = "acertado")
    private boolean acertado;

    // Constructor con parámetros
    public Progreso(ProgresoId id, boolean acertado) {
        this.id = id;
        this.acertado = acertado;
    }




    
    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "fechacreacion", updatable = false)
    private Date fechaCreacion;

    @UpdateTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "fechaactualizacion")
    private Date fechaActualizacion;
}
