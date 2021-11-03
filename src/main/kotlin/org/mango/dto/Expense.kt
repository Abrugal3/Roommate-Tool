package org.mango.dto

import io.quarkus.hibernate.orm.panache.kotlin.PanacheEntity
import java.util.*
import javax.persistence.Entity

@Entity
data class Expense (
    var expense: String? = null,
    var roommate: String? = null,
    var price: Double? = null,
    var date: String? = null
) : PanacheEntity()
