package net.mips.compiler;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import com.sun.jdi.Type;


public class Scanner {
	
   List<Symboles> motsCles;
   
 Symboles symbCour;
 char carCour;
 FileReader fluxSour;
 final int EOF=10;
 
 Scanner(String F) throws ErreurLexicale,IOException
 {
	File fichier=new File(F);
	if(!fichier.exists())
		throw new ErreurLexicale(CodesErr.FIC_VID_ERR);
	
	else {
		System.out.println("ficher exist");
	}
	
 }
 

	

}

