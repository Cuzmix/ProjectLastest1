package controllers.security;

import play.api.Environment;
import play.mvc.*;
import play.data.*;
import play.db.ebean.Transactional;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;

import views.html.*;

import models.users.*;

public class LoginController extends Controller {

    private FormFactory formFactory;

    private Environment env;

    @Inject
    public LoginController(Environment e, FormFactory f){
        this.env = e;
        this.formFactory = f;
    }

    public Result login(){

        Form<Login> loginForm = formFactory.form(Login.class);

        return ok(login.render(loginForm, Users.getUserById(session().get("email"))));
    }

    public Result loginSubmit(){
        Form<Login> loginForm = formFactory.form(Login.class).bindFromRequest();

        if(loginForm.hasErrors()){
            return badRequest(login.render(loginForm,Users.getUserById(session().get("email"))));
        }
        else {
            session().clear();

            session("email",loginForm.get().getEmail());
        }
        Users u = Users.getUserById(session().get("email"));
        if(u.getNumber().equals("admin")){
            return redirect(controllers.routes.AdminController.service(0));
        }

        return redirect(controllers.routes.HomeController.index());
    }

    public Result logout(){
        session().clear();
        flash("You've been logged out");
        return redirect(routes.LoginController.login());
    }


}