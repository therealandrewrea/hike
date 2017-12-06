package org.launchcode.Hike.Models.data;

import org.launchcode.Hike.Models.tags;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface tagsDao extends CrudRepository<tags, Integer> {

}
