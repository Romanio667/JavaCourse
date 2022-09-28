import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int flag=1;
        float result;
        Basket myBasket = new Basket();
        ArrayList<Basket> BasketList = new ArrayList<Basket>();
        PriceOfProducts myPriceOfProducts=new PriceOfProducts();
        while (flag==1) {
            myBasket=new Basket();
            Scanner in = new Scanner(System.in);
            System.out.println("Введите товар и его количество");
            String product = in.nextLine();
            String[] productInform = product.split("\\s+");
            myBasket.setName(productInform[0]);
            myBasket.setNumber(Integer.parseInt(productInform[1]));
            sumOfProduct(productInform, myBasket, myPriceOfProducts);
            BasketList.add(myBasket);
            System.out.println("Хотите добавить ещё товар? 1-да, 0-нет");
            flag = in.nextInt();

        }
        result=sumOfAllProducts(BasketList);
        BasketList.sort(Comparator.comparing(Basket::getName));
        output(myBasket,BasketList,result);
    }

    public static void sumOfProduct(String[] productInform,Basket myBasket,PriceOfProducts myPriceOfProducts){
        switch (myBasket.getName()){
            case "Агава": myBasket.setSum((float)Math.round (myBasket.getNumber() * myPriceOfProducts.getAgava() * 100) / 100); myBasket.setPrice(myPriceOfProducts.getAgava()); break;
            case "Бумага": myBasket.setSum((float) Math.round (myBasket.getNumber() * myPriceOfProducts.getPaper() * 100) / 100); myBasket.setPrice(myPriceOfProducts.getPaper()); break;
            default: throw new IllegalArgumentException("Invalid name of the product: " + myBasket.getName());
        }
    }

    public static float sumOfAllProducts( ArrayList<Basket> BasketList){
        float result=0;
        for(int i=0; i<BasketList.size(); i++) {
           result=result+BasketList.get(i).getSum();
        }
        return result;
    }

    public static void output(Basket myBasket, ArrayList<Basket> BasketList, float result){
        System.out.println("Заказ №12312 Фамилия Имя Отчество 30.09.2019");
        System.out.println();
        System.out.printf("%-10s %-10s %-10s %-10s\n","Название","Цена","Количество","Сумма");
        for(int i=0; i<BasketList.size(); i++) {
            System.out.printf("%-10s %-10s %-10s %-10s\n", BasketList.get(i).getName(), BasketList.get(i).getPrice(), BasketList.get(i).getNumber(),BasketList.get(i).getSum());
        }
        System.out.println();
        System.out.println("Итого: "+result);
    }

}
