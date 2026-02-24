package crud;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        DbFunctions db = new DbFunctions();
        Connection conn = db.connect_to_db();

//        db.createTable(conn, "employee");
//        db.insert_row(conn, "employee", "davi", "brasil");
//        db.update_name(conn, "employee", "eua", "brasil");
//        db.search_by_name(conn, "employee", "alex");
//        db.search_by_id(conn, "employee", 6);
//        db.search_by_address(conn, "employee", "eua");
//        db.delete_row_by_name(conn, "employee", "davi");
//        db.delete_row_by_id(conn, "employee", 10);
//        db.delete_table(conn, "employee");
//        db.read_data(conn, "employee");
    }
}