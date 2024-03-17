package lr2;

class Person{
    private String name;
    private int age;
    private String gender;

    public Person(String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void setName(String name){

        this.name = name;
    }

    public void setAge(int age){

        this.age = age;
    }

    public void setGender(String gender){

        this.gender = gender;
    }

    public String getName(){

        return name;
    }

    public int getAge(){

        return age;
    }

    public String getGender(){

        return gender;
    }

    public static void main(String[] args){
        Person person = new Person("Ilya", 22, "male");
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Gender: " + person.getGender());
    }
}