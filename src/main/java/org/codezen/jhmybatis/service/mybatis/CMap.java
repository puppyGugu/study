package org.codezen.jhmybatis.service.mybatis;

import org.apache.ibatis.type.Alias;
import org.springframework.jdbc.support.JdbcUtils;

import java.lang.String;
import java.util.HashMap;

@Alias("CMap")
public class CMap<S, O> extends HashMap<String, Object> {

  private static final long serialVersionUID = 1L;

    @Override
    public Object put(String key, Object value) {
        return super.put(JdbcUtils.convertUnderscoreNameToPropertyName((String) key), value);
    }
}
