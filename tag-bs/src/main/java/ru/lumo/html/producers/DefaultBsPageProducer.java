/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ru.lumo.html.producers;

import ru.lumo.html.tag.Lit;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author misha
 */
public abstract class DefaultBsPageProducer extends DefaultPageProducer implements BsPageProducer {

    @Override
    public Map<String, String> getViewport() {
        Map<String, String> map = new HashMap<>();
        map.put("name", "viewport");
        map.put("content", "width=device-width, initial-scale=1");
        return map;
    }

    @Override
    public Map<String, String> getHttpEquiv() {
        Map<String, String> map = new HashMap<>();
        map.put("http-equiv", "X-UA-Compatible");
        map.put("content", "IE=edge");
        return map;
    }

    @Override
    public Lit getDebugHeadData() {
        return new Lit(""
            + "        <!-- Just for debugging purposes. Don't actually copy this line! -->\n"
            + "        <!--[if lt IE 9]><script src=\"../../assets/js/ie8-responsive-file-warning.js\"></script><![endif]-->\n"
            + "        <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->\n"
            + "        <!--[if lt IE 9]>\n"
            + "          <script src=\"https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js\"></script>\n"
            + "          <script src=\"https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js\"></script>\n"
            + "        <![endif]-->\n");
    }

    @Override
    public List<String> getBsCoreJavascriptLinks() {
        List<String> list = new ArrayList<>();
        list.add("https://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js");
        list.add(getBase() + "data/js/bootstrap.min.js");
        return list;
    }

    
}
