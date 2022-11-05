package ru.aqude.springjparestsecondserver.service.impl

import org.springframework.stereotype.Service
import ru.aqude.springjparestsecondserver.dto.CountryDto
import ru.aqude.springjparestsecondserver.entity.CountryEntity
import ru.aqude.springjparestsecondserver.repository.CountryRepository
import ru.aqude.springjparestsecondserver.service.CountryService

@Service
class CountryServiceImpl (private val countryRepository: CountryRepository,) : CountryService {
    override fun getAll(): List<CountryDto> {
        return countryRepository.findAll().map {
            it.toDto()
        }
    }

    private fun CountryEntity.toDto() : CountryDto = CountryDto(
        id = this.id,
//        nameCountry = this.nameCountry,
        population = this.population,
        area = this.area,
        capital = this.capital,
        president = this.president,
    )
}