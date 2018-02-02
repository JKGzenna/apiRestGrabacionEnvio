package es.cex.apiRestGrabacionEnvio.common;

import java.math.BigDecimal;

public class Constants {

    // DataSources Properties
//    public final static String JAVA_NAMING_INITIAL_PROPERTY = "JAVA.NAMING.INITIAL.PROPERTY";
//    public final static String JAVA_NAMING_URL_PROPERTY = "JAVA.NAMING.URL.PROPERTY";
//    public final static String JAVA_NAMING_INITIAL_VALUE = "JAVA.NAMING.INITIAL.VALUE";
//    public final static String JAVA_NAMING_URL_VALUE = "JAVA.NAMING.URL.VALUE";
    // DataSources
//    public final static String ALERTRAN_DATASOURCE = "JBOSS.ALERTRAN_DATASOURCE.JNDINAME";
//    public final static String JBOSS_DATASOURCE = "JBOSS.JNDINAME";

    // Procedures
    /** PROCEDURE_NAME_OBTENER_SEGUIMIENTO_ENVIO */
	public static final String PROCEDURE_NAME_GRABAR_ENVIO = "GRABAR_ENVIO";
    /** PROCEDURE_NAME_GRABAR_ENVIO_OFICINAS */
	public static final String PROCEDURE_NAME_GRABAR_ENVIO_OFICINAS = "GRABAR_ENVIO_OFICINAS";
	/** PROCEDURE_NAME_DEVUELVE_ETIQUETA_ZPL */
	public static final String PROCEDURE_NAME_DEVUELVE_ETIQUETA_ZPL = "DEVUELVE_ETIQUETA_ZPL";
	/** PROCEDURE_NAME_DEVUELVE_ETIQUETA_ZPL */
	public static final String PROCEDURE_NAME_CONSULTA_HORA_CORTE = "CONSULTA_HORA_CORTE";
	public static final String PROCEDURE_NAME_DAMETIQUETA = "DAMEETIQUETA";
	/** PROCEDURE_NAME_DAME_INFO_ADICIONAL */
	public static final String PROCEDURE_NAME_DAME_INFOADICIONAL_ETIQUETA = "DAME_INFOADICIONAL_ETIQUETA";
	
	
//    public final static String PROCEDURE_GETPOBLACION = "PROCEDURE.GETPOBLACION";
//    public final static String PROCEDURE_GRABAR_CONTATO = "PROCEDURE.GRABAR.CONTATO";
//    public final static String PROCEDURE_GETPAISES = "PROCEDURE.GETPAISES";
//    public final static String PROCEDURE_INSERTA_TRAZA = "PROCEDURE.INSERTA.TRAZA";
//    public final static String PROCEDURE_ENCRIPTAR_CHX = "PROCEDURE.ENCRIPTAR.CHX";
//    public final static String PROCEDURE_VERIFICAR_RECOGIDA = "PROCEDURE.VERIFICAR.RECOGIDA";
//    public final static String PROCEDURE_MARCAR_ENVIO_IMPRESO = "PROCEDURE.MARCAR.ENVIO.IMPRESO";
//    public final static String PROCEDURE_MARCAR_ENVIO_ENVIADO = "PROCEDURE.MARCAR.ENVIO.ENVIADO";
//    public final static String PROCEDURE_GET_RECOGIDA_PROPUESTA = "PROCEDURE.GET.RECOGIDA.PROPUESTA";
//    public final static String PROCEDURE_TRAER_ENVIO = "PROCEDURE.TRAER.ENVIO";
//    public final static String PROCEDURE_GET_IMPRESION_RECOGIDA = "PROCEDURE.GET.IMPRESION.RECOGIDA";
//    public final static String PROCEDURE_GET_IMPRESION_RECOGIDA_WEB = "PROCEDURE.GET.IMPRESION.RECOGIDA.WEB";
//    public final static String PROCEDURE_INSERTA_TRAZA_TPV = "PROCEDURE.INSERTA.TRAZA.TPV";
//    public final static String PROCEDURE_DESACTIVAR_ENVIO_NO_CLIENTE = "PROCEDURE.DESACTIVAR.ENVIO.NO.CLIENTE";
//    public final static String PROCEDURE_ACTIVAR_ENVIO_RECOGIDA_NO_CLIENTE = "PROCEDURE.ACTIVAR.ENVIO.RECOGIDA.NO.CLIENTE";
//    public final static String PROCEDURE_GRABAR_ENVIO_NO_CLIENTE = "PROCEDURE.GRABAR.ENVIO.NO.CLIENTE";
//    public final static String PROCEDURE_GRABAR_SOLICITUD_CONTACTO = "PROCEDURE_GRABAR_SOLICITUD_CONTACTO";
//    public final static String PROCEDURE_GETCALLES = "PROCEDURE.GETCALLES";
//    public final static String PROCEDURE_SIMULADOR_NO_CLIENTE = "PROCEDURE.SIMULADOR.NO.CLIENTE";
//    public final static String PROCEDURE_GRABAR_GETPAISES = "PROCEDURE.GRABAR.GETPAISES";
//    public final static String PROCEDURE_SERVICE_POINTS_GETPAISES = "PROCEDURE.SERVICE.POINTS.GETPAISES";
//    public final static String PROCEDURE_GETSERVICEPOINTS = "PROCEDURE.GETSERVICEPOINTS";
//    public final static String PROCEDURE_DETAIL_CLIENT = "PROCEDURE.DETAIL.CLIENT";
//    public final static String PROCEDURE_BUSCAR_PRODUCTO = "PROCEDURE.BUSCAR.PRODUCTO";
//    public final static String PROCEDURE_BUSCAR_RECOGIDA = "PROCEDURE.BUSCAR.RECOGIDA";
//    public final static String PROCEDURE_GET_RECOGIDA_SPR = "PROCEDURE.GET.RECOGIDA.SPR";
//    public final static String PROCEDURE_GET_CENTROS = "PROCEDURE.GET.CENTROS";
//    public final static String PROCEDURE_CALCULAR_RECOGIDA = "PROCEDURE.CALCULAR.RECOGIDA";
//    public final static String PROCEDURE_HORA_CORTE = "PROCEDURE.HORA.CORTE";
//    public final static String PROCEDURE_CENTROS_PRODUCTO = "PROCEDURE.CENTROS.PRODUCTO";
//    public final static String PROCEDURE_BUSCAR_PRODUCTOS_SS = "PROCEDURE.BUSCAR.PRODUCTOS.SS";
//    public final static String PROCEDURE_GRABAR_RECOGIDA = "PROCEDURE.GRABAR.RECOGIDA";
//    public final static String PROCEDURE_GRABAR_RECOGIDA_ESPECIAL = "PROCEDURE.GRABAR.RECOGIDA.ESPECIAL";
//    public final static String PROCEDURE_GET_ENVIO = "PROCEDURE.GET.ENVIO";
//    public final static String PROCEDURE_GET_GESTIONES = "PROCEDURE.GET.GESTIONES";
//    public final static String PROCEDURE_GET_BULTOS = "PROCEDURE.GET.BULTOS";
//    public final static String PROCEDURE_GET_ENVIO_LOGOFF = "PROCEDURE.GET.ENVIO.LOGOFF";
//    public final static String PROCEDURE_GET_GESTION = "PROCEDURE.GET.GESTION";
//    public final static String PROCEDURE_GET_PROPUESTA_FECHA_CONCERTADA = "PROCEDURE.GET.PROPUESTA.FECHA.CONCERTADA";
//    public final static String PROCEDURE_GRABAR_SOLUCION_NUEVA_ENTREGA = "PROCEDURE.GRABAR.SOLUCION.NUEVA.ENTREGA";
//    public final static String PROCEDURE_GET_ENVIO_LOGOFF_MOV = "PROCEDURE.GET.ENVIO.LOGOFF.MOV";
//    public final static String PROCEDURE_GET_ENVIO_MOV = "PROCEDURE.GET.ENVIO.MOV";
//    public final static String PROCEDURE_GRABAR_SOLUCION_NUEVA_ENTREGA_MOV = "PROCEDURE.GRABAR.SOLUCION.NUEVA.ENTREGA.MOV";
//    public final static String PROCEDURE_GET_GESTION_MOV = "PROCEDURE.GET.GESTION.MOV";
//    public final static String PROCEDURE_VALIDATE_CP_NEW_DELIVERY_MOV = "PROCEDURE.VALIDATE.CP.NEW.DELIVERY.MOV";
//    public final static String PROCEDURE_GET_PROPUESTA_FECHA_CONCERTADA_MOV = "PROCEDURE.GET.PROPUESTA.FECHA.CONCERTADA.MOV";
//    public final static String PROCEDURE_GET_FORMAS_PAGO = "PROCEDURE.GET.FORMAS.PAGO";
//    public final static String PROCEDURE_GET_DATOS_FACTURA = "PROCEDURE.GET.DATOS.FACTURA";
//    public final static String PROCEDURE_GRABAR_DATOS_FACTURA = "PROCEDURE.GRABAR.DATOS.FACTURA";
//    public final static String PROCEDURE_ACTUALIZA_ENVIO_FACTURADO = "PROCEDURE.ACTUALIZA.ENVIO.FACTURADO";
//    public final static String PROCEDURE_GRABAR_SOLICITUD_FACTURA = "PROCEDURE.GRABAR.SOLICITUD.FACTURA";
//    public final static String PROCEDURE_ACTIVAR_ENVIO_WEB = "PROCEDURE.ACTIVAR_ENVIO_WEB";
//    public final static String PROCEDURE_DESACTIVAR_ENVIO_WEB = "PROCEDURE.DESACTIVAR_ENVIO_WEB";
//    public final static String PROCEDURE_BUSCAR_CONCURSOS = "PROCEDURE.BUSCAR.CONCURSOS";
//    public final static String PROCEDURE_GRABAR_PROVEEDOR = "PROCEDURE.GRABAR.PROVEEDOR";
//    public final static String PROCEDURE_BUSCAR_NEGOCIOS_SECTOR = "PROCEDURE.BUSCAR.NEGOCIOS.SECTOR";
//    public final static String PROCEDURE_BUSCAR_PRODUCTOS_NEGOC_SECTOR = "PROCEDURE.BUSCAR.PRODUCTOS.NEGOC.SECTOR";
//    public final static String PROCEDURE_GET_ENVIO_WEB_PUBLICO = "PROCEDURE.GET.ENVIO.WEB.PUBLICO";
//    public final static String PROCEDURE_GET_MASK_CP_PUBLICO = "PROCEDURE.GET.MASK.CP.PUBLICO";
//    public final static String PROCEDURE_GET_MOTIVO_RECLAMACION = "PROCEDURE.GET.MOTIVO.RECLAMACION";
//    public final static String PROCEDURE_GET_CONTENIDO_INTERNACIONAL_PUBLICO = "PROCEDURE.GET.CONTENIDO.INTERNACIONAL.PUBLICO";

