package com.example.metier;

import com.example.dao.IDao;
import com.example.metier.IMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("metier")
public class MetierImpl implements IMetier {
    @Autowired
    private IDao dao;                 // pas de @Qualifier ici
    @Override
    public double calcul() { return dao.getValue() * 2; }
}