package ru.aqude.springjparestsecondserver.dto

data class CountryDto(
    val id: Int,
//    val nameCountry: String,
    val population: Int,
    val area: Int,
    val capital: String,
    val president: String,
)