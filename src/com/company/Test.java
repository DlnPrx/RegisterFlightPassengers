package com.company;

public class Test {

    public static void main(String[] args) {
        //System.out.println("_____________________");
        System.out.println("_____________________Création 4 passagers_____________________");
        Passenger passager1 = new Passenger("Nom1", "Prenom1", 31, "Marseille1");
        Passenger passager2 = new Passenger("Nom2", "Prenom2", 32, "Marseille2");
        Passenger passager3 = new Passenger("Nom3", "Prenom3", 33, "Marseille3");
        Passenger passager4 = new Passenger("Nom4", "Prenom4", 34, "Marseille4");
        Passenger passager5 = new Passenger("Nom5", "Prenom5", 35, "Marseille5");
        System.out.println("_____________________Création Avion1_____________________");
        Flight avion1 = new Flight("Cessna","AF45",4);


        System.out.println("_____________________Ajouter 4 passagers pour 4 places_____________________");
        avion1.add(passager1);
        avion1.add(passager2);
        avion1.add(passager3);
        avion1.add(passager4);
        avion1.add(passager5); //Le cinquieme pour verifier la limite
        System.out.println("_____________________Afficher l'avion_____________________");
        avion1.afficheravion();
        System.out.println("_____________________Verifier si passager 1 est a bord_____________________");
        avion1.isOnBoard(passager1);
        System.out.println("_____________________Ajouter un passager deja a bord_____________________");
        avion1.add(passager1);
        System.out.println("_____________________Débarquer passager1_____________________");
        avion1.remove(passager1);
        System.out.println("_____________________Verifier si passager 1 est a bord_____________________");
        avion1.isOnBoard(passager1);
        System.out.println("_____________________afficher avion1_____________________");
      avion1.afficheravion();
        // test détection égalité structurelle
        // p1 et p2 sont 2 objets:
        // **différents du point de vue de l'égalité référentielle(adresse mémoire différente)
        // **identiques du point de ve de l'égalité structurelle(même nom, même prénom, même âge même adresse)
        Passenger p1 = new Passenger("Charles", "Hattan", 31, "Marseille1");
        Passenger p2 = new Passenger("Charles", "Hattan", 31, "Marseille1");
        // enregistrer le passager Charles
        System.out.println("Test égalité structurelle");
        avion1.add(p1);
        // le passager Charles, dont on a une référence dans p2, est-il dans l'avion?
        avion1.isOnBoard(p2);
        // affichage
        //Passager Passenger:(Charles',Hattan',31,Marseille1')embarqué
        //Passenger:(Charles',Hattan',31,Marseille1')n'est pas présent à bord
        // Conclusion: la méthode isOnBoard n'est pas capable de détecter l'égalité structurelle
        // des 2 objets p1 et p2!
        // Pourquoi?
        // car la classe Passenger ne redéfini pas la méthode equals qui permet de spécifier
        // les critères permettant de dire que 2 objets sont égaux du point de vue structurel.

    }
}
