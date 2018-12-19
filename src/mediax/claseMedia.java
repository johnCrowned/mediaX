
package mediax;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class claseMedia {
    
    
        public claseMedia(){
            
        }
        ArrayList<Double> datos=new ArrayList(0);
        
        
        public void agregarDatos(double data){
            datos.add(data);
        }
        public void borrarMemoria(){
            datos.clear();
        }
        public void calcularMedia(){
            double sumatoria=0.0;
            for (int i = 0; i < datos.size(); i++) {
                sumatoria = sumatoria+datos.get(i);
            }
            double media=0;
            media=sumatoria/datos.size();
            JOptionPane.showMessageDialog(null,"El valor de la media es "+media);
        }
        
        
        
}
