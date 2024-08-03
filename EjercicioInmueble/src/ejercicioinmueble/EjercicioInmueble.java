package ejercicioinmueble;

public class EjercicioInmueble {
    public static void main(String[] args) {
        System.out.println("******************** Inmueble *********************");
        Propiedad propiedad1 = new Propiedad();
        propiedad1.setIdPropiedad(1);
        propiedad1.setMetrosCuadrados(500);
        propiedad1.setUbicacion("Zona 2 Guatemala");
        propiedad1.setPrecio(1000000);
        propiedad1.mostrarInfo();
        System.out.println("");

        System.out.println("******************** Vivienda *********************");
        Residencia residencia1 = new Residencia(5, 2);
        residencia1.setIdPropiedad(2);
        residencia1.setMetrosCuadrados(980);
        residencia1.setUbicacion("Zona 2 Villa Nueva");
        residencia1.setPrecio(1500000);
        residencia1.mostrarInfo();
        System.out.println("");

        System.out.println("******************** Casa *********************");
        Casa vivienda1 = new Casa(2, 5, 2);
        vivienda1.setIdPropiedad(3);
        vivienda1.setMetrosCuadrados(200);
        vivienda1.setPrecio(200000);
        vivienda1.mostrarInfo();
        System.out.println("");

        System.out.println("******************** Rural *********************");
        Rustica viviendaRustica = new Rustica(3, 2, 5, 20, 50);
        viviendaRustica.setUbicacion("San Marcos.");
        viviendaRustica.setMetrosCuadrados(200);
        viviendaRustica.setIdPropiedad(4);
        viviendaRustica.setPrecio(2000000);
        viviendaRustica.mostrarInfo();
        System.out.println("");

        System.out.println("******************** Urabana *********************"); 
        Urbana viviendaUrbana = new Urbana(2, 6, 3);
        viviendaUrbana.setPrecio(1800000);
        viviendaUrbana.setMetrosCuadrados(900);
        viviendaUrbana.setIdPropiedad(4);
        viviendaUrbana.setUbicacion("Zona 14, Guatemala");
        viviendaUrbana.mostrarInfo();
        System.out.println("");

        System.out.println("******************** Cerrado *********************");
        Cerrada viviendaCerrada = new Cerrada(4, 5, 6, 18000, true, "");
        viviendaCerrada.setPrecio(250000);
        viviendaCerrada.setIdPropiedad(6);
        viviendaCerrada.setUbicacion("San Jose, Villa Nueva");
        viviendaCerrada.mostrarInfo();
        System.out.println("");

        System.out.println("******************** Independiente *********************");
        Independiente viviendaIndependiente = new Independiente(5, 2, 3);
        viviendaIndependiente.setIdPropiedad(107);
        viviendaIndependiente.setMetrosCuadrados(850);
        viviendaIndependiente.setUbicacion("Barcena");
        viviendaIndependiente.setPrecio(55500);
        viviendaIndependiente.mostrarInfo();
        System.out.println("");

        System.out.println("******************** Apartamento *********************");
        Apartamento apartamento1 = new Apartamento(115800, 2, 7);
        apartamento1.setIdPropiedad(12);
        apartamento1.setMetrosCuadrados(120);
        apartamento1.setUbicacion("Zona 12, Guatemala");
        apartamento1.setPrecio(180000);
        apartamento1.mostrarInfo();
        System.out.println("");

        System.out.println("******************** Estudio *********************");
        Estudio estudio1 = new Estudio(50000, 6, 8);
        estudio1.setIdPropiedad(4);
        estudio1.setMetrosCuadrados(270);
        estudio1.setPrecio(200000);
        estudio1.setUbicacion("Antigua Guatemala");
        estudio1.mostrarInfo();
        System.out.println("");

        System.out.println("******************** Familiar *********************");
        Familiar viviendaFamiliar = new Familiar(250000, 5, 8);
        viviendaFamiliar.setIdPropiedad(150);
        viviendaFamiliar.setMetrosCuadrados(210);
        viviendaFamiliar.setPrecio(450000);
        viviendaFamiliar.setUbicacion("Calle principal de Monterrico");
        viviendaFamiliar.mostrarInfo();
        System.out.println("");

        System.out.println("******************** Local *********************");
        Local local1 = new Local("Salon Premier");
        local1.setIdPropiedad(020);
        local1.setMetrosCuadrados(410);
        local1.setPrecio(350000);
        local1.setUbicacion("San Jose");
        local1.mostrarInfo();
        System.out.println("");

        System.out.println("******************** Comercial *********************");
        Comercial localComercial = new Comercial("Majadas", "Guatemala");
        localComercial.setIdPropiedad(1007);
        localComercial.setMetrosCuadrados(2000);
        localComercial.setPrecio(7000000);
        localComercial.setUbicacion("Anillo Periferico");
        localComercial.mostrarInfo();
        System.out.println("");

        System.out.println("******************** Oficina *********************");
        Oficina oficina1 = new Oficina(false, "San Miguel Petapa");
        oficina1.setIdPropiedad(666);
        oficina1.setMetrosCuadrados(375);
        oficina1.setPrecio(475000);
        oficina1.setUbicacion("Petapa");
        oficina1.mostrarInfo();
        System.out.println("");
    }
}

