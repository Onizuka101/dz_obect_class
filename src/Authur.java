import java.util.Objects;

public class Authur {
    private String nameAuthur;
    private String surnameAuthur;

    public Authur (String nameAuthur, String surnameAuthur) {
        this.nameAuthur= nameAuthur;
        this.surnameAuthur=surnameAuthur;
    }

    public String getNameAuthur() {
        return this.nameAuthur;
    }
    public String getSurnameAuthur() {
        return this.surnameAuthur;
    }
    public String toString () {
        return this.nameAuthur + this.surnameAuthur;
    }
    @Override
    public boolean equals(Object o){
        if (this == o) {
            return true;
        }
        if (o==null || getClass() != o.getClass()) {
            return false;
        }
        Authur authur = (Authur) o;
        return nameAuthur.equals(authur.getNameAuthur()) && surnameAuthur.equals(authur.getSurnameAuthur());
    }
    @Override
    public int hashCode() {
        return Objects.hash(nameAuthur, surnameAuthur);
    }
}
