package com.jordan.pokemons;

import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

@SpringBootApplication
public class PokemonApplication {

	public static void main(String[] args) {
		SpringApplication.run(PokemonApplication.class, args);
		try {
			// create Gson instance
			Gson gson = new Gson();

			// Connection with MySQLDB
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/db_pokemon", "root", "Jordan75");
			Statement st = con.createStatement();

			// create a reader
			Reader reader = Files.newBufferedReader(Paths.get("C:/Users/darkj/Desktop/Clases/PGV/pokemon.json"));

			// convert JSON array to list of users
			List<Pokemon> pokemons = new Gson().fromJson(reader, new TypeToken<List<Pokemon>>() {
			}.getType());

			String reset = "ALTER TABLE db_pokemon.pokemon AUTO_INCREMENT = 1;";
			st.execute(reset);
			String delete = "Delete from db_pokemon.pokemon where idPoke >= 0;";
			st.execute(delete);
			pokemons.forEach((x) -> {
				try {
					// Query MySQLDB
					String query = "INSERT INTO db_pokemon.pokemon(NumPokemon, Name, Type1, HP, Attack, Defense, Sp_attack, Sp_defense, Speed) "
							+ "VALUES (" + x.getId() + ", \"" + x.getName().getEnglish() + "\", \"" + x.getType().get(0)
							+ "\", " + x.getBase().getHp() + ", " + x.getBase().getAttack() + ", "
							+ x.getBase().getDefense() + ", " + x.getBase().getSp_attack() + ", "
							+ x.getBase().getSp_defense() + ", " + x.getBase().getSpeed() + "); ";
					st.execute(query);

					if (x.getType().size() == 2) {
						String query2 = "UPDATE db_pokemon.pokemon set Type2=\"" + x.getType().get(1)
								+ "\" WHERE NumPokemon=" + x.getId() + "; ";
						st.execute(query2);
					}
					// ResultSet rs = st.executeQuery(query);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					System.out.println("Mal");
				}
				// System.out.println(x.getType().size());
				// x.getId() + " - " + x.getBase().getAttack());
			});

			// close connection
			con.close();

			// close reader
			reader.close();

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
