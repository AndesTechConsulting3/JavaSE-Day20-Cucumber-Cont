package org.andestech.learning.rfb19.g3;

import cucumber.api.java.Before;
import cucumber.api.java.ru.Дано;
import cucumber.api.java.ru.Если;
import cucumber.api.java.ru.Тогда;
import org.testng.Assert;

import java.util.List;
import java.util.Map;


public class Steps4 {
    int a,b,c;

    @Если("сложить {int} и {int}")
    public void сложить_и(Integer a, Integer b) {
        // Write code here that turns the phrase above into concrete actions
        System.out.printf("a=%d, b=%d\n",a,b);
        this.a=a; this.b=b;
        //System.out.println(this);
    }

    @Тогда("получим {int}")
    public void получим(Integer c) {
        // Write code here that turns the phrase above into concrete actions
        System.out.printf("c=%d\n",c);
        //System.out.println(this);
        Assert.assertEquals(a+b, c+0);
    }


    @Дано("следующие данные:")
    public void следующие_данные(Map<String, List<Integer>> map) {

         map.forEach((k,v) -> {
           v.forEach(d -> System.out.println(k + "->" +d));

       } );

    }


    @Дано("следующие данные 2:")
    public void следующие_данные(List<Integer> numbers) {

        System.out.println(numbers);
    }



}
