package nota.varias;

public class varias {
	public   int  notasuma(int[] noto) { // no static ya que hay que instanciarlo . Hemos creado objeto en Nota objeto
		
		int suma = 0;
		for ( int n : noto) {
			suma += n;
		}
		return suma / noto.length;
		}
	}


