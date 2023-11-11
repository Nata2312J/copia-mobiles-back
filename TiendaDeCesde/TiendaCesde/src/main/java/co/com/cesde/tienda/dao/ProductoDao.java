package co.com.cesde.tienda.dao;

import co.com.cesde.tienda.conexion.Conexion;
import co.com.cesde.tienda.modelo.ProductoModelo;
import co.com.cesde.tienda.service.ProductoService;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductoDao {
    //SE CONECTA A LA BASE DE DATOS

    public static void crearProductoDB(ProductoModelo pm) {
        Conexion conexion = new Conexion();
        try (Connection connect = conexion.getConnectionDB()) {
            PreparedStatement ps = null;

            try {
                String query = "INSERT INTO productos(nombre_producto,cantidad,precio)VALUES (?,?,?)";//?->Significa que le voy a mandar un parametro
                ps = connect.prepareStatement(query);
                ps.setString(1, pm.getNombreProducto());
                ps.setDouble(2, pm.getCantidad());
                ps.setDouble(3, pm.getPrecio());
                ps.executeUpdate(); //Ejecutar una catualizacion a la base de datos
                System.out.println("Se registró el producto correctamente");

            } catch (SQLException e) {//Try sin recursos
                System.out.println(e);
            }

        } catch (SQLException e) {
            System.out.println(e);
        }


    }


    public static void consultarProductoDB() {
        PreparedStatement ps = null;
        ResultSet rs = null; //Trae datos de base de datos
        Conexion conexion = new Conexion();
        try (Connection connect = conexion.getConnectionDB()) {
            String query = "SELECT * FROM productos";
            ps = connect.prepareStatement(query);
            rs = ps.executeQuery();//Solo para las consultas
            while (rs.next()) {
                System.out.println("Id del producto: " + rs.getInt("id_producto"));
                System.out.println("Nombre del producto: " + rs.getString("nombre_producto"));
                System.out.println("Cantidad del producto: " + rs.getDouble("cantidad"));
                System.out.println("Precio del producto: " + rs.getDouble("precio"));

            }


        } catch (SQLException e) {
            System.out.println(e);
            System.out.println("No fue posible recuperar los registros");
        }
    }

    public static void eliminarProductoDB(int idProducto) {
        Conexion conexion = new Conexion();
        try (Connection connect = conexion.getConnectionDB()) {
          PreparedStatement ps=null;
               try{
                        String query="DELETE FROM productos WHERE productos.id_producto=?";
                        ps=connect.prepareStatement(query);
                        ps.setInt(1,idProducto);
                        ps.executeUpdate();
                   System.out.println("Registro eliminado...");

               }   catch (SQLException e) {
                   System.out.println(e);
               }


        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static void actualizarProductoBD(ProductoModelo pm) {
        Conexion conexion = new Conexion();
        try (Connection connect = conexion.getConnectionDB()) {
             PreparedStatement ps=null;
             try{
                int opc=pm.getOpc();
                if(opc==1){
                    String query= "UPDATE productos SET nombre_producto= ? WHERE id_producto=?";
                    ps=connect.prepareStatement(query);
                    ps.setString(1,pm.getNombreProducto());
                    ps.setInt(2, pm.getIdProducto());
                    ps.executeUpdate();
                    opc=pm.getOpc();
                    System.out.println("Actualizacion realizada...");
                }else if(opc==2) {
                      String query= "UPDATE productos SET cantidad= ? WHERE id_producto=?";
                       ps=connect.prepareStatement(query);
                       ps.setDouble(1,pm.getCantidad());
                       ps.setInt(2, pm.getIdProducto());
                       ps.executeUpdate();
                       opc=pm.getOpc();
                    System.out.println("Actualizacion realizada...");
                }else if(opc==3){
                    String query="UPDATE productos SET precio=? WHERE id_producto=? ";
                    ps=connect.prepareStatement(query);
                    ps.setDouble(1,pm.getPrecio());
                    ps.setInt(2,pm.getIdProducto());
                    ps.executeUpdate();
                    opc=pm.getOpc();
                    System.out.println("Actualizacion realizada...");
                }

             }  catch (SQLException e) {
                 System.out.println(e);
             }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

}

