public class Main {
    public static void main(String[] args) {

        book book1 = new book("book1", 1990);
        System.out.println("book1.name = " + book1.getName());
        System.out.println("book1.age = " + book1.getAge());
        book1.setAge(1999);
        System.out.println("book1.getAge() = " + book1.getAge());
        Authur authur = new  Authur("Ivan", "Ivanov");
        System.out.println("authur.nameAuthur = " + authur.getNameAuthur());
        System.out.println("authur.surnameAuthur = " + authur.getSurnameAuthur());
        book book2 = new book("book1", 1899 );
        System.out.println("book2.getName() = " + book2.getName());
        System.out.println("book2.getAge() = " + book2.getAge());
        Authur authur2 = new Authur("Petr", "Petrov");
        System.out.println("authur2.getNameAuthur() = " + authur2.getNameAuthur());
        System.out.println("authur2.getSurnameAuthur() = " + authur2.getSurnameAuthur());


    }
}