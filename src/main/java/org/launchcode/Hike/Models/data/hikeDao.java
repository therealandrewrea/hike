package org.launchcode.Hike.Models.data;

import org.launchcode.Hike.Models.hike;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface hikeDao extends CrudRepository<hike, Integer> {
}