// ---------------------------- Inmueble --------------------------
class Propiedad {
    private int idPropiedad;
    private int metrosCuadrados;
    private String ubicacion;
    private double precio;

    public Propiedad() {}

    public Propiedad(int id, int area, String direccion, double valor) {
        this.idPropiedad = id;
        this.metrosCuadrados = area;
        this.ubicacion = direccion;
        this.precio = valor;
    }

    public int getIdPropiedad() {
        return this.idPropiedad;
    }

    public void setIdPropiedad(int id) {
        this.idPropiedad = id;
    }

    public int getMetrosCuadrados() {
        return this.metrosCuadrados;
    }

    public void setMetrosCuadrados(int area) {
        this.metrosCuadrados = area;
    }

    public String getUbicacion() {
        return this.ubicacion;
    }

    public void setUbicacion(String direccion) {
        this.ubicacion = direccion;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(double valor) {
        this.precio = valor;
    }

    public void mostrarInfo() {
        System.out.println("Propiedad ID: " + this.idPropiedad);
        System.out.println("Area: " + this.metrosCuadrados + " m^2");
        System.out.println("Ubicacion: " + this.ubicacion);
        System.out.println("Precio: Q" + this.precio);
    }
}

// -------------------------- Vivienda -----------------------------------
class Residencia extends Propiedad {
    private int habitaciones;
    private int banos;

    public Residencia(int habitaciones, int banos) {
        super();
        this.habitaciones = habitaciones;
        this.banos = banos;
    }

    public Residencia(int id, int area, String direccion, double valor, int habitaciones, int banos) {
        super(id, area, direccion, valor);
        this.habitaciones = habitaciones;
        this.banos = banos;
    }

    public int getHabitaciones() {
        return this.habitaciones;
    }

    public void setHabitaciones(int habitaciones) {
        this.habitaciones = habitaciones;
    }

    public int getBanos() {
        return this.banos;
    }

    public void setBanos(int banos) {
        this.banos = banos;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("No. de habitaciones: " + this.habitaciones);
        System.out.println("No. de banios: " + this.banos);
    }
}

// ------------------------------- Casa --------------------------------------
class Casa extends Residencia {
    private int pisos;

    public Casa(int pisos, int habitaciones, int banos) {
        super(habitaciones, banos);
        this.pisos = pisos;
    }

    public int getPisos() {
        return this.pisos;
    }

    public void setPisos(int pisos) {
        this.pisos = pisos;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("No. de pisos: " + this.pisos);
    }
}

// ----------------------------------- Rural ------------------------------------
class Rustica extends Casa {
    private int distanciaCabecera;
    private int altitud;

    public Rustica(int pisos, int habitaciones, int banos, int distancia, int altitud) {
        super(pisos, habitaciones, banos);
        this.distanciaCabecera = distancia;
        this.altitud = altitud;
    }

    public int getDistanciaCabecera() {
        return this.distanciaCabecera;
    }

