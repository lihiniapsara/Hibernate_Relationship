package Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Address {

    @Id
    private int aid;

    private String no;

    private String road;

    private String city;

    public Address(int aid, String no, String road, String city) {
        this.aid = aid;
        this.no = no;
        this.road = road;
        this.city = city;
    }

    public Address() {
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public void setRoad(String road) {
        this.road = road;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getAid() {
        return aid;
    }

    public String getNo() {
        return no;
    }

    public String getRoad() {
        return road;
    }

    public String getCity() {
        return city;
    }

}
