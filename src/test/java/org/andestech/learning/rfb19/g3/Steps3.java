package org.andestech.learning.rfb19.g3;

import cucumber.api.java.ru.Дано;
import cucumber.api.java.ru.Если;
import cucumber.api.java.ru.То;

public class Steps3 {

    @Если("Открыта страница {string}")
    public void открыта_страница(String page) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Page: " + page);
    }

    @То("фон главного меню имеет цвет {color}")
    public void фон_главного_меню_имеет_цвет(ColorBase color) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Цвет 1: " + color);
    }

    @То("цвет элементов меню есть {color}")
    public void цвет_элементов_меню_есть(ColorBase color) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Цвет 2: " + color);
    }

    @Дано("Описание теста")
    public void описание_теста(String docString) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Дано работает!");
    }
}
