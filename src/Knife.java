import java.util.Objects;

public class Knife {
    String producer;
    int length;
    int hardness;

    public Knife(String producer, int length, int hardness) {
        this.producer = producer;
        this.length = length;
        this.hardness = hardness;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Knife)) return false;
        Knife knife = (Knife) o;
        return length == knife.length &&
                hardness == knife.hardness &&
                Objects.equals(producer, knife.producer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(producer, length, hardness);
    }

    @Override
    public String toString() {
        return "Knife{" +
                "producer='" + producer + '\'' +
                ", length=" + length +
                ", hardness=" + hardness +
                '}';
    }
}
