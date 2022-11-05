package ru.aqude.springjparestsecondserver.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import ru.aqude.springjparestsecondserver.dto.CountryDto
import ru.aqude.springjparestsecondserver.service.CountryService

@RestController
@RequestMapping("/countries")
class CountryController(
    private val countryService: CountryService,
) {
    @GetMapping // http://localhost:8080/countries
    fun getAll(@RequestParam("page") pageIndex: Int): List<CountryDto> = countryService.getAll(pageIndex)

    @GetMapping("/id") // http://localhost:8080/countries/id?id=1
    fun byId(@RequestParam("id") id: Int): CountryDto = countryService.byId(id)

    @GetMapping("/name") // http://localhost:8080/countries/name?namecountry=Russia
    fun byName(@RequestParam("namecountry") namecountry: String): List<CountryDto> = countryService.ByName(namecountry)
}
