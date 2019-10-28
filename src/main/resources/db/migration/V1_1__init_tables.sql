-- utilisateur
insert into utilisateur(nom, pseudo, email, date_naissance, numero_telephone)
values ('frederic', 'fredroo', 'frederic-michel.pereira@softeam.fr', '1984-03-07','0785530885', );


-- themes
insert into theme(theme, nom) values('Nintendo', 'mario');
insert into theme(theme, nom) values('Nintendo', 'mario3');
insert into theme(theme, nom) values('Xbox', 'call of duty');

-- lieux
insert into lieu (nom, longitude, latitude) values ('Chez Softeam', 47.207078, -1.537324);
insert into lieu (nom, longitude, latitude) values ('Au lieu Unique', 47.215515, -1.545832);

-- evenements
insert into evenement(nom, organisateur_id, date_debut, date_fin,statut,lieu_id, theme_id  )
values ('soirée game', 1, '2019-10-28', null, 'EN_CONSTRUCTION',(select id from lieu where nom='Chez Softeam'),(select id from theme where nom='mario' ) );



-- places
insert into place( evenement_id ,type_place, statut,prix )
values( (select id from evenement where nom ='soirée game'), 'PAYANTE', 'LIBRE', 10.5);

insert into place( evenement_id ,type_place, statut,prix )
values( (select id from evenement where nom ='soirée game'), 'PAYANTE', 'PRISE', 11.5);

insert into place( evenement_id ,type_place, statut,prix )
values( (select id from evenement where nom ='soirée game'), 'GRATUITE', 'RESERVE', 0);


-- notation
insert into notation (juge_id, note, evenement_id)
values ((select id from utilisateur where nom='frederic'),8, (select id from evenement where nom ='soirée game'));

insert into notation (juge_id, note, place_id)
values ((select id from utilisateur where nom='frederic'),12, (select id from place where prix =11.5));

