/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Route;

/**
 *
 * @author fernando
 */
public class Route {
    public static int currentNo = 1;
    
    private int id;
    private String from;
    private String to;
    private int fare;

    public Route(String from, String to, int fare) {
        this.id = currentNo;
        this.from = from;
        this.to = to;
        this.fare = fare;
        
        currentNo++;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public void setFare(int fare) {
        this.fare = fare;
    }

    public int getId() {
        return id;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public int getFare() {
        return fare;
    }
    
}
