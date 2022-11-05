package ru.aqude.springjparestsecondserver.service
import ru.aqude.springjparestsecondserver.dto.CountryDto

interface CountryService {
    fun getAll(pageIndex: Int): List<CountryDto>
}