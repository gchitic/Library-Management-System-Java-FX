package com.example.biblioteca;

import com.example.biblioteca.*;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.Pane;
import javafx.util.Duration;

import javax.swing.*;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;

public class HomeController {

    //panels
    @FXML
    private Pane form1WelcomePane;
    @FXML
    private Pane form2AddBook;
    @FXML
    private Pane form3ShowBook;
    @FXML
    private Pane form4AddReader;
    @FXML
    private Pane form5ShowReader;
    @FXML
    private Pane form6AddInchiriere;
    @FXML
    private Pane form7ShowInchiriere;
    @FXML
    private Pane form8AddReturnare;
    @FXML
    private Pane form9ShowReturnare;


    //menu
    @FXML
    private MenuItem menuFile_acasa;
    @FXML
    private MenuItem menuFile_EXIT;
    @FXML
    private MenuItem menuCarti_add;
    @FXML
    private MenuItem menuCarti_show;
    @FXML
    private MenuItem menuCititori_add;
    @FXML
    private MenuItem menuCititori_show;
    @FXML
    private MenuItem menuImprumuta_add;
    @FXML
    private MenuItem menuImprumuta_show;
    @FXML
    private MenuItem menuReturnare_add;
    @FXML
    private MenuItem menuReturn_show;



    //navigarea intre pagini
    @FXML
    protected void onMenuFile_acasaClick() {
        //deschiderea paginii HOME
        form1WelcomePane.setVisible(true);
        form2AddBook.setVisible(false);
        form3ShowBook.setVisible(false);
        form4AddReader.setVisible(false);
        form5ShowReader.setVisible(false);
        form6AddInchiriere.setVisible(false);
        form7ShowInchiriere.setVisible(false);
        form8AddReturnare.setVisible(false);
        form9ShowReturnare.setVisible(false);
    }
    @FXML
    protected void onMenuFile_EXITclick() {
        System.exit(0);
    }
    @FXML
    protected void onMenuCarti_addClick() {
        //deschiderea paginii ADD BOOK
        form2AddBook.setVisible(true);
        form1WelcomePane.setVisible(false);
        form3ShowBook.setVisible(false);
        form4AddReader.setVisible(false);
        form5ShowReader.setVisible(false);
        form6AddInchiriere.setVisible(false);
        form7ShowInchiriere.setVisible(false);
        form8AddReturnare.setVisible(false);
        form9ShowReturnare.setVisible(false);
    }
    @FXML
    protected void onMenuCarti_showClick() {
        //deschiderea paginii SHOW BOOK
        form3ShowBook.setVisible(true);
        form1WelcomePane.setVisible(false);
        form2AddBook.setVisible(false);
        form4AddReader.setVisible(false);
        form5ShowReader.setVisible(false);
        form6AddInchiriere.setVisible(false);
        form7ShowInchiriere.setVisible(false);
        form8AddReturnare.setVisible(false);
        form9ShowReturnare.setVisible(false);
    }
    @FXML
    protected void onMenuCititori_addClick() {
        //deschiderea paginii ADD READER
        form4AddReader.setVisible(true);
        form1WelcomePane.setVisible(false);
        form2AddBook.setVisible(false);
        form3ShowBook.setVisible(false);
        form5ShowReader.setVisible(false);
        form6AddInchiriere.setVisible(false);
        form7ShowInchiriere.setVisible(false);
        form8AddReturnare.setVisible(false);
        form9ShowReturnare.setVisible(false);
    }
    @FXML
    protected void onMenuCititori_showClick() {
        //deschiderea paginii SHOW READER
        form5ShowReader.setVisible(true);
        form2AddBook.setVisible(false);
        form1WelcomePane.setVisible(false);
        form3ShowBook.setVisible(false);
        form4AddReader.setVisible(false);
        form6AddInchiriere.setVisible(false);
        form7ShowInchiriere.setVisible(false);
        form8AddReturnare.setVisible(false);
        form9ShowReturnare.setVisible(false);
    }
    @FXML
    protected void onMenuImprumuta_addClick() {
        //deschiderea paginii ADD IMPRUMUT
        form6AddInchiriere.setVisible(true);
        form1WelcomePane.setVisible(false);
        form2AddBook.setVisible(false);
        form3ShowBook.setVisible(false);
        form4AddReader.setVisible(false);
        form5ShowReader.setVisible(false);
        form7ShowInchiriere.setVisible(false);
        form8AddReturnare.setVisible(false);
        form9ShowReturnare.setVisible(false);
    }
    @FXML
    protected void onMenuImprumuta_showClick() {
        //deschiderea paginii SHOW IMPRUMUT
        form7ShowInchiriere.setVisible(true);
        form1WelcomePane.setVisible(false);
        form2AddBook.setVisible(false);
        form3ShowBook.setVisible(false);
        form4AddReader.setVisible(false);
        form5ShowReader.setVisible(false);
        form6AddInchiriere.setVisible(false);
        form8AddReturnare.setVisible(false);
        form9ShowReturnare.setVisible(false);
    }
    @FXML
    protected void onMenuReturnare_addClick() {
        //deschiderea paginii ADD RETURN
        form8AddReturnare.setVisible(true);
        form1WelcomePane.setVisible(false);
        form2AddBook.setVisible(false);
        form3ShowBook.setVisible(false);
        form4AddReader.setVisible(false);
        form5ShowReader.setVisible(false);
        form6AddInchiriere.setVisible(false);
        form7ShowInchiriere.setVisible(false);
        form9ShowReturnare.setVisible(false);
    }
    @FXML
    protected void onMenuReturn_showClick() {
        //deschiderea paginii SHOW RETURN
        form9ShowReturnare.setVisible(true);
        form1WelcomePane.setVisible(true);
        form2AddBook.setVisible(false);
        form3ShowBook.setVisible(false);
        form4AddReader.setVisible(false);
        form5ShowReader.setVisible(false);
        form6AddInchiriere.setVisible(false);
        form7ShowInchiriere.setVisible(false);
        form8AddReturnare.setVisible(false);
    }

