package examen1;

import java.util.ArrayList;

public class Clase {
    private String name;
    private ArrayList<String> Atributos = new ArrayList<String>();
    private ArrayList<String> Metodos = new ArrayList<String>();

    public Clase(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public ArrayList<String> getAtributos() {
        return Atributos;
    }

    public ArrayList<String> getMetodos() {
        return Metodos;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAtributos(ArrayList<Atributo> Atributos) {
        this.Atributos = Atributos;
    }

    public void setMetodos(ArrayList<Metodo> Metodos) {
        this.Metodos = Metodos;
    }

    @Override
    public String toString() {
        return "Clase{" + "name=" + name + ", Atributos=" + Atributos + ", Metodos=" + Metodos + '}';
    }
    
    
    
}
