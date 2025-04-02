package interfacE.task2;

import interfacE.task2.service.MessageFormatter;
import interfacE.task2.service.serviceImpl.LowerCaseFormatterImpl;
import interfacE.task2.service.serviceImpl.UpperCaseFormatterImpl;

public class Main {
    public static void main(String[] args) {
        MessageFormatter UpperFormat = new UpperCaseFormatterImpl();
        MessageFormatter LowerFormat = new LowerCaseFormatterImpl();
        System.out.println(UpperFormat.formatMessage("SepTemBer"));
        System.out.println(LowerFormat.formatMessage("SepTemBer"));

    }
    }

