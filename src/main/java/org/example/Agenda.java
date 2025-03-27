package org.example;

import java.util.*;

/**
 * La clase Agenda gestiona una lista de contactos.
 * Permite añadir, eliminar o modificar contactos y sus numeros de telefono.
 *
 * @author dam
 * @version 1.0
 * @since 2025
 */

public class Agenda {
    private List<Contacto> contacts; // Lista de Contacto

    /**
     * Este contructor inicializa la lisa de contactos.
     */

    public Agenda() {
        this.contacts = new ArrayList<>();
    }

    /**
     * Este metodo recibe el nombre y el telefono, crea un bool para despues recorrer la lista y comparar objetos,
     * es decir los contactos, si ya existe solo añade el numero, sino existe añade el contacto nuevo.
     * @param name el nombre del contacto
     * @param phone el numero de telefono.
     */

    public void addContact(String name, String phone) {
        boolean exists = false;
        for (Contacto c : contacts) {
            if (c.getName().equalsIgnoreCase(name)) {
                exists = true;
                c.getPhones().add(phone);
                break;
            }
        }

        if (!exists) {
            Contacto newContact = new Contacto(name, phone);
            contacts.add(newContact);
        }
    }

    /**
     * Este metodo elimina un contacto de la agenda por su nombre.
     * @param name el nombre del contacto a eliminar
     */

    public void removeContact(String name) {
        Iterator<Contacto> it = contacts.iterator();

        while (it.hasNext()) {
            Contacto c = it.next();

            if (c.getName().equalsIgnoreCase(name)) {
                it.remove();
            }
        }
    }

    /**
     * Este metodo modifica el numero de telefono de un contacto existente.
     *
     * @param name el nombre del contacto
     * @param oldPhone el numero de telefono antiguo
     * @param newPhone el nuevo numero de telefono
     */

    public void modifyPhoneNumber(String name, String oldPhone, String newPhone) {
        for (Contacto c : contacts) {
            if (c.getName().equalsIgnoreCase(name)) {
                List<String> phones = c.getPhones();

                int index = phones.indexOf(oldPhone);

                if (index != -1) {
                    phones.set(index, newPhone);
                }
            }
        }
    }

    /**
     * Por ultimo este metodo obtiene la lista de contactos.
     *
     * @return la lista de contactos
     */

    public List<Contacto> getContacts() {
        return this.contacts;
    }
}