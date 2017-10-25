/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generic;

/**
 *
 * @author Santosh Goteti
 */
public class Generic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Example E = new Example<>();
        E.setA(123456.000);
        System.out.println(E.getA());
        
        
int[] pqr = new int[]{1,2,3};
        System.out.println(pqr.length);
try{
pqr[0]=10;
    System.out.println(pqr[0]);
pqr[5]=25;
    System.out.println(pqr[5]);
}
catch(Exception e){
    System.out.println("Array EXE");
}
finally{
    System.out.println(pqr[2]);

}
    }

}

class Example<T> {

    private T a;

    public T getA() {
        return a;
    }

    public void setA(T a) {
        this.a = a;
    }

}




class SRT{



}