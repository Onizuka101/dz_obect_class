import java.util.Objects;

public class book {
    private   String name;
    private   int age;
    private Authur authur;


    public book (String name, int age,Authur authur){
        this.name=name;
        this.age=age;
        this.authur=authur;

    }

    public String getName() {
        return this.name;
    }
    public int getAge() {
        return this.age;
    }
    public void setAge (int age) {
        this.age=age;
    }
    public Authur getAuthur() {
        return this.authur;
    }

    @Override
    public String toString() {
        return "имя " + this.name + " год " + this.age + " ИФ автора " + this.authur;
    }
    @Override
    public boolean equals(Object o){
        if (this == o) {
            return true;
        }
        if (o==null || getClass() != o.getClass()) {
    return false;
        }
        book bookk = (book) o;
      return age == bookk.getAge() && name.equals(bookk.getName()) && authur.equals(bookk.authur);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name,age , authur);
    }
}
