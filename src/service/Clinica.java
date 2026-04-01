package service;

import java.util.ArrayList;
import model.Animal;
import model.Tutor;

public class Clinica {

    private ArrayList<Animal> animais;
    private ArrayList<Tutor> tutores;

    public Clinica() {
        animais = new ArrayList<>();
        tutores = new ArrayList<>();
    }

    public void cadastrarTutor(Tutor tutor) {
        tutores.add(tutor);
    }

    public void cadastrarAnimal(Animal animal) {
        animais.add(animal);
    }

    public ArrayList<Tutor> getTutores() {
        return tutores;
    }

    public void listarTutores() {
        if (tutores.isEmpty()) {
            System.out.println("Nenhum tutor cadastrado.");
            return;
        }

        for (Tutor tutor : tutores) {
            System.out.println(tutor);
        }
    }

    public void listarAnimais() {
        if (animais.isEmpty()) {
            System.out.println("Nenhum animal cadastrado.");
            return;
        }

        for (Animal animal : animais) {
            System.out.println(animal);
            System.out.println("Tutor: " + animal.getTutor().getNome());
            System.out.println("----------------------");
        }
    }

    public Animal buscarAnimal(String nome) {
        for (Animal animal : animais) {
            if (animal.getNome().equalsIgnoreCase(nome)) {
                return animal;
            }
        }
        return null;
    }
}