package br.com.fiap.listener;

import java.io.FileWriter;
import java.util.Date;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@WebListener
public class ListenerAplicacao implements ServletContextListener, HttpSessionListener, HttpSessionAttributeListener, ServletRequestAttributeListener {

    public ListenerAplicacao() {
    }

    public void sessionCreated(HttpSessionEvent arg0)  { 
    	gerarLog("Sess�o Criada!");
    }

    public void attributeRemoved(ServletRequestAttributeEvent arg0)  { 
    	gerarLog("Atributo Removido!");
    }

    public void sessionDestroyed(HttpSessionEvent arg0)  { 
    	gerarLog("Sess�o Destru�da!");
    }

    public void contextDestroyed(ServletContextEvent arg0)  { 
    	gerarLog("Aplica��o Finalizada!");
    }

    public void attributeAdded(ServletRequestAttributeEvent arg0)  { 
    	String d = (String)arg0.getServletRequest().getAttribute("msg");
    	if(d != null)
    		gerarLog("Atributo '" + d + "' adicionado na requisi��o");
    }

    public void attributeReplaced(ServletRequestAttributeEvent arg0)  { 
    	gerarLog("Atributo Atualizado na Request!");
    }

    public void attributeAdded(HttpSessionBindingEvent arg0)  { 
    	gerarLog("Atributo Adicionado � Sess�o!");
    }

    public void attributeRemoved(HttpSessionBindingEvent arg0)  { 
    	gerarLog("Atributo Removido da Sess�o!");
    }

    public void attributeReplaced(HttpSessionBindingEvent arg0)  { 
    	gerarLog("Atributo Atualizado na Sess�o!");
    }

    public void contextInitialized(ServletContextEvent arg0)  { 
    	gerarLog("Aplica��o Iniciada!");
    }
	
    private void gerarLog(String texto){
    	try {
			FileWriter fw = new FileWriter("d:\\Temp\\Arquivo\\Log.txt", true);
			fw.write("[" + new Date() + "] - " + texto + "\r\n" );
			fw.close();
		} catch (Exception e) {
			System.out.println("Ixi!");
		}
    }
}
