package org.andestech.learning.rfb19.g3;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.ru.Если;
import cucumber.api.java.ru.То;
import cucumber.api.java.ru.Тогда;
import org.testng.Assert;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Steps2 {

    @Before
    public void init(){
        System.out.println("+++ before steps: " + this);

//        DateTimeFormatter f = DateTimeFormatter.ofPattern("LLLL,dd,yyyy", new Locale("ru"));
//        LocalDate ld = LocalDate.parse("Январь,21,2020",f);

//        System.out.println("+++ " + ld);
    }

   // @Если("Вы ввели дату {int}\\/{int}\\/{int}")
    @Если("Вы ввели дату {localdate1}")
    public void вы_ввели_дату(LocalDate localDate) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Date: " + localDate);
    }

    @Если("вторую дату {localdate2}")
    public void вторую_дату_январь(LocalDate localDate) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Date: " + localDate.format(DateTimeFormatter.ofPattern("yyy-MMMM-dd")));

    }



    @After
    public void teardown(){
        System.out.println("--- after steps: " + this);
    }
}