    /* PROCEDIMIENTOS DAO CONTACT */
//    public final static String PROCEDURE_BUSCAR_CONTACTOS = "PROCEDURE.BUSCAR.CONTACTOS";
//    public final static String PROCEDURE_GET_CONTACTO = "PROCEDURE.GET.CONTACTO";
//    public final static String PROCEDURE_GET_CONTACTO_TELEFONO = "PROCEDURE.GET.CONTACTO.TELEFONO";
//    public final static String PROCEDURE_GET_LOGISTICA_INVERSA = "PROCEDURE.GET.LOGISTICA.INVERSA";
//    public final static String PROCEDURE_GET_CLIENTE_CENTRO = "PROCEDURE.GET.CLIENTE.CENTRO";
//    public final static String PROCEDURE_GRABAR_CONTACTO = "PROCEDURE.GRABAR.CONTACTO";
//    public final static String PROCEDURE_GRABAR_CONTACTO_TELEFONO = "PROCEDURE.GRABAR.CONTACTO.TELEFONO";
//    public final static String PROCEDURE_BORRAR_CONTACTO = "PROCEDURE.BORRAR.CONTACTO";

    /* PROCEDIMIENTOS DAO LOGIN */
//    public final static String PROCEDURE_LOGIN = "PROCEDURE.LOGIN";
//    public final static String PROCEDURE_GET_NUM_WWW_USUARIOS_BY_ID = "PROCEDURE.GET.NUM.WWW.USUARIOS.BY.ID";
//    public final static String PROCEDURE_GRABAR_USUARIO_AUTOLOGIN = "PROCEDURE.GRABAR.USUARIO.AUTOLOGIN";

    /* PROCEDIMIENTOS DAO MASTER */
//    public final static String PROCEDURE_GET_MAESTRO = "PROCEDURE.GET.MAESTRO";

    /* PROCEDIMIENTOS DAO OFFICESHIPING */
//    public final static String PROCEDURE_GET_ENVIO_WEB = "PROCEDURE.GET.ENVIO.WEB";
//    public final static String PROCEDURE_BUSCAR_ENVIOS_WEB = "PROCEDURE.BUSCAR.ENVIOS.WEB";
//    public final static String PROCEDURE_BORRAR_ENVIO_WEB = "PROCEDURE.BORRAR.ENVIO.WEB";
//    public final static String PROCEDURE_BUSCAR_OFICINA_VIGENTE = "PROCEDURE.BUSCAR.OFICINA.VIGENTE";
//    public final static String PROCEDURE_GET_HABILITAR_MODIFICACION = "PROCEDURE.GET.HABILITAR.MODIFICACION";
//    public final static String PROCEDURE_GRABAR_ENVIO = "PROCEDURE.GRABAR.ENVIO";
//    public final static String PROCEDURE_GRABAR_DATOS_FACTURA_OFFICE = "PROCEDURE.GRABAR.DATOS.FACTURA.OFFICE";
//    public final static String PROCEDURE_GRABAR_SOLICITUD_FACTURA_OFFICE = "PROCEDURE.GRABAR.SOLICITUD.FACTURA.OFFICE";
//    public final static String PROCEDURE_ACTUALIZA_ENVIO_FACTURADO_OFFICE = "PROCEDURE.ACTUALIZA.ENVIO.FACTURADO.OFFICE";
//    public final static String PROCEDURE_CALCULAR_RECOGIDA_PUNTO_VENTA = "PROCEDURE.CALCULAR.RECOGIDA.PUNTO.VENTA";
//    public final static String PROCEDURE_GRABAR_RECOGIDA_PUNTO_VENTA = "PROCEDURE.GRABAR.RECOGIDA.PUNTO.VENTA";
//    public final static String PROCEDURE_MARCAR_ENVIO_IMPRESO_OFFICE = "PROCEDURE.MARCAR.ENVIO.IMPRESO.OFFICE";
//    public final static String PROCEDURE_MARCAR_ENVIO_ENVIADO_OFFICE = "PROCEDURE.MARCAR.ENVIO.ENVIADO.OFFICE";
//    public final static String PROCEDURE_GET_ENVIO_LI_VA = "PROCEDURE.GET.ENVIO.LI.VA";
//    public final static String PROCEDURE_GET_PAISES_OFICINAS = "PROCEDURE.GET.PAISES.OFICINAS";
//    public final static String PROCEDURE_GET_CONTENIDO_INTERNACIONAL = "PROCEDURE.GET.CONTENIDO.INTERNACIONAL";
//    public final static String PROCEDURE_GET_MASK_CP = "PROCEDURE.GET.MASK.CP";
//    public final static String PROCEDURE_GET_OFFICE_DATA_POSTAL_MAIL = "PROCEDURE.GET.OFFICE.DATA.POSTAL.MAIL";
//    public final static String PROCEDURE_GET_FACTURA_ENVIOS = "PROCEDURE.GET.FACTURA.ENVIOS";

