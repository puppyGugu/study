package org.codezen.jhmybatis.service.mybatis;

import java.util.HashMap;
import java.util.List;

/**
 * Service Interface for managing {@link Region}.
 */
public interface RegionService {

    /**
     * Save a region.
     *
     * @param region the entity to save.
     * @return the persisted entity.
     */
    void save(HashMap<String, Object> map);

    /**
     * Get all the regions.
     *
     * @return the list of entities.
     */
    List<CMap<String, Object>> findAll();

    /**
     * Get the "id" region.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    CMap<String, Object> findOne(HashMap<String, Object> map);

    /**
     * Delete the "id" region.
     *
     * @param id the id of the entity.
     */
    void delete(HashMap<String, Object> map);

    void insert(HashMap<String, Object> map);

    void update(HashMap<String, Object> map);
}
