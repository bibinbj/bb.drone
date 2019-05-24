package com;

class Author {
    int id;
    int age;
    String name;

    public Author(int id,String name,int age){
        this.id = id;
        this.name = name;
        this.age =age;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
