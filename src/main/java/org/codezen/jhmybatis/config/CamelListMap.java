package org.codezen.jhmybatis.config;

import org.apache.commons.collections4.map.ListOrderedMap;
import java.lang.String;

public class CamelListMap<S, O> extends ListOrderedMap<String, Object> {

  private static final long serialVersionUID = 1L;

  private java.lang.String toProperCase(java.lang.String s, boolean isCapital) {

        java.lang.String rtnValue = "";

        if(isCapital){
            rtnValue = s.substring(0, 1).toUpperCase() +
                s.substring(1).toLowerCase();
        }else{
            rtnValue = s.toLowerCase();
        }
        return rtnValue;
    }

    private java.lang.String  toCamelCase(java.lang.String  s){
        java.lang.String [] parts = s.split("_");
        StringBuilder camelCaseString = new StringBuilder();

        for (int i = 0; i < parts.length ; i++) {
            java.lang.String  part = parts[i];
            camelCaseString.append(toProperCase(part, (i != 0 ? true : false))) ;
        }

        return camelCaseString.toString();
    }

    @Override
    public Object put(String key, Object value) {
        return super.put((String) toCamelCase((java.lang.String) key), value);

    }
}
