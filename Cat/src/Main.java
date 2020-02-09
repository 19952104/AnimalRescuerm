public class Main {
    public static void main(String[] args) {
        Animal piki = new Animal();
        piki.type = "Cat";
        piki.name = "Piki";
        piki.favoriteActivity = "sleep";
        piki.favoriteFood = " felix";
        piki.healthStatus = 7;
        piki.levelOfSpirit = 8;
        piki.theLevelOfTheFeelingOfHunger = 10;
        piki.age = 3;
        System.out.println(piki.name + "\n " + piki.age + "\n" + piki.theLevelOfTheFeelingOfHunger + "\n" + piki.levelOfSpirit + "\n " + piki.healthStatus + "\n " + piki.favoriteFood + "\n" + piki.favoriteActivity);

        Veterinarian mihai = new Veterinarian();
        mihai.name = "Mihai";
        mihai.specialization = "veterinarian";
        System.out.println(mihai.name + "\n" + mihai.specialization);

        RecreationalActivity first = new RecreationalActivity();
        first.name = "purrs";
        System.out.println(first.name);
        Food purina = new Food();
        purina.name = "Purina";
        purina.quantify = 101.6;
        purina.food = true;
        System.out.println(purina.food + "\n" + purina.quantify + "\n" + purina.food);

        Adoptator alex = new Adoptator();
        alex.name = "Alex";
        alex.moneyAvailable = 6656556;
        System.out.println(alex.name + "\n" + alex.moneyAvailable);


    }
}
