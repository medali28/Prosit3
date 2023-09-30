import java.util.Scanner;

public class ZooManagement {
    public static void main(String[] args) {
/*
        Instruction 5 :
        Animal lion = new Animal("Félin", "lion", 3, true);
        Zoo myZoo = new Zoo("Mon Zoo", "Ma Ville", 25);
*/




/*      Instruction 6 :
        On remarque qu'il faut additionner les valeurs des objets car nous avons créé un constructeur
*/




//        Instruction 7 :
        Animal lion = new Animal("Félin", "lion", 3, true);
        Animal elephant = new Animal("Éléphant", "elephant", 5, true);




//        Instruction 8 :

        Zoo myZoo = new Zoo("Mon Zoo", "Ma Ville");
        myZoo.displayZoo();
        System.out.println(myZoo);
        System.out.println(myZoo.toString());
        /*
        output de instruction  myZoo.displayZoo();
        Nom du zoo : Mon Zoo
        Ville du zoo : Ma Ville
        Nombre de cages : 2

        output de instruction System.out.println(myZoo); et System.out.println(myZoo.toString());
        Zoo@5f184fc6
        Zoo@5f184fc6
        */
        /*
        Lorsque vous utilisez System.out.println(myZoo); et System.out.println(myZoo.toString());
        et que la classe Zoo n'a pas redéfini la méthode toString()
        donc ils afficher adresse mémoire
        */

//        Instruction 9 :
//        pour corriger cette erreur on doit ajouter methode toString()


//        Instruction 10 :
        // on propos number de cages est 2
        Animal tigre = new Animal("Félin", "Tigre", 8, true);
        boolean animal1 = myZoo.addAnimal(lion);
        boolean animal2 = myZoo.addAnimal(tigre);
        boolean animal3 = myZoo.addAnimal(elephant);
        if (animal1) {
            System.out.println("L'animal 1 a été ajouté au zoo avec succès !");
        } else {
            System.out.println("L'animal 1 n'a pas pu être ajouté au zoo.");
        }
        if (animal2) {
            System.out.println("L'animal 2 a été ajouté au zoo avec succès !");
        } else {
            System.out.println("L'animal 2 n'a pas pu être ajouté au zoo.");
        }
        if (animal3) {
            System.out.println("L'animal 3 a été ajouté au zoo avec succès !");
        } else {
            System.out.println("L'animal 3 n'a pas pu être ajouté au zoo.");
        }
        /*
        output:
        L'animal 1 a été ajouté au zoo avec succès !
        L'animal 2 a été ajouté au zoo avec succès !
        L'animal 3 n'a pas pu être ajouté au zoo.


        On note le nombre maximum d'animaux peuvent être ajoutés inferieur la valeur de nbrcages
         dans ce cas nombre de cages est 2 on peut ajouter 2 animaux .

         */


//      Instruction 11 :
        System.out.println("------------------------ Instruction 11 -------------------------");
        myZoo.displayAnimals();
        /*
        output :
        Animal 1:
        Animal{family='Félin', name='lion', age=3, isMammal=true}
        Animal 2:
        Animal{family='Félin', name='Tigre', age=8, isMammal=true}
         */
        Animal animalRecherche1 = new Animal("Félin", "lion", 3, true);
        int index1 = myZoo.searchAnimal(animalRecherche1);
        if (index1 != -1) {
            System.out.println("L'animal " + animalRecherche1.name + " a été trouvé à l'indice: "+index1);
        } else {
            System.out.println("L'animal " + animalRecherche1.name + " n'a pas été trouvé dans le zoo.");
        }
        Animal animalRecherche2 = new Animal("Félin", "cat", 5, true);
        int index2 = myZoo.searchAnimal(animalRecherche2);
        if (index2 != -1) {
            System.out.println("L'animal " + animalRecherche2.name + " a été trouvé à l'indice: "+index2);
        } else {
            System.out.println("L'animal " + animalRecherche2.name + " n'a pas été trouvé dans le zoo.");
        }
        /*
        output:
        L'animal lion a été trouvé à l'indice: 0
        L'animal cat n'a pas été trouvé dans le zoo.
         */


        //  Créez un autre animal identique au premier
        Animal lion2 = new Animal("Félin", "lion", 3, true);
        boolean animal4 = myZoo.addAnimal(lion2);
        if (animal4) {
            System.out.println("L'animal 4 a été ajouté au zoo avec succès !");
        } else {
            System.out.println("L'animal 4 n'a pas pu être ajouté au zoo.");
        }
        Animal animalRecherche3 = new Animal("Félin", "lion", 3, true);
        int index3 = myZoo.searchAnimal(animalRecherche3);
        if (index3 != -1) {
            System.out.println("L'animal " + animalRecherche1.name + " a été trouvé à l'indice:"+index3);
        } else {
            System.out.println("L'animal " + animalRecherche1.name + " n'a pas été trouvé dans le zoo.");
        }
        myZoo.displayAnimals();
        /*
        output:
        L'animal lion a été trouvé à l'indice: 0
        L'animal cat n'a pas été trouvé dans le zoo.
        L'animal 4 a été ajouté au zoo avec succès !
        L'animal lion a été trouvé à l'indice:0
        Animaux dans le zoo:
        Animal 1:
        Animal{family='Félin', name='lion', age=3, isMammal=true}
        Animal 2:
        Animal{family='Félin', name='Tigre', age=8, isMammal=true}
        Animal 3:
        Animal{family='Éléphant', name='elephant', age=5, isMammal=true}
        Animal 4:
        Animal{family='Félin', name='lion', age=3, isMammal=true}
        J'ai remarqué que la méthode renverra l'index du premier animal correspondant trouvé dans le zoo.

        */

//       Instruction 12 :
        System.out.println("------------------------ Instruction 12 -------------------------");
        /*
        pour corriger cette erreur on ajouter function boolean pour test si animail existe ou non
        avant ajouter dans le zoo et utilise function equals pour compare 2 objects
        - function equals est ajouter dans la classe animal
        - function isAnimalInZoo(animal) est ajouter dans le class Zoo et appelle dans le function addAnimal(animal)
         */
        myZoo.displayAnimals();
    /*
        output :
        L'animal lion a été trouvé à l'indice: 0
        L'animal cat n'a pas été trouvé dans le zoo.
        L'animal 4 n'a pas pu être ajouté au zoo.
        L'animal lion a été trouvé à l'indice:0
        Animaux dans le zoo:
        Animal 1:
        Animal{family='Félin', name='lion', age=3, isMammal=true}
        Animal 2:
        Animal{family='Félin', name='Tigre', age=8, isMammal=true}
        Animal 3:
        Animal{family='Éléphant', name='elephant', age=5, isMammal=true}
     */




//        Instruction 13 :
        System.out.println("------------------------ Instruction 13 -------------------------");
        myZoo.displayAnimals();
        Animal lionToRemove = new Animal("Félin", "lion", 3, true);
        boolean removed = myZoo.removeAnimal(lionToRemove);
        if (removed) {
            System.out.println("L'animal a été supprimé avec succès du zoo.");
        } else {
            System.out.println("L'animal n'a pas été trouvé dans le zoo et n'a pas été supprimé.");
        }
        myZoo.displayAnimals();
        /*
            output:
            avant remove:
            Animaux dans le zoo:
            Animal 1:
            Animal{family='Félin', name='lion', age=3, isMammal=true}

            Animal 2:
            Animal{family='Félin', name='Tigre', age=8, isMammal=true}

            Animal 3:
            Animal{family='Éléphant', name='elephant', age=5, isMammal=true}
            *******************
            L'animal a été supprimé avec succès du zoo.
            *******************
            apres remove :
            Animaux dans le zoo:
            Animal 1:
            Animal{family='Félin', name='Tigre', age=8, isMammal=true}

            Animal 2:
            Animal{family='Éléphant', name='elephant', age=5, isMammal=true}
         */


//         Instruction 14 :
        /*
        final private int nbrCages = 25;
         */
//        Instruction 15 :
        boolean isZooFull = myZoo.isZooFull();
        if (isZooFull) {
            System.out.println("The zoo is full");
        } else {
            System.out.println("The zoo is not yet full");
        }

        /*
        Output:
        The zoo is not yet full.
         */
//        Instruction 16 :

        Zoo secondZoo = new Zoo("Mon Zoo", "Ma Ville");

        Animal lionTosecondZoo = new Animal("Félin", "lion", 8, true);
        secondZoo.addAnimal(lionTosecondZoo);
        Animal tigerTosecondZoo = new Animal("Félin", "tiger", 6, true);
        secondZoo.addAnimal(tigerTosecondZoo);
        Animal elephantTosecondZoo = new Animal("Éléphant", "elephant", 11, true);
        secondZoo.addAnimal(elephantTosecondZoo);
        Animal catTosecondZoo = new Animal("Félin", "cat", 2, true);
        secondZoo.addAnimal(catTosecondZoo);
        Zoo comparisonResult =myZoo.comparerZoo(myZoo,secondZoo);
        comparisonResult.displayAnimals();
        /*
        output:
        Animaux dans le zoo:
        Animal :Animal{family='Félin', name='lion', age=8, isMammal=true}
        Animal :Animal{family='Félin', name='tiger', age=6, isMammal=true}
        Animal :Animal{family='Éléphant', name='elephant', age=11, isMammal=true}
        Animal :Animal{family='Félin', name='cat', age=2, isMammal=true}


         */
    }
}

