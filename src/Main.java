//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // task 1
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);


        // task 2

        var number = 4;
        System.out.println(dog+number);
        System.out.println(cat+number);
        System.out.println(paper+number);

        // task 3

        var weightDog = dog - 3.5;
        var weightCat = cat - 1.6;
        var weightPaper = paper - 7639;

        System.out.println(weightDog);
        System.out.println(weightCat);
        System.out.println(weightPaper);

        // task 4
        var friend = (19 + 2) / 7;

        System.out.println(friend);

        // task 5

        var frog = 3.5;
        var frogMultiply = frog * 10;
        var frogDivision = frogMultiply / 3.5;
        var frogPlus = frogDivision + 4;


        System.out.println(frog);
        System.out.println(frogMultiply);
        System.out.println(frogDivision);
        System.out.println(frogPlus);

        // task 6

        var oneBoxer = 78.2;
        var secondBoxer = 82.7;
        var totalWeight = oneBoxer + secondBoxer;

        System.out.println("Общий вес боксёров " + totalWeight);

        // task 7

        var weightDifference = secondBoxer % oneBoxer;
        System.out.println("Разница в весе двух боксёров " + weightDifference);

        // task 8

        var timeWork = 640;
        var workers = timeWork / 8;

        System.out.println("Всего работников в компании "+ workers +" человек");

        var newWorkers = workers + 94;
        var NewTimeWork = timeWork / newWorkers;

        System.out.println("Если в компании работает "+newWorkers+" человек, то всего "+NewTimeWork+" часов работы может быть поделено между сотрудниками");

    }
}