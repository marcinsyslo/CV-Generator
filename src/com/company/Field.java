package com.company;

import com.company.Types.DateType;
import com.company.Types.LinesTextType;
import com.company.Types.Type;
import com.company.Types.TextType;

public class Field {
    private Type fieldType;
    private String question;
    private String html;
    private String name;

    public Field(String name, String type, String question) {
        this.name = name;
        this.question = question;

        switch (type) {
            case "text":
                fieldType = new TextType();
                break;
            case "date":
                fieldType = new DateType();
                break;
            case "lines":
                fieldType = new LinesTextType();
                break;
            default:
                break;
        }
    }

    public String toString() {
        return name;
    }

    public void askUser() {
        html = this.fieldType.askUser(question);
    }

    public String getHtml() {
        return html;
    }
}
