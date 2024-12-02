package udla.vmolina.pooabsint.imprenta;
import udla.vmolina.pooabsint.imprenta.modelo.Curriculo;
import udla.vmolina.pooabsint.imprenta.modelo.Hoja;
import udla.vmolina.pooabsint.imprenta.modelo.Informe;
public class EjemploImprenta {
    public static void main(String[] args){
        Curriculo cv = new Curriculo("Juan Galán", "Ing. Sistemas", "Java", "Estudio Microservicios");
        cv.experiencia("Java");
        cv.experiencia("Oracle DBA");
        cv.experiencia("SpringBoot Framework");
        cv.experiencia("Desarrollador FullStank");
        cv.experiencia("Angular");
        Informe informe = new Informe("Autor: " + "JJJ", "Revisor: " + "KKK", "Contenido: " + "Estudio Microservicios");
        imprimir(cv);
        imprimir(informe);
    }
    public static void imprimir(Hoja imprime){
        System.out.println(imprime.imprimir());
    }
}
