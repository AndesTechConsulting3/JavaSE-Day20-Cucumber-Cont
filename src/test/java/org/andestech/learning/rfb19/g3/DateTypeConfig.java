package org.andestech.learning.rfb19.g3;

import cucumber.api.TypeRegistry;
import cucumber.api.TypeRegistryConfigurer;
import io.cucumber.cucumberexpressions.ParameterType;
import io.cucumber.cucumberexpressions.Transformer;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateTypeConfig implements TypeRegistryConfigurer {
    @Override
    public Locale locale() {
        return new Locale("ru");
    }

    @Override
    public void configureTypeRegistry(TypeRegistry typeRegistry) {

        typeRegistry.defineParameterType(new ParameterType<>(
                "localdate1",
                "\\d{2}/\\d{2}/\\d{4}",
                LocalDate.class,
                (String s) -> {
                    DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                    return LocalDate.parse(s,f);
                }
        ));

        typeRegistry.defineParameterType(new ParameterType<>(
                "localdate2",
                "\\d{2} [а-яА-Я]{4,10},\\d{4}",
                LocalDate.class,
                (String s) -> {
                    DateTimeFormatter f = DateTimeFormatter.ofPattern("dd MMMM,yyyy", new Locale("ru"));
                    return LocalDate.parse(s,f);
                }
        ));

        typeRegistry.defineParameterType(new ParameterType<>(
                "color",
                "rgb\\(\\d{1,3},\\d{1,3},\\d{1,3},\\d{1,3}\\)",
                ColorBase.class,
                (String s) -> {
                    int r,g,b; double a;
                    String data = s.substring(s.indexOf("(")+1,s.indexOf(")"));
                    String[] datas = data.split(",");
                    r=Integer.parseInt(datas[0]);
                    g=Integer.parseInt(datas[1]);
                    b=Integer.parseInt(datas[2]);
                    a=Double.parseDouble(datas[3]);

                    return new ColorBase(r,g,b,a);
                }
        ));
    }
}
