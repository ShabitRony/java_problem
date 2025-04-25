package assignment;

public class LaptopPrice {
    int discount;
    public LaptopPrice(int discount){
        this.discount = discount;
    }
    public void Price(int laptopPrice,int mousePrice,int count){
        double totalPrice = laptopPrice+(mousePrice*count);
        double dis = totalPrice*(discount/100.0);
        double finalPrice = totalPrice - dis;
        System.out.println(finalPrice);
    }
    public static void main(String[] args) {
        LaptopPrice laptopPrice = new LaptopPrice(15);
         laptopPrice.Price(85000 ,2500,1 );
    }
}
