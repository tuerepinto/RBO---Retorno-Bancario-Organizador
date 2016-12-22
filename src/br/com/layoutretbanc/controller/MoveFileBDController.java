package br.com.layoutretbanc.controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import br.com.layoutretbanc.builder.DirectoryFolder;
import br.com.layoutretbanc.builder.MoveFile;

public class MoveFileBDController {

	MoveFile mf = new MoveFile();

	static Path originalFileBD; // arquivo original destino
	static Path moveFileObGBD; // Obras Gerais
	static Path moveFileChBD; // Holding
	static Path moveFileNegBD; // Concreto Negocios
	static Path moveFileComBD; // COM
	static Path moveFileCprBD; // CPR
	static Path moveFileQuiBD; // Quintas
	static Path moveFilePnlBD; // Portal Nova Lima
	static Path moveFileGdBD; // Garden
	static Path moveFileGtBD; // Green
	static Path moveFileImpBD; // Imperial
	static Path moveFileLumBD; // Lumiere
	static Path moveFileVicBD; // Victoria
	static Path moveFileBlueBD; // Blue
	static Path moveFileHspBD; // Hotel Sao Paulo
	static Path moveFileSpeBD; // Spe Patagonia

	public static void moveFilesChBD() {

		originalFileBD = Paths.get(OpenFolderController.dir + "\\" + DirectoryFolder.getNome());
		moveFileChBD = Paths.get(DirectoryFolder.directoryCHBD + "\\" + DirectoryFolder.getNome());

		try {
			Files.move(originalFileBD, moveFileChBD, StandardCopyOption.REPLACE_EXISTING);
		} catch (IOException e) {
			System.out.println("Arquivo não foi movido.");
			e.printStackTrace();
		}
	}

	public static void moveFilesObGBD() {

		originalFileBD = Paths.get(OpenFolderController.dir + "\\" + DirectoryFolder.getNome());
		moveFileObGBD = Paths.get(DirectoryFolder.directoryObGBD + "\\" + DirectoryFolder.getNome());

		try {
			Files.move(originalFileBD, moveFileObGBD, StandardCopyOption.REPLACE_EXISTING);
		} catch (Exception e) {
			System.out.println("Arquivo não foi movido.");
			e.printStackTrace();
		}
	}

	public static void moveFilesComBD() {
		originalFileBD = Paths.get(OpenFolderController.dir + "\\" + DirectoryFolder.getNome());
		moveFileComBD = Paths.get(DirectoryFolder.directoryComBD + "\\" + DirectoryFolder.getNome());

		try {
			Files.move(originalFileBD, moveFileComBD, StandardCopyOption.REPLACE_EXISTING);
		} catch (Exception e) {
			System.out.println("Arquivo não foi movido.");
			e.printStackTrace();
		}
	}

	public static void moveFilesCprBD() {
		originalFileBD = Paths.get(OpenFolderController.dir + "\\" + DirectoryFolder.getNome());
		moveFileCprBD = Paths.get(DirectoryFolder.directoryCprBD + "\\" + DirectoryFolder.getNome());

		try {
			Files.move(originalFileBD, moveFileCprBD, StandardCopyOption.REPLACE_EXISTING);
		} catch (Exception e) {
			System.out.println("Arquivo não foi movido.");
			e.printStackTrace();
		}
	}

	public static void moveFilesQuiBD() {
		originalFileBD = Paths.get(OpenFolderController.dir + "\\" + DirectoryFolder.getNome());
		moveFileQuiBD = Paths.get(DirectoryFolder.directoryQuiBD + "\\" + DirectoryFolder.getNome());

		try {
			Files.move(originalFileBD, moveFileQuiBD, StandardCopyOption.REPLACE_EXISTING);
		} catch (Exception e) {
			System.out.println("Arquivo não foi movido.");
			e.printStackTrace();
		}
	}

	public static void moveFilesPnlBD() {
		originalFileBD = Paths.get(OpenFolderController.dir + "\\" + DirectoryFolder.getNome());
		moveFilePnlBD = Paths.get(DirectoryFolder.directoryPnlBD + "\\" + DirectoryFolder.getNome());

		try {
			Files.move(originalFileBD, moveFilePnlBD, StandardCopyOption.REPLACE_EXISTING);
		} catch (Exception e) {
			System.out.println("Arquivo não foi movido.");
			e.printStackTrace();
		}
	}

	public static void moveFilesNegBD() {
		originalFileBD = Paths.get(OpenFolderController.dir + "\\" + DirectoryFolder.getNome());
		moveFileNegBD = Paths.get(DirectoryFolder.directoryNegBD + "\\" + DirectoryFolder.getNome());

		try {
			Files.move(originalFileBD, moveFileNegBD, StandardCopyOption.REPLACE_EXISTING);
		} catch (Exception e) {
			System.out.println("Arquivo não foi movido.");
			e.printStackTrace();
		}
	}

