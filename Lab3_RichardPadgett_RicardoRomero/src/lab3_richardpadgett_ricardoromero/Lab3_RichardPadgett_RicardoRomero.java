package lab3_richardpadgett_ricardoromero;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Lab3_RichardPadgett_RicardoRomero {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Tiendas");
        System.out.println("1.Comprar");
        System.out.println("2.Administrar");
        metodomenu();
    }

    public static void metodomenu() {
        int posicion = 0;

        ArrayList<Personas> p = new ArrayList();

        ArrayList<Productos> pro = new ArrayList();

        ArrayList<Locales> l = new ArrayList();

        Clientes cliente = null;
        int cont = 0;

        int op1 = 0;
        int op2 = 0;
        int op3 = 0;
        while (op1 <= 3) {
            System.out.println("------Super Mercado------");
            System.out.println("1.Iniciar Sesion Clientes");
            System.out.println("2.Iniciar Sesion Empleado");
            System.out.println("3.Registrarse como cliente");
            System.out.println("4.Salir");
            op1 = sc.nextInt();
            //menu principal
            if (op1 == 1) {
                boolean es = false;
                do {
                    System.out.println("Ingrese su Usuario: ");
                    String usuario = sc.next();
                    System.out.println("Ingrese su Contraseña: ");
                    String contra = sc.next();

                    int r = 0;
                    for (Personas o : p) {
                        if (o instanceof Clientes) {
                            if (((Clientes) o).getUser().equals(usuario) && ((Clientes) o).getPassw().equals(contra)) {
                                posicion = r;
                                es = true;
                                //cliente = (Clientes) per;
                            }
                            System.out.println("prueba2");
                        }
                        r++;
                    }
                    if (es) {
                        System.out.println("°°°°°°BIENVENIDO°°°°°°");
                        String a = "";
                        for (Locales t : l) {
                            if (t instanceof Tiendas) {
                                a += l.indexOf(t) + "" + "-" + t + "\n";
                            }
                        }
                        System.out.println(a);

                        System.out.println("Ingrese la Posicion de la Tienda en que desea comprar: ");
                        int posio = sc.nextInt();
                        for (int i = 0; i < l.get(posio).getProd().size(); i++) {
                            System.out.println(l.get(posio).getProd().get(i).toString());

                        }
                        String b = "";
                        int conta = 0;
                        for (Productos po : pro) {
                            if (po instanceof Productos) {
                                b += conta + "" + "-" + po + "\n";
                                conta++;
                            }
                        }
                        System.out.println(b);
                        
                        System.out.println("Ingrese la posicion del producto que quiere comprar: ");
                        int compra = sc.nextInt();
                        if (cliente != null) {
                            cliente.getFactura().add(l.get(posio).getProd().get(compra));
                            cont++;
                            if (cont % 5 == 0) {
                                for (int i = 0; i < cliente.getFactura().size(); i++) {
                                    System.out.println(cliente.getFactura().get(i).toString());
                                }
                            }
                        }
                    } else {
                        System.out.println("Usuario o Contraseña Incorrecta");
                    }
                } while (es = false);

            } else if (op1 == 2) {
                System.out.println("Ingrese su nombre de usuaro");
                String us = sc.next();
                System.out.println("ingrese su contra su password");
                String pass = sc.next();
                if ("Socio13".equals(us) && "xlr8".equals(pass)) {

                    do {
                        //menu de socio
                        System.out.println("--Bienvenido--");
                        System.out.println("1.Crear locales");
                        System.out.println("2.Crear Empleados");
                        System.out.println("3.Crear Productos");
                        System.out.println("4.Modificar Locales");
                        System.out.println("5.Modificar Empleados");
                        System.out.println("6.Modificar Productos");
                        System.out.println("7.Eliminar Locales");
                        System.out.println("8.Eliminar Empleados");
                        System.out.println("9.Eliminar Productos");
                        System.out.println("10.listar locales");
                        op2 = sc.nextInt();
                        if (op2 == 4) {

                            System.out.println("Ingrese la posicion a modificar: ");
                            int i = sc.nextInt();
                            System.out.println("Ingrese nuevo nombre del local: ");
                            String nombre = sc.next();
                            System.out.println("Ingrese el nuevo piso del local: ");
                            int piso = sc.nextInt();

                            ((Locales) l.get(i)).setNombre(nombre);
                            ((Locales) l.get(i)).setPiso(piso);
                        } else if (op2 == 1) {

                            int local = 0;
                            System.out.println("Ingrese nombre del local: ");
                            String nombre = sc.next();
                            System.out.println("Ingrese el piso del local: ");
                            int piso = sc.nextInt();
                            System.out.println("Creacion locales de Comida, Tiendas y Quioscos");
                            System.out.println("1.Tiendas");
                            System.out.println("2.Quioscos");
                            System.out.println("3.Locales Comida");
                            local = sc.nextInt();
                            if (local == 1) {
                                System.out.println("Ingrese el tamaño de la Tienda: ");
                                int tamaño = sc.nextInt();
                                l.add(new Tiendas(tamaño, nombre, piso));
                            }

                            if (local == 2) {
                                System.out.println("Ingrese la posicion de la tienda que quiere un Quiosco: ");
                                int pos = sc.nextInt();
                                String nombre_Quiosco = l.get(pos).getNombre();
                                int precio;
                                for (int i = 0; i < l.size(); i++) {
                                    if (l.get(i) instanceof Quioscos) {
                                        for (int j = 0; j < pro.size(); j++) {
                                            precio = (l.get(i).getProd().get(j).getPrecio()) / 2;

                                        }
                                    }
                                }
                            }

                            if (local == 3) {
                                
                            }
                        } else if (op2 == 2) {
                            System.out.println("ingrese el nombre de usuario del Empleado");
                            String nom = sc.next();
                            System.out.println("ingrese la contrasena del empleado");
                            String contra = sc.next();
                            System.out.println("ingrese el correo del empleado");
                            String em = sc.next();
                            System.out.println("ingrese el nombre completo del usuario");
                            String nombrecom = sc.next();
                            System.out.println("ingrese la ID del empleado");
                            String id = sc.next();
                            System.out.println("ingrese la fecha de nacimiento del empleado");
                            String fechan = sc.next();
                            System.out.println("ingrese el horario de trabajo del empleado");
                            int horario = sc.nextInt();
                            p.add(new Empleados(horario, horario, us, pass, em, nombrecom, id, fechan));

                        } else if (op2 == 3) {
                            System.out.println("ingrese el precio del producto");
                            int precio = sc.nextInt();
                            System.out.println("ingrese una descripcion del producto");
                            String descrip = sc.next();
                            System.out.println("ingrese la marca del producto");
                            String marca = sc.next();
                            System.out.println("ingrese el descuento del producto");
                            int descu = sc.nextInt();
                            System.out.println("ingrese el tipo de producto que quiere crear");
                            System.out.println("1.Ropa");
                            System.out.println("2.Jueguetes");
                            System.out.println("3.comida");
                            op3 = sc.nextInt();
                            if (op3 == 1) {
                                System.out.println("ingrese la talla");
                                String talla = sc.next();
                                System.out.println("ingrese si es de hombre o mujer");
                                String sexp = sc.next();
                                pro.add(new Ropa(talla, precio, descrip, marca, descu));
                            } else if (op3 == 2) {

                                System.out.println("Escriba que tipo de juguete quiere crear");
                                System.out.println("1.Rompecabezas");
                                System.out.println("2.carro");
                                System.out.println("3.otro");
                                String juguete = sc.next();
                                pro.add(new Juguetes(juguete, precio, descrip, marca, descu));
                            } else if (op3 == 3) {
                                System.out.println("Ingrese la fecha de caducidad: ");
                                String fecha_caducidad = sc.next();
                                pro.add(new Comida(fecha_caducidad, precio, descrip, marca, descu));
                            }

                        } else if (op2 == 5) {
                            System.out.println("Ingrese la Posicion a Modificar: ");
                            int i = sc.nextInt();
                            System.out.println("ingrese el nuevo nombre de usuario del Empleado");
                            String nom = sc.next();
                            System.out.println("ingrese la nueva contrasena del empleado");
                            String contra = sc.next();
                            System.out.println("ingrese el nuevo correo del empleado");
                            String em = sc.next();
                            System.out.println("ingrese el nuevo nombre completo del usuario");
                            String nombrecom = sc.next();
                            System.out.println("ingrese la nueva ID del empleado");
                            String id = sc.next();
                            System.out.println("ingrese la nueva fecha de nacimiento del empleado");
                            String fechan = sc.next();
                            System.out.println("ingrese el nuevo horario de trabajo del empleado");
                            int horario = sc.nextInt();

                            ((Empleados) p.get(i)).setUser(nom);
                            ((Empleados) p.get(i)).setPassw(contra);
                            ((Empleados) p.get(i)).setEmail(em);
                            ((Empleados) p.get(i)).setNombrec(nombrecom);
                            ((Empleados) p.get(i)).setId(id);
                            ((Empleados) p.get(i)).setFechan(fechan);
                            ((Empleados) p.get(i)).setHorariot(horario);

                        } else if (op2 == 6) {
                            System.out.println("Ingresar posicion a Modificar: ");
                            int i = sc.nextInt();
                            System.out.println("ingrese el nuevo precio del producto");
                            int precio = sc.nextInt();
                            System.out.println("ingrese una nueva descripcion del producto");
                            String descrip = sc.next();
                            System.out.println("ingrese la nueva marca del producto");
                            String marca = sc.next();
                            System.out.println("ingrese el nuevo descuento del producto");
                            int descu = sc.nextInt();

                            ((Productos) pro.get(i)).setPrecio(precio);
                            ((Productos) pro.get(i)).setDescripcion(descrip);
                            ((Productos) pro.get(i)).setMarca(marca);
                            ((Productos) pro.get(i)).setDescuento(descu);

                        } else if (op2 == 7) {
                            System.out.println("Ingrese la Posicion a eliminar: ");
                            int pos = sc.nextInt();
                            l.remove(pos);
                        } else if (op2 == 8) {
                            System.out.println("Ingrese la Posicion a eliminar: ");
                            int pos = sc.nextInt();
                            if (p.get(pos) instanceof Empleados) {
                                p.remove(pos);
                            }
                        } else if (op2 == 9) {
                            System.out.println("Ingrese la Posicion a eliminar: ");
                            int pos = sc.nextInt();
                            pro.remove(pos);
                        } else if (op2 == 10) {
                            String pos = "";
                            for (Object lo : l) {
                                if (lo instanceof Locales) {
                                    pos += lo.toString() + "\n";

                                }
                                JOptionPane.showMessageDialog(null, pos);

                            }
                        }
                    } while (op2 < 10);
                }

                //fin del menu de socio
            } else if (op1 == 3) {
                System.out.println("ingrese el nombre de usuario de Cliente");
                String nom = sc.next();
                System.out.println("ingrese la contrasena de Cliente");
                String contra = sc.next();
                System.out.println("ingrese el correo de Cliente");
                String em = sc.next();
                System.out.println("ingrese el nombre completo del usuario");
                String nombrecom = sc.next();
                System.out.println("ingrese la ID del Cliente");
                String id = sc.next();
                System.out.println("ingrese la fecha de nacimiento del Cliente");
                String fechan = sc.next();
                System.out.println("Ingrese la cantidad de Dinero: ");
                int dinero = sc.nextInt();
                p.add(new Clientes(null, dinero, nom, contra, em, nombrecom, id, fechan));
            }
        }
    }
}
