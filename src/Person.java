/**
 * Created by lisiyang on 17/7/2.
 */
public class Person {
    private int age;
    private String name;
    public Person(String name,int age){
        this.name=name;
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public Integer getAge(){
        return age;
    }
    public String toString(){
        return this.getName()+" "+this.getAge();
    }
//    public int compareTo (Object o){
//        Person person = (Person) o;
//        int result = this.age < person.age ? 1 : (this.age==person.age?0:-1);//降序
//        if (result == 0){
//            this.getName().compareTo(person.getName());
//        }
//        return result;
//    }
}
