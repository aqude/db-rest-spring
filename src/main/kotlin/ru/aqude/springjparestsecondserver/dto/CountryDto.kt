package ru.aqude.springjparestsecondserver.dto

data class CountryDto(
    val id: Int,
    val namecountry: String,
    val population: Int,
    val area: Int,
    val capital: String,
    val president: String,
)