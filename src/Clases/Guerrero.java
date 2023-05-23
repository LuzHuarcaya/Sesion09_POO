package Clases;


/**
 *
 * @author Estudiante
 */
public class Guerrero extends Personaje {
    
    private int fureza;
    private int resistencia;
    
    /**
     * @return the fureza
     */
    public int getFureza() {
        return fureza;
    }

    /**
     * @param fureza the fureza to set
     */
    public void setFureza(int fureza) {
        this.fureza = fureza;
    }

    /**
     * @return the resistencia
     */
    public int getResistencia() {
        return resistencia;
    }

    /**
     * @param resistencia the resistencia to set
     */
    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }
    
    public void ataqueEspecial(Personaje atacado){
        
    }

    @Override
    public void atacar(Personaje atacado) {
        int nivelActualDeVida = atacado.getVida();
        atacado.setVida(nivelActualDeVida - 10);
        atacado.defender(this);
    }
    
    
}
