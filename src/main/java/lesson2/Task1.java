package lesson2;

/**
 * Реализовать у класса Task1 переменные age (тип int),  name (тип String), ageGroup(тип String)
 * реализовать методы геттеры и сеттеры для каждой переменной.
 * Должны быть выполненны следующие условия:
 *  - не должно быть возможности напрямую устанваливать или читать значение age/name
 *  - нельзя установить значение age меньше нуля
 *  - максимальныое значение для возраста - 100
 *  - значение name не может быть короче чем 3 символа и длиннее чем 50 символов
 *  - name не может состоять из одних только пробелов
 *  - не зависимо от того ввел пользователь имя с большой или с маленькой буквы,
 *      оно должно быть записано в переменную name с большой буквы
 *  - ageGroup должен устанавливаться автоматически при установке возраста
 *      - child если age до 15 лет
 *      - student  - если age от 15 до 25 лет
 *      - worker - если age от 26 до 65 лет
 *      - pensioner - если age старше 66 лет
 *  - ageGroup можно только прочитать с помощью геттера, сеттер должен быть приватным и недоступным для других классов
 */

public class Task1 {

    final static String groupChild = "child";
    final static String groupStudent = "student";
    final static String groupWorker = "worker";
    final static String groupPensioner = "pensioner";

    public Task1(int age, String name){
        this.age = age;
        this.name = name;
        setAgeGroup(age);
    }

    public Task1(){
        this.age = 4;
        this.name = "Esenia";
        this.ageGroup = groupChild;
    }

    private int age;
    private String name;
    String ageGroup;

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        if(age < 0 || age > 100) {
            System.out.print("Error age");
        } else {
            this.age = age;
            setAgeGroup(age);
        }
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if( name == null ) {
            System.out.println("Error name");
            return;
        }
        if(name.length() < 3 || name.length() > 50 || name.trim().length() == 0 ) {
            System.out.println("Error name");
        } else {
            this.name = name.substring( 0, 1 ).toUpperCase() + name.substring( 1 );
        }
    }

    public String getAgeGroup() {
        return this.ageGroup;
    }

    private void setAgeGroup(int age) {
        if(age >= 0 || age <= 14) {
            this.ageGroup = groupChild;
        } else if (age >= 15 || age <= 25){
            this.ageGroup = groupStudent;
        } else if (age >= 26 || age <= 65){
            this.ageGroup = groupWorker;
        } else if (age >= 66 || age <= 100){
            this.ageGroup = groupPensioner;
        } else {
            System.out.println("Error ageGroup");
        }
    }

}
