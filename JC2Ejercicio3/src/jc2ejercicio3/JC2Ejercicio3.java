package jc2ejercicio3;

import javax.swing.JOptionPane;

public class JC2Ejercicio3 {

    public static void main(String[] args) {
    int opcion2=0;
    int contador =0;
    
    String[] botones = {"Empleado por comision","Empleado con base","Salir"};    

    do{
        int opcion = JOptionPane.showOptionDialog(null,
                "Pulsa un boton: ",
                "Javadesde0.com",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE, null,
                botones, botones[0]);
        
        if(opcion == 0){System.out.println("Empleado por comision");
        opcion2 = 1;
        
        }
        else if (opcion == 1){System.out.println("Empleado con base");
        opcion2 = 2;
        }
        else if (opcion == 2){System.exit(0);}
        

        switch(opcion2){
            case 1:
            String n1 = JOptionPane.showInputDialog(null, "Escriba el nombre del empleado por Comision");
            String a1 = JOptionPane.showInputDialog(null, "Escriba el apellido del empleado por Comision");
            String nss = JOptionPane.showInputDialog(null, "Escriba el numero de seguro social");
            String ventasBrutas = JOptionPane.showInputDialog(null, "Escriba la venta bruta");
            int ventas2 = Integer.parseInt(ventasBrutas);
            String tarifaComision = JOptionPane.showInputDialog(null, "Escriba la tarifa de comision");
            double tarifa2 =  Double.parseDouble(tarifaComision);
            
            EmpleadoPorComision empleadoPorComision = new EmpleadoPorComision(n1,
            a1,nss,ventas2,tarifa2);
            
            JOptionPane.showMessageDialog(null, "Empleado por comision " + "\n"+"\n" + "Llamada a toString de EmpleadoPorComision con referencia de superclase  a un objeto de la superclase:"+ "\n" + empleadoPorComision.toString());
            break;
            
            case 2:
            String n2 = JOptionPane.showInputDialog(null, "Escriba el nombre del empleado base mas Comision");
            String a2 = JOptionPane.showInputDialog(null, "Escriba el apellido del empleado base mas Comision");
            String nss2 = JOptionPane.showInputDialog(null, "Escriba el numero de seguro social");
            String ventasBrutas2 = JOptionPane.showInputDialog(null, "Escriba la venta bruta");
            int ventas3 = Integer.parseInt(ventasBrutas2);
            String tarifaComision2 = JOptionPane.showInputDialog(null, "Escriba la tarifa de comision");
            double tarifa3 =  Double.parseDouble(tarifaComision2);
            String sueldoBase = JOptionPane.showInputDialog(null, "Escriba la venta bruta");
            int sueldoBase2 = Integer.parseInt(sueldoBase);
            
            EmpleadoBaseMasComision empleadoBaseMasComision = new EmpleadoBaseMasComision(n2,
            a2,nss2,ventas3,tarifa3,sueldoBase2);

            JOptionPane.showMessageDialog(null, "Empleado con base " + "\n"+"\n" + "Llamada a toString de EmpleadoBaseMasComision con referencia de subclase a un objeto de la subclase:"+ "\n" + empleadoBaseMasComision.toString());
            break;
            
        }    
    }while(contador!=3);
    
    //    EmpleadoPorComision empleadoPorComision2 = empleadoBaseMasComision;
      //  EmpleadoBaseMasComision empleadoPorComision3 = empleadoBaseMasComision;
 //       System.out.printf("%s %s:\n\n%s\n","Llamada a toString de EmpleadoBaseMasComision con referencia de superclase",
       // "a un objeto de la subclase", empleadoPorComision2.toString() );
   //     System.out.printf("%s %s:\n\n%s\n","\nLlamada a toString de EmpleadoBaseMasComision con referencia de subClase",
        //"a un mismo objeto", empleadoPorComision3.toString() );
    }
}