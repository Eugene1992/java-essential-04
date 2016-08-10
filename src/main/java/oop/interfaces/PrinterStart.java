package oop.interfaces;

/**
 * Created by deyneko55 on 03.08.16.
 */
public class PrinterStart {


    void print(PrinterService ps){
        if (ps.isEnoughResorces()){
            System.out.println("print");
        }
    }
}
