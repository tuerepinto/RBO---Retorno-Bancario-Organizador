package br.com.layoutretbanc.controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import br.com.layoutretbanc.builder.DirectoryFolder;
import br.com.layoutretbanc.builder.MoveFile;

/*
 * Move cada arquivo para sua pasta de destino
 * validado pela sua conta corrente de pagamento.
 */

public class MoveFileController {

	MoveFile mf = new MoveFile();

	static Path originalFile; // arquivo original destino
	static Path moveFileObG;  //Obras Gerais
	static Path moveFileCh;	  //Holding
	static Path moveFileNeg;  //Concreto Negocios	
	static Path moveFileCom;  //COM
	static Path moveFileCpr;  //CPR
	static Path moveFileQui;  //Quintas
	static Path moveFilePnl;  //Portal Nova Lima
	static Path moveFileGd;   //Garden
	static Path moveFileGt;   //Green
	static Path moveFileImp;  //Imperial
	static Path moveFileLum;  //Lumiere
	static Path moveFileVic;  //Victoria
	static Path moveFileBlue; //Blue
	static Path moveFileHsp;  //Hotel Sao Paulo
	static Path moveFileSpe;  //Spe Patagonia

	public static void moveFilesCh() {

		originalFile = Paths.get(OpenFolderController.dir + "\\" + DirectoryFolder.getNome());
		moveFileCh = Paths.get(DirectoryFolder.directoryCH + "\\" + DirectoryFolder.getNome());

		try {
			Files.move(originalFile, moveFileCh, StandardCopyOption.REPLACE_EXISTING);
		} catch (IOException e) {
			System.out.println("Arquivo não foi movido.");
			e.printStackTrace();
		}
	}

	public static void moveFilesObG() {

		originalFile = Paths.get(OpenFolderController.dir + "\\" + DirectoryFolder.getNome());
		moveFileObG = Paths.get(DirectoryFolder.directoryObG + "\\" + DirectoryFolder.getNome());

		try {
			Files.move(originalFile, moveFileObG, StandardCopyOption.REPLACE_EXISTING);
		} catch (Exception e) {
			System.out.println("Arquivo não foi movido.");
			e.printStackTrace();
		}
	}

	public static void moveFilesCom() {
		originalFile = Paths.get(OpenFolderController.dir + "\\" + DirectoryFolder.getNome());
		moveFileCom = Paths.get(DirectoryFolder.directoryCom + "\\" + DirectoryFolder.getNome());

		try {
			Files.move(originalFile, moveFileCom, StandardCopyOption.REPLACE_EXISTING);
		} catch (Exception e) {
			System.out.println("Arquivo não foi movido.");
			e.printStackTrace();
		}
	}

	public static void moveFilesCpr() {
		originalFile = Paths.get(OpenFolderController.dir + "\\" + DirectoryFolder.getNome());
		moveFileCpr = Paths.get(DirectoryFolder.directoryCpr + "\\" + DirectoryFolder.getNome());

		try {
			Files.move(originalFile, moveFileCpr, StandardCopyOption.REPLACE_EXISTING);
		} catch (Exception e) {
			System.out.println("Arquivo não foi movido.");
			e.printStackTrace();
		}
	}

	public static void moveFilesQui() {
		originalFile = Paths.get(OpenFolderController.dir + "\\" + DirectoryFolder.getNome());
		moveFileQui = Paths.get(DirectoryFolder.directoryQui + "\\" + DirectoryFolder.getNome());

		try {
			Files.move(originalFile, moveFileQui, StandardCopyOption.REPLACE_EXISTING);
		} catch (Exception e) {
			System.out.println("Arquivo não foi movido.");
			e.printStackTrace();
		}
	}

	public static void moveFilesPnl() {
		originalFile = Paths.get(OpenFolderController.dir + "\\" + DirectoryFolder.getNome());
		moveFilePnl = Paths.get(DirectoryFolder.directoryPnl + "\\" + DirectoryFolder.getNome());

		try {
			Files.move(originalFile, moveFilePnl, StandardCopyOption.REPLACE_EXISTING);
		} catch (Exception e) {
			System.out.println("Arquivo não foi movido.");
			e.printStackTrace();
		}
	}

	public static void moveFilesNeg() {
		originalFile = Paths.get(OpenFolderController.dir + "\\" + DirectoryFolder.getNome());
		moveFileNeg = Paths.get(DirectoryFolder.directoryNeg + "\\" + DirectoryFolder.getNome());

		try {
			Files.move(originalFile, moveFileNeg, StandardCopyOption.REPLACE_EXISTING);
		} catch (Exception e) {
			System.out.println("Arquivo não foi movido.");
			e.printStackTrace();
		}
	}

