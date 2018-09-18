/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javaapplication1.Triangulo;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Marcos
 */
public class Trianguloteste {

    public Trianguloteste() {

    }

    @Test
    public void Trianguloequilatero() {
        Triangulo t = new Triangulo(1, 1, 1);

        int i = 0;

        for (String propriedade : t.getPropriedades()) {
            if (i == 0) {
                assertEquals("Válido", propriedade);
            } else if (i == 1) {
                assertEquals("Equilátero", propriedade);
            }
            i++;
        }

    }

    @Test
    public void TrianguloIsósceles() {
        Triangulo t = new Triangulo(10, 10, 12);

        int i = 0;

        for (String propriedade : t.getPropriedades()) {
            if (i == 0) {
                assertEquals("Válido", propriedade);
            } else if (i == 1) {
                assertEquals("Isósceles", propriedade);
            }
            i++;
        }

    }

    @Test
    public void TrianguloRetângulo() {
        Triangulo t = new Triangulo(5, 3, 4);

        int i = 0;

        for (String propriedade : t.getPropriedades()) {
            if (i == 0) {
                assertEquals("Válido", propriedade);
            } else if (i == 1) {
                assertEquals("Retângulo", propriedade);
            }
            i++;
        }

    }

    @Test
    public void TrianguloEscaleno() {
        Triangulo t = new Triangulo(5, 7, 8);

        int i = 0;

        for (String propriedade : t.getPropriedades()) {
            if (i == 0) {
                assertEquals("Válido", propriedade);
            } else if (i == 1) {
                assertEquals("Escaleno", propriedade);
            }
            i++;
        }

    }
}
