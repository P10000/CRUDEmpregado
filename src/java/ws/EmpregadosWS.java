/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import com.google.gson.Gson;
import controller.EmpregadosDao;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import model.Empregados;

/**
 * REST Web Service
 *
 * @author DELL
 */
@Path("/empregados")
public class EmpregadosWS {

    @Context
    private UriInfo context;

    /**
     * Creado uma nova instancia de EmpregadosWS
     */
    public EmpregadosWS() {
    }

    /**
     * Retrieves representation of an instance of ws.EmpregadosWS
     *
     * @param nome
     * @param cargo
     * @param salario
     * @return an instance of java.lang.String
     * @throws java.text.ParseException
     */
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/insere/{nome}/{cargo}/{salario}")
    public Response insereEmpregado(@PathParam("nome") String nome, @PathParam("cargo") String cargo, @PathParam("salario") Double salario) throws ParseException{
        Empregados empregado = new Empregados();
        empregado.setNome(nome);
        empregado.setCargo(cargo);
        empregado.setSalario(salario);
        
        EmpregadosDao dao = new EmpregadosDao();

        dao.adiciona(empregado);
        
        String msg = nome + " " + cargo + " " + salario + " Adicionados com sucesso!";
        return Response.status(200).entity(msg).build();

    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/consulta")
    public String consultaJsonEmpregados() {
        // Cria uma arraylist
        List<Empregados> lista = new ArrayList<>();

        // chama a controller
        EmpregadosDao dao = new EmpregadosDao();

        // adiciona o select do banco
        lista = dao.getLista();

        // Coverter para json
        Gson g = new Gson();
        return g.toJson(lista);
    }

    /**
     * PUT method for updating or creating an instance of EmpregadosWS
     *
     * @param id
     * @param nome
     * @param cargo
     * @param salario
     * @return
     */
    @PUT
    @Path("/altera/{id}/{nome}/{cargo}/{salario}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response alteraEmpregado(@PathParam("id") int id, @PathParam("nome") String nome, @PathParam("cargo") String cargo, @PathParam("salario") Double salario) {
        Empregados empregado = new Empregados();
        empregado.setId(id);
        empregado.setNome(nome);
        empregado.setCargo(cargo);
        empregado.setSalario(salario);
        EmpregadosDao dao = new EmpregadosDao();

        dao.altera(empregado);
        
        String msg = nome + " " + cargo + " " + salario + " Alterados com sucesso!";
        return Response.status(200).entity(msg).build();
    }
 
    @DELETE
    //@Consumes(MediaType.APPLICATION_JSON)
    @Path("/delete/{id}")
    public Response deletaEmpregado(@PathParam("id") int id) {
        Empregados empregado = new Empregados();
        EmpregadosDao dao = new EmpregadosDao();
        
        empregado.setId(id);
        dao.remove(empregado);

        String output = id + " Removido com sucesso!";
        return Response.status(200).entity(output).build();
    }

    String deletaEmpregado(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String insereEmpregado(String content, String content0, String content1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
