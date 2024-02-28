package lesson20240228;

public class CoffeeMachine {

    private int currentMoneyInMachine = 0;


// Кофемашина:
// 1. Создать перечисление Coffee с разными вариантами кофе
// - Cappuccino
// - Latte
// - Americano
// - Espresso
// - Macchiato
// У каждого сорта кофе есть цена и описание.
// 2. В классе CoffeeMachine реализовать метод displayInfo(Coffee coffee), который выводил бы информацию о выбранном кофе.
// 3. Реализовать метод makeCoffee(Coffee coffee, int money), который проверял бы, достаточно ли средств,
// готовил бы кофе и выдавал сдачу. Если выбрано капучино, автомат сообщает, что данного вида кофе нет.
    public static void main(String[] args) {
        Coffee coffee = Coffee.CAPPUCCINO;

        CoffeeMachine coffeeMachine = new CoffeeMachine();



//        coffeeMachine.displayInfo(coffee);

        coffeeMachine.makeCoffee(Coffee.AMERICANO, 85);
        coffeeMachine.makeCoffee(Coffee.AMERICANO, 60);
        coffeeMachine.getMoneyBack();

//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//        }
    }

    public void displayInfo(Coffee coffee){
        System.out.println(coffee);
    }

    public void makeCoffee(Coffee coffee, int money){
        currentMoneyInMachine += money;

        switch (coffee) {
            case CAPPUCCINO -> {
                System.out.println("No CAPPUCCINO in coffee machine");
            }
            default -> {
                if (coffee.getCost() > currentMoneyInMachine) {
                    System.out.println("Not enough money for " + coffee);
//                    System.out.println("Take back your money: " + money);
                } else {
                    System.out.println("Cooking " + coffee);
                    currentMoneyInMachine -= coffee.getCost();
//                    System.out.println("Take back your change: " + (money - coffee.getCost()));
                    System.out.println("Take back your coffee " + coffee);
                }
            }
        }
    }

    public void getMoneyBack() {
        System.out.println("Take your money " + currentMoneyInMachine);
        currentMoneyInMachine = 0;
    }

}
