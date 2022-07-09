import java.sql.ResultSet;
import java.sql.Statement;

import connection.Connect;
import javafx.application.Application;
import javafx.stage.Stage;
import view.CreateView;
import view.TabelView;

public class App extends Application{
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        launch(args);
    }

    @Override
    public void start(Stage arg0) throws Exception {
        
        String sql = "SELECT * FROM stok_obat";
        Connect con = new Connect();
        Statement stat = con.connection();
        ResultSet res = stat.executeQuery(sql);

        while(res.next()){
            System.out.println("Nomor = "+res.getString("no"));
            System.out.println("Nama Barang = "+res.getString("nama_barang"));
        }

        TabelView test2 = new TabelView();
        test2.tabelView();
        
        
        // CreateView test = new CreateView();
        // test.createForm();
    }
}