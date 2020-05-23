package org.codezen.jhmybatis.service.mybatis;

import java.util.HashMap;
import java.util.List;

/**
 */
public interface RegionService {

    /**
     * Get all the regions.
     *
     * @return the list of entities.
     */
    List<CMap<String, Object>> findAll();

    /**
     * Get the "id" region.
     *
     * @param map the id of the entity.
     * @return the entity.
     */
    HashMap<String, Object> findOne(HashMap<String, Object> map);

    /**
     * Delete the "id" region.
     *
     * @param map the id of the entity.
     */
    void delete(HashMap<String, Object> map);

    void insert(HashMap<String, Object> map);

    void update(HashMap<String, Object> map);

    int ifExists(HashMap<String,Object> map);

}
