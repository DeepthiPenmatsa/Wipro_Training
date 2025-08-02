package Jdbc_day1;

import java.sql.*;

public class JdbcMovieDemo {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/jdbc1"; // change db name if needed
        String userName = "root";
        String pwd = "Hima@1304";

        try {
            // Load MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("MySQL driver loaded!");
        } catch (ClassNotFoundException e) {
            System.err.println("MySQL driver not found!");
            e.printStackTrace();
            return;
        }

        try (Connection con = DriverManager.getConnection(url, userName, pwd);
             Statement st = con.createStatement()) {

            // Create movies table
            String createTable = "CREATE TABLE IF NOT EXISTS movies (" +
                    "movie_id INT AUTO_INCREMENT PRIMARY KEY, " +
                    "title VARCHAR(255) NOT NULL, " +
                    "genre VARCHAR(50) NOT NULL, " +
                    "rating DECIMAL(3,1) NOT NULL, " +
                    "status VARCHAR(20) NOT NULL, " +
                    "poster_image_url VARCHAR(255) NULL)";
            st.executeUpdate(createTable);
            System.out.println("Table 'movies' created successfully!");

            // Insert Inception
            String insertSQL = "INSERT INTO movies (title, genre, rating, status, poster_image_url) VALUES (?, ?, ?, ?, ?)";
            try (PreparedStatement ps = con.prepareStatement(insertSQL)) {
                ps.setString(1, "Inception");
                ps.setString(2, "Sci-Fi");
                ps.setBigDecimal(3, new java.math.BigDecimal("8.8"));
                ps.setString(4, "Released");
                ps.setString(5, "http://example.com/inception.jpg");
                ps.executeUpdate();
                System.out.println("Movie 'Inception' inserted successfully!");
            }

            // Insert Baahubali
            try (PreparedStatement ps = con.prepareStatement(insertSQL)) {
                ps.setString(1, "Baahubali");
                ps.setString(2, "Action");
                ps.setBigDecimal(3, new java.math.BigDecimal("8.5"));
                ps.setString(4, "Released");
                ps.setString(5, "http://example.com/baahubali.jpg");
                ps.executeUpdate();
                System.out.println("Movie 'Baahubali' inserted successfully!");
            }

            // Insert Kalki 2898 AD
            try (PreparedStatement ps = con.prepareStatement(insertSQL)) {
                ps.setString(1, "Kalki 2898 AD");
                ps.setString(2, "Sci-Fi");
                ps.setBigDecimal(3, new java.math.BigDecimal("8.7"));
                ps.setString(4, "Upcoming");
                ps.setString(5, "http://example.com/kalki.jpg");
                ps.executeUpdate();
                System.out.println("Movie 'Kalki 2898 AD' inserted successfully!");
            }

            // Insert Jurassic World
            try (PreparedStatement ps = con.prepareStatement(insertSQL)) {
                ps.setString(1, "Jurassic World");
                ps.setString(2, "Adventure");
                ps.setBigDecimal(3, new java.math.BigDecimal("7.0"));
                ps.setString(4, "Released");
                ps.setString(5, "http://example.com/jurassicworld.jpg");
                ps.executeUpdate();
                System.out.println("Movie 'Jurassic World' inserted successfully!");
            }

            // Fetch & display all movies
            String query = "SELECT * FROM movies";
            try (ResultSet rs = st.executeQuery(query)) {
                System.out.println("\n--- Movie List ---");
                while (rs.next()) {
                    int id = rs.getInt("movie_id");
                    String title = rs.getString("title");
                    String genre = rs.getString("genre");
                    double rating = rs.getDouble("rating");
                    String status = rs.getString("status");
                    String poster = rs.getString("poster_image_url");

                    System.out.println("ID: " + id + ", Title: " + title + ", Genre: " + genre +
                            ", Rating: " + rating + ", Status: " + status + ", Poster URL: " + poster);
                }
            }

        } catch (SQLException e) {
            System.out.println("Database operation failed!");
            e.printStackTrace();
        }
    }
}
