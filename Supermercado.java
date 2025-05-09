import java.util.Scanner;

public class Supermercado {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String productoNombre = "";
        double productoPrecio = 0;
        boolean productoDisp = false;

        String productoNombre2 = "";
        double productoPrecio2 = 0;
        boolean productoDisp2 = false;

        String productoNom3 = "";
        double productoPre3 = 0;
        boolean productoDisp3 = false;

        while (true) {
            System.out.println("\n MENU DEL SUPERMERCADO ");
            System.out.println("1. Agregar producto");
            System.out.println("2. Listar productos");
            System.out.println("3. Vender producto");
            System.out.println("4. Salir");
            System.out.print("Elige una opcion: ");
            int opcion = input.nextInt();
            input.nextLine(); 

            switch (opcion) {
                case 1:
                    if (!productoDisp) {
                        System.out.print("Nombre del producto: ");
                        productoNombre = input.nextLine();
                        System.out.print("Precio del producto: ");
                        productoPrecio = input.nextDouble();
                        productoDisp = true;
                    } else if (!productoDisp2) {
                        System.out.print("Nombre del producto: ");
                     productoNombre2
             = input.nextLine();
                        System.out.print("Precio del producto: ");
                        productoPrecio2 = input.nextDouble();
                        productoDisp2 = true;
                    } else if (!productoDisp3) {
                        System.out.print("Nombre del producto: ");
                        productoNom3 = input.nextLine();
                        System.out.print("Precio del producto: ");
                        productoPre3 = input.nextDouble();
                        productoDisp3 = true;
                    } else {
                        System.out.println("Inventario lleno.");
                    }
                    break;

                case 2:
                    System.out.println("\n--- Productos disponibles ---");
                    if (productoDisp)
                        System.out.println("1. " + productoNombre + " - $" + productoPrecio);
                    if (productoDisp2)
                        System.out.println("2. " + productoNombre2
             + " - $" + productoPrecio2);
                    if (productoDisp3)
                        System.out.println("3. " + productoNom3 + " - $" + productoPre3);
                    if (!productoDisp && !productoDisp2 && !productoDisp3)
                        System.out.println("No hay productos");
                    break;

                case 3:
                    System.out.print("¿Que producto vendiste? (1,2,3): ");
                    int vendido = input.nextInt();
                    switch (vendido) {
                        case 1:
                            if (productoDisp) {
                                System.out.println("Producto vendido: " + productoNombre);
                                productoDisp = false;
                            } else {
                                System.out.println("No disponible");
                            }
                            break;
                        case 2:
                            if (productoDisp2) {
                                System.out.println("Producto vendido: " + productoNombre2);
                                productoDisp2 = false;
                            } else {
                                System.out.println("No disponible");
                            }
                            break;
                        case 3:
                            if (productoDisp3) {
                                System.out.println("Producto vendido: " + productoNom3);
                                productoDisp3 = false;
                            } else {
                                System.out.println("No disponible");
                            }
                            break;
                        default:
                            System.out.println("Opcion invalida.");
                    }
                    break;

                case 4:
                    System.out.println("Saliendo...");
                    input.close();
                    return;

                default:
                    System.out.println("Opcion inválida.");
            }
        }
    }
}