    /* PROCEDICIMIENTOS DAO PRODUCT */
//    public final static String PROCEDURE_SIMULADOR_TASACION_ENVIO = "PROCEDURE.SIMULADOR.TASACION.ENVIO";
//    public final static String PROCEDURE_GET_PRODUCTO_WS_CAJA = "PROCEDURE.GET.PRODUCTO.WS.CAJA";
//    public final static String PROCEDURE_GET_COMPROMISO_ENTREGA = "PROCEDURE.GET.COMPROMISO.ENTREGA";
//    public final static String PROCEDURE_GET_PRODUCTOS_PERMITIDOS_ADMISION_CEX = "PROCEDURE.GET.PRODUCTOS.PERMITIDOS.ADMISION.CEX";

    /* PRIVADO GRABACION Y RECOGIDA (PA_WWW o PA_WWW_CLIENTES) */
//    public final static String PROCEDURE_GET_CLIENTE_CENTRO_MODO_PRIVADA = "PROCEDURE.GET.CLIENTE.CENTRO.MODO.PRIVADA";
//    public final static String PROCEDURE_GETPAISES_PRIVADA = "PROCEDURE.GETPAISES.PRIVADA";
//    public final static String PROCEDURE_CALCULAR_RECOGIDA_PRIVADA = "PROCEDURE.CALCULAR.RECOGIDA.PRIVADA";
//    public final static String PROCEDURE_GET_PRODUCTOS_PERMITIDOS_PRIVADA = "PROCEDURE.GET.PRODUCTOS.PERMITIDOS.PRIVADA";
//    public final static String PROCEDURE_GRABAR_RECOGIDA_WEB_PRIVADA = "PROCEDURE.GRABAR.RECOGIDA.WEB.PRIVADA";
//    public final static String PROCEDURE_GRABAR_ENVIO_WEB_CHX_PRIVADA = "PROCEDURE.GRABAR.ENVIO.WEB.CHX.PRIVADA";
//    public final static String PROCEDURE_MARCAR_ENVIO_IMPRESO_PRIVADA = "PROCEDURE.MARCAR.ENVIO.IMPRESO.PRIVADA";
//    public final static String PROCEDURE_MARCAR_ENVIO_ENVIADO_PRIVADA = "PROCEDURE.MARCAR.ENVIO.ENVIADO.PRIVADA";
//    public final static String PROCEDURE_GET_USUARIO_PERSONALIZADO_PRIVADA = "PROCEDURE.GET.USUARIO.PERSONALIZADO.PRIVADA";
//    public final static String PROCEDURE_CUMPLE_HORA_CORTE_PRIVADA = "PROCEDURE.CUMPLE.HORA.CORTE.PRIVADA";
//    public final static String PROCEDURE_GRABAR_ENVIO_PERSONALIZADO_PRIVADA = "PROCEDURE.GRABAR.ENVIO.PERSONALIZADO.PRIVADA";
//    public final static String PROCEDURE_GET_ENVIO_WEB_PRIVADA = "PROCEDURE.GET.ENVIO.WEB.PRIVADA";
//    public final static String PROCEDURE_GET_PRIVATE_OFFICE_DATA = "PROCEDURE.GET.PRIVATE.OFFICE.DATA";
//
//    public final static String PROCEDURE_MODIFICAR_RECLAMACION_PRIVADA = "PROCEDURE.MODIFICAR.RECLAMACION.PRIVADA";
//    public final static String PROCEDURE_BUSCAR_RECLAMACIONES_PRIVADA = "PROCEDURE.BUSCAR.RECLAMACIONES.PRIVADA";
//    public final static String PROCEDURE_GET_RECLAMACION_PRIVADA = "PROCEDURE.GET.RECLAMACION.PRIVADA";
//    public final static String PROCEDURE_GRABAR_SEGUIMIENTO_RECLAMACION_PRIVADA = "PROCEDURE.GRABAR.SEGUIMIENTO.RECLAMACION.PRIVADA";
//
//    public final static String PROCEDURE_BUSCAR_BANCOS_CLIENTE_PRIVADA = "PROCEDURE.BUSCAR.BANCOS.CLIENTE.PRIVADA";
//    public final static String PROCEDURE_BUSCAR_VALIJAS_OFICINA_PRIVADA = "PROCEDURE.BUSCAR.VALIJAS.OFICINA.PRIVADA";
//
//    public final static String PROCEDURE_BORRAR_ENVIO_WEB_PRIVADO = "PROCEDURE.BORRAR.ENVIO.WEB.PRIVADO";
//    public final static String PROCEDURE_BUSCAR_ENVIOS_WEB_PRIVADO = "PROCEDURE.BUSCAR.ENVIOS.WEB.PRIVADO";
//
//    public final static String PROCEDURE_GET_DATOS_FINANCIEROS_PRIVADO = "PROCEDURE.GET.DATOS.FINANCIEROS.PRIVADO";
//    public final static String PROCEDURE_BUSCAR_ENVIOS_FACT_PREVISTA_PRIVADO = "PROCEDURE.BUSCAR.ENVIOS.FACT.PREVISTA.PRIVADO";
//    public final static String PROCEDURE_BUSCAR_FACTURAS_PRIVADO = "PROCEDURE.BUSCAR.FACTURAS.PRIVADO";
//    public final static String PROCEDURE_GET_SUPLEMENTOS_ENVIO = "PROCEDURE.GET.SUPLEMENTOS.ENVIO";
//    public final static String PROCEDURE_BUSCAR_EXP_INDEMNIZACION_PRIVADO = "PROCEDURE.BUSCAR.EXP.INDEMNIZACION.PRIVADO";
//    public final static String PROCEDURE_GET_EXP_INDEMNIZACION_PRIVADO = "PROCEDURE.GET.EXP.INDEMNIZACION.PRIVADO";
//    public final static String PROCEDURE_GRABAR_DOCS_EXP_INDEMNIZACION_PRIVADO = "PROCEDURE.GRABAR.DOCS.EXP.INDEMNIZACION.PRIVADO";
//    public final static String PROCEDURE_INSERTAR_TRAZA_ERROR_JAVA_PRIVADO = "PROCEDURE.INSERTAR.TRAZA.ERROR.JAVA.PRIVADO";
//
//    public final static String PROCEDURE_CAMBIAR_CONTRASENIA_USUARIO_WEB = "PROCEDURE.CAMBIAR.CONTRASENIA.USUARIO.WEB";
//
//    public final static String PROCEDURE_BUSCAR_POBLACION_SIMILAR = "PROCEDURE.BUSCAR.POBLACION.SIMILAR";
//
//    public final static String PROCEDURE_BUSCAR_RECOGIDAS_PRIVADA = "PROCEDURE.BUSCAR.RECOGIDAS.PRIVADA";
//    public final static String PROCEDURE_GET_RECOGIDA_PRIVADA = "PROCEDURE.GET.RECOGIDA.PRIVADA";
//    public final static String PROCEDURE_COMPROBAR_RECOGIDA_MODIFICABLE_PRIVADA = "PROCEDURE.COMPROBAR.RECOGIDA.MODIFICABLE.PRIVADA";
//    public final static String PROCEDURE_ACTUALIZA_DESTINO_RECOGIDA_PRIVADA = "PROCEDURE.ACTUALIZA.DESTINO.RECOGIDA.PRIVADA";
//
//    public final static String PROCEDURE_ALTA_ENVIO_FACTURA = "PROCEDURE.ALTA.ENVIO.FACTURA";
//
//    public final static String PROCEDURE_SIMULADOR_TASACION_ENVIO_PRIVADA = "PROCEDURE.SIMULADOR.TASACION.ENVIO.PRIVADA";
//
//    /* PROCEDIMIENTOS CONFIGURAR ALBARAN */
//    public final static String PROCEDURE_GET_FORMATO_ALBARANES = "PROCEDURE.GET.FORMATO.ALBARANES";
//    public final static String PROCEDURE_GET_CONFIGURACION_ALBARAN = "PROCEDURE.GET.CONFIGURACION.ALBARAN";
//    public final static String PROCEDURE_GRABAR_CONFIGURACION_ALBARAN = "PROCEDURE.GRABAR.CONFIGURACION.ALBARAN";
//    /* FIN PROCEDIMIENTOS CONFIGURAR ALBARAN */
//
//    /* PROCEDIMIENTOS ALTA USUARIOS */
//    public final static String PROCEDURE_GET_NOMBRE_CLIENTE = "PROCEDURE.GET.NOMBRE.CLIENTE";
//    public final static String PROCEDURE_SET_ALTA_USUARIO = "PROCEDURE.SET.ALTA.USUARIO";
//    public final static String PROCEDURE_GET_USUARIOS = "PROCEDURE.GET.USUARIOS";
//    public final static String PROCEDURE_SET_BAJA_USUARIO = "PROCEDURE.SET.BAJA.USUARIO";
//    public final static String PROCEDURE_GET_OBTIENE_DETALLE = "PROCEDURE.GET.OBTIENE.DETALLE";
//    /* FIN PROCEDIMIENTOS ALTA USUARIOS */
//
//    /* PROCEDIMIENTOS DETALLE RECOGIDA PUBLICO */
//    public final static String PROCEDURE_GET_RECOGIDA_PUBLICO = "PROCEDURE.GET.RECOGIDA.PUBLICO";
//    public final static String PROCEDURE_GET_RECOGIDA_LOGOFF_URL = "PROCEDURE.GET.RECOGIDA_URL";
//    /* PROCEDIMIENTOS DETALLE RECOGIDA PUBLICO */
//
//    /* PROCEDIMIENTOS GESTION INCIDENCIAS */
//    public final static String PROCEDURE_BUSCAR_GESTIONES = "PROCEDURE.BUSCAR.GESTIONES";
//    public final static String PROCEDURE_GET_GESTION_SPR = "PROCEDURE.GET.GESTION.SPR";
//    public final static String PROCEDURE_GRABAR_SEGUIMIENTO_GESTION = "PROCEDURE.GRABAR.SEGUIMIENTO.GESTION";
//    public final static String PROCEDURE_GRABAR_SOLUCION_DEVOLVER_ENVIO = "PROCEDURE.GRABAR.SOLUCION.DEVOLVER.ENVIO";
//    /* FIN PROCEDIMIENTOS GESTION INCIDENCIAS */
//
//    public final static String SHA1 = "SHA1";
//
//    public final static String JBOSS_SERVER_CONF_URL = "jboss.server.config.url";
//
//    public final static String FILE = "file:";
//    public final static String BLANK = "";
//
//    public final static String CONFIG_CHX_PROPERTIES = "config_chronoexpres_utils.properties";
//    public final static String BD_URL = "urlDB";
//    public final static String BD_USER = "user";
//    public final static String BD_PWD = "pwd";
//    public final static String NO_APLICA = "N/A";
//
//    public final static String EXPORT_LIST_TYPE = "list";
//    public final static String EXPORT_DETAIL_TYPE = "detail";
//    public static final String EXPORT_FILE_LIST_NAME = "list";
//    public static final String EXPORT_FILE_DETAIL_NAME = "detail";
//
//    public final static String EXPORT_DETAIL_PICKUP_TYPE = "pickup";
//    public final static String EXPORT_DETAIL_SHIPPING_TYPE = "shipping";
      public final static String EXPORT_PORTLET_NAME = "export.portlet.name";

