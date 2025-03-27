package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * La clase Contacto representa un contacto con un nombre y una lista de números de teléfono.
 * @author dam
 * @version 1.0
 * @since 2025
 */

class Contacto {
    private String name;
    private List<String> phones;

    /**
     * Este constructor que inicializa un contacto con un nombre y un número de teléfono.
     * @param name el nombre del contacto
     * @param phone el número de teléfono inicial del contacto
     */

    public Contacto(String name, String phone) {
        this.name = name;
        this.phones = new ArrayList<>();
        this.phones.add(phone);
    }

    /**
     * Este metodo obtiene el nombre del contacto.
     * @return el nombre del contacto
     */

    public String getName() {
        return this.name;
    }

    /**
     * Este metodo obtiene la lista de números de teléfono del contacto.
     * @return la lista de números de teléfono
     */

    public List<String> getPhones() {
        return this.phones;
    }
}