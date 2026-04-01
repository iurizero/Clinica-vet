package model;

public class Animal {
    private String nome;
    private String raca;
    private int idade;

    //MAIS UM EXEMPLO DE PORRA DE CONSTRUTOR
    public Animal(String nome, String raca, int idade, Tutor tutor){
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
        this.tutor = tutor;
    }

    //GETTERS E SETTERS (Inserem e pegam info numa private string) (Cria usando ctrl+enter no macos)
    //Getters e setters para o nome
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

    //Getters e setters para raça
    public void setRaca(String raca) {
        this.raca = raca;
    }
    public String getRaca() {
        return raca;
    }

    //Getters e setters para idade
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public int getIdade() {
        return idade;
    }

    //Getter e setter do tutor
    public Tutor getTutor() {
        return tutor;
    }
    public void setTutor(Tutor tutor) {
        this.tutor = tutor;
    }

    private Tutor tutor;
}
