package br.cnj.primeiroexemplo.model;

import java.time.LocalDate;

public class Processo {

    private Long idProcesso;

    private String nrProcesso;
    private String nrProcessoOrigem;
    private String dsComplemento;
    private LocalDate dtInicio;
    private Long idJbpm;
    private LocalDate dtFim;
    private int nrDuracao;
    private String nmActorId;
    private String dsNmUsuCadastroProcesso;
    private Long idPkTbProcessoPg;
    private String idSessaoPg;
    private String nrProcessoTemp;
    
    public Long getIdProcesso() {
        return idProcesso;
    }
    public void setIdProcesso(Long idProcesso) {
        this.idProcesso = idProcesso;
    }
    public String getNrProcesso() {
        return nrProcesso;
    }
    public void setNrProcesso(String nrProcesso) {
        this.nrProcesso = nrProcesso;
    }
    public String getNrProcessoOrigem() {
        return nrProcessoOrigem;
    }
    public void setNrProcessoOrigem(String nrProcessoOrigem) {
        this.nrProcessoOrigem = nrProcessoOrigem;
    }
    public String getDsComplemento() {
        return dsComplemento;
    }
    public void setDsComplemento(String dsComplemento) {
        this.dsComplemento = dsComplemento;
    }
    public LocalDate getDtInicio() {
        return dtInicio;
    }
    public void setDtInicio(LocalDate dtInicio) {
        this.dtInicio = dtInicio;
    }
    public Long getIdJbpm() {
        return idJbpm;
    }
    public void setIdJbpm(Long idJbpm) {
        this.idJbpm = idJbpm;
    }
    public LocalDate getDtFim() {
        return dtFim;
    }
    public void setDtFim(LocalDate dtFim) {
        this.dtFim = dtFim;
    }
    public int getNrDuracao() {
        return nrDuracao;
    }
    public void setNrDuracao(int nrDuracao) {
        this.nrDuracao = nrDuracao;
    }
    public String getNmActorId() {
        return nmActorId;
    }
    public void setNmActorId(String nmActorId) {
        this.nmActorId = nmActorId;
    }
    public String getDsNmUsuCadastroProcesso() {
        return dsNmUsuCadastroProcesso;
    }
    public void setDsNmUsuCadastroProcesso(String dsNmUsuCadastroProcesso) {
        this.dsNmUsuCadastroProcesso = dsNmUsuCadastroProcesso;
    }
    public Long getIdPkTbProcessoPg() {
        return idPkTbProcessoPg;
    }
    public void setIdPkTbProcessoPg(Long idPkTbProcessoPg) {
        this.idPkTbProcessoPg = idPkTbProcessoPg;
    }
    public String getIdSessaoPg() {
        return idSessaoPg;
    }
    public void setIdSessaoPg(String idSessaoPg) {
        this.idSessaoPg = idSessaoPg;
    }
    public String getNrProcessoTemp() {
        return nrProcessoTemp;
    }
    public void setNrProcessoTemp(String nrProcessoTemp) {
        this.nrProcessoTemp = nrProcessoTemp;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((idProcesso == null) ? 0 : idProcesso.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Processo other = (Processo) obj;
        if (idProcesso == null) {
            if (other.idProcesso != null)
                return false;
        } else if (!idProcesso.equals(other.idProcesso))
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "Processo [idProcesso=" + idProcesso + ", nrProcesso=" + nrProcesso + "]";
    }
}
