// // class Food {
// //     String name;
// //     double price;
// //     void order(){
// //         System.out.println("Food Ordered: ");
// //     }
// // }Food f1 = new Food();
// // class Food{
// //     private double price;
// //     public void setPrice(double p){
// //         if(p>0)price = p;
// //     }
// //     public double getPrice(){

// //     }
// // }

// // class Pizza extends Food{
// //     void type(){
// //         System.out.println("Veg Pizza");
// //     }
// //     class Burger extends Food{
// //         void type(){
// //             System.out.println("Burger orderes");
// //         }
// //     }
// // }
// // food item f = new pizza();
// // f.order();


class FoodItem {
    private String name;
    private double price;

    public void setName(String n){
        name = n;
    }

    public String getName(){
        return name;
    }

    public void setPrice(double p){
        if(p > 0){
            price = p;
        }
    }

    public double getPrice(){
        return price;
    }

    void order(){
        System.out.println("Food ordered");
    }
}
class Pizza extends FoodItem {
    void type(){
        System.out.println("Veg Pizza");
    }
    @Override
    void order(){
        System.out.println("Pizza ordered");
    }
}
abstract class Delivery {
    abstract void process();
}

class OnlineDelivery extends Delivery{
    void process(){
        System.out.println("Delivery in process...");
    }
}

public class Food {
    public static void main(String[] args){

        Pizza p1 = new Pizza();
        p1.setName("Margherita");
        p1.setPrice(300);

        p1.order();     
        p1.type();      

        System.out.println("Price: " + p1.getPrice());

        OnlineDelivery d = new OnlineDelivery();
        d.process(); 
    }
}