package hyk.springframework.springbootrecipeapp.services;

import hyk.springframework.springbootrecipeapp.commands.UnitOfMeasureCommand;

import java.util.Set;

public interface UnitOfMeasureService {
    Set<UnitOfMeasureCommand> listAllUoms();
}
