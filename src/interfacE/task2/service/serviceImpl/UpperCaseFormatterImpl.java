package interfacE.task2.service.serviceImpl;

import interfacE.task2.service.MessageFormatter;

public class UpperCaseFormatterImpl implements MessageFormatter {

    @Override
    public String formatMessage(String message) {
       return message.toUpperCase();
    }
}
