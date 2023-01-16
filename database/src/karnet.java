import java.sql.Date;
public class karnet {
    int karnet_id;
    Date data_waznosci;
    Date data_aktywacji;
    boolean premium;
    int klient_id;
    public int getKarnet_id() {
        return karnet_id;
    }

    public void setKarnet_id(int karnet_id) {
        this.karnet_id = karnet_id;
    }

    public Date getData_waznosci() {
        return data_waznosci;
    }

    public void setData_waznosci(Date data_waznosci) {
        this.data_waznosci = data_waznosci;
    }

    public Date getData_aktywacji() {
        return data_aktywacji;
    }

    public void setData_aktywacji(Date data_aktywacji) {
        this.data_aktywacji = data_aktywacji;
    }

    public boolean isPremium() {
        return premium;
    }

    public void setPremium(boolean premium) {
        this.premium = premium;
    }

    public int getKlient_id() {
        return klient_id;
    }

    public void setKlient_id(int klient_id) {
        this.klient_id = klient_id;
    }
}
