package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;



@CronapiMetaData(type = "blockly")
@CronappSecurity
public class UsuariosTodos {

public static final int TIMEOUT = 300;

/**
 *
 * @return Var
 */
// UsuariosTodos
public static Var Executar() throws Exception {
 return new Callable<Var>() {

   public Var call() throws Exception {
    return cronapi.database.Operations.query(Var.valueOf("app.entity.UserRole"),Var.valueOf("select u from UserRole u"));
   }
 }.call();
}

}