    public final static String EXPORT_PDF_TYPE = "pdf";
    public final static String EXPORT_PDF_LIST = "export.pdf.list";
    public final static String EXPORT_PDF_LIST_HEADER = "export.pdf.list.headers";
    public final static String EXPORT_PDF_EXTENSION = ".pdf";
    public final static String EXPORT_PDF_ATTACHMENT = "attachment";
    public final static String EXPORT_PDF_ATTACHMENT_INLINE = "inline";
    public final static String EXPORT_PDF_FILENAME = "filename";
    public final static String EXPORT_PDF_CONTENT_TYPE = "application/pdf";
    public final static String EXPORT_PDF_FORTMAT_DATE = "dd-MM-yyyy HH:mm:ss";
    public final static String EXPORT_PDF_HEARDER_IMG = "logo%20correos_Express.png";
    public final static String EXPORT_PDF_HEARDER_TEXT = "export.pdf.header.text";
    public final static String EXPORT_PDF_HEARDER_DATE = "export.pdf.header.date";
    public final static String EXPORT_PDF_FOOTER = "export.pdf.footer.text";
    public final static String EXPORT_PDF_KEY_PREFIX = "export.pdf.";
    public final static String EXPORT_PDF_LONG_DATE_FORMAT = "dd-MM-yyy HH:mm:ss";
    public final static Integer EXPORT_PDF_DEFAULT_SIZE = 100;
    public final static Integer EXPORT_PDF_DEFAULT_COLSPAN = 1;
    public final static Float EXPORT_PDF_DEFAULT_PADDING = 0f;
    public final static Float EXPORT_PDF_DEFAULT_FIXEDHEIGHT = 20f;
//
//    public final static String EXPORT_XLS_TYPE = "xls";
      public final static String EXPORT_XLS_LIST = "export.xls.list";
      public final static String EXPORT_XLS_LIST_HEADER = "export.xls.list.headers";
//    public final static String EXPORT_XLS_EXTENSION = ".xls";
//    public final static String EXPORT_XLS_CONTENT_TYPE = "application/vnd.ms-excel";
//    public final static String EXPORT_XLS_ATTACHMENT = "attachment";
//    public final static String EXPORT_XLS_FILENAME = "filename";
//    public final static String EXPORT_XLS_FORTMAT_DATE = "dd-MM-yyyy HH:mm:ss";
//    public final static String EXPORT_XLS_HEARDER_IMG = "logo correos_Express.png";
      public final static String EXPORT_XLS_HEARDER_TEXT = "export.xls.header.text";
      public final static String EXPORT_XLS_HEARDER_DATE = "export.xls.header.date";
//    public final static String EXPORT_XLS_FOOTER = "export.pdf.footer";
//    public final static String EXPORT_XLS_KEY_PREFIX = "export.xls.";
      public final static String EXPORT_XLS_LONG_DATE_FORMAT = "dd-MM-yyy HH:mm:ss";
//
//    public static String DEFAULT_DATE_FORMAT = "dd/MM/yyyy";
//    public static String DEFAULT_LOCALE = "es";
//
//    public final static String EXPORT_XLS_DETAIL = "export.xls.detail";
//    public final static String EXPORT_XLS_DETAIL_SHEETS = "export.xls.detail.sheets";
      public final static String EXPORT_XLS_DETAIL_SHEETS_HEADER = "export.xls.detail.sheets.header";
//    public final static String EXPORT_XLS_DETAIL_SHEETS_COLUMNS = "export.xls.detail.sheets.columns";
      public final static String EXPORT_XLS_DETAIL_HEARDER_TEXT = "export.xls.detail.header.text";
//    public final static String EXPORT_XLS_DETAIL_HEADER_KEY_PREFIX = "export.xls.detail.header.";
//    public final static String EXPORT_XLS_DETAIL_KEY_PREFIX = "export.xls.detail.";

