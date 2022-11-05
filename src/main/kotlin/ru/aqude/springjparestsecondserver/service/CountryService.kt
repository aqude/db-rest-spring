package ru.aqude.springjparestsecondserver.service
import ru.aqude.springjparestsecondserver.dto.CountryDto

interface CountryService {
    fun getAll(pageIndex: Int): List<CountryDto>
    fun byId(id: Int): CountryDto

    fun ByName(namecountry: String): List<CountryDto>
}