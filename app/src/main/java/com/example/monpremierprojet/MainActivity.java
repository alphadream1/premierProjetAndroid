package com.example.monpremierprojet;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView textViewConsole;
    Button buttonAjouter, buttonAjouterPlusieur, buttonSupprimerDernier;
    EditText editTextNom, editTextPrenom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // indique le fichier xml a charger
        setContentView(R.layout.activity_main);

        //récupere les elements definis dasn le fichiers xml transmis a senContentView
        textViewConsole = findViewById(R.id.textViewConsole);
        textViewConsole.setText("Salut, Tu Vas Bien? \n et Manu TU descend?");

        //clic listener c pour enregistrer un clic sur l'écran et donc intéragir
        buttonAjouter = findViewById(R.id.buttonAjouter);
        buttonAjouterPlusieur = findViewById(R.id.buttonAjouterPlusieur);
        buttonSupprimerDernier = findViewById(R.id.buttonSupprimerDernier);
        editTextNom = findViewById(R.id.editTextNom);
        editTextPrenom = findViewById(R.id.editTextPrenom);

        buttonAjouter.setOnClickListener(this);
        buttonAjouterPlusieur.setOnClickListener(this);
        buttonSupprimerDernier.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == buttonAjouter) {
            String nom = editTextNom.getText().toString();
            String prenom = editTextPrenom.getText().toString();
            String resultat = concatString(nom, prenom);
            textViewConsole.setText(resultat);
        } else if (v == buttonAjouterPlusieur) {
            textViewConsole.setText("Clic buttonAjouterPlusieur ");
        } else if (v == buttonSupprimerDernier) {
            textViewConsole.setText("Clic buttonSupprimerDernier ");
        }
    }

    public String concatString(String nom, String prenom) {
        String resultat = "Nom : " + nom + "\n Prénom : " + prenom;
        if (nom.length() == 0) {
            return "le nom est vide";
        } else if (prenom.length() == 0) {
            return "le prenom est vide";
        } else {
            return resultat;
        }
    }
}


