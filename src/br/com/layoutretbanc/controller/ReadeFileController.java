package br.com.layoutretbanc.controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import br.com.layoutretbanc.builder.DirectoryFolder;
import br.com.layoutretbanc.builder.ListFile;
import br.com.layoutretbanc.builder.MoveFile;

public class ReadeFileController {
	DirectoryFolder df = new DirectoryFolder();
	MoveFileController mfc = new MoveFileController();
	MoveFile mf = new MoveFile();

	public static String line = "";
	public static String header = "";
	public static String loteHeader = "";
	public static String trailer = "";

	private BufferedReader readerHeader;
	private BufferedReader readerTrailer;

	// reader header and lote header .ret banc
	public void headerDetalhe() {

		try {
			readerHeader = new BufferedReader(
					new FileReader(new File(OpenFolderController.dir + "\\" + DirectoryFolder.getNome())));
			try {
				header = readerHeader.readLine().concat("\n").toString();
				ListFile.setHeader(header);
				while ((line = readerHeader.readLine()) != null) {
					loteHeader = line.substring(line.indexOf("")).concat("\n").toString();
					ListFile.setLoteHeader(loteHeader);
					break;
				}
				readerHeader.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// reader trailer .ret banc
	public void trailerDetalhe() {
		try {
			readerTrailer = new BufferedReader(
					new FileReader(new File(OpenFolderController.dir + "\\" + DirectoryFolder.getNome())));
			try {
				while ((line = readerTrailer.readLine()) != null) {
					if (line != null) {
						trailer = line.substring(line.indexOf("")).concat("\n").toString();
						ListFile.setTrailer(trailer);
					}
				}
				readerTrailer.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	/*
	 * Leitura e movimentacao dos arquivos para suas pastas destino
	 * Arquivos ainda não separado pelas sua linha.
	 */
	
	public void filesMove(){
		if (ListFile.getHeader().contains(mf.lineArqOneConHold)) {
			MoveFileController.moveFilesCh();
		} else if (ListFile.getHeader().contains(mf.lineArqOneConObG)) {
			MoveFileController.moveFilesObG();
		}else if(ListFile.getHeader().contains(mf.lineArqOneConCom)){
			MoveFileController.moveFilesCom();
		}else if(ListFile.getHeader().contains(mf.lineArqOneConCpr)){
			MoveFileController.moveFilesCpr();
		}else if(ListFile.getHeader().contains(mf.lineArqOneConQui)){
			MoveFileController.moveFilesQui();
		}else if(ListFile.getHeader().contains(mf.lineArqOneConPnl)){
			MoveFileController.moveFilesPnl();
		}else if(ListFile.getHeader().contains(mf.lineArqOneConNeg)){
			MoveFileController.moveFilesNeg();
		}else if(ListFile.getHeader().contains(mf.lineArqOneConGd)){
			MoveFileController.moveFilesGd();
		}else if(ListFile.getHeader().contains(mf.lineArqOneConGt)){
			MoveFileController.moveFilesGt();
		}else if(ListFile.getHeader().contains(mf.lineArqOneConImp)){
			MoveFileController.moveFilesImp();
		}else if(ListFile.getHeader().contains(mf.lineArqOneConLum)){
			MoveFileController.moveFilesLum();
		}else if(ListFile.getHeader().contains(mf.lineArqOneConVic)){
			MoveFileController.moveFilesVic();
		}else if(ListFile.getHeader().contains(mf.lineArqOneConBlue)){
			MoveFileController.moveFilesBlue();
		}else if(ListFile.getHeader().contains(mf.lineArqOneConHsp)){
			MoveFileController.moveFilesHsp();
		}else if(ListFile.getHeader().contains(mf.lineArqOneConSpe)){
			MoveFileController.moveFilesSpe();
		}			
	}
}
