package org.mango.controllers

import org.mango.dto.Chore
import org.mango.repository.ChoreRepository
import javax.transaction.Transactional
import javax.ws.rs.*
import javax.ws.rs.core.MediaType
import javax.ws.rs.core.Response


@Path("/chores")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
class ChoresController (val repository: ChoreRepository){

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    fun findAll(): Response = Response.ok(repository.listAll()).build()

    @POST
    @Transactional
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    fun create (chore: Chore): Response {
        repository.persist(chore)
        return Response.ok(chore).status(201).build()
    }

    @DELETE
    @Path("/{id}")
    @Transactional
    @Produces(MediaType.APPLICATION_JSON)
    fun delete(@PathParam("id") id: Long) :Response {
        repository.deleteById(id)
        return Response.ok("Item id $id deleted.").build()
    }

    @PUT
    @Path("/{id}")
    @Transactional
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    fun update(chore: Chore, @PathParam("id") id: Long): Response {
        repository.update("" +
                "choreName = '${chore.choreName}', " +
                "roommate = '${chore.roommate}', " +
                "date = '${chore.date}' " +
                "where id = $id")
        return Response.ok(repository.findById(id)).build()

    }
}

