import java.util.HashMap;

public class Car {
    private int id;
    private String NO;

    public Car(int id, String NO) {
        this.id = id;
        this.NO = NO;
    }

    public Car() {
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNO() {
        return NO;
    }

    public void setNO(String NO) {
        this.NO = NO;
    }

    @Override
    public String toString() {
        return
                "id=" + id +
                ", NO='" + NO + '\''
                ;
    }
}
