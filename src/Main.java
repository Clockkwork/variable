public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача №1 ");
        var dog = 8;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
    }


    public static void task2() {
        System.out.println("Задача №2 ");
        var dog = 8;
        var cat = 3.6;
        var paper = 763789;
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);
    }


    public static void task3(){
        System.out.println("Задача №3 ");
        double dog = 12;
        var cat = 7.6;
        var paper =763789;
        dog = (double)(dog - 3.5);
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);

    }
    public static void task4() {
        System.out.println("Задача №4 ");
        var friend = 19;
        System.out.println(friend);
        friend = friend * 2;
        System.out.println(friend);
        friend = friend /7;
        System.out.println(friend);
    }
    public static void task5() {
        System.out.println("Задача №5 ");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
    }
    public static void task6() {
        System.out.println("Задача №6");
        var firstBoxerWeight = 78.2;
        var secondBoxerWeight = 82.7;
        var  totalWeight = firstBoxerWeight + secondBoxerWeight;
        System.out.println("Общий вес бойцов " + totalWeight + " кг ");
        var differenceWeight = secondBoxerWeight - firstBoxerWeight;
        System.out.println("Разница между весами бойцов " + differenceWeight + "кг ");
    }
    public static void task7() {
        System.out.println("Задача №7");
        var firstBoxerWeight = 78.2;
        var secondBoxerWeight = 82.7;
        var differenceWeight = secondBoxerWeight - firstBoxerWeight;
        System.out.println("Разница между весами бойцов " + differenceWeight + "кг ");
        var preponderance = secondBoxerWeight % firstBoxerWeight;
        System.out.println("Перевес на " + preponderance + "кг! ");
    }
    public static void task8() {
        //Задание 8.Задача 1.
        System.out.println("Задача №8");
        var totalHours = 640;
        var employee = 8;
        var workingStuff = totalHours / employee;
        System.out.println("Всего работников в компании - " + workingStuff + " человек ");
        //Задание 8.Задача 2
        var stuffs = workingStuff + 94;
        System.out.println(stuffs);
        var hours = totalHours / stuffs;
        System.out.println("Если в компании работает - " + stuffs + " человек ");
        System.out.println("То всего " + hours + " часа работы может быть поделено между сотрудниками");
    }

}

