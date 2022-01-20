package org.example;

public class Employee {
        private Integer id;
        private String name;
        private String prof;

    public Employee(Integer id, String name, String prof) {
        super();
        this.id = id;
        this.name = name;
        this.prof = prof;}


        public Integer getId () {
            return id;
        }

        public void setId (Integer id){
            this.id = id;
        }

        public String getName () {
            return name;
        }

        public void setName (String name){
            this.name = name;
        }

        public String getProf () {
            return prof;
        }

        public void setProf (String prof){
            this.prof = prof;
        }


        @Override
        public String toString () {
            return "Employee [id=" + id + ", name=" + name + ", prof=" + prof + "]";
        }
    }
