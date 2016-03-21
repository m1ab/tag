/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.lumo.html.bs.tag;

/**
 *
 * @author misha
 */
public class BsInput extends BsTag {

    public enum Type {
        TEXT,
        PASSWORD,
        COLOR,          //	Виджет для выбора цвета.
        DATE,           //	Поле для выбора календарной даты.
        DATETIME,       //	Указание даты и времени.
        DATETIME_LOCAL, //	Указание местной даты и времени.
        EMAIL,          //	Для адресов электронной почты.
        NUMBER,         //	Ввод чисел.
        RANGE,          //	Ползунок для выбора чисел в указанном диапазоне.
        SEARCH,         //	Поле для поиска.
        TEL,            //	Для телефонных номеров.
        TIME,           //	Для времени.
        URL,            //	Для веб-адресов.
        MONTH,          //	Выбор месяца.
        WEEK;           //	Выбор недели.
        @Override
        public String toString() {
            return name().replace("_", "-").toLowerCase();
        }
    }

    public BsInput(String id, String name, String value, boolean enabled) {
        this(Type.TEXT, "form-control", id, name, value, enabled);
    }

    public BsInput(Type type, String id, String name, String value, boolean enabled) {
        this(type, "form-control", id, name, value, enabled);
    }

    public BsInput(Type type, String tagClass, String id, String name, String value, boolean enabled) {
        super("input", tagClass);
        putAttribute("type", type.toString());
        if (id != null) putAttribute("id", id);
        if (name != null) putAttribute("name", name);
        if (value != null) putAttribute("value", value);
        if (!enabled) addFlag("disabled");
    }

}
