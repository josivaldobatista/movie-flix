INSERT INTO tb_user (first_name, email, password) VALUES ('Bob Brown', 'bob@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO tb_user (first_name, email, password) VALUES ('Ana Green', 'ana@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');

INSERT INTO tb_role (authority) VALUES ('ROLE_VISITOR');
INSERT INTO tb_role (authority) VALUES ('ROLE_MEMBER');

INSERT INTO tb_user_role (user_id, role_id) VALUES (1, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (2, 2);

INSERT INTO tb_genre (name) VALUES ("Aventura");
INSERT INTO tb_genre (name) VALUES ("Épico");
INSERT INTO tb_genre (name) VALUES ("Fantasia");
INSERT INTO tb_genre (name) VALUES ("Ação");
INSERT INTO tb_genre (name) VALUES ("Terror");
INSERT INTO tb_genre (name) VALUES ("Comédia");
INSERT INTO tb_genre (name) VALUES ("Drama");
INSERT INTO tb_genre (name) VALUES ("Romance");

INSERT INTO tb_movie (title, subtitle, year, img_url, synopsis, genre, review) VALUES ("Senhor dos Aneis", "A Sociedade do Anel", 2001, "https://upload.wikimedia.org/wikipedia/pt/3/38/Lord_of_the_Rings_Fellowship_of_the_Ring.jpg", "Numa terra fantástica e única, chamada Terra-Média, um hobbit (seres de estatura entre 80 cm e 1,20 m, com pés peludos e bochechas um pouco avermelhadas) recebe de presente de seu tio o Um Anel, um anel mágico e maligno que precisa ser destruído antes que caia nas mãos do mal. Para isso o hobbit Frodo (Elijah Woods) terá um caminho árduo pela frente, onde encontrará perigo, medo e personagens bizarros. Ao seu lado para o cumprimento desta jornada aos poucos ele poderá contar com outros hobbits, um elfo, um anão, dois humanos e um mago, totalizando 9 pessoas que formarão a Sociedade do Anel.", 3, 1);

INSERT INTO tb_review (text, movie) VALUES ("Melhor filme ja feito, 100 estrels de 10 ;D.", 1);