package com.testpro.mdaling.factory.singleton;

import java.util.HashMap;
import java.util.Map;

/**
 * 多列模式
 */

public class Connection {

    private static int MAX = 5;

    private static int index = 1;

    private static Connection connection;

    private Connection() {
    }

    private static Map<Integer, Connection> pool = new HashMap<Integer, Connection>();

    public static Connection getInstance() {
        connection = pool.get(index);
        if (connection == null) {
            synchronized (Connection.class) {
                if (connection == null) {
                    connection = new Connection();
                    pool.put(index, connection);
                }
            }
        }
        index++;
        if (index > MAX) {
            index = 1;
        }
        return connection;
    }

}
