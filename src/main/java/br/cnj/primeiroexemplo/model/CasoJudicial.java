package br.cnj.primeiroexemplo.model;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Objects;

public class CasoJudicial {

    private int id;

    private String numeroUnico;

    private String decisao;

    
    private String descricao;
    
    private Timestamp dataRegistro;
    
    public CasoJudicial(String numeroUnico, String decisao, String descricao) {
        this.numeroUnico = numeroUnico;
        this.decisao = decisao;
        this.descricao = descricao;
        this.dataRegistro = new Timestamp(System.currentTimeMillis());
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumeroUnico() {
        return numeroUnico;
    }

    public void setNumeroUnico(String numeroUnico) {
        this.numeroUnico = numeroUnico;
    }

    public String getDecisao() {
        return decisao;
    }

    public void setDecisao(String decisao) {
        this.decisao = decisao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Timestamp getDataRegistro() {
        return dataRegistro;
    }

    public void setDataRegistro(Timestamp dataRegistro) {
        this.dataRegistro = dataRegistro;
    }
    
    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String data = Objects.isNull(this.dataRegistro)
                ? null
                : sdf.format(dataRegistro.getTime());
        return new StringBuilder()
                .append(String.format("%7d: %s - %1s - %s - %s",
                        id,
                        numeroUnico,
                        decisao,
                        data,
                        descricao))
                .toString();
    }

}
