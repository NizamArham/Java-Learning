public class Car {
    
    private String make;
    private String model;
    private String color;
    private int year;

    Car(String make, String model, String color, int year){
        this.setmake(make); 
        this.setmodel(model);
        this.setcolor(color);
        this.setyear(year);

    }

    public String getmake(){
        return make;
    }

    public String getmodel(){
        return model;
    }

    public String getcolor(){
        return color;
    }

    public int getyear(){
        return year;
    }


    public void setmake(String make){
        this.make = make;
    }


    public void setmodel(String model){
        this.model = model;
    }


    public void setcolor(String color){
        this.color = color;
    }

    public void setyear(int year){
        this.year = year;
    }
    
}
