package br.com.layoutretbanc.builder;

public class DirectoryFolder {

	/*
	 * Modificar o diretorio padrão, para que seja lido os arquivos que foram
	 * salvos atraves do banco.
	 */
	public static String directory = "C:\\ArquivoRetBanc"; //Diretorio de arquivos que contem na linha "OO".
	public static String newDirectory = "C:\\ArquivoRetBanc\\ArquivosRet_BD"; //Diretorio de arquivos que contem na linha "BD".
	public static String directoryCH = "C:\\ArquivoRetBanc\\ArquivosRet_00\\CONCRETO_HOLDING"; //Holding
	public static String directoryObG = "C:\\ArquivoRetBanc\\ArquivosRet_00\\CONCRETO_OBG"; //Obras Gerais
	public static String directoryNeg = "C:\\ArquivoRetBanc\\ArquivosRet_00\\CONCRETO_NEG"; //Negocio
	public static String directoryCom = "C:\\ArquivoRetBanc\\ArquivosRet_00\\CONCRETO_COM"; //COM
	public static String directoryCpr = "C:\\ArquivoRetBanc\\ArquivosRet_00\\CONCRETO_CPR";	//CPR
	public static String directoryQui = "C:\\ArquivoRetBanc\\ArquivosRet_00\\CONCRETO_QUI";	//Quintas
	public static String directoryPnl = "C:\\ArquivoRetBanc\\ArquivosRet_00\\CONCRETO_PNL"; //Portal Nova Lima
	public static String directoryBlue = "C:\\ArquivoRetBanc\\ArquivosRet_00\\CONCRETO_BLUE"; //Blue
	public static String directoryGd = "C:\\ArquivoRetBanc\\ArquivosRet_00\\CONCRETO_GARDEN"; //Garden
	public static String directoryGt = "C:\\ArquivoRetBanc\\ArquivosRet_00\\CONCRETO_GREEN"; //Green
	public static String directoryImp = "C:\\ArquivoRetBanc\\ArquivosRet_00\\CONCRETO_IMP"; //Imperial
	public static String directoryLum = "C:\\ArquivoRetBanc\\ArquivosRet_00\\CONCRETO_LUM"; //Lumiere
	public static String directoryVic = "C:\\ArquivoRetBanc\\ArquivosRet_00\\CONCRETO_VIC";	//Victoria
	public static String directoryHsp = "C:\\ArquivoRetBanc\\ArquivosRet_00\\CONCRETO_HPS"; //Hotel São Paulo
	public static String directorySpe = "C:\\ArquivoRetBanc\\ArquivosRet_00\\CONCRETO_SPE"; //SPE Patagonia
	
	public static String nome;

	public static String getNome() {
		return nome;
	}

	public static void setNome(String nome) {
		DirectoryFolder.nome = nome;
	}

}
