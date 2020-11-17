package com.company;

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