    //butoanele pentru scurtaturi
    @FXML
    protected void onButtonAddBookClick() {
        //deschiderea paginii ADD BOOK
        form2AddBook.setVisible(true);
        form1WelcomePane.setVisible(false);
        form3ShowBook.setVisible(false);
        form4AddReader.setVisible(false);
        form5ShowReader.setVisible(false);
        form6AddInchiriere.setVisible(false);
        form7ShowInchiriere.setVisible(false);
        form8AddReturnare.setVisible(false);
        form9ShowReturnare.setVisible(false);
    }
    @FXML
    protected void onButtonAddReaderClick() {
        //deschiderea paginii ADD READER
        form4AddReader.setVisible(true);
        form1WelcomePane.setVisible(false);
        form2AddBook.setVisible(false);
        form3ShowBook.setVisible(false);
        form5ShowReader.setVisible(false);
        form6AddInchiriere.setVisible(false);
        form7ShowInchiriere.setVisible(false);
        form8AddReturnare.setVisible(false);
        form9ShowReturnare.setVisible(false);
    }
    @FXML
    protected void onButtonImprumutaCarteClick() {
        //deschiderea paginii ADD IMPRUMUT
        form6AddInchiriere.setVisible(true);
        form1WelcomePane.setVisible(false);
        form2AddBook.setVisible(false);
        form3ShowBook.setVisible(false);
        form4AddReader.setVisible(false);
        form5ShowReader.setVisible(false);
        form7ShowInchiriere.setVisible(false);
        form8AddReturnare.setVisible(false);
        form9ShowReturnare.setVisible(false);
    }
    @FXML
    protected void onButtonReturneazaCarteClick() {
        //deschiderea paginii ADD RETURN
        form8AddReturnare.setVisible(true);
        form1WelcomePane.setVisible(false);
        form2AddBook.setVisible(false);
        form3ShowBook.setVisible(false);
        form4AddReader.setVisible(false);
        form5ShowReader.setVisible(false);
        form6AddInchiriere.setVisible(false);
        form7ShowInchiriere.setVisible(false);
        form9ShowReturnare.setVisible(false);
    }




