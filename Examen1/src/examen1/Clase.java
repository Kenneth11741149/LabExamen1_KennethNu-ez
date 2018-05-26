package examen1;

import java.util.ArrayList;

public class Clase {
    private String name;
    private ArrayList<String> Atributos = new ArrayList();
    private ArrayList<String> Metodos = new ArrayList();

    public Clase(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public ArrayList<String> getAtributos() {
        return Atributos;
    }

    public void setAtributos(ArrayList<String> Atributos) {
        this.Atributos = Atributos;
    }

    public ArrayList<String> getMetodos() {
        return Metodos;
    }

    public void setMetodos(ArrayList<String> Metodos) {
        this.Metodos = Metodos;
    }


    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Clase{" + "name=" + name + ", Atributos=" + Atributos + ", Metodos=" + Metodos + '}';
    }
    
    
    
}
