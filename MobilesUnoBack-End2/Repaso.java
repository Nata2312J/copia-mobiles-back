import java.util.ArrayList;
import java.util.Scanner;

public class Repaso {


        static Scanner sc= new Scanner(System.in);
        static ArrayList<ArrayList<String>> productos =new ArrayList<>();
        static ArrayList<String> producto = new ArrayList<>();

        //variables globales
        static int id;
        static String nombreProducto;
        static String presentacion;
        static double costo;
        static double precioDeVenta;
        static double margen;
        static double cantidad;
        static double valorInventario;

        public static void main(String[] args) {

            // menuApp();


            }

        public static void registrarProducto(){
            try {
                System.out.println("ingrese el id del producto");
                id = sc.nextInt();
                String idString = id+ ""; //parseo de int A String
                producto.add(idString);
                sc.skip("\n");
                System.out.println("ingrese el nombre del producto");
                nombreProducto = sc.nextLine();
                producto.add(nombreProducto);
                System.out.println("ingrese la presentacion del producto");
                presentacion = sc.nextLine();
                producto.add(presentacion);
                System.out.println("ingrese el costo del producto");
                costo = sc.nextDouble();
                String costoString = costo + "";
                producto.add(costoString);
                System.out.println("ingrese la cantidad del producto");
                cantidad= sc.nextDouble();
                String canString = cantidad + "";
                producto.add(canString);
                System.out.println("ingrese el margen de venta");
                margen = sc.nextDouble();
                String margenStr = margen + "";
                producto.add(margenStr);
                precioDeVenta =calcularPrecioVentas();
                valorInventario = calcularValorInventario();

                productos.add(producto);

            }catch (Exception e){
                System.out.println(e);
                System.out.println("debe ingresar decimales con , ");
                registrarProducto();
            }

        }

        public static void recorrerListaDeListas(){
            for (ArrayList<String> producto :productos){
                System.out.println(producto);

            }

        }
        public static void recorrer(){
            for ( int i = 0 ; i < producto.size(); i++){
                System.out.println(producto.get(i));}
            }

        public static double calcularPrecioVentas() {
            precioDeVenta = Math.round(costo /(1-margen));
            return precioDeVenta;
        }
        public static double calcularValorInventario(){
            valorInventario = cantidad*costo ;
            return valorInventario;
        }
        public static void imprimirProducto(){
            System.out.println("id: " + id + "\n" +
                    "Producto: " + nombreProducto + "\n" +
                    "presentacion: " + presentacion + "\n" +
                    "Costo: " + costo + "\n" +
                    "Margen: " + margen + "\n" +
                    "Precio de ventas: " + precioDeVenta + "\n" +
                    "Valor Intervalo: " + valorInventario + "\n" );
        }
        public static void menuApp(){
            System.out.println("inicializar aplicacion oprima 1");
            int isOn = sc.nextInt();
            while(isOn != 0){
                System.out.println("bienvenido al gestor de ventas XY20000");
                System.out.println("seleccione: 1 registrar producto \n" +
                        "2 listar producto \n" +
                        "3 registrar venta \n" +
                        "4 imprimir factura \n" +
                        "5 ver caja \n" +
                        "6 salir");
                int opc = sc.nextInt();
                switch (opc){
                    case 1:
                        System.out.println("registrar producto");
                        registrarProducto();
                        break;
                    case 2:
                        System.out.println("listar producto");
                        imprimirProducto();
                        break;
                    case 3:
                        System.out.println("registrar venta");
                        break;
                    case 4:
                        System.out.println("imprimir factura");
                        break;
                    case 5:
                        System.out.println("ver caja");
                        break;
                    case 6:
                        System.out.println("salir");
                        isOn = 0;
                        break;
                    default:
                        System.out.println("ingrese una opcion valida");
                }
            }
        }
    }
