package ico.fes.factory;

import ico.fes.dispositivos.Computadora;
import ico.fes.dispositivos.SmartPhone;
import ico.fes.dispositivos.Tablet;

public class DispositivosFactory {
    public static Dispositivo createDispositivo(int tipo){
        switch(tipo){
            case Dispositivo.COMPUTADORA_LENOVO:
                return new Computadora("LENOVO T430s",8,120); 
            case Dispositivo.COMPUTADORA_HP:
                return new Computadora("HP H20", 16, 240);
            case Dispositivo.SMARTPHONE_IPHONE:
                return new SmartPhone("IPHONE","Azul celeste", 8500.00f);
            case Dispositivo.SMARTPHONE_SANSUNG:
                return new SmartPhone("SANSUNG", "Gris", 11999.99f);
            case Dispositivo.TABLET_IOS:
                return new Tablet("IOS", 10, "Blanca");
            case Dispositivo.TABLET_ANDROID:
                return new Tablet("HUAWEI", 8,"verde");
            default:
                throw new AssertionError();
        } 
    }
}
