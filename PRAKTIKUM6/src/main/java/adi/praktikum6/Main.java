package adi.praktikum6;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage panggungUtama) {

        TableView<Mahasiswa> tabelMahasiswa = new TableView<>();

        TableColumn<Mahasiswa, String> kolomNIM = new TableColumn<>("NIM");
        kolomNIM.setCellValueFactory(new PropertyValueFactory<>("nim"));

        TableColumn<Mahasiswa, String> kolomNama = new TableColumn<>("Nama");
        kolomNama.setCellValueFactory(new PropertyValueFactory<>("Nama"));

        tabelMahasiswa.getColumns().addAll(kolomNIM, kolomNama);

        tabelMahasiswa.getItems().addAll(
                new Mahasiswa(1, "M. Adi Syahputra", "2210817210017"),
                new Mahasiswa(2, "Nadhif Basalamah", "2210817210018"),
                new Mahasiswa(3, "Donne Maula", "2210817210019"),
                new Mahasiswa(4, "Vierra", "2210817210020"),
                new Mahasiswa(5, "James Arthur", "2210817210021"),
                new Mahasiswa(6, "Coyote Theory", "2210817210022"),
                new Mahasiswa(7, "Keane", "2210817210023"),
                new Mahasiswa(8, "Conan Grey", "2210817210024"),
                new Mahasiswa(9, "D4vd", "2210817210025"),
                new Mahasiswa(10, "Coldplay", "2210817210026")
        );

        VBox vbox = new VBox(tabelMahasiswa);

        Scene scene = new Scene(vbox);
        panggungUtama.setScene(scene);

        panggungUtama.show();
    }
}
