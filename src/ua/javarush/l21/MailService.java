package ua.javarush.l21;

import ua.javarush.l21.exceptions.BadSqlException;
import ua.javarush.l21.exceptions.ReceiverIsEmptyException;

public class MailService {

    public void sendMessage(String to, String body)  {
        DBService dbService = new DBService();
        if (to.isEmpty()) {
            throw new ReceiverIsEmptyException("To cannot be empty!");
        }
        try {
            dbService.execute("csndcnsj");
        } catch (BadSqlException e) {

        }
    }

}
