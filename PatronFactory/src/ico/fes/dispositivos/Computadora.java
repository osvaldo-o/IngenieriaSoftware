package ico.fes.dispositivos;

import ico.fes.factory.Dispositivo;

public class Computadora implements Dispositivo{
    private String modelo;
    private int memoriaRAM;
    private int almacenamiento;

    public Computadora() {
    }

    public Computadora(String modelo, int memoriaRAM, int almacenamiento) {
        this.modelo = modelo;
        this.memoriaRAM = memoriaRAM;
        this.almacenamiento = almacenamiento;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getMemoriaRAM() {
        return memoriaRAM;
    }

    public void setMemoriaRAM(int memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    @Override
    public String toString() {
        return "Computadora{" + "modelo=" + modelo + ", memoriaRAM=" + memoriaRAM + ", almacenamiento=" + almacenamiento + '}';
    }
}
