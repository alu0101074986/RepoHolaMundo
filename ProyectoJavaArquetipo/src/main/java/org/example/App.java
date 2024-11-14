package org.example;

import java.util.Random;

public class App 
{
    public static void main(String[] args)
    {
        // Lista de mensajes
        String[] mensajes = {
            "Hola Mundo con Arquetipo!",
            "¡Bienvenido al mundo de Java!",
            "¡Programación en Java es divertida!",
            "¡Hola desde tu aplicación de ejemplo!",
            "¡Este es un mensaje aleatorio!"
        };

        // Generador de números aleatorios
        Random random = new Random();
        int indice = random.nextInt(mensajes.length);

        // Imprime un mensaje aleatorio
        System.out.println(mensajes[indice]);
    }
}
