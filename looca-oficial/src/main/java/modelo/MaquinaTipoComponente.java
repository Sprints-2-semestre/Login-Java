package modelo;

public class MaquinaTipoComponente {
    private Integer idMaquinaTipoComponente;
    private Integer fkMaquina;
    private Integer fkTipoComponente;
    private String idProcessador;
    private Integer numProcessadoresLogicos;
    private Integer numProcessadoresFisicos;
    private Double tamanhoTotal;
    private String numSerial;
    private String enderecoMac;
    private String ipv4;

    public MaquinaTipoComponente(Integer fkMaquina, Integer fkTipoComponente, String idProcessador, Integer numProcessadoresLogicos, Integer numProcessadoresFisicos, Double tamanhoTotal, String enderecoMac, String numSerial, String ipv4) {
        idMaquinaTipoComponente = null;
        this.fkMaquina = fkMaquina;
        this.fkTipoComponente = fkTipoComponente;
        this.idProcessador = idProcessador;
        this.numProcessadoresLogicos = numProcessadoresLogicos;
        this.numProcessadoresFisicos = numProcessadoresFisicos;
        this.tamanhoTotal = tamanhoTotal;
        this.enderecoMac = enderecoMac;
        this.numSerial = numSerial;
        this.ipv4 = ipv4;
    }

    public MaquinaTipoComponente() {
    }

    public Integer getIdMaquinaTipoComponente() {
        return idMaquinaTipoComponente;
    }

    public void setIdMaquinaTipoComponente(Integer idMaquinaTipoComponente) {
        this.idMaquinaTipoComponente = idMaquinaTipoComponente;
    }

    public Integer getFkMaquina() {
        return fkMaquina;
    }

    public void setFkMaquina(Integer fkMaquina) {
        this.fkMaquina = fkMaquina;
    }

    public Integer getFkTipoComponente() {
        return fkTipoComponente;
    }

    public void setFkTipoComponente(Integer fkTipoComponente) {
        this.fkTipoComponente = fkTipoComponente;
    }

    public String getIdProcessador() {
        return idProcessador;
    }

    public void setIdProcessador(String idProcessador) {
        this.idProcessador = idProcessador;
    }

    public Integer getNumProcessadoresLogicos() {
        return numProcessadoresLogicos;
    }

    public void setNumProcessadoresLogicos(Integer numProcessadoresLogicos) {
        this.numProcessadoresLogicos = numProcessadoresLogicos;
    }

    public Integer getNumProcessadoresFisicos() {
        return numProcessadoresFisicos;
    }

    public void setNumProcessadoresFisicos(Integer numProcessadoresFisicos) {
        this.numProcessadoresFisicos = numProcessadoresFisicos;
    }

    public Double getTamanhoTotal() {
        return tamanhoTotal;
    }

    public void setTamanhoTotal(Double tamanhoTotal) {
        this.tamanhoTotal = tamanhoTotal;
    }

    public String getEnderecoMac() {
        return enderecoMac;
    }

    public void setEnderecoMac(String enderecoMac) {
        this.enderecoMac = enderecoMac;
    }

    public String getNumeroSerial() {
        return numSerial;
    }

    public void setNumeroSerial(String numSerial) {
        this.numSerial = numSerial;
    }

    public String getIpv4() {
        return ipv4;
    }

    public void setIpv4(String ipv4) {
        this.ipv4 = ipv4;
    }

    @Override
    public String toString() {
        return """
                Id Maquina Tipo Componente: %d
                Fk Maquina: %d
                Fk Tipo Componente: %d
                Id Processador: %s
                Número Processadores Lógicos: %d
                Número Processadores Físicos: %d
                Tamanho Total: %.4f
                Endereço Mac: %s
                Número Serial: %s
                Ipv4: %s
                """.formatted(idMaquinaTipoComponente, fkMaquina, fkTipoComponente, idProcessador, numProcessadoresLogicos, numProcessadoresFisicos, tamanhoTotal, enderecoMac, numSerial, ipv4);
    }
}
