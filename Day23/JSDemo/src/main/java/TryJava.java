import java.io.FileReader;
import java.util.List;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineFactory;
import javax.script.ScriptEngineManager;

public class TryJava {
	public static void main(String args[]){
		try{
			ScriptEngineManager mgr = new ScriptEngineManager();
			List<ScriptEngineFactory> list= mgr.getEngineFactories();
			list.forEach((sef)->System.out.println(sef.getEngineName()));
			
			ScriptEngine engine = mgr.getEngineByName("graal.js");
			engine.eval(new FileReader("C:\\Grads\\Daliy Practice\\Day23\\JSDemo\\demo2.js"));
			
			Invocable inv = (Invocable) engine;
			inv.invokeFunction("abc");
			inv.invokeFunction("greet",40,50);

			String name = (String) inv.invokeFunction("greet","wissen","technology");
			System.out.println("welcome to +"+name);
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}
