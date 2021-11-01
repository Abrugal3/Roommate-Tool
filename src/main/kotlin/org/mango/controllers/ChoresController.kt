package org.mango.controllers

import org.mango.dto.Chore
import javax.ws.rs.Consumes
import javax.ws.rs.POST
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType


@Path("/chores")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
class ChoresController {

    private val chores: ArrayList<Chore> = ArrayList();

    @POST
    fun addChore(chore: Chore){
        chores.add(chore);
    }
}