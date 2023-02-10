public class Main {
    public static void main(String[] args) {
        Authur authur1 = new  Authur("Ivan", "Ivanov");
        Authur authur2 = new Authur("Petr", "Petrov");
        Authur authur3 = new Authur("Petr", "Petrov");
        System.out.println(authur2.equals(authur3));
        book book1 = new book("book1", 1990, authur1);
        book book2 = new book("book2", 1899, authur2 );
        book book3 = new book("book2", 1899, authur2 );
        System.out.println(book2.equals(book3));
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book2.hashCode());
        System.out.println(book3.hashCode());
        System.out.println(authur2.hashCode());
        System.out.println(authur3.hashCode());
    }
}
