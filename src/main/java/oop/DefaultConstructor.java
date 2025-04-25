package oop;

public class DefaultConstructor {
    int vat;
    public DefaultConstructor(int vat) {
        this.vat = vat;
    }
        public int productPrice(int price,int count){
            price =(price+(price*count)*vat/100);
            return price;
        }

    public static void main(String[] args) {
        DefaultConstructor df= new DefaultConstructor(15);
        int totalprice= df.productPrice(100,1);
        System.out.println(totalprice);
    }
}
