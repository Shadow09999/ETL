package org.example.database;

import java.sql.Connection;
import java.sql.DatabaseMetaData;

public interface DatabaseMetadataPrinter {
    void print(Connection conn, DatabaseMetaData dmd);
}
