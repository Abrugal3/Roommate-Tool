package org.mango.dto

import io.quarkus.hibernate.orm.panache.kotlin.PanacheEntity
import javax.persistence.Entity

@Entity
data class Chore (
             var choreName: String? = null,
             var roommate: String? = null,
             var date: String? = null
            ) : PanacheEntity()

