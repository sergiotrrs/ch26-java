package org.generation;

import java.security.NoSuchAlgorithmException;

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

public class KeyGeneratorExample {

    public static void main(String[] args) {
        try {
            // Generar una clave secreta de 256 bits utilizando el algoritmo AES
            SecretKey secretKey = KeyGenerator.getInstance("AES").generateKey();

            // Obtener la representación en bytes de la clave secreta
            byte[] keyBytes = secretKey.getEncoded();

            // Imprimir la clave secreta generada
            System.out.println("Clave secreta generada: " + bytesToHex(keyBytes));
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }

    // Método para convertir un array de bytes a una representación hexadecimal
    private static String bytesToHex(byte[] bytes) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bytes) {
            sb.append(String.format("%02x", b));
        }
        return sb.toString();
    }

}