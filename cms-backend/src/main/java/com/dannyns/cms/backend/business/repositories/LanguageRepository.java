package com.dannyns.cms.backend.business.repositories;

import com.dannyns.cms.backend.business.entities.Language;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LanguageRepository extends CrudRepository<Language, Long> {
}
