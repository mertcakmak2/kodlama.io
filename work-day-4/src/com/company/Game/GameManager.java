package com.company.Game;

import com.company.Campaign.CampaignManager;
import com.company.Entities.Administrator;
import com.company.Entities.Campaign;
import com.company.Entities.Game;
import com.company.Entities.User;
import com.company.Interfaces.IGameManager;

public class GameManager implements IGameManager {

    private Administrator administrator;

    public GameManager(Administrator administrator) {
        this.administrator = administrator;
    }

    @Override
    public void addGame(Game game) {
        System.out.println(game.getName()+" adlı oyun "+administrator.getName() +" tarafından eklendi");
    }

    @Override
    public void deleteGame(Game game) {
        System.out.println(game.getName()+" adlı oyun "+administrator.getName() +" tarafından silindi");
    }

    @Override
    public void updateGame(Game game) {
        System.out.println(game.getName()+" adlı oyun "+administrator.getName() +" tarafından güncellendi");
    }
}
