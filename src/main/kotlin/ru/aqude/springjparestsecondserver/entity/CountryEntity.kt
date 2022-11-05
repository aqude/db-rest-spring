package ru.aqude.springjparestsecondserver.entity

import javax.persistence.*

@Entity
@Table(name = "test")
class CountryEntity (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int = 0,
    val namecountry: String = "",
    val population: Int = 0,
    val area: Int = 0,
    val capital: String = "",
    val president: String = "",
)