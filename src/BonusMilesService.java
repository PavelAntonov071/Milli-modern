public class BonusMilesService {
    public int calculate(int price) {
        int bonusVozvrat = 20;
        int bonus = price / bonusVozvrat;
        return bonus;
    }
}