    // Metodă pentru afișarea alertelor
    private void showAlert(String title, String message, Alert.AlertType alertType) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setContentText(message);
        alert.showAndWait();
    }

    //Metoda se setare a orei si datii in footer
    @FXML
    private Label lblOra, lblData;

    private void setTime() {
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        // Timeline pentru actualizarea timpului și datei
        Timeline timeline = new Timeline(
                new KeyFrame(
                        Duration.seconds(1),
                        event -> {
                            LocalDateTime now = LocalDateTime.now();
                            lblOra.setText("Ora: " + now.format(timeFormatter));
                            lblData.setText("Data: " + now.format(dateFormatter));
                        }
                )
        );

        // Repetare infinită
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play();
    }

    @FXML
    public void initialize() {
        //Setarea timpului
        setTime();

        // Configurează coloanele
        //book
        colID.setCellValueFactory(new PropertyValueFactory<>("id_carte"));
        colDenumire.setCellValueFactory(new PropertyValueFactory<>("denumire"));
        colAutor.setCellValueFactory(new PropertyValueFactory<>("autor"));
        colEditura.setCellValueFactory(new PropertyValueFactory<>("editura"));
        colDomeniul.setCellValueFactory(new PropertyValueFactory<>("domeniul"));
        colAn.setCellValueFactory(new PropertyValueFactory<>("an_aparitie"));
        //reader
        colID_cit.setCellValueFactory(new PropertyValueFactory<>("id_cititor"));
        colNume.setCellValueFactory(new PropertyValueFactory<>("nume"));
        colPrenume.setCellValueFactory(new PropertyValueFactory<>("prenume"));
        colTel.setCellValueFactory(new PropertyValueFactory<>("nr_tel"));
        colAdresa.setCellValueFactory(new PropertyValueFactory<>("adresa"));
        //inchirieri
        colID_inchiriere.setCellValueFactory(new PropertyValueFactory<>("id_inchiriere"));
        col_idCarte_inchiriere.setCellValueFactory(new PropertyValueFactory<>("carte_id"));
        col_idCititor_inchiriere.setCellValueFactory(new PropertyValueFactory<>("cititor_id"));
        colDataInchiriere_inchiriere.setCellValueFactory(new PropertyValueFactory<>("data_inchiriere"));
        colDataEstimReturn_inchiriere.setCellValueFactory(new PropertyValueFactory<>("data_estim_return"));
        colCarte_inchiriere.setCellValueFactory(new PropertyValueFactory<>("carte"));
        colCititor_inchiriere.setCellValueFactory(new PropertyValueFactory<>("cititor"));
        colTel_inchiriere.setCellValueFactory(new PropertyValueFactory<>("nr_tel"));
        colAdresa_inchiriere.setCellValueFactory(new PropertyValueFactory<>("adresa"));
        //returnari
        col_show_IdReturn.setCellValueFactory(new PropertyValueFactory<>("id_returnare"));
        col_show_IdInchiriere.setCellValueFactory(new PropertyValueFactory<>("inchiriere_id"));
        col_show_DataReturn.setCellValueFactory(new PropertyValueFactory<>("data_return"));
        col_show_IdCarte.setCellValueFactory(new PropertyValueFactory<>("carte_id"));
        col_show_Carte.setCellValueFactory(new PropertyValueFactory<>("carte"));
        col_show_IdCitittor.setCellValueFactory(new PropertyValueFactory<>("cititor_id"));
        col_show_Cititor.setCellValueFactory(new PropertyValueFactory<>("cititor"));
        col_show_Tel.setCellValueFactory(new PropertyValueFactory<>("nr_tel"));
        col_show_Adresa.setCellValueFactory(new PropertyValueFactory<>("adresa"));
        col_show_DataInchiriere.setCellValueFactory(new PropertyValueFactory<>("data_inchiriere"));
        col_show_DataEstReturn.setCellValueFactory(new PropertyValueFactory<>("data_estim_return"));

        // Încarcă datele în tabel
        loadBook();
        loadReader();
        loadInchiriere();
        loadReturnare();



        //Selectia din tabel
        //book
        bookTable.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue != null) {
                // Completează câmpurile de text cu datele din rândul selectat
                show_denumireField.setText(newValue.getDenumire());
                show_autorField.setText(newValue.getAutor());
                show_edituraField.setText(newValue.getEditura());
                show_domeniuField.setText(newValue.getDomeniul());
                show_anField.setText(String.valueOf(newValue.getAn_aparitie()));
            }
        });
        //reader
        readerTable.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue != null) {
                show_numeField.setText(newValue.getNume());
                show_prenumeField.setText(newValue.getPrenume());
                show_telField.setText(newValue.getNr_tel());
                show_adresaField.setText(newValue.getAdresa());
            }
        });
        //inchiriere
        inchiriereTable.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue != null) {
                show_idCarte_inchiriere.setText(String.valueOf(newValue.getCarte_id()));
                show_idCititor_inchiriere.setText(String.valueOf(newValue.getCititor_id()));

                LocalDate dataInchiriere = null;
                LocalDate dataEstimReturn = null;
                dataInchiriere = ((java.sql.Date) newValue.getData_inchiriere()).toLocalDate();
                dataEstimReturn = ((java.sql.Date) newValue.getData_estim_return()).toLocalDate();

                show_dataInchiriere_inchiriere.setValue(dataInchiriere);
                show_dataEstimReturn_inchiriere.setValue(dataEstimReturn);

            }
        });
        //returnare
        returnareTable.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue != null) {
                show_idInchiriere_returnField.setText(String.valueOf(newValue.getInchiriere_id()));
                show_idCititor_inchiriere.setText(String.valueOf(newValue.getCititor_id()));

                LocalDate dataInchiriere = null;
                LocalDate dataEstimReturn = null;
                LocalDate dataReturn = null;
                dataInchiriere = ((java.sql.Date) newValue.getData_inchiriere()).toLocalDate();
                dataEstimReturn = ((java.sql.Date) newValue.getData_estim_return()).toLocalDate();
                dataReturn = ((java.sql.Date) newValue.getData_return()).toLocalDate();

                show_dataInchiriere_returnField.setValue(dataInchiriere);
                show_dataEstimareReturn_returnField.setValue(dataEstimReturn);
                show_dataReturn_returnField.setValue(dataReturn);

            }
        });
    }




    //BOOK - functionality
    private CarteDAO carteDAO = new CarteDAO();

    //ADD BOOK - functionality
    @FXML
    private Button carte_btnAdauga, carte_btnAnuleaza;
    @FXML
    private TextField denumireField, autorField, edituraField, domeniuField, anField;

    @FXML
    protected void onCarte_btnAdaugaClick() {
        //adaugarea in baza de date
        try {
            String denumire = denumireField.getText().trim();
            String autor = autorField.getText().trim();
            String editura = edituraField.getText().trim();
            String domeniu = domeniuField.getText().trim();
            int an = Integer.parseInt(anField.getText().trim());

            Carte carte = new Carte(denumire, autor, editura, domeniu, an);
            boolean success = carteDAO.addCarte(carte);

            if (success) {
                // Afișează mesajul de succes
                showAlert("Succes", "Carte înregistrată cu succes!", Alert.AlertType.INFORMATION);

                // Resetează câmpurile formularului
                denumireField.setText("");
                autorField.setText("");
                edituraField.setText("");
                domeniuField.setText("");
                anField.setText("");

                loadBook();
            } else {
                showAlert("Eroare", "Eroare la înregistrarea cărții!", Alert.AlertType.ERROR);
            }
        } catch (Exception e) {
            showAlert("Eroare", "A aparut o eroare!", Alert.AlertType.ERROR);
            e.printStackTrace();
        }
    }
    @FXML
    protected void onCarte_btnAnuleazaClick() {
        //stergerea campurilor
        denumireField.setText("");
        autorField.setText("");
        edituraField.setText("");
        domeniuField.setText("");
        anField.setText("");
    }


    //SHOW BOOK - functionality
    @FXML
    private Button carte_btnActualizeaza, carte_btnSterge;
    @FXML
    private TextField show_denumireField, show_autorField, show_edituraField, show_domeniuField, show_anField;

    @FXML
    private TableView<Carte> bookTable;
    @FXML
    private TableColumn<Carte, Integer> colID, colAn;
    @FXML
    private TableColumn<Carte, String> colDenumire, colAutor, colEditura, colDomeniul;


    //incarcarea cartilor si afisarea lor in tab
    private void loadBook() {
        try {
            // Obține lista de cărți din baza de date
            List<Carte> carti = carteDAO.showBooks();

            ObservableList<Carte> data = FXCollections.observableArrayList(carti);

            // Setează datele în tabel
            bookTable.setItems(data);
        } catch (Exception e) {
            e.printStackTrace();
            showAlert("Eroare", "A apărut o eroare la încărcarea datelor: "+ e.getMessage(), Alert.AlertType.ERROR);
        }
    }

    //actualizare carte
    @FXML
    private void onCarte_btnActualizeazaClick() {
        // Obține cartea selectată din tabel
        Carte selectedCarte = bookTable.getSelectionModel().getSelectedItem();

        if (selectedCarte != null) {
            // Preia datele din câmpurile de text
            String denumire = show_denumireField.getText().trim();
            String autor = show_autorField.getText().trim();
            String editura = show_edituraField.getText().trim();
            String domeniu = show_domeniuField.getText().trim();
            int an = Integer.parseInt(show_anField.getText().trim());

            Carte updatedBook = new Carte(selectedCarte.getId_carte(), denumire, autor, editura, domeniu, an);
            carteDAO.updateBooks(updatedBook);

            // Afișează mesajul de succes
            showAlert("Succes", "Carte modificată cu succes! ", Alert.AlertType.INFORMATION);

            // Resetează câmpurile de text
            show_denumireField.setText("");
            show_autorField.setText("");
            show_edituraField.setText("");
            show_domeniuField.setText("");
            show_anField.setText("");

            loadBook();
        } else {
            showAlert("Eroare", "Selectați o carte pentru a o actualiza!", Alert.AlertType.ERROR);
        }
    }

    @FXML
    private void onCarte_btnStergeClick() {
        // Obține cartea selectată din tabel
        Carte selectedCarte = bookTable.getSelectionModel().getSelectedItem();

        if (selectedCarte != null) {
            // Confirmă ștergerea cărții
            Alert confirmationAlert = new Alert(Alert.AlertType.CONFIRMATION);
            confirmationAlert.setTitle("Confirmare ștergere");
            confirmationAlert.setContentText("Sigur doriți să ștergeți cartea: " + selectedCarte.getDenumire() + "?");

            confirmationAlert.showAndWait().ifPresent(response -> {
                if (response == ButtonType.OK) {
                    carteDAO.deleteBook(selectedCarte.getId_carte());

                    // Resetează câmpurile de text
                    show_denumireField.setText("");
                    show_autorField.setText("");
                    show_edituraField.setText("");
                    show_domeniuField.setText("");
                    show_anField.setText("");

                    showAlert("Succes", "Carte ștearsă cu succes!", Alert.AlertType.INFORMATION);
                    loadBook();
                }
            });
        } else {
            showAlert("Atenție", "Selectați o carte pentru a o șterge!", Alert.AlertType.WARNING);
        }
    }





    //Reader - functionality
    CititorDAO cititorDAO = new CititorDAO();

    //ADD READER
    @FXML
    private Button cititor_btnAdauga, cititor_btnAnuleaza;
    @FXML
    private TextField numeField, prenumeField, telField, adresaField;

    @FXML
    protected void onCititor_btnAdaugaClick() {
        //adaugarea in baza de date
        try {
            String nume = numeField.getText().trim();
            String prenume = prenumeField.getText().trim();
            String tel = telField.getText().trim();
            String adresa = adresaField.getText().trim();

            Cititor cititor = new Cititor(nume, prenume, tel, adresa);
            boolean success = cititorDAO.addCititor(cititor);

            if (success) {
                // Afișează mesajul de succes
                showAlert("Succes", "Cititor înregistrat cu succes!", Alert.AlertType.INFORMATION);

                // Resetează câmpurile formularului
                numeField.setText("");
                prenumeField.setText("");
                telField.setText("");
                adresaField.setText("");

                loadReader();
            } else {
                showAlert("Eroare", "Eroare la înregistrarea cititorului!", Alert.AlertType.ERROR);
            }
        } catch (Exception e) {
            showAlert("Eroare", "A aparut o eroare!", Alert.AlertType.ERROR);
            e.printStackTrace();
        }
    }
    @FXML
    protected void onCititor_btnAnuleazaClick() {
        //stergerea campurilor
        numeField.setText("");
        prenumeField.setText("");
        telField.setText("");
        adresaField.setText("");
    }

    //SHOW READER
    @FXML
    private Button citit_btnActualizeaza, citit_btnSterge;
    @FXML
    private TextField show_numeField, show_prenumeField, show_telField, show_adresaField;

    @FXML
    private TableView<Cititor> readerTable;
    @FXML
    private TableColumn<Cititor, Integer> colID_cit;
    @FXML
    private TableColumn<Cititor, String> colNume, colPrenume, colTel, colAdresa;

    //incarcarea cititorilor si afisarea lor in tab
    private void loadReader() {
        try {
            List<Cititor> citiori = cititorDAO.showReaders();
            ObservableList<Cititor> data = FXCollections.observableArrayList(citiori);
            readerTable.setItems(data);
        } catch (Exception e) {
            e.printStackTrace();
            showAlert("Eroare", "A apărut o eroare la încărcarea datelor: "+ e.getMessage(), Alert.AlertType.ERROR);
        }
    }

    //actualizare cititor
    @FXML
    private void onCitit_btnActualizeazaClick() {
        // Obține cartea selectată din tabel
        Cititor selectedCititor = readerTable.getSelectionModel().getSelectedItem();

        if (selectedCititor != null) {
            // Preia datele din câmpurile de text
            String nume = show_numeField.getText().trim();
            String prenume = show_prenumeField.getText().trim();
            String tel = show_telField.getText().trim();
            String adresa = show_adresaField.getText().trim();

            Cititor updatedReader = new Cititor(selectedCititor.getId_cititor(), nume, prenume, tel, adresa);
            cititorDAO.updateReader(updatedReader);

            // Afișează mesajul de succes
            showAlert("Succes", "Cititor modificat cu succes! ", Alert.AlertType.INFORMATION);

            // Resetează câmpurile de text
            show_numeField.setText("");
            show_prenumeField.setText("");
            show_telField.setText("");
            show_adresaField.setText("");

            loadReader();
        } else {
            showAlert("Eroare", "Selectați un cititor pentru al actualiza!", Alert.AlertType.ERROR);
        }
    }

    @FXML
    private void onCititor_btnStergeClick() {
        Cititor selectedCititor = readerTable.getSelectionModel().getSelectedItem();

        if (selectedCititor != null) {
            Alert confirmationAlert = new Alert(Alert.AlertType.CONFIRMATION);
            confirmationAlert.setTitle("Confirmare ștergere");
            confirmationAlert.setContentText("Sigur doriți să ștergeți cititorul: " + selectedCititor.getNume() + "?");

            confirmationAlert.showAndWait().ifPresent(response -> {
                if (response == ButtonType.OK) {
                    cititorDAO.deleteReader(selectedCititor.getId_cititor());

                    // Resetează câmpurile de text
                    show_numeField.setText("");
                    show_prenumeField.setText("");
                    show_telField.setText("");
                    show_adresaField.setText("");

                    showAlert("Succes", "Cititor ștears cu succes!", Alert.AlertType.INFORMATION);
                    loadReader();
                }
            });
        } else {
            showAlert("Atenție", "Selectați un cititor pentru al șterge!", Alert.AlertType.WARNING);
        }
    }




    //INCHIRIERE - functionality
    InchiriereDAO inchiriereDAO = new InchiriereDAO();

    //ADD INCHIRIERE
    @FXML
    private TextField idCarteField, idCititorField;
    @FXML
    private DatePicker dataInchiriereField, dataEstimReturnField;

    @FXML
    private Button inchiriere_btnAnuleaza, inchiriere_btnInchiriaza;

    @FXML
    protected void onInchiriere_btnInchiriazaClick() {
        //adaugarea in baza de date
        try {

            int id_carte = Integer.parseInt(idCarteField.getText().trim());
            int id_cititor = Integer.parseInt(idCititorField.getText().trim());
            LocalDate dateInchiriere = dataInchiriereField.getValue();
            LocalDate dateEstReturnare = dataEstimReturnField.getValue();

            // Conversia LocalDate -> java.util.Date
            Date utilDateInchiriere = java.sql.Date.valueOf(dateInchiriere);
            Date utilDateEstReturnare = java.sql.Date.valueOf(dateEstReturnare);

            Inchiriere inchiriere = new Inchiriere(id_carte, id_cititor, utilDateInchiriere, utilDateEstReturnare);
            boolean success = inchiriereDAO.addInchiriere(inchiriere);

            if (success) {
                // Afișează mesajul de succes
                showAlert("Succes", "Inregistrat cu succes!", Alert.AlertType.INFORMATION);

                // Resetează câmpurile formularului
                idCarteField.setText("");
                idCititorField.setText("");
                dataInchiriereField.setValue(null);
                dataEstimReturnField.setValue(null);

                loadInchiriere();
            } else {
                showAlert("Eroare", "Eroare la înregistrarea!", Alert.AlertType.ERROR);
            }
        } catch (Exception e) {
            showAlert("Eroare", "A aparut o eroare!", Alert.AlertType.ERROR);
            e.printStackTrace();
        }
    }
    @FXML
    protected void onInchiriere_btnAnuleazaClick() {
        //stergerea campurilor
        idCarteField.setText("");
        idCititorField.setText("");
        dataInchiriereField.setValue(null);
        dataEstimReturnField.setValue(null);
    }

    //SHOW INCHIRIERE
    @FXML
    private TextField show_idCarte_inchiriere, show_idCititor_inchiriere;
    @FXML
    private DatePicker show_dataInchiriere_inchiriere,show_dataEstimReturn_inchiriere;
    @FXML
    private TableView<Inchiriere> inchiriereTable;
    @FXML
    private TableColumn<Inchiriere, Integer> colID_inchiriere, col_idCarte_inchiriere, col_idCititor_inchiriere;
    @FXML
    private TableColumn<Inchiriere, String>  colCarte_inchiriere, colCititor_inchiriere, colTel_inchiriere, colAdresa_inchiriere;
    @FXML
    private TableColumn<Inchiriere, Date> colDataInchiriere_inchiriere, colDataEstimReturn_inchiriere;

    private void loadInchiriere() {
        try {
            List<Inchiriere> inchirieri = inchiriereDAO.showinchirieri();
            ObservableList<Inchiriere> data = FXCollections.observableArrayList(inchirieri);
            inchiriereTable.setItems(data);
        } catch (Exception e) {
            e.printStackTrace();
            showAlert("Eroare", "A apărut o eroare la încărcarea datelor: "+ e.getMessage(), Alert.AlertType.ERROR);
        }
    }



    //RETURNARE
    ReturnareDAO returnareDAO = new ReturnareDAO();
    //ADD RETURN
    @FXML
    private TextField id_inchiriere_returnField;
    @FXML
    private DatePicker dataReturnField;
    @FXML
    private Button return_btnAnuleaza, return_btnReturneaza;

    @FXML
    protected void onReturn_btnReturneazaClick() {
        //adaugarea in baza de date
        try {

            int id_inchiriere = Integer.parseInt(id_inchiriere_returnField.getText().trim());
            LocalDate dateReturnare = dataReturnField.getValue();

            // Conversia LocalDate -> java.util.Date
            Date utilDateReturnare = java.sql.Date.valueOf(dateReturnare);

            Returnare returnare = new Returnare(id_inchiriere, utilDateReturnare);
            boolean success = returnareDAO.addReturnare(returnare);

            if (success) {
                // Afișează mesajul de succes
                showAlert("Succes", "Returnare cu succes!", Alert.AlertType.INFORMATION);

                // Resetează câmpurile formularului
                id_inchiriere_returnField.setText("");
                dataReturnField.setValue(null);

                loadReturnare();
            } else {
                showAlert("Eroare", "Eroare la returnare!", Alert.AlertType.ERROR);
            }
        } catch (Exception e) {
            showAlert("Eroare", "A aparut o eroare!", Alert.AlertType.ERROR);
            e.printStackTrace();
        }
    }
    @FXML
    protected void onReturn_btnAnuleazaClick() {
        //stergerea campurilor
        id_inchiriere_returnField.setText("");
        dataReturnField.setValue(null);
    }


    //SHOW RETURNARE
    @FXML
    private TextField show_idInchiriere_returnField;
    @FXML
    private DatePicker show_dataInchiriere_returnField, show_dataEstimareReturn_returnField, show_dataReturn_returnField;
    @FXML
    private TableView<Returnare> returnareTable;
    @FXML
    private TableColumn<Returnare, Integer> col_show_IdReturn, col_show_IdInchiriere, col_show_IdCarte, col_show_IdCitittor;
    @FXML
    private TableColumn<Returnare, String> col_show_Carte,  col_show_Cititor, col_show_Tel, col_show_Adresa;
    @FXML
    private TableColumn<Returnare, Date> col_show_DataInchiriere, col_show_DataEstReturn, col_show_DataReturn;

    private void loadReturnare() {
        try {
            List<Returnare> returnari = returnareDAO.showReturnari();
            ObservableList<Returnare> data = FXCollections.observableArrayList(returnari);
            returnareTable.setItems(data);
        } catch (Exception e) {
            e.printStackTrace();
            showAlert("Eroare", "A apărut o eroare la încărcarea datelor: "+ e.getMessage(), Alert.AlertType.ERROR);
        }
    }

}