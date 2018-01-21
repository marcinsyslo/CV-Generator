package com.company.Types;

import java.util.Scanner;

public class LinesTextType implements Type {
    private String[] value = new String[1];

    @Override
    public String askUser(String question) {
        Scanner in = new Scanner(System.in);
        System.out.println("##### " + question + " #####");

        this.value[0] = placeInLis(in);

        return this.getHTMLValue();
    }

    @Override
    public void setValues(String[] value) {
        this.value = value;
    }

    @Override
    public String getHTMLValue() {
        return this.value[0];
    }

    private String placeInLis(Scanner in) {
        String value = in.nextLine();
        value = "<li>" + value.replaceAll(",", "</li><li>");
        return value + "</li>";
    }
}
