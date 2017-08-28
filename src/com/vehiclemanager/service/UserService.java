package com.vehiclemanager.service;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.vehiclemanager.dao.UserDAO;
import com.vehiclemanager.entity.User;

@Path("/UserSet")
public class UserService {

	UserDAO userDAO = new UserDAO();

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getUsers() {
		// implement to return all users from set
		// like userDAO.getUsers().toJSON();

		String output = "all users";

		return Response.status(200).entity(output).build();
	}

	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getUserByID(@PathParam("id") String id) {
		// implement to return user by id
		// like userDao.getUser(id)
		String output = "user with id " + id;
		return Response.status(200).entity(output).build();
	}

	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public Response createUser(User user) {
		// implement to create user
		// like dao.addUser(user) - how to get "user" from postman?
		String output = "user created successfully";
		return Response.status(201).entity(output).build();
	}

	@PUT
	@Produces(MediaType.APPLICATION_JSON)
	public Response updateUser(User user) {
		// implement to update user
		// like userDAO.updateUser(user)
		String output = "user successfully updated";
		return Response.status(200).entity(output).build();
	}

	@DELETE
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response deleteUser(@PathParam("id") String id) {
		// implement to delete user with id
		// like userDao.deleteUser(id)
		String output = "user with id " + id + " deleted successfully";
		return Response.status(204).entity(output).build();
	}
}
