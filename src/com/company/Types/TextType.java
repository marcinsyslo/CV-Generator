package com.company.Types;

import java.util.Scanner;

public class TextType implements Type {
    private String[] values = new String[1];

    @Override
    public String askUser(String question) {
        Scanner in = new Scanner(System.in);
        System.out.println("##### " + question + " #####");
        values[0] = in.nextLine();

        return this.getHTMLValue();
    }

    @Override
    public void setValues(String[] value) {
        this.values = value;
    }

    @Override
    public String getHTMLValue() {
        return this.values[0];
    }
}
