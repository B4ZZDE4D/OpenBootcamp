public class Estaciones {
    public static void main(String[] args) throws Exception {

        var Estacion = "Invierno";

        switch (Estacion) {
            case "Verano":
                System.out.println("Es hora de ir a por unos tragos!");
                break;
            case "Otoño":
                System.out.println("Mira como caen las hojas :D");
                break;
            case "Invierno":
                System.out.println("Ponte abrigo y vamos a tomar un cafe :D");
                break;
            case "Primavera":
                System.out.println("Las maripozas vuelan!");
                break;
            default:
                System.out.println("La entrada no existe :(");
        }
    }
}
