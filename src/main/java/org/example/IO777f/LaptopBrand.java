package org.example.IO777f;
class LaptopBrand implements Comparable<LaptopBrand>{

    private String name;

    public LaptopBrand(String name){
        this.setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int compareTo(LaptopBrand o) {
        return name.compareTo(o.getName());
    }

    public String toString(){
        return this.getName();
    }
}