    public final static String EXPORT_PDF_DETAIL = "export.pdf.detail";
    public final static String EXPORT_PDF_DETAIL_SHEETS = "export.pdf.detail.sheets";
    public final static String EXPORT_PDF_DETAIL_SHEETS_HEADER = "export.pdf.detail.sheets.header";
    public final static String EXPORT_PDF_DETAIL_SHEETS_COLUMNS = "export.pdf.detail.sheets.columns";
    public final static String EXPORT_PDF_DETAIL_HEARDER_TEXT = "export.pdf.detail.header.text";
    public final static String EXPORT_PDF_DETAIL_HEADER_KEY_PREFIX = "export.pdf.detail.header.";
    public final static String EXPORT_PDF_DETAIL_KEY_PREFIX = "export.pdf.detail.";
    public final static String EXPORT_PDF_DETAIL_TOTAL_REGISTRY = "export.pdf.detail.registrycount";

    public final static String EXPORT_NONE = "none";
    public final static String EXPORT_COL = "col";
    public final static String EXPORT_BLANCK = "blanck";
    public final static String EXPORT_CORREOSEXPRESS_TITLE = "export.correosexpress.title";

    public final static int COLUMNS_SECTIONS = 2;
    public final static float CELL_HEIGHT = 16;

    // PROPIEDADES PARA LA GENERACION DE PDFs

    // COMUNES A MAS DE UN TIPO DE PDF
    public final static String INSURANCE = "insurance";
    public final static String INSURANCEVALUE = "insuranceValue";
    public final static String OBSERVATIONS = "observations";
    public final static String OFFICESHIPPINGNUMBER = "officeShippingNumber";
    public final static String PARCELS = "parcels";
    public final static String PRODUCTNAME = "productName";
    public final static String PRODUCTCODE = "productCode";
    public final static String RECEIVER_ADDRESS = "receiver.address";
    public final static String RECEIVER_CITY = "receiver.city";
    public final static String RECEIVER_CP = "receiver.cp";
    public final static String POSTAL_MAIL_CP = "postal.mail.cp";
    public final static String RECEIVER_COUNTRY = "receiver.country";
    public final static String RECEIVER_NAME = "receiver.name";
    public final static String RECEIVER_PHONE = "receiver.phone";
    public final static String REFUND = "refund";
    public final static String REFUNDVALUE = "refundValue";
    public final static String SENDER_ADDRESS = "sender.address";
    public final static String SENDER_PHONE = "sender.phone";
    public final static String SENDER_NAME = "sender.name";
    public final static String POST_OFFICE_BOX = "post.office.box";

    // etiqueta y deliveryNote
    public final static String CHX_DESTINATION = "receiver.city2";

    public final static String HIDE_SENDER = "sender.hide";
    public final static String REFERENCE = "reference";
    public final static String KEYCLI = "keycli";
    public final static String CENTER_NAME = "sender.center.name";
    public final static String SENDER_KEYCLI = "sender.keycli";
    public final static String WEIGHT = "weight";
    public final static String ENVIORETORNO = "envioRetorno";
    public final static String DATE = "date";
    public final static String RECORDING_DATE = "recordingDate";
    public final static String PORTAGE = "portage";
    public final static String SENDER_ENVIOCLIENTE = "sender.envioCliente";
    public final static String FECHAENV = "fechaEnv";

    // ETIQUETA A4
//    public final static String LABELA4_TEMPLATE = "etiquetasa4";
//    public final static String LABELA4_LOGO = "labelA4.logo";
//    public final static String LABELA4_COVER = "labelA4.cover";
//    public final static String LABELA4_CLIENT_NUMBER_CENTER = "labelA4.sender.clientnumbercenter";
//    public final static String LABELA4_SENDER_NAME = "labelA4.sender.name";
//    public final static String LABELA4_SENDER_ADDRESS = "labelA4.sender.address";
//    public final static String LABELA4_SENDER_CITY_CP = "labelA4.sender.city.cp";
//    public final static String LABELA4_SENDER_PHONE_NAME = "labelA4.sender.phone.name";
//    public final static String LABELA4_OFFICESHIPPINGNUMBER = "labelA4.officeShippingNumber";
//    public final static String LABELA4_ENVIORETORNO = "labelA4.envioRetorno";
//
//    public final static String LABELA4_SENDER_ENVIOCLIENTE = "labelA4.sender.envioCliente";
//    public final static String LABELA4_SENDER_REFCLIENTE = "labelA4.sender.refCliente";
//    public final static String LABELA4_FECHAENV = "labelA4.fechaEnv";
//    public final static String LABELA4_PARCELS = "labelA4.parcels";
//    public final static String LABELA4_WEIGHT = "labelA4.weight";
//    public final static String LABELA4_TYPEGOODS = "labelA4.typeGoods";
//    public final static String LABELA4_RECEIVER_NAME = "labelA4.receiver.name";
//    public final static String LABELA4_RECEIVER_PHONECONTACT = "labelA4.receiver.phonecontact";
//    public final static String LABELA4_RECEIVER_PHONE = "phone";
//    public final static String LABELA4_RECEIVER_CONTACT = "contact";
//    public final static String LABELA4_RECEIVER_ADDRESS = "labelA4.receiver.address";
//    public final static String LABELA4_RECEIVER_CITY = "labelA4.receiver.city";
//    public final static String LABELA4_RECEIVER_CPCITY = "labelA4.receiver.cp.city";
//
//    public final static String LABELA4_PRODUCTNAME = "labelA4.productName";
//    public final static String LABELA4_DELIVERYONSATURDAY = "labelA4.deliveryOnSaturday";
//    public final static String LABELA4_REFUNDVALUE = "labelA4.refundValue";
//    public final static String LABELA4_INSURANCEVALUE = "labelA4.insuranceValue";
//
//    public final static String LABELA4_OBSERVATIONS = "labelA4.observations";
//    public final static String LABELA4_DATE = "labelA4.date";
//
//    public final static String LABELA4_DRIVER = "labelA4.driver";
//    public final static String LABELA4_DATESIGNATURE = "labelA4.datesignature";
//    public final static String LABELA4_AGREEMENT = "labelA4.agreement";
//    public final static String LABELA4_CUSTOMERSERVICEPARCEL = "labelA4.customerserviceparcel";
//    public final static String LABELA4_CUSTOMERSERVICECUSTOMER = "labelA4.customerservicecustomer";
//    public final static String LABELA4_HORIZONTAL_BARCODE = "labelA4.horizontalBarCode";
//    public final static String LABELA4_VERTICAL_BARCODE = "labelA4.verticalBarCode";

