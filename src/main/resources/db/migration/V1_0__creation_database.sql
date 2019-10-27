
CREATE TABLE utilisateur (
    id   INT AUTO_INCREMENT PRIMARY KEY,
    nom varchar(255),
    pseudo varchar(255),
    email varchar(255),
    date_naissance date,
    numero_telephone varchar(255),
    description text
);

CREATE TABLE holding (
    id   INT AUTO_INCREMENT PRIMARY KEY,
    nom varchar(255),
    description text
);

CREATE TABLE lieu (
    id   INT AUTO_INCREMENT PRIMARY KEY,
    nom varchar(255),
    latitude double,
    longitude double
);

CREATE TABLE theme (
    id   INT AUTO_INCREMENT PRIMARY KEY,
    nom varchar(255),
    theme varchar(255),
    image varchar(255)
);

CREATE TABLE evenement (
    id   INT AUTO_INCREMENT PRIMARY KEY,
    nom varchar(255),
    organisateur_id int,
    date_debut date,
    date_fin date,
    statut varchar(255),
    description text,
    lieu_id int,
    holding_id int,
    theme_id int,
    FOREIGN KEY (organisateur_id   ) REFERENCES utilisateur(id),
	FOREIGN KEY (lieu_id   ) REFERENCES lieu(id),
	FOREIGN KEY (holding_id   ) REFERENCES holding(id),
	FOREIGN KEY (theme_id   ) REFERENCES theme(id),
);


CREATE TABLE place(
    id   INT AUTO_INCREMENT PRIMARY KEY,
    evenement_id int,
    utilisateur_id int,
    type_place varchar(255),
    statut varchar(255),
    motif_refus varchar(255),
    prix double,
 FOREIGN KEY (evenement_id ) REFERENCES evenement(id),
 FOREIGN KEY (utilisateur_id) REFERENCES utilisateur(id)
);

CREATE TABLE notation(
    id   INT AUTO_INCREMENT PRIMARY KEY,
    juge_id int,
    place_id int,
    evenement_id int,
    prix double,
 FOREIGN KEY (evenement_id ) REFERENCES evenement(id),
 FOREIGN KEY (place_id ) REFERENCES place(id),
 FOREIGN KEY (juge_id ) REFERENCES utilisateur(id)
);