	public static void moveFilesGdBD() {
		originalFileBD = Paths.get(OpenFolderController.dir + "\\" + DirectoryFolder.getNome());
		moveFileGdBD = Paths.get(DirectoryFolder.directoryGdBD + "\\" + DirectoryFolder.getNome());

		try {
			Files.move(originalFileBD, moveFileGdBD, StandardCopyOption.REPLACE_EXISTING);
		} catch (Exception e) {
			System.out.println("Arquivo não foi movido.");
			e.printStackTrace();
		}
	}

	public static void moveFilesGtBD() {
		originalFileBD = Paths.get(OpenFolderController.dir + "\\" + DirectoryFolder.getNome());
		moveFileGtBD = Paths.get(DirectoryFolder.directoryGtBD + "\\" + DirectoryFolder.getNome());

		try {
			Files.move(originalFileBD, moveFileGtBD, StandardCopyOption.REPLACE_EXISTING);
		} catch (Exception e) {
			System.out.println("Arquivo não foi movido.");
			e.printStackTrace();
		}
	}

	public static void moveFilesImpBD() {
		originalFileBD = Paths.get(OpenFolderController.dir + "\\" + DirectoryFolder.getNome());
		moveFileImpBD = Paths.get(DirectoryFolder.directoryImpBD + "\\" + DirectoryFolder.getNome());

		try {
			Files.move(originalFileBD, moveFileImpBD, StandardCopyOption.REPLACE_EXISTING);
		} catch (Exception e) {
			System.out.println("Arquivo não foi movido.");
			e.printStackTrace();
		}
	}

	public static void moveFilesLumBD() {
		originalFileBD = Paths.get(OpenFolderController.dir + "\\" + DirectoryFolder.getNome());
		moveFileLumBD = Paths.get(DirectoryFolder.directoryLumBD + "\\" + DirectoryFolder.getNome());

		try {
			Files.move(originalFileBD, moveFileLumBD, StandardCopyOption.REPLACE_EXISTING);
		} catch (Exception e) {
			System.out.println("Arquivo não foi movido.");
			e.printStackTrace();
		}
	}

	public static void moveFilesBlueBD() {
		originalFileBD = Paths.get(OpenFolderController.dir + "\\" + DirectoryFolder.getNome());
		moveFileBlueBD = Paths.get(DirectoryFolder.directoryBlueBD + "\\" + DirectoryFolder.getNome());

		try {
			Files.move(originalFileBD, moveFileBlueBD, StandardCopyOption.REPLACE_EXISTING);
		} catch (Exception e) {
			System.out.println("Arquivo não foi movido.");
			e.printStackTrace();
		}
	}

	public static void moveFilesHpsBD() {
		originalFileBD = Paths.get(OpenFolderController.dir + "\\" + DirectoryFolder.getNome());
		moveFileHspBD = Paths.get(DirectoryFolder.directoryHspBD + "\\" + DirectoryFolder.getNome());

		try {
			Files.move(originalFileBD, moveFileHspBD, StandardCopyOption.REPLACE_EXISTING);
		} catch (Exception e) {
			System.out.println("Arquivo não foi movido.");
			e.printStackTrace();
		}
	}

	public static void moveFilesSpeBD() {
		originalFileBD = Paths.get(OpenFolderController.dir + "\\" + DirectoryFolder.getNome());
		moveFileSpeBD = Paths.get(DirectoryFolder.directorySpeBD + "\\" + DirectoryFolder.getNome());

		try {
			Files.move(originalFileBD, moveFileSpeBD, StandardCopyOption.REPLACE_EXISTING);
		} catch (Exception e) {
			System.out.println("Arquivo não foi movido.");
			e.printStackTrace();
		}
	}

	public static void moveFilesVicBD() {
		originalFileBD = Paths.get(OpenFolderController.dir + "\\" + DirectoryFolder.getNome());
		moveFileVicBD = Paths.get(DirectoryFolder.directoryVicBD + "\\" + DirectoryFolder.getNome());

		try {
			Files.move(originalFileBD, moveFileVicBD, StandardCopyOption.REPLACE_EXISTING);
		} catch (Exception e) {
			System.out.println("Arquivo não foi movido.");
			e.printStackTrace();
		}
	}

	public static void moveFilesHspBD() {
		originalFileBD = Paths.get(OpenFolderController.dir + "\\" + DirectoryFolder.getNome());
		moveFileHspBD = Paths.get(DirectoryFolder.directoryHspBD + "\\" + DirectoryFolder.getNome());

		try {
			Files.move(originalFileBD, moveFileHspBD, StandardCopyOption.REPLACE_EXISTING);
		} catch (Exception e) {
			System.out.println("Arquivo não foi movido.");
			e.printStackTrace();
		}
	}
}
