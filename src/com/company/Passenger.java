package com.company;

import java.util.Objects;

public class Passenger {
    private String mLastName;
    private String mFirstName;
    private int mAge;
    private String mAdress;

    public Passenger(String lastName, String firstName, int age, String adress) {
        this.mLastName = lastName;
        this.mFirstName = firstName;
        this.mAge = age;
        this.mAdress = adress;
    }

    public String getmLastName() {
        return mLastName;
    }

    public void setmLastName(String mLastName) {
        this.mLastName = mLastName;
    }

    public String getmFirstName() {
        return mFirstName;
    }

    public void setmFirstName(String mFirstName) {
        this.mFirstName = mFirstName;
    }

    public int getmAge() {
        return mAge;
    }

    public void setmAge(int mAge) {
        this.mAge = mAge;
    }

    public String getmAdress() {
        return mAdress;
    }

    public void setmAdress(String mAdress) {
        this.mAdress = mAdress;
    }

    //Redefinition de la methode equals pour comparer deux passagers
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passenger passenger = (Passenger) o;
        return mAge == passenger.mAge &&
                Objects.equals(mLastName, passenger.mLastName) &&
                Objects.equals(mFirstName, passenger.mFirstName) &&
                Objects.equals(mAdress, passenger.mAdress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mLastName, mFirstName, mAge, mAdress);
    }

    //Redefinition de la methode toString
    @Override
    public String toString() {
        return "Passenger:(" +
                "" + mLastName + '\'' +
                "," + mFirstName + '\'' +
                "," + mAge +
                "," + mAdress + '\'' +
                ')';

    }
}
