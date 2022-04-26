package ico.fes.dispositivos;

import ico.fes.factory.Dispositivo;

public class SmartPhone implements Dispositivo{
    private String modelo;
    private String color;
    private float precio;

    public SmartPhone() {
    }

    public SmartPhone(String modelo, String color, float precio) {
        this.modelo = modelo;
        this.color = color;
        this.precio = precio;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "SmartPhone{" + "modelo=" + modelo + ", color=" + color + ", precio=" + precio + '}';
    }
}
