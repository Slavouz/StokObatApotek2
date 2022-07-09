package view;

import java.sql.ResultSet;
import java.sql.Statement;

import connection.Connect;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import model.Stok_obat;

public class TabelView {
    public void tabelView() {
        Stage stage = new Stage();
        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setAlignment(Pos.CENTER);

        TextField search = new TextField();
        search.setPromptText("Cari Stok Obat");
        grid.add(search, 0, 0);

        TableView<Stok_obat> table = new TableView<Stok_obat>();
        final ObservableList<Stok_obat> data = FXCollections.observableArrayList();
        try {

            Stok_obat stok = new Stok_obat(null, null, null, null, null, null, null, null, null, null, null, null);
            String sql = "SELECT * FROM " + stok.tabel;
            Connect conn = new Connect();
            Statement statement = conn.connection();
            ResultSet result = statement.executeQuery(sql);
            while (result.next()) {
                data.add(new Stok_obat(result.getString("nama_barang"), ""+result.getInt("no_batch"), result.getString("PBF"), result.getString("jenis"), ""+result.getInt("satuan"), ""+result.getInt("jumlah_stok"), result.getString("tgl_msk"), result.getString("tgl_klr"), result.getString("exp"),
                        ""+result.getInt("harga1"), ""+result.getInt("harga2"),
                        ""+result.getInt("diskon")));
            }
        } catch (Exception e) {
        }

        table.setEditable(true);

        TableColumn nama_barangCol = new TableColumn("Nama Barang");
        TableColumn no_batchCol = new TableColumn("No Batch");
        TableColumn PBFCol = new TableColumn("PBF");
        TableColumn jenisCol = new TableColumn("Jenis");
        TableColumn satuanCol = new TableColumn("Satuan");
        TableColumn jumlah_stokCol = new TableColumn("Jumlah Stok");
        TableColumn tanggal = new TableColumn("Tanggal");
        TableColumn tgl_mskCol = new TableColumn("Masuk");
        TableColumn tgl_klrCol = new TableColumn("Keluar");
        TableColumn expCol = new TableColumn("Expired");
        TableColumn harga = new TableColumn("Harga");
        TableColumn harga1Col = new TableColumn("Harga 1");
        TableColumn harga2Col = new TableColumn("Harga 2");
        TableColumn diskonCol = new TableColumn("Diskon");
        TableColumn actionCol = new TableColumn("Action");

        nama_barangCol.setMinWidth(200);
        nama_barangCol.setCellValueFactory(
                new PropertyValueFactory<Stok_obat, String>("nama_barang"));

        no_batchCol.setCellValueFactory(
                new PropertyValueFactory<Stok_obat, String>("no_batch"));

        PBFCol.setMinWidth(100);
        PBFCol.setCellValueFactory(
                new PropertyValueFactory<Stok_obat, String>("PBF"));

        jenisCol.setMinWidth(200);
        jenisCol.setCellValueFactory(
                new PropertyValueFactory<Stok_obat, String>("jenis"));

        satuanCol.setCellValueFactory(
                new PropertyValueFactory<Stok_obat, String>("satuan"));

        jumlah_stokCol.setCellValueFactory(
                new PropertyValueFactory<Stok_obat, String>("jumlah_stok"));

        tgl_mskCol.setMinWidth(100);
        tgl_mskCol.setCellValueFactory(
                new PropertyValueFactory<Stok_obat, String>("tgl_msk"));

        tgl_klrCol.setMinWidth(100);
        tgl_klrCol.setCellValueFactory(
                new PropertyValueFactory<Stok_obat, String>("tgl_klr"));

        expCol.setMinWidth(100);
        expCol.setCellValueFactory(
                new PropertyValueFactory<Stok_obat, String>("exp"));

        harga1Col.setMinWidth(100);
        harga1Col.setCellValueFactory(
                new PropertyValueFactory<Stok_obat, String>("harga1"));

        harga2Col.setMinWidth(100);
        harga2Col.setCellValueFactory(
                new PropertyValueFactory<Stok_obat, String>("harga2"));

        diskonCol.setMinWidth(100);
        diskonCol.setCellValueFactory(
                new PropertyValueFactory<Stok_obat, String>("diskon"));

        tanggal.setMaxWidth(300);        
        tanggal.getColumns().addAll(tgl_mskCol, tgl_klrCol, expCol);

        harga.setMaxWidth(300);
        harga.getColumns().addAll(harga1Col, harga2Col, diskonCol);

        table.getColumns().addAll(nama_barangCol, no_batchCol, PBFCol, jenisCol, satuanCol, jumlah_stokCol, tanggal,
                harga);

        table.setItems(data);
        grid.add(table, 0, 1);

        Button searchEngine = new Button("Cari");
        searchEngine.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                // CreateView create = new CreateView();
                // create.createForm();
            }
        });
        grid.add(searchEngine, 1, 0);

        Button create = new Button("Tambahkan");
        create.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                CreateView create = new CreateView();
                create.createForm();
            }
        });
        grid.add(create, 0, 2);

        Scene scene = new Scene(grid);
        stage.setTitle("Tabel");
        stage.setScene(scene);
        stage.show();
    }
}
