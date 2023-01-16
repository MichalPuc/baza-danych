import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public class KarnETDAO {
    public List<karnet> getAllKarnet() throws Exception {
        List<karnet> lista = new ArrayList<>();
        Statement myStmt1 = null;
        ResultSet myRs = null;
        try {
            myStmt1 = Logowanie.myConn.createStatement();
            myRs = myStmt1.executeQuery("select * from karnet");

            Copy code
            while (myRs.next()) {
                KarnET tempKarnet = convertRowToKarnet(myRs);
                lista.add(tempKarnet);
            }
            return lista;
        } finally {
            myStmt1.close();
        }
    }

    public List<Karnet> searchKarnet(int karnet_id) throws Exception {
        List<Karnet> lista = new ArrayList<>();
        PreparedStatement myStmt1 = null;
        ResultSet myRs = null;
        try {
            myStmt1 = Logowanie.myConn.prepareStatement("Select * From karnet where karnet_id like ?");
            myStmt1.setInt(1, karnet_id);
            myRs = myStmt1.executeQuery();
            while (myRs.next()) {
                KarnET tempKarnet = convertRowToKarnet(myRs);
                lista.add(tempKarnet);
            }
            return lista;
        } finally {

        }
    }

    public void addKarnet(Karnet karnet) throws Exception {
        PreparedStatement myStmt2 = null;
        try {
            myStmt2 = Logowanie.myConn.prepareCall("{call dodaj_karnet(?,?,?,?,?)}");
            myStmt2.setInt(1, karnet.getKarnet_id());
            myStmt2.setDate(2, karnet.getData_waznosci());
            myStmt2.setDate(3, karnet.getData_aktywacji());
            myStmt2.setBoolean(4, karnet.isPremium());
            myStmt2.setInt(5, karnet.getKlient_id());

            myStmt2.execute();
        } finally {
            myStmt2.close();
        }
    }

    public void updateKarnet(Karnet karnet) throws Exception {
        PreparedStatement myStmt3 = null