import java.util.ArrayList;
import java.util.List;
public class Zoo {
    List<Animal> animals;
    private String name;
    private String city;
    final private int nbrCages = 25;


    public Zoo(String name, String city) {
        this.name = name;
        this.city = city;
        this.animals = new  ArrayList<Animal>();
    }

    @Override
    public String toString() {
        return "Zoo{" +
                "name=" + name + "\n" +
                ", city=" + city + "\n" +
                ", nbrCages=" + nbrCages +
                '}';
    }

    void displayZoo() {
        System.out.println("Nom du zoo : " + name);
        System.out.println("Ville du zoo : " + city);
        System.out.println("Nombre de cages : " + nbrCages);
    }

    int searchAnimal(Animal animalToSearch) {
        for (Animal animal : animals)
        {
            if (animal.name.equals(animalToSearch.name)){
                return  animals.indexOf(animalToSearch) ;
             }
        }
       return  -1;
    }

     boolean addAnimal(Animal animal) {
        if (animals.size() < nbrCages && !animals.contains(animal) ) {
            animals.add(animal);
            return true;
        }
        return false;
    }



    void displayAnimals() {
        System.out.println("Animaux dans le zoo:");
        for (Animal animal : animals)
        {
            System.out.println(animal);
        }
    }

     boolean removeAnimal(Animal animalToRemove) {
        return  animals.remove(animalToRemove);
    }


    boolean isZooFull() {
        return animals.size() == nbrCages;
    }


    Zoo comparerZoo(Zoo myZoo, Zoo secondZoo) {
        return myZoo.animals.size() < secondZoo.animals.size() ? secondZoo:myZoo;
    }
}
