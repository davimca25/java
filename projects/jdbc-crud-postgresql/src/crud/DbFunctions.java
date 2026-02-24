package crud;

import java.sql.*;

public class DbFunctions {

    public Connection connect_to_db() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/devdb",
                    "",
                    ""
            );
            System.out.println("Conectado com sucesso.");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }

    public void createTable(Connection conn, String table_name) {
        String query = "CREATE TABLE " + table_name +
                " (empid SERIAL PRIMARY KEY, name VARCHAR(200), address VARCHAR(200))";

        try (Statement stmt = conn.createStatement()) {
            stmt.executeUpdate(query);
            System.out.println("Table created.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void insert_row(Connection conn, String table_name, String name, String address) {
        String query = "INSERT INTO " + table_name + " (name, address) VALUES (?, ?)";

        try (PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setString(1, name);
            ps.setString(2, address);
            ps.executeUpdate();
            System.out.println("Row inserted.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void read_data(Connection conn, String table_name) {
        String query = "SELECT * FROM " + table_name;

        try (Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            while (rs.next()) {
                System.out.print(rs.getInt("empid") + " ");
                System.out.print(rs.getString("name") + " ");
                System.out.println(rs.getString("address"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void update_name(Connection conn, String table_name, String old_name, String new_name) {
        String query = "UPDATE " + table_name + " SET name = ? WHERE name = ?";

        try (PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setString(1, new_name);
            ps.setString(2, old_name);
            ps.executeUpdate();
            System.out.println("Data updated.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void search_by_name(Connection conn, String table_name, String name) {
        String query = "SELECT * FROM " + table_name + " WHERE name = ?";

        try (PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setString(1, name);

            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    System.out.print(rs.getInt("empid") + " ");
                    System.out.print(rs.getString("name") + " ");
                    System.out.println(rs.getString("address"));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void search_by_id(Connection conn, String table_name, int id) {
        String query = "SELECT * FROM " + table_name + " WHERE empid = ?";

        try (PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setInt(1, id);

            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    System.out.print(rs.getInt("empid") + " ");
                    System.out.print(rs.getString("name") + " ");
                    System.out.println(rs.getString("address"));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void search_by_address(Connection conn, String table_name, String address) {
        String query = "SELECT * FROM " + table_name + " WHERE address = ?";

        try (PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setString(1, address);

            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    System.out.print(rs.getInt("empid") + " ");
                    System.out.print(rs.getString("name") + " ");
                    System.out.println(rs.getString("address"));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void delete_row_by_name(Connection conn, String table_name, String name) {
        String query = "DELETE FROM " + table_name + " WHERE name = ?";

        try (PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setString(1, name);
            ps.executeUpdate();
            System.out.println("Row deleted.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void delete_row_by_id(Connection conn, String table_name, int id) {
        String query = "DELETE FROM " + table_name + " WHERE empid = ?";

        try (PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("Row deleted.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void delete_table(Connection conn, String table_name) {
        String query = "DROP TABLE " + table_name;

        try (Statement stmt = conn.createStatement()) {
            stmt.executeUpdate(query);
            System.out.println("Table deleted.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}