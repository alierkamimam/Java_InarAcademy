package chapter.chapter13.listing;

public class HouseTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        House house=new House(1,1750.50);
        House house1=(House) house.clone();
        System.out.println(house.getWhenBuilt()==house1.getWhenBuilt());
        System.out.println(house==house1);
        System.out.println(house.compareTo(house1));
        System.out.println(house.equals(house1));
    }
}
