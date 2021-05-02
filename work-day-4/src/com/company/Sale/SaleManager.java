package com.company.Sale;

import com.company.Entities.Campaign;
import com.company.Entities.Game;
import com.company.Entities.User;
import com.company.Interfaces.ISaleManager;

public class SaleManager implements ISaleManager {

    private Campaign campaign;

    public SaleManager(Campaign campaign) {
        this.campaign = campaign;
    }

    @Override
    public void saleGame(Game game, User user) {
        System.out.println(user.getName()+" adlı user tarafından "+campaign.getName()+
                " kampanyası ile "+game.getName()+" adlı oyun satın alındı.");
    }
}