    public void setDistanciaCabecera(int distancia) {
        this.distanciaCabecera = distancia;
    }

    public int getAltitud() {
        return this.altitud;
    }

    public void setAltitud(int altitud) {
        this.altitud = altitud;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Distancia a la cabecera: " + this.distanciaCabecera + " km");
        System.out.println("Altitud: " + this.altitud + " msnm");
    }
}

// -------------------------------------- Urabana -----------------------------------------
class Urbana extends Casa {
    public Urbana(int pisos, int habitaciones, int banos) {
        super(pisos, habitaciones, banos);
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
    }
}

// ------------------------------------ Cerrado --------------------------------------------
class Cerrada extends Urbana {
    private boolean vigilancia;
    private String extras;

    public Cerrada(int pisos, int habitaciones, int banos, double valor, boolean vigilancia, String extras) {
        super(pisos, habitaciones, banos);
        this.vigilancia = vigilancia;
        this.extras = extras;
    }

    public boolean tieneVigilancia() {
        return this.vigilancia;
    }

    public void setVigilancia(boolean vigilancia) {
        this.vigilancia = vigilancia;
    }

    public String getExtras() {
        return this.extras;
    }

    public void setExtras(String extras) {
        this.extras = extras;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Vigilancia: " + (this.vigilancia ? "Sí" : "No"));
        System.out.println(" " + this.extras);
    }
}

// ---------------------------- Independiente ---------------------------------
class Independiente extends Urbana {
    public Independiente(int pisos, int habitaciones, int banos) {
        super(pisos, habitaciones, banos);
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
    }
}

// --------------------------------------- Apartamento ------------------------------------
class Apartamento extends Residencia {
    public Apartamento(int id, int area, String direccion, double valor, int habitaciones, int banos) {
        super(id, area, direccion, valor, habitaciones, banos);
    }

    public Apartamento(double valor, int habitaciones, int banos) {
        super(habitaciones, banos);
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
    }
}

// -------------------------------------------- Estidio -----------------------------------------
class Estudio extends Apartamento {
    public Estudio(int id, int area, String direccion, double valor, int habitaciones, int banos) {
        super(id, area, direccion, valor, habitaciones, banos);
    }

    public Estudio(double valor, int habitaciones, int banos) {
        super(valor, habitaciones, banos);
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
    }
}

// -------------------------------------- Familiar -----------------------------------
class Familiar extends Apartamento {
    public Familiar(int id, int area, String direccion, double valor, int habitaciones, int banos) {
        super(id, area, direccion, valor, habitaciones, banos);
    }

    public Familiar(double valor, int habitaciones, int banos) {
        super(valor, habitaciones, banos);
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
    }
}

// ---------------------------------------- Local ---------------------------------------
class Local extends Propiedad {
    private String localizacion;

    public Local(String localizacion) {
        this.localizacion = localizacion;
    }

    public Local(int id, int area, String direccion, double valor, String localizacion) {
        super(id, area, direccion, valor);
        this.localizacion = localizacion;
    }

    public String getLocalizacion() {
        return this.localizacion;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Localizacion: " + this.localizacion);
    }
}

// --------------------------------------- Comercial -------------------------------
class Comercial extends Local {
    private String nombreCentroComercial;

    public Comercial(String centroComercial, String localizacion) {
        super(localizacion);
        this.nombreCentroComercial = centroComercial;
    }

    public String getNombreCentroComercial() {
        return this.nombreCentroComercial;
    }

    public void setNombreCentroComercial(String centroComercial) {
        this.nombreCentroComercial = centroComercial;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Centro Comercial: " + this.nombreCentroComercial);
    }
}

// ------------------------------- Oficina ------------------------------------
class Oficina extends Local {
    private boolean esGobierno;

    public Oficina(boolean esGobierno, String localizacion) {
        super(localizacion);
        this.esGobierno = esGobierno;
    }

    public boolean esGobierno() {
        return this.esGobierno;
    }

    public void setEsGobierno(boolean esGobierno) {
        this.esGobierno = esGobierno;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Es del gobierno: " + (this.esGobierno ? "Si" : "No"));
    }
}
