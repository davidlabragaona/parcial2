
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.StringTokenizer;

public class Test {

	public static void main(String[] args) {
		File file= new File("Input.in");
		FileReader fr = null;
		BufferedReader br;
		Ciudad miCiudad;
		
		try{
			fr= new FileReader(file);
			br= new BufferedReader(fr);
			StringTokenizer linea= new StringTokenizer(br.readLine());
			int islas= Integer.parseInt(linea.nextToken());
			int tuneles= Integer.parseInt(linea.nextToken());
			int puentes= Integer.parseInt(linea.nextToken());
			//System.out.println("Islas: "+islas+"\nTuneles: "+tuneles+"\nPuentes: "+puentes);
			miCiudad= new Ciudad(islas);
			int origen;
			int destino;
			for (int i=0; i< tuneles; i++){
				linea= new StringTokenizer(br.readLine());
				origen= Integer.parseInt(linea.nextToken());
				destino= Integer.parseInt(linea.nextToken());
				//System.out.println("Tunel:\nOrigen: "+origen+"\nDestino: "+destino);
				miCiudad.agregarCamino(origen, destino, 0);
			}
			for (int i=0; i< puentes; i++){
				linea= new StringTokenizer(br.readLine());
				origen= Integer.parseInt(linea.nextToken());
				destino= Integer.parseInt(linea.nextToken());
				//System.out.println("Puente:\nOrigen: "+origen+"\nDestino: "+destino);
				miCiudad.agregarCamino(origen, destino, 1);
			}
		
				
		}catch(FileNotFoundException e){
			System.out.println(file.getAbsolutePath()+" "+e.getStackTrace());
			System.out.println("Error al abrir archivo");
		}catch(Exception e){
			System.out.println(e.getStackTrace());
		}
		finally{
			try{                    
				if( null != fr ){   
					fr.close();     
				}                  
			}catch (Exception e2){ 
				e2.printStackTrace();
			}
		}
		
	}

}
