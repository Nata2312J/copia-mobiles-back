package explicacionPadres;

public class test {
    public static void main(String[] args) {
        Padre padre=new Padre();
        padre.setnombre("Pablo");
        padre.setId(103040);
        padre.setApellido("Garcia");
        padre.setOcupacion("Mesero");
        System.out.println(padre.getnombre() + padre.getId() + padre.getApellido() + padre.getOcupacion());

        Padre padreDos=new Padre();
        padreDos.setnombre("Kevin");
        padreDos.setApellido("Jimenez");
        padreDos.setId(10304430);
        padreDos.setOcupacion("Programador");
        System.out.println(padreDos.getnombre() + padreDos.getId() + padreDos.getApellido() + padreDos.getOcupacion());

        Padre madre=new Padre();
        madre.setnombre("Natalia");
        madre.setApellido("garcia");
        madre.setId(103023440);
        madre.setOcupacion("Maestro");
        System.out.println(madre.getnombre() + padre.getId() + padre.getApellido() + padre.getOcupacion());

        Padre papaNoel=new Padre();
        papaNoel.crearPadre();
        papaNoel.verPadre();

    }
}
