package com.company.Interfaces;

import com.company.Entities.Game;
import com.company.Entities.User;

public interface IGameManager {

    void addGame(Game game);

    void deleteGame(Game game);

    void updateGame(Game game);

}
