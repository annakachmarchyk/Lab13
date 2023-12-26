package org.example.task2;

public class Main {
    public static void main(String[] args) {
        Database db = new Database();
        Autorization autorization = new Autorization();
        if (autorization.login(db)) {
            ReportBuilder br = new ReportBuilder(db);
        }
    }
}
