package atividade5;

class endereco {
    String estado;
    String cidade;
    String bairro;
    int numero;
    String complemento;

    public endereco(String estado, String cidade, String bairro, int numero, String complemento) {
        this.estado = estado;
        this.cidade = cidade;
        this.bairro = bairro;
        this.numero = numero;
        this.complemento = complemento;
    }

    public void apresentarLogradouro() {
        System.out.println("Endereço: " + estado + ", " + cidade + ", " + bairro + ", " + numero + ", " + complemento);
    }
}
