package org.example;

//Model class
class Person {
    private Integer id;
    private String fname;
    private String lname;

    public Person(Integer id, String fname, String lname) {
        super();
        this.id = id;
        this.fname = fname;
        this.lname = lname;
    }


    //Getters and Setters


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

//        @Override
//    public String toString() {
//        return "Person [id=" + id + ", fname=" + fname + ", lname=" + lname + "]";
//    }


    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                '}';
    }
}