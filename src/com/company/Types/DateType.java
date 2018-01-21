package com.company.Types;

import java.util.Scanner;

public class DateType implements Type {
    private String[] values = new String[3];

    @Override
    public String askUser(String question) {
        Scanner in = new Scanner(System.in);
        System.out.println("##### " + question + " #####");

        System.out.println("Podaj dzień:");
        values[0] = in.nextLine();
        System.out.println("Podaj miesiąc:");
        values[1] = in.nextLine();
        System.out.println("Podaj rok:");
        values[2] = in.nextLine();

        return this.getHTMLValue();
    }

    @Override
    public void setValues(String[] value) {
        this.values = value;
    }

    @Override
    public String getHTMLValue() {
        return this.values[0] + " " + this.values[1] + " " + this.values[2];
    }
}
