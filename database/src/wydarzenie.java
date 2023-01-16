import java.sql.Date;
public class wydarzenie {
    int wydarzenie_id;
    boolean rodzaj;
    Date data;
    int trener_id;

    public int getWydarzenie_id() {
        return wydarzenie_id;
    }

    public void setWydarzenie_id(int wydarzenie_id) {
        this.wydarzenie_id = wydarzenie_id;
    }

    public boolean isRodzaj() {
        return rodzaj;
    }

    public void setRodzaj(boolean rodzaj) {
        this.rodzaj = rodzaj;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public int getTrener_id() {
        return trener_id;
    }

    public void setTrener_id(int trener_id) {
        this.trener_id = trener_id;
    }
}
