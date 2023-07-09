package com.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import java.util.Arrays;

public class Main {
    
    public static void main(String[] args) {
        try {
            BufferedReader buf = new BufferedReader(new FileReader("CoronaWarnAppDaten.csv"));
            Connection conn = DriverManager.getConnection(System.getenv("POSTGRES_URL"), System.getenv("DB_USERNAME"), System.getenv("DB_PASSWORD"));

            Statement createTable = conn.createStatement();
            String[] columns = buf.readLine().substring(17).split(","); //cut of the updated_time and slice to get all column names
            String[] columnsWithOutDate = Arrays.copyOfRange(columns, 1, columns.length); //when creating the table we are creating the date column separately but when filling the table we are not
            String tableName = "CvdDataModel";
            createTable.executeUpdate(sqlCreateTable(columnsWithOutDate, tableName));
            createTable.close();

            Statement insertData = conn.createStatement();
            String line;
            while((line = buf.readLine())!=null) insertData.executeUpdate(sqlInsertData(line, columns, tableName));
            insertData.close();
            System.out.println("finished");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    public static String sqlCreateTable(String[] columns, String tableName) throws IOException {

        String sqlCreateTable = "CREATE TABLE IF NOT EXISTS "+tableName+"(id serial, effective_date date, ";

        for(String name : columns) sqlCreateTable += name+" VARCHAR(25) not NULL DEFAULT '0',";
        sqlCreateTable = sqlCreateTable.substring(0, sqlCreateTable.length()-1)+");"; //lösche das letzte Komma und schließe das Statement

        return sqlCreateTable;
    }

    public static String sqlInsertData(String line, String[] columns, String tableName){
        String[] values = line.substring(26).split(",");
        String[] allValues = new String[columns.length];

        for(int i = 0; i<columns.length; i++) {
            try {
                allValues[i] = values[i];
                if (values[i].equals("")) allValues[i] = "0";
            } catch (IndexOutOfBoundsException e) {
                allValues[i] = "0";
            }
        }

        String sqlInsertData = "INSERT INTO "+tableName+"(";
        for(String name : columns) sqlInsertData += name+", ";
        sqlInsertData = sqlInsertData.substring(0, sqlInsertData.length()-2)+") VALUES(";
        for(String value : allValues) sqlInsertData += "'"+value+"',";
        sqlInsertData = sqlInsertData.substring(0, sqlInsertData.length()-1) + ");";

        return sqlInsertData;
    }

}