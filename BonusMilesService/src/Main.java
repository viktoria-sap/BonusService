public class Main {
    public static void main(String[] args) {
        BonusMilesService milesService = new BonusMilesService();
        int price = 10;
        long miles = milesService.calculate(price);
        System.out.println(miles);
    }
}