    // ETIQUETAS ADHESIVAS
//    public final static String STICKER2LABEL_TEMPLATE = "etiquetas2adhesivo";
//    public final static String STICKER2LABEL_HORIZONTAL_BARCODE = "sticker2Label.horizontalBarCode";
//    public final static String STICKER2LABEL_LOGO = "sticker2Label.logo";
//    public final static String STICKER2LABEL_COVER = "sticker2Label.cover";
//    public final static String STICKER2LABEL_VERTICAL_BARCODE = "sticker2Label.verticalBarCode";
//    public final static String STICKER2LABEL_COVER_RECTANGLE = "sticker2Label.coverRectangle";
//
//    public final static String STICKER2LABEL_CLIENT_NUMBER_CENTER = "sticker2label.sender.clientnumbercenter";
//    public final static String STICKER2LABEL_SENDER_NAME = "sender.name";
//    public final static String STICKER2LABEL_SENDER_ADDRESS = "sender.address";
//    public final static String STICKER2LABEL_SENDER_CITY_CP = "sender.city.cp";
//    public final static String STICKER2LABEL_SENDER_PHONE_NAME = "sticker2label.sender.phone.name";
//    public final static String STICKER2LABEL_OFFICESHIPPINGNUMBER = "sticker2label.officeShippingNumber";
//    public final static String STICKER2LABEL_ENVIORETORNO = "sticker2label.envioRetorno";
//
//    public final static String STICKER2LABEL_SENDER_ENVIOCLIENTE = "sticker2label.sender.envioCliente";
//    public final static String STICKER2LABEL_SENDER_REFCLIENTE = "sticker2label.sender.refCliente";
//    public final static String STICKER2LABEL_FECHAENV = "sticker2label.fechaEnv";
//    public final static String STICKER2LABEL_PARCELS = "sticker2label.parcels";
//    public final static String STICKER2LABEL_WEIGHT = "sticker2label.weight";
//    public final static String STICKER2LABEL_TYPEGOODS = "typeGoods";
//    public final static String STICKER2LABEL_RECEIVER_NAME = "receiver.name";
//    public final static String STICKER2LABEL_RECEIVER_PHONECONTACT = "sticker2label.receiver.phonecontact";
//    public final static String STICKER2LABEL_RECEIVER_PHONE = "phone";
//    public final static String STICKER2LABEL_RECEIVER_CONTACT = "contact";
//    public final static String STICKER2LABEL_RECEIVER_ADDRESS = "receiver.address";
//    public final static String STICKER2LABEL_RECEIVER_CITY = "receiver.city";
//    public final static String STICKER2LABEL_RECEIVER_CPCITY = "receiver.cp.city";
//
//    public final static String STICKER2LABEL_PRODUCTNAME = "productName";
//    public final static String STICKER2LABEL_DELIVERYONSATURDAY = "sticker2label.deliveryOnSaturdayLabel";
//    public final static String STICKER2LABEL_REFUNDVALUE = "sticker2label.refund";
//
//    public final static String STICKER2LABEL_OBSERVATIONS = "sticker2label.observations";
//    public final static String STICKER2LABEL_AGREEMENT = "sticker2label.agreement";

    // ALBARAN
    public final static String DELIVERYNOTE_DELIVERYONSATURDAY = "deliveryNote.deliveryOnSaturday";
    public final static String DELIVERYNOTE_HORIZONTALBARCODE = "deliveryNote.horizontalBarCode";
    public final static String DELIVERYNOTE_LOGO = "deliveryNote.logo";
    public final static String DELIVERYNOTE_COVER = "deliveryNote.cover";
    public final static String DELIVERYNOTE_TEMPLATE = "albaran";
    public final static String DELIVERYNOTE_REFUNDLABEL = "deliverynote.refundLabel";
    public final static String DELIVERYNOTE_CURRENCYLABEL = "deliverynote.currencyLabel";
    public final static String DELIVERYNOTE_PARCELLABEL = "deliverynote.parcelLabel";
    public final static String DELIVERYNOTE_DATELABEL = "deliverynote.dateLabel";
    public final static String DELIVERYNOTE_PORTAGELABEL = "deliverynote.portageLabel";
    public final static String DELIVERYNOTE_WEIGHTLABEL = "deliverynote.weightLabel";
    public final static String DELIVERYNOTE_WEIGHTUNITS = "deliverynote.weightUnits";
    public final static String DELIVERYNOTE_FECHAENV = "deliverynote.fechaEnv";
    public final static String DELIVERYNOTE_INSURANCELABEL = "deliverynote.insuranceLabel";
    public final static String DELIVERYNOTE_DELIVERYONSATURDAYLABEL = "deliverynote.deliveryOnSaturdayLabel";
    public final static String DELIVERYNOTE_SATURDAYLABEL = "deliverynote.saturdayLabel";
    public final static String DELIVERYNOTE_REFERENCELABEL = "deliverynote.referenceLabel";
    public final static String DELIVERYNOTE_PARCELCODE = "parcelCode";
    public final static String DELIVERYNOTE_PARCELCODELABEL = "deliverynote.parcelCodeLabel";
    public final static String DELIVERYNOTE_RECEIVERLABEL = "deliverynote.receiverLabel";
    public final static String DELIVERYNOTE_OBSERVATIONSLABEL = "deliverynote.observationsLabel";
    public final static String DELIVERYNOTE_OFFICESHIPPINGNUMBERLABEL = "deliverynote.officeShippingNumberLabel";
    public final static String DELIVERYNOTE_ENVIORETORNO = "deliverynote.envioRetornoLabel";
    public final static String DELIVERYNOTE_DE = "deliverynote.de";
    public final static String DELIVERYNOTE_SENDER_CITY = "sender.city";
    public final static String DELIVERYNOTE_SENDER_CP = "sender.cp";
    public final static String DELIVERYNOTE_RECEIVER_NAME2 = "receiver.name2";
    public final static String DELIVERYNOTE_PACKAGES = "deliverynote.packagesList";
    public final static String DELIVERYNOTE_POST_OFFICE_BOX = "deliverynote.postOfficeBox";

