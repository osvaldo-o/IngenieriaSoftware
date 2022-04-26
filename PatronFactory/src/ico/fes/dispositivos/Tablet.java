package ico.fes.dispositivos;

import ico.fes.factory.Dispositivo;

public class Tablet implements Dispositivo{
    private String marca;
    private int tamaño_pulgadas;
    private String color;

    public Tablet() {
    }

    public Tablet(String marca, int tamaño_pulgadas, String color) {
        this.marca = marca;
        this.tamaño_pulgadas = tamaño_pulgadas;
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getTamaño_pulgadas() {
        return tamaño_pulgadas;
    }

    public void setTamaño_pulgadas(int tamaño_pulgadas) {
        this.tamaño_pulgadas = tamaño_pulgadas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Tablet{" + "marca=" + marca + ", tama\u00f1o_pulgadas=" + tamaño_pulgadas + ", color=" + color + '}';
    }
    
    
}
