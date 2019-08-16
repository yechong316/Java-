public class Puppy{

    int puppyAge;
    public Puppy(int age){
        System.out.println("我的年龄是：" + age);
    }

    public void setAge(int age){
        puppyAge = age;
    }

    public int getAge(){
        System.out.println("小狗的年龄:" + puppyAge);
        return puppyAge;
    }
    public static void main(String[] args){
        Puppy myage = new Puppy(30);

        myage.setAge(2);
        myage.getAge();

        System.out.println("变量值:" + myage.puppyAge);


    }

}