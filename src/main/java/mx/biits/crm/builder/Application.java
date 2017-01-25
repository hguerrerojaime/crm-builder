package mx.biits.crm.builder;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import mx.biits.crm.builder.ui.main.MainFrame;

@SpringBootApplication
@ComponentScan
public class Application {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new SpringApplicationBuilder(Application.class).headless(false).run(args);
		
		MainFrame mainFrame = context.getBean(MainFrame.class);
		
		mainFrame.setVisible(true);
		
	}
	

}
