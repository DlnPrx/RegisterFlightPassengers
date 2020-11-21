package com.company;

import java.util.*;
import java.lang.*;


public class Flight {


    private String mType;
    private String mFlyNumber;
    private int mSeatsNb;
    private Passenger[] mPassengerList;

    public Flight(String type, String flyNumber, int seatsNb) {
        this.mType = type;
        this.mFlyNumber = flyNumber;
        this.mSeatsNb = seatsNb;
        mPassengerList = new Passenger[mSeatsNb];
    }

    //Affiche la liste des passagers dans l'avion et les places vides ("null")
    public void afficheravion() {
        for (Passenger elem : mPassengerList) {
            System.out.println(elem);
        }
    }

    //Ajouter passager
    public void add(Passenger passenger) {

        //Verification si passager deja à bord
        for (Passenger value : mPassengerList) {
            if (passenger.equals(value)) {
                System.out.println("Passager deja dans l'avion ");
                break;
            }
        }

        //ajoute un passager, si un emplacement est vide (null) et si il reste de la place
        for (int j = 0; j < mPassengerList.length; j++) {
            if (mPassengerList[j] == null) {
                mPassengerList[j] = passenger;
                System.out.println("Passager " + passenger + "embarqué");
                break;

            } else if (j == mSeatsNb - 1) {
                System.out.println("L'avion est plein, le passager " + passenger + "ne peut pas embarquer");
                break;
            }
        }
    }


    public void remove(Passenger passenger) {
        //supprime un passager

        for (int i = 0; i < mPassengerList.length; i++) {
            if (passenger.equals(mPassengerList[i])) //trouver la position du passager dans le tableau
            {
                Passenger[] copyArray = new Passenger[mSeatsNb];

                for (int j = 0; j < mPassengerList.length; j++) {
                    if (j == i) {
                        mPassengerList[j] = copyArray[j];
                    }
                }
                System.out.println(passenger + "A débarqué de l'avion");

                break;
            }
            if (i == (mPassengerList.length - 1)) {
                System.out.println("Ce passager n'est pas dans l'avion");
            }
        }

    }

    public void isOnBoard(Passenger passenger) {
        //affiche est a bord ou n'est pas a bord
        for (int i = 0; i < mPassengerList.length; i++) {
            if (passenger.equals(mPassengerList[i])) {
                System.out.println(passenger + "est présent à bord");
                break;
            }
            if (i == (mPassengerList.length - 1)) {
                System.out.println(passenger + "n'est pas présent à bord");
                break;
            }

        }

    }


    @Override
    public String toString() {
        return "Flight{" +
                "mType='" + mType + '\'' +
                ", mFlyNumber='" + mFlyNumber + '\'' +
                ", mSeatsNb=" + mSeatsNb +
                ", mPassengerList=" + Arrays.toString(mPassengerList) +
                '}';
    }
}