    // RECIBO
//    public final static String RECEIPT_TEMPLATE = "recibo";
//    public final static String RECEIPT_BAG_TEMPLATE = "reciboMaleta";
//    public final static String RECEIPT_SHIPPING = "receipt.shipping_2";
//    public final static String RECEIPT_SHIPPING_LABEL = "receipt.shipping.label";
//    public final static String RECEIPT_REFERENCE = "receipt.reference";
//    public final static String RECEIPT_SENDER_LABEL = "receipt.sender.label";
//    public final static String RECEIPT_SENDER = "receipt.sender_2";
//    public final static String RECEIPT_SENDER_ADDRESS = "receipt.sender.address";
//    public final static String RECEIPT_SENDER_PHONE = "receipt.sender.phone";
//    public final static String RECEIPT_SENDER_CONTACT = "receipt.sender.contact";
//    public final static String RECEIPT_RECEIVER_LABEL = "receipt.receiver.label";
//    public final static String RECEIPT_RECEIVER_NAME = "receipt.receiver_2";
//    public final static String RECEIPT_RECEIVER_PHONE = "receipt.receiver.phone";
      public final static String RECEIPT_RECEIVER_CONTACT = "receipt.receiver.contact";
//    public final static String RECEIPT_OBSERVATIONS = "receipt.observations";
//    public final static String RECEIPT_PARCELS = "receipt.parcels";
//    public final static String RECEIPT_WEIGHT = "receipt.weight";
//    public final static String RECEIPT_PORTAGE = "receipt.portage";
//    public final static String RECEIPT_PACKAGE_INFO = "receipt.package.info";
//    public final static String RECEIPT_PRODUCT = "receipt.product";
//    public final static String RECEIPT_ADDITIONALSERVICES = "receipt.additionalservices";
//    public final static String RECEIPT_REFUND = "receipt.refund";
//    public final static String RECEIPT_INSURANCEVALUE = "receipt.insurancevalue";
//    public final static String RECEIPT_BILLREQUESTED = "receipt.billrequested";
//    public final static String RECEIPT_CONFIRMATIONBYSMS = "receipt.confirmationbysms";
//    public final static String RECEIPT_ADMISSIONDATE = "receipt.admissiondate";
//    public final static String RECEIPT_ESTIMATEDDELIVERYDATE = "receipt.estimateddeliverydate";
//    public final static String RECEIPT_TOTAL_LABEL = "receipt.total.label";
//    public final static String RECEIPT_TOTAL = "receipt.total_2";
//    public final static String RECEIPT_CONTACTDETAILS = "receipt.contactdetails";
//    public final static String RECEIPT_POST_OFFICE_BOX = "receipt.postOfficeBox";

    // envios nacionales
//    public final static String RECEIPT_LEGALCONDITIONS = "receipt.legalconditions";
//    public final static String RECEIPT_LEGALCONDITIONS_2 = "receipt.legalconditions.2";
//    public final static String RECEIPT_LEGALCONDITIONS_3 = "receipt.legalconditions.3";
//    public final static String RECEIPT_LEGALCONDITIONS_3_MALETAS = "receipt.legalconditions.3.maletas";
//    public final static String RECEIPT_LEGALCONDITIONS_4 = "receipt.legalconditions.4";
//    public final static String RECEIPT_LEGALCONDITIONS_4_MALETAS = "receipt.legalconditions.4.maletas";
//    public final static String RECEIPT_LEGALCONDITIONS_5 = "receipt.legalconditions.5";
//    public final static String RECEIPT_LEGALCONDITIONS_6 = "receipt.legalconditions.6";
//    public final static String RECEIPT_LEGALCONDITIONS_7 = "receipt.legalconditions.7";
//    public final static String RECEIPT_LEGALCONDITIONS_8 = "receipt.legalconditions.8";
//    public final static String RECEIPT_LEGALCONDITIONS_9 = "receipt.legalconditions.9";
//    public final static String RECEIPT_LEGALCONDITIONS_10 = "receipt.legalconditions.10";
//    public final static String RECEIPT_LEGALCONDITIONS_11 = "receipt.legalconditions.11";
//    public final static String RECEIPT_LEGALCONDITIONS_12 = "receipt.legalconditions.12";
//    public final static String RECEIPT_LEGALCONDITIONS_13 = "receipt.legalconditions.13";
//    public final static String RECEIPT_LEGALCONDITIONS_14 = "receipt.legalconditions.14";
//    public final static String RECEIPT_LEGALCONDITIONS_14_MALETAS = "receipt.legalconditions.14.maletas";
    // envios internacionales
//    public final static String RECEIPT_INTERNATIONAL_LEGALCONDITIONS = "receipt.international.legalconditions";
//    public final static String RECEIPT_INTERNATIONAL_LEGALCONDITIONS_1 = "receipt.international.legalconditions.1";
//    public final static String RECEIPT_INTERNATIONAL_LEGALCONDITIONS_2 = "receipt.international.legalconditions.2";
//    public final static String RECEIPT_INTERNATIONAL_LEGALCONDITIONS_3 = "receipt.international.legalconditions.3";
//    public final static String RECEIPT_INTERNATIONAL_LEGALCONDITIONS_4 = "receipt.international.legalconditions.4";
//    public final static String RECEIPT_INTERNATIONAL_LEGALCONDITIONS_5 = "receipt.international.legalconditions.5";
//    public final static String RECEIPT_INTERNATIONAL_LEGALCONDITIONS_6 = "receipt.international.legalconditions.6";
//    public final static String RECEIPT_INTERNATIONAL_LEGALCONDITIONS_7 = "receipt.international.legalconditions.7";
//    public final static String RECEIPT_INTERNATIONAL_LEGALCONDITIONS_8 = "receipt.international.legalconditions.8";
//    public final static String RECEIPT_INTERNATIONAL_LEGALCONDITIONS_9 = "receipt.international.legalconditions.9";
//    public final static String RECEIPT_INTERNATIONAL_LEGALCONDITIONS_10 = "receipt.international.legalconditions.10";
//    public final static String RECEIPT_INTERNATIONAL_LEGALCONDITIONS_11 = "receipt.international.legalconditions.11";
//    public final static String RECEIPT_INTERNATIONAL_LEGALCONDITIONS_12 = "receipt.international.legalconditions.12";
//    public final static String RECEIPT_INTERNATIONAL_LEGALCONDITIONS_13 = "receipt.international.legalconditions.13";
//    public final static String RECEIPT_INTERNATIONAL_LEGALCONDITIONS_14 = "receipt.international.legalconditions.14";
//    public final static String RECEIPT_INTERNATIONAL_LEGALCONDITIONS_15 = "receipt.international.legalconditions.15";
//    public final static String RECEIPT_CONTENT_DESCRIPTION = "receipt.content.description";
//    public final static String RECEIPT_CONTENT_TOTAL_VALUE = "receipt.content.total.value";

    // RECOGIDAS
    public final static String PICKUP_TEMPLATE = "recogida";
    public final static String PICKUP_CLIENT_NUMBER_CENTER = "pickup.sender.clientnumbercenter";
    public final static String PICKUP_SENDER_NAME = "sender.name";
    public final static String PICKUP_SENDER_ADDRESS = "sender.address";
    public final static String PICKUP_SENDER_CITY_CP = "sender.city.cp";
    public final static String PICKUP_SENDER_PHONE_NAME = "pickup.sender.phone.name";
    public final static String PICKUP_OFFICESHIPPINGNUMBER = "pickup.officeShippingNumber";
    public final static String PICKUP_OFFICESHIPPINGNUMBER_CHX = "pickup.officeShippingNumberCHX";
    public final static String PICKUP_OFFICESHIPPINGNUMBER_CLI = "pickup.officeShippingNumberCli";
    public final static String PICKUP_MOSTRARPROPIO = "pickup.MostrarPropio";

