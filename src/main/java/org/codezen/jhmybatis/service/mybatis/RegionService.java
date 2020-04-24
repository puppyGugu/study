package org.codezen.jhmybatis.service.mybatis;

import org.codezen.jhmybatis.domain.Region;

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
    Region save(Region region);

    /**
     * Get all the regions.
     *
     * @return the list of entities.
     */
    List<HashMap<String, Object>> findAll();

    /**
     * Get the "id" region.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    HashMap<String, Object> findOne(HashMap<String, Object> map);

    /**
     * Delete the "id" region.
     *
     * @param id the id of the entity.
     */
    void delete(HashMap<String, Object> map);
}
