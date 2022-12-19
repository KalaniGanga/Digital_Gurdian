package com.example.digitalguardian;

public class Patient {
    private String name;
    private int roomNumber;
    private int temperature;
    private String desc;
    private String gender;
    private String index;


    public String getName() {
        return name;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public int getTemperature() {
        return temperature;
    }

    public String getDesc() {
        return desc;
    }

    public String getGender() {
        return gender;
    }

    public String getIndex() {
        return index;
    }

    public Patient(String index, String name, int roomNumber, int temperature, String desc, String gender) {
        this.name = name;
        this.roomNumber = roomNumber;
        this.temperature = temperature;
        this.desc = desc;
        this.gender = gender;
        this.index = index;

    }

}
