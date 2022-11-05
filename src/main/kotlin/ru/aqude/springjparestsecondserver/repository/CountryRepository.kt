package ru.aqude.springjparestsecondserver.repository

import org.springframework.data.repository.CrudRepository
import ru.aqude.springjparestsecondserver.entity.CountryEntity

interface CountryRepository: CrudRepository<CountryEntity, Int>