	public static void moveFilesGd() {
		originalFile = Paths.get(OpenFolderController.dir + "\\" + DirectoryFolder.getNome());
		moveFileGd = Paths.get(DirectoryFolder.directoryGd + "\\" + DirectoryFolder.getNome());

		try {
			Files.move(originalFile, moveFileGd, StandardCopyOption.REPLACE_EXISTING);
		} catch (Exception e) {
			System.out.println("Arquivo não foi movido.");
			e.printStackTrace();
		}
	}

	public static void moveFilesGt() {
		originalFile = Paths.get(OpenFolderController.dir + "\\" + DirectoryFolder.getNome());
		moveFileGt = Paths.get(DirectoryFolder.directoryGt + "\\" + DirectoryFolder.getNome());

		try {
			Files.move(originalFile, moveFileGt, StandardCopyOption.REPLACE_EXISTING);
		} catch (Exception e) {
			System.out.println("Arquivo não foi movido.");
			e.printStackTrace();
		}
	}

	public static void moveFilesImp() {
		originalFile = Paths.get(OpenFolderController.dir + "\\" + DirectoryFolder.getNome());
		moveFileImp = Paths.get(DirectoryFolder.directoryImp + "\\" + DirectoryFolder.getNome());

		try {
			Files.move(originalFile, moveFileImp, StandardCopyOption.REPLACE_EXISTING);
		} catch (Exception e) {
			System.out.println("Arquivo não foi movido.");
			e.printStackTrace();
		}
	}

	public static void moveFilesLum() {
		originalFile = Paths.get(OpenFolderController.dir + "\\" + DirectoryFolder.getNome());
		moveFileLum = Paths.get(DirectoryFolder.directoryLum + "\\" + DirectoryFolder.getNome());

		try {
			Files.move(originalFile, moveFileLum, StandardCopyOption.REPLACE_EXISTING);
		} catch (Exception e) {
			System.out.println("Arquivo não foi movido.");
			e.printStackTrace();
		}
	}

	public static void moveFilesBlue() {
		originalFile = Paths.get(OpenFolderController.dir + "\\" + DirectoryFolder.getNome());
		moveFileBlue = Paths.get(DirectoryFolder.directoryBlue + "\\" + DirectoryFolder.getNome());

		try {
			Files.move(originalFile, moveFileBlue, StandardCopyOption.REPLACE_EXISTING);
		} catch (Exception e) {
			System.out.println("Arquivo não foi movido.");
			e.printStackTrace();
		}
	}

	public static void moveFilesHps() {
		originalFile = Paths.get(OpenFolderController.dir + "\\" + DirectoryFolder.getNome());
		moveFileHsp = Paths.get(DirectoryFolder.directoryHsp + "\\" + DirectoryFolder.getNome());

		try {
			Files.move(originalFile, moveFileHsp, StandardCopyOption.REPLACE_EXISTING);
		} catch (Exception e) {
			System.out.println("Arquivo não foi movido.");
			e.printStackTrace();
		}
	}

	public static void moveFilesSpe() {
		originalFile = Paths.get(OpenFolderController.dir + "\\" + DirectoryFolder.getNome());
		moveFileSpe = Paths.get(DirectoryFolder.directorySpe + "\\" + DirectoryFolder.getNome());

		try {
			Files.move(originalFile, moveFileSpe, StandardCopyOption.REPLACE_EXISTING);
		} catch (Exception e) {
			System.out.println("Arquivo não foi movido.");
			e.printStackTrace();
		}
	}

	public static void moveFilesVic() {
		originalFile = Paths.get(OpenFolderController.dir + "\\" + DirectoryFolder.getNome());
		moveFileVic = Paths.get(DirectoryFolder.directoryVic + "\\" + DirectoryFolder.getNome());

		try {
			Files.move(originalFile, moveFileVic, StandardCopyOption.REPLACE_EXISTING);
		} catch (Exception e) {
			System.out.println("Arquivo não foi movido.");
			e.printStackTrace();
		}
	}

	public static void moveFilesHsp() {
		originalFile = Paths.get(OpenFolderController.dir + "\\" + DirectoryFolder.getNome());
		moveFileHsp = Paths.get(DirectoryFolder.directoryHsp + "\\" + DirectoryFolder.getNome());

		try {
			Files.move(originalFile, moveFileHsp, StandardCopyOption.REPLACE_EXISTING);
		} catch (Exception e) {
			System.out.println("Arquivo não foi movido.");
			e.printStackTrace();
		}
	}
}
