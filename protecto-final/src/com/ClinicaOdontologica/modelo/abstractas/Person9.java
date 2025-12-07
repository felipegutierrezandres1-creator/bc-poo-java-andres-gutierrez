package com.ClinicaOdontologica.modelo.abstractas;
//CLASE ABSTRACTA
public abstract class Person9 {
    private String id;
    private String name;
    private int age;

    // Constructor
    public Person9(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    // Getters y Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age >= 0) {
            this.age = age;
        }
    }

    // Metodo abstracto
    public abstract void showInfo();
}
