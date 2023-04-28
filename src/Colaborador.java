class Colaborador {
    private String nome;
    private String cpf;
    private String telefone;
    private String dataNascimento;
    private String dataAgendamento;
    private String periodo;

    public Colaborador(String nome, String cpf, String telefone, String dataNascimento, String dataAgendamento, String periodo) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
        this.dataAgendamento = dataAgendamento;
        this.periodo = periodo;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public String getDataAgendamento() {
        return dataAgendamento;
    }

    public String getPeriodo() {
        return periodo;
    }
}