package ru.aqude.springjparestsecondserver.service.impl

import org.springframework.data.domain.PageRequest
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service
import ru.aqude.springjparestsecondserver.dto.CountryDto
import ru.aqude.springjparestsecondserver.entity.CountryEntity
import ru.aqude.springjparestsecondserver.repository.CountryRepository
import ru.aqude.springjparestsecondserver.service.CountryService

@Service
class CountryServiceImpl (private val countryRepository: CountryRepository) : CountryService {
    override fun getAll(pageIndex: Int): List<CountryDto> {
        return countryRepository.findByOrderByNamecountry(PageRequest.of(pageIndex, 3)).map {
            it.toDto()
        }
    }

    override fun byId(id: Int): CountryDto {
        return countryRepository.findByIdOrNull(id)?.toDto() ?: throw IllegalArgumentException("Country with id $id not found")
    }

    override fun ByName(namecountry: String): List<CountryDto>
         = countryRepository.findByNamecountryStartsWithIgnoreCaseOrderByNamecountry(namecountry).map { it.toDto()}


    private fun CountryEntity.toDto() : CountryDto = CountryDto(
        id = this.id,
        namecountry = this.namecountry,
        population = this.population,
        area = this.area,
        capital = this.capital,
        president = this.president,
    )
}