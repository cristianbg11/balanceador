package com.pucmm.dockeraltadisponibilidad.cornelia.repository;


import com.pucmm.dockeraltadisponibilidad.cornelia.entidades.Formulario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface FormularioRepository extends JpaRepository<Formulario, Long> {

    @Query(nativeQuery = true, value = "SELECT SUM(f.resultado1) FROM formulario as f GROUP BY f.pregunta1")
    public Integer countByResultado1();

    @Query(nativeQuery = true, value = "SELECT SUM(f.resultado2) FROM formulario as f GROUP BY f.pregunta2")
    public Integer countByResultado2();

    @Query(nativeQuery = true, value = "SELECT SUM(f.resultado3) FROM formulario as f GROUP BY f.pregunta3")
    public Integer countByResultado3();

    @Query(nativeQuery = true, value = "SELECT SUM(f.resultado4) FROM formulario as f GROUP BY f.pregunta4")
    public Integer countByResultado4();


}
