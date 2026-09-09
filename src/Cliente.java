public class Cliente {
    private String nome;
    private String modelo;
    private String cor;
    private String placa;
    private String valor;
    private String servico;
    private String tipoVeiculo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getServico() {
        return servico;
    }

    public void setServico(String servico) {
        this.servico = servico;
    }

    public String getTipoVeiculo() {
        return tipoVeiculo;
    }

    public void setTipoVeiculo(String tipoVeiculo) {
        this.tipoVeiculo = tipoVeiculo;
    }

    public Cliente(String nome, String modelo, String cor, String placa, String servico, String tipoVeiculo, String valor) {
        setNome(nome);
        setModelo(modelo);
        setCor(cor);
        setPlaca(placa);
        setServico(servico);
        setTipoVeiculo(tipoVeiculo);
        setValor(valor);
    }
}
