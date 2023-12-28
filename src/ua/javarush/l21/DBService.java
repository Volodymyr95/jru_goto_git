package ua.javarush.l21;

import ua.javarush.l21.exceptions.BadSqlException;

public class DBService {

    public void execute(String sql) throws BadSqlException {
        if (sql.length() < 1) {
            throw new BadSqlException(String.format("Bad query: %s", sql));
        }
    }
}
