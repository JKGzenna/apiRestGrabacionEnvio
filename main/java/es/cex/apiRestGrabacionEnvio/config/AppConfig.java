package es.cex.apiRestGrabacionEnvio.config;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import es.cex.apiRestGrabacionEnvio.common.Constants;
import es.cex.apiRestGrabacionEnvio.dao.procedures.GetApiRestEtiquetaProcedure;
import es.cex.apiRestGrabacionEnvio.dao.procedures.GetApiRestGrabacionEnvioOficProcedure;
import es.cex.apiRestGrabacionEnvio.dao.procedures.GetApiRestGrabacionEnvioProcedure;
import es.cex.apiRestGrabacionEnvio.dao.procedures.GetApiRestHoraCorteRecProcedure;



@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"es.cex.*","es.chx.intranet.*"})
public class AppConfig {
	
	private static final Log LOG = LogFactory.getLog(AppConfig.class);
	
	protected Properties pro;
    protected final String ENV_DIRECTORIO = "CATALINA_HOME";
    protected final String NOMBRE_DIRECTORIO_CONF = "conf";

	public AppConfig() {
	}



	@Bean
	public DataSource getDataSource() {
		cargaProperties();
		
		if (pro != null) {
			
			DriverManagerDataSource dataSource = new DriverManagerDataSource();
			
			dataSource.setDriverClassName(pro.getProperty(Constants.JDBC_DRIVER));
			dataSource.setUrl(pro.getProperty(Constants.JDBC_URL));
			dataSource.setUsername(pro.getProperty(Constants.JDBC_USER));
			dataSource.setPassword(pro.getProperty(Constants.JDBC_PASS));
			
			// Si queremos hacer pruebas en local si configurar el fichero jdbc.properties
//			dataSource.setDriverClassName("oracle.jdbc.driver.OracleDriver");
//			dataSource.setUrl("jdbc:oracle:thin:@192.168.241.123:1521:DESANOVA");
//			dataSource.setUsername("alertran");
//			dataSource.setPassword("alertran");
			
			
			return dataSource;
			
		}
		else {
			return null;
		}
	}
	
	
	public void cargaProperties() {
		String ruta;
		File fichero;

		pro = new Properties();
		try {
			ruta = System.getenv(ENV_DIRECTORIO);
			if (ruta == null) {
				LOG.error("No se encuentra la variable de entorno " + ENV_DIRECTORIO);
			} else {
				ruta += File.separator + NOMBRE_DIRECTORIO_CONF;
				ruta +=  "/" + Constants.JDBC_PROPERTIES;
				fichero = new File(ruta);
				if (!fichero.exists()) {
					LOG.error("No se encuentra el fichero " + fichero.getCanonicalPath());
				} else {
					pro.load(new FileInputStream(fichero));
				}
			}
		} catch( SecurityException ex ) {
			LOG.error("Permisos insuficientes para acceder a " + ENV_DIRECTORIO );
		} catch (IOException ex) {
			LOG.error("Imposible leer del fichero " + Constants.JDBC_PROPERTIES);
		} 
	}
	
	

	
	@Bean
    public GetApiRestGrabacionEnvioProcedure getApiRestGrabacionEnvioProcedure() {
        return new GetApiRestGrabacionEnvioProcedure(getDataSource());
    }
	
	@Bean
    public GetApiRestGrabacionEnvioOficProcedure getApiRestGrabacionEnvioOficProcedure() {
        return new GetApiRestGrabacionEnvioOficProcedure(getDataSource());
    }	
	
	@Bean
    public GetApiRestEtiquetaProcedure getApiRestEtiquetaProcedure() {
        return new GetApiRestEtiquetaProcedure(getDataSource());
    }	

	@Bean
    public GetApiRestHoraCorteRecProcedure getApiRestHoraCorteRecProcedure() {
        return new GetApiRestHoraCorteRecProcedure(getDataSource());
    }	
}