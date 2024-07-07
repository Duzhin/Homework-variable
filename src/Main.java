public class Main {

    public static void main(String[] args) {
        int numberTusk = 1;
        // Задача 1
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

        printMessages(dog, cat, paper, numberTusk);

        // Задача 2
        printMessages(dog+=4, cat+=4, paper+=4, numberTusk += 1);

        // Задача 3
        printMessages(dog -= 3.5, cat -= 1.6 , paper -= 7639, numberTusk +=1);

        // Задача 4
        System.out.println("Задача "+ (numberTusk+=1));
        var friend = 19;
        System.out.println(friend);
        System.out.println(friend += 2);
        System.out.println(friend /= 3);

        // Задача 5

        System.out.println("Задача "+ (numberTusk+=1));
        var frog = 19; // с double значения будут правильные
        System.out.println(frog);
        System.out.println(frog *= 10);
        System.out.println(frog /= 3.5); // !При делении нужно переменной присваивать переменную c плавающей точкой в var
        System.out.println(frog += 4);

        // Задача 6
        System.out.println("Задача "+ (numberTusk+=1));
        var weightFirstBoxer = 78.2;
        var weightSecondBoxer = 82.7;
        System.out.println("Масса двух боксеров " + (weightFirstBoxer+weightSecondBoxer) + " кг");
        System.out.println("Перевес одного из боксеров " + Math.abs(weightFirstBoxer-weightSecondBoxer) + " кг");

        // Задача 7
        System.out.println("Задача "+ (numberTusk+=1));
        var segmentationRemain = (weightFirstBoxer>weightSecondBoxer)?(weightFirstBoxer%weightSecondBoxer):(weightSecondBoxer%weightFirstBoxer);
        System.out.println("Остаток от деления " + segmentationRemain );

        // Задача 8
        System.out.println("Задача "+ (numberTusk+=1));
        var timeToWorkGeneral = 640;
        var timeToWorkSingle = 8;
        var personToWork = timeToWorkGeneral / timeToWorkSingle;
        System.out.println("Всего работников в компании - " + (personToWork) + " человек");
        System.out.println("Если в компании работает " + (personToWork+94) + " человек, то всего " + (personToWork+94)*8 + " часов работы может быть поделено между сотрудниками");
    }
    public static void printMessages(double dog, double cat, int paper, int numberTusk){ // Вывод значений переменных для 3х повторяющихся задач
        System.out.println("Задача "+ numberTusk);
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }
}