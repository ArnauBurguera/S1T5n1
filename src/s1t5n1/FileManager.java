package s1t5n1;

import java.io.File;
import java.text.SimpleDateFormat;

public class FileManager {

	private File directori;

	public FileManager(File directori) {
		super();
		this.directori = directori;
	}

	public File getDirectori() {
		return directori;
	}

	public void ordenarILlistar() {
		File ruta = this.directori;
		String[] continguts = ruta.list();	
		recurssioSubcarpetes(ruta,continguts);

	}

	public void recurssioSubcarpetes(File filePare, String[] contingutsFilePare) {
		for(String dirOrFile : contingutsFilePare) {

			File fileFill = new File(filePare.getAbsolutePath(),dirOrFile);
			if(fileFill.isDirectory() && fileFill.list().length > 0) {

				System.out.println("(D)" + dirOrFile + lastModifiedDate(fileFill));
				recurssioSubcarpetes(fileFill,fileFill.list());

			}else if(fileFill.isDirectory() && fileFill.list().length == 0){
				System.out.println("(D)" + dirOrFile + lastModifiedDate(fileFill));
			}else {
				System.out.println("(F)" + dirOrFile + lastModifiedDate(fileFill));
			}
		}
	}

	public String lastModifiedDate(File file) {
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
		return " -- Última moficicació: " + sdf.format(file.lastModified());
	}

}
