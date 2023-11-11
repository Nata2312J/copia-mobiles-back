package co.com.cesde.tienda.service;

import co.com.cesde.tienda.dao.ProductoDao;
import co.com.cesde.tienda.modelo.ProductoModelo;

import java.util.Scanner;

public class ProductoService {

    //METODOS ESTATICOS PARA MEJOR ALCANCE
    Scanner sc=new Scanner(System.in);

    public void crearProducto(ProductoModelo pm){
        System.out.println("Ingrese el nonbre del producto: ");
        String nombreProducto=sc.nextLine();

        System.out.println("Ingrese la cantidad del producto: ");
        double cantidad= sc.nextDouble();

        System.out.println("Ingrese el precio del producto: ");
        double precio=sc.nextDouble();


        pm.setNombreProducto(nombreProducto);
        pm.setCantidad(cantidad);
        pm.setPrecio(precio);

        ProductoDao.crearProductoDB(pm);
    }

    public void consultarProducto(){
        ProductoDao.consultarProductoDB();
    }
    public void eliminarProducto(){
        System.out.println("Ingrese el id del producto a eliminar: ");
        int idProducto=sc.nextInt();
        ProductoDao.eliminarProductoDB(idProducto);
    }
    public void actualizarProducto(ProductoModelo pm){
        System.out.println("Actualizar: \n1.Nombre \n2.Cantidad \n3.Precio");
       int opc=sc.nextInt();
       sc.skip("\n");
       if(opc==1){
           System.out.println("Ingrese el nuevo nombre del producto: ");
           String nuevoNombre=sc.nextLine();
           System.out.println("Indique el id del producto a actualizar: ");
           int idProducto=sc.nextInt();
           pm.setNombreProducto(nuevoNombre);
           pm.setOpc(opc);
           pm.setIdProducto(idProducto);
           ProductoDao.actualizarProductoBD(pm);
       }else if(opc==2){
           System.out.println("Ingrese la nueva cantidad  del producto: ");
           double nuevaCantidad=sc.nextDouble();
           System.out.println("Indique el id del producto a actualizar: ");
           int idProducto=sc.nextInt();
           pm.setCantidad(nuevaCantidad);
           pm.setOpc(opc);
           pm.setIdProducto(idProducto);
           ProductoDao.actualizarProductoBD(pm);
       }else if(opc==3){
           System.out.println("Ingrese el nuevo precio del producto: ");
          double nuevoPrecio=sc.nextDouble();
           System.out.println("Indique el id del producto a actualizar: ");
           int idProducto=sc.nextInt();
           pm.setPrecio(nuevoPrecio);
           pm.setOpc(opc);
           pm.setIdProducto(idProducto);
           ProductoDao.actualizarProductoBD(pm);

       }else {
           System.out.println("Ingrese un numero valido");
       }


    }




}
