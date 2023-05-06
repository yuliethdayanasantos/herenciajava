import java.util.Scanner;

import Interlemd.Moto;

public class App {
    public static void main(String[] args) throws Exception {
       
        Moto moto=new Moto();
        moto.setColor("NEGRA");
        moto.setCombustible("125");
        moto.setMarca("HONDA");
        moto.setNumeroderuedas(2);

        System.out.println("moto de marca"+moto.getMarca()+"color "+moto.getColor()+"combustible "+moto.getCombustible()
        );
        Moto moto2=new Moto();
        Scanner dato=new Scanner(System.in);
        System.out.println("ingrese el color de su moto");
        moto2.setColor(dato.nextLine());
        System.out.println(moto2.getColor());
        
        moto.rodar();
        Yate yate=new Yate();
    }
}
