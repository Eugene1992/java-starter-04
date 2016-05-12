package hwBasicAdditional;


/**
 * Created by User on 11.05.2016.
 */
//Требуется: Создать класс с именем Address. В теле класса требуется создать поля: index, country, city, street, house, apartment.
//Для каждого поля, создать метод с двумя методами доступа (get, set)
//      Создать экземпляр класса Address.
//      В поля экземпляра записать информацию о почтовом адресе.
//      Выведите на экран значения полей, описывающих адрес.
public class Adress {

    public String country;
    public int index;
    public String city;
    public String street;
    public int house;
    public int apartament;

    public Adress() {
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getHouse() {
        return house;
    }

    public void setHouse(int house) {
        this.house = house;
    }

    public int getApartament() {
        return apartament;
    }

    public void setApartament(int apartament) {
        this.apartament = apartament;
    }

    public void viewAdress() {
        System.out.println("Country : " + country);
        System.out.println("City : " + city);
        System.out.println("Index : " + index);
        System.out.println("Street : " + street);
        System.out.println("House : " + house);
        System.out.println("Apartament : " + apartament);
    }
}