    public final static String PICKUP_SENDER_ENVIOCLIENTE = "pickup.sender.envioCliente";
    public final static String PICKUP_SENDER_REFCLIENTE = "pickup.sender.refCliente";
    public final static String PICKUP_NUMBER = "pickup.number";
    public final static String PICKUP_PARCELS = "pickup.parcels";
    public final static String PICKUP_WEIGHT = "pickup.weight";
    public final static String PICKUP_TYPEGOODS = "pickup.typeGoods";
    public final static String PICKUP_RECEIVER_NAME = "pickup.receiver.name";
    public final static String PICKUP_RECEIVER_PHONECONTACT = "pickup.receiver.phonecontact";
    public final static String PICKUP_RECEIVER_PHONE = "phone";
    public final static String PICKUP_RECEIVER_CONTACT = "contact";
    public final static String PICKUP_RECEIVER_ADDRESS = "pickup.receiver.address";
    public final static String PICKUP_RECEIVER_CITY = "pickup.receiver.city";
    public final static String PICKUP_RECEIVER_CPCITY = "pickup.receiver.cp.city";

    public final static String PICKUP_PRODUCTNAME = "pickup.productName";
    public final static String PICKUP_DELIVERYONSATURDAY = "pickup.deliveryOnSaturday";
    public final static String PICKUP_REFUNDVALUE = "pickup.refundValue";
    public final static String PICKUP_INSURANCEVALUE = "pickup.insuranceValue";
    public final static String PICKUP_TOTAL = "pickup.total";

    public final static String PICKUP_OBSERVATIONS = "pickup.observations";
    public final static String PICKUP_DATE = "pickup.date";

    public final static String PICKUP_DRIVER = "pickup.driver";
    public final static String PICKUP_DATESIGNATURE = "pickup.datesignature";
    public final static String PICKUP_AGREEMENT = "pickup.agreement";
    public final static String PICKUP_CUSTOMERSERVICEPARCEL = "pickup.customerserviceparcel";
    public final static String PICKUP_CUSTOMERSERVICECUSTOMER = "pickup.customerservicecustomer";
    public final static String PICKUP_HORIZONTAL_BARCODE = "pickup.horizontalBarCode";
    public final static String PICKUP_VERTICAL_BARCODE = "pickup.verticalBarCode";

    public final static String OFICINAS_REDIRECT_URL = "oficinas.redirect.url";
    public final static String FLAG_REDIRECT_URL = "flag.redirect.url";

    // DECLARACION DE VALOR (DECLARATION OF VALUE)
//    public final static String DOV_TEMPLATE = "declarationofvalue";
//    public final static String DOV_TEMPLATE_PUBLIC = "declarationofvaluepublic";
//
//    public final static String DOV_TICK = "S";
//    public final static String DOV_CROSS = "\u00A3";

    // contents of item
//    public final static String DOV_IS_DOCUMENTATION = "documentscheck";
//    public final static String DOV_IS_GOODS = "merchandisecheck";
//    public final static String DOV_IS_DANGEROUS_GOODS = "dangerousmerchandisecheck";

    // additional services
//    public final static String DOV_IS_INSURANCE = "insurancecheck";
//
//    public final static String DOV_SENDER_NIF = "sender.nif";
//    public final static String DOV_SENDER_COMPANY = "sender.company";
//    public final static String DOV_SENDER_CONTACT = "sender.contact";
//    public final static String DOV_SENDER_POSTCODE = "sender.postcode";
//    public final static String DOV_SENDER_PROVINCE = "sender.province";
//    public final static String DOV_SENDER_COUNTRY = "sender.country";
//    public final static String DOV_SENDER_COUNTRY_CODE = "sender.country.code";
//    public final static String DOV_SENDER_EMAIL = "sender.email";
//    public final static String DOV_RECEIVER_NIF = "receiver.nif";
//    public final static String DOV_RECEIVER_COMPANY = "receiver.company";
//    public final static String DOV_RECEIVER_CONTACT = "receiver.contact";
//    public final static String DOV_RECEIVER_POSTCODE = "receiver.postcode";
//    public final static String DOV_RECEIVER_EMAIL = "receiver.email";
//    public final static String DOV_RECEIVER_COUNTRY = "receiver.country.code";
//    public final static String DOV_RECEIVER_COUNTRY_UE = "receiver.country.code.ue";
//    public final static String DOV_AMOUNT = "amount";
//    public final static String DOV_DESCRIPTION = "description";
//    public final static String DOV_WEIGHT = "weight";
//    public final static String DOV_VALUE = "value";
//    public final static String DOV_CONTENTS = "contents";
//    public final static String DOV_TOTALVALUE = "totalvalue";
//    public final static String DOV_COPIES = "dov.copies";
//    public final static String DOV_COMMENTS = "comments";
//    public final static String DOV_DOCUMENTS_CHECK = "documentscheck";
//    public final static String DOV_DOCUMENTS = "dov.documentation";

    // Type shipping declaration of value
//    public final static int TYPE_SHIPPING_OFFICE = 0;
//    public final static int TYPE_SHIPPING_PUBLIC = 1;
//    public final static int TYPE_SHIPPING_PRIVATE = 2;
//
//    public final static BigDecimal EQUIPAQ_KEYTSV = new BigDecimal(94);

//    public final static String ORIGIN_APP = "origin.app";
//    public final static String ORIGIN_APP_PUBLIC = "public";
//    public final static String ORIGIN_APP_PRIVATE = "private";
    
    
    
    /** DB_PACKAGE_NAME_CHX_WS_GENERICO */
	public static final String DB_PACKAGE_NAME_CHX_WS_GENERICO = "CHX_WS_GENERICO";
	
	/** DB_PACKAGE_NAME_CR_RECEPCION */
	public static final String DB_PACKAGE_NAME_PA_DEVUELVE_ETIQUETAS = "PA_DEVUELVE_ETIQUETAS";
	
	public static final String DB_PACKAGE_NAME_PCK_WS_DEVOLUCION = "PCK_WS_DEVOLUCION";


   
	public static final String ENCODING_UTF_8 = "UTF-8";
	public static final String ERROR_GRABAR_ENVIO = "ERROR GRABAR_ENVIO";
	public static final String CADENA_VACIA = "";
	public static Integer CONTADOR_BULTOS = 1;
	public static final String KEY_ESQUEMA = "keyEsquema";
	public static final String PATH_PDF = "rutaPDF";
	public static final String GENERAR_PDF = "generarPDF";
	
	/** Esquema ownwer de los tipos de datos Oracle */
	public static final String DBTYPES_OWNER = "ALERTRAN.ARRAYBULT";
	
	/** JSON_FORMAT */
	public static final String JSON_FORMAT = "JSON";
	/** XML_FORMAT */
	public static final String XML_FORMAT = "XML";
	
	
	/** JDBC_PROPERTIES */ 
	public static final String JDBC_PROPERTIES = "jdbc.properties";
	/** ORACLE_DRIVER */ 
	public static final String JDBC_DRIVER = "jdbc.driverClassName";
	/** ORACLE_URI */ 
	public static final String JDBC_URL = "jdbc.url";
	/** JDBC_USER */ 
	public static final String JDBC_USER = "jdbc.username";
	/** JDBC_PASS */ 
	public static final String JDBC_PASS = "jdbc.password";
	
    
    
    

}