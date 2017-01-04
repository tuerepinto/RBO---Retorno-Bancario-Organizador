package br.com.layoutretbanc.app;

import javax.swing.JOptionPane;

import br.com.layoutretbanc.builder.DateClass;
import br.com.layoutretbanc.builder.DirectoryFolder;
import br.com.layoutretbanc.controller.CreateFolderController;
import br.com.layoutretbanc.controller.DateFolderController;
import br.com.layoutretbanc.controller.OpenFolderController;

public class RetBancMain {

	public static void main(String[] args) {
		CreateFolderController cfc = new CreateFolderController();
		OpenFolderController ofc = new OpenFolderController();
		DateFolderController dfc = new DateFolderController();

		cfc.newFolde();
		cfc.subFolder();
		ofc.openFolder();
		dfc.dateFolder();

		JOptionPane.showMessageDialog(null,
				"Programa executado com sucesso. Confira as pastas:" +"\n\r"+ DirectoryFolder.directory +"\n\r"+ DateClass.getDate());

	}

}
