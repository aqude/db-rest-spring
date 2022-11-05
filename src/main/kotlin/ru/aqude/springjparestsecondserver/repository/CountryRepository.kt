package ru.aqude.springjparestsecondserver.repository

import org.springframework.data.domain.PageRequest
import org.springframework.data.repository.CrudRepository
import ru.aqude.springjparestsecondserver.entity.CountryEntity

interface CountryRepository: CrudRepository<CountryEntity, Int> {
   fun findByOrderByNamecountry(pageable: PageRequest): List<CountryEntity>
    fun findByNamecountryStartsWithIgnoreCaseOrderByNamecountry(namecountry: String): List<CountryEntity>
}