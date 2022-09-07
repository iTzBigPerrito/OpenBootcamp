package com.mipaquete;

public class CocheCRUDImpl implements CocheCRUD{
    @Override
    public void save() {
        System.out.println("Este es el método save()");
    }

    @Override
    public void findAll() {
        System.out.println("Este es el método findAll()");
    }

    @Override
    public void delete() {
        System.out.println("Este es el método delete()");
    }
}
