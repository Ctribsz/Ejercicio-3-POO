import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;


public class Drive{
    public static void main(String[] args) {
        

        ArrayList<Carro> Carro  = new ArrayList<>();
        ArrayList<Servicio> Servicio = new ArrayList<>();

        Carro.add(new Carro("Toyota", "ABC123", "Camry", "2020", LocalDate.of(2023, 9, 8), "Juan"));
        Carro.add(new Carro("Honda", "XYZ789", "Civic", "2019", LocalDate.of(2023, 9, 10), "Carlos"));
        Carro.add(new Carro("Toyota", "DEF456", "Camry", "2018", LocalDate.of(2023, 9, 11), "Luis"));
        Carro.add(new Carro("Toyota", "GHI789", "Camry", "2019", LocalDate.of(2023, 9, 12), "Chris"));
        Carro.add(new Carro("Toyota", "JKL012", "Camry", "2020", LocalDate.of(2023, 9, 13), "Pedro"));

        Servicio.add(new Servicio("Motor", 1500));
        Servicio.add(new Servicio("Frenos", 500));
        Servicio.add(new Servicio("Chasis", 2500));
        Servicio.add(new Servicio("Motor", 1500));
        Servicio.add(new Servicio("Caja de cambios", 3000));
        Servicio.add(new Servicio("Motor", 1500));

        while(true){
            System.out.println("Hola usuario, con este programa podras llevar mejor el registro de tu taller");
            System.out.println("-------------------------------------------------------------------------");
            System.out.println("1. Registrar nuevo vehiculo.");
            System.out.println("2. Estadisticas del taller.");
            System.out.println("3. Salir.");
            Scanner sc = new Scanner(System.in);  
            System.out.println("Elige la accion que quieras realizar: ");
            int op = sc.nextInt();
            sc.nextLine();

            switch(op){
                case 1:
                    System.out.println("Ingrese los datos del vehiculo como se le indica a continucacion");
                    System.out.println("----------------------------------------------------------------");
                    System.out.println("Ingrese la marca del vehiculo: ");
                    String marca = sc.nextLine();
                    System.out.println("Ingrese la placa del vehiculo (en mayusculas): ");
                    String placa = sc.nextLine();
                    System.out.println("Ingrese la linea del vehiculo: ");
                    String linea = sc.nextLine();
                    System.out.println("Ingrese el modelo del vehiculo: ");
                    String modelo = sc.nextLine();
                    System.out.println("Ingrese la fecha de ingreso del vehiculo (Ejemplo 2023-07-14): ");
                    String fechaStr = sc.next();
                    LocalDate fecha = LocalDate.parse(fechaStr);
                    System.out.println("Ingrese el nombre del propietario del vehiculo: ");
                    String nombre = sc.nextLine();

                    Carro carro = new Carro(marca, placa, linea, modelo, fecha, nombre);
                    Carro.add(carro);
                    sc.nextLine();

                    System.out.println("Cantidad de servicios necesita el vehiculo: ");
                    int ca = sc.nextInt();
                    for (int i = 1; i <= ca; i++) {
                        System.out.println("Ahora ingrese los servicios o reparaciones del vehiculo: \n");
                        String tipo = sc.next();
                        System.out.println("Ingrese el monto a cobrar por el servicio: ");
                        int monto = sc.nextInt();

                        Servicio servicio = new Servicio(tipo, monto);
                        Servicio.add(servicio);
                        sc.nextLine();
                    }
                    break;
                
                case 2:
                    String[] marcas = new String[Carro.size()];

                    for (int i = 0; i < Carro.size(); i++) {
                        marcas[i] = Carro.get(i).getMarca();
                    }

                    String modeloMasRepetido = null;
                    int maxRepeticiones = 0;

                    for (int i = 0; i < marcas.length; i++) {
                        String modeloActual = marcas[i];
                        int repeticiones = 0;

                        for (int j = 0; j < marcas.length; j++) {
                            if (modeloActual.equals(marcas[j])) {
                                repeticiones++;
                            }
                        }

                        if (repeticiones > maxRepeticiones) {
                            modeloMasRepetido = modeloActual;
                            maxRepeticiones = repeticiones;
                        }
                    }

                    System.out.println("-------------------------------------------------");
                        System.out.println("La marca mas repetida es: " + modeloMasRepetido);
                        System.out.println("Número de repeticiones: " + maxRepeticiones);
                        System.out.println("-------------------------------------------------");

                    String[] serv = new String[Servicio.size()];

                    
                    for (int i = 0; i < Servicio.size(); i++) {
                        serv[i] = Servicio.get(i).getTipo();
                    }

                    String servicioMasRepetido = null;
                    int maxRepeticione = 0;

                    for (int i = 0; i < serv.length; i++) {
                        String servActual = serv[i];
                        int repeticiones2 = 0;

                        for (int j = 0; j < serv.length; j++) {
                            if (servActual.equals(serv[j])) {
                                repeticiones2++;
                            }
                        }

                        if (repeticiones2 > maxRepeticione) {
                            servicioMasRepetido = servActual;
                            maxRepeticione = repeticiones2;
                        }
                    }

                        
                        System.out.println("-------------------------------------------------");
                        System.out.println("El servicio más requerido es: " + servicioMasRepetido);
                        System.out.println("Número de repeticiones: " + maxRepeticione);
                        System.out.println("-------------------------------------------------");

                    break;

                case 3: 
                    System.exit(0);
                    break;
                    
                default: 
                    System.out.println("Ingresa una opcion valida por favor");
                    break;
            }
        }
    }
}