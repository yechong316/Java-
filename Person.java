public class Person {

    String name;
    int age;
    String task;
    byte a = 10;
    public Person(String name1){
        this.name = name1;
    }

    public void personAge(int PerAge){
        age = PerAge % 20;
    }

    public void target(String str){
        task = str;
    }

    public void PrintTask(){
        System.out.println("姓名：" + name);
        System.out.println("年龄：" + age);
        System.out.println("目的:" + task);
    }


}
