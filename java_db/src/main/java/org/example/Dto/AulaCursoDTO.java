package org.example.Dto;

public class AulaCursoDTO {

    private Integer idAula;
    private Integer idCurso;
    private String colegio;
    private String curso;

    public AulaCursoDTO(Integer idAula, Integer idCurso,
                        String colegio, String curso) {
        this.idAula = idAula;
        this.idCurso = idCurso;
        this.colegio = colegio;
        this.curso = curso;
    }

    public Integer getIdAula() {
        return idAula;
    }

    public Integer getIdCurso() {
        return idCurso;
    }

    public String getColegio() {
        return colegio;
    }

    public String getCurso() {
        return curso;
    }
}
