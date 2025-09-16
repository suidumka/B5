package io.loop.Task2;

public class WebElementButton {
    String id;
    String label;


    public WebElementButton(String id) {
        this.id = id;

    }

    public WebElementButton(String id, String label) {
        this(id);
        this.label = label;

    }

    @Override
    public String toString() {
        return "WebElementButton{" +
                "id='" + id + '\'' +
                ", label='" + label + '\'' +
                '}';
    }
}





