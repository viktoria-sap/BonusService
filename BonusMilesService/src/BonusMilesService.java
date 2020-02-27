public class BonusMilesService {
    public long calculate(int price){
        long miles = price / 20;
        return miles;
    }
}
