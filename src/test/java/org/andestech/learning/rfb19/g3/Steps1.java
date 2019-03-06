package org.andestech.learning.rfb19.g3;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.ru.Если;
import cucumber.api.java.ru.То;
import cucumber.api.java.ru.Тогда;
import org.testng.Assert;

public class Steps1 {

    @Before
    public void init(){
        System.out.println("+++ before steps: " + this);
    }

    @Если("пользователь вводит логин {string} и пароль {string}")
    public void пользователь_вводит_логин_и_пароль(String login, String pass) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("login: " + login + ", pass:" + pass);
    }

    @То("пользователь успешно входит на сайт")
    public void пользователь_успешно_входит_на_сайт() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Успешный вход");
        Assert.assertTrue(true);
    }

    @Если("пользователь успешно вошёл на сайт {string}")
    public void пользователь_успешно_вошёл_на_сайт(String site) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Test входа на сайт " +site);
    }

    @Тогда("он выполняет Logout")
    public void он_выполняет_Logout() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Logout successful...");

    }



    @After
    public void teardown(){
        System.out.println("--- after steps: " + this);
    }
}
