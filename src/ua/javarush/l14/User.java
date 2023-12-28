package ua.javarush.l14;

public class User {

    public String name;

    public int age;
    public Nissan car;

    public Address address;

    public User() {
    }

    public User(String name) {
        this.name = name;
    }

    public User(String name, int age, Nissan car, Address address) {
        this.name = name;
        this.age = age;
        this.car = car;
        this.address = address;
    }


//    class Address {
//        private String country;
//        private String city;
//        private String street;
//
//        public Address() {
//        }
//
//        public void showOwner() {
//            System.out.println(name);
//        }
//
//        public Address(String country, String city, String street) {
//            this.country = country;
//            this.city = city;
//            this.street = street;
//        }
//
//        @Override
//        public String toString() {
//            return "Address{" +
//                    "country='" + country + '\'' +
//                    ", city='" + city + '\'' +
//                    ", street='" + street + '\'' +
//                    '}';
//        }
//    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", car=" + car +
                ", address=" + address +
                '}';
    }
}
