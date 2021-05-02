package com.company;

import com.company.Campaign.CampaignManager;
import com.company.Entities.*;
import com.company.Game.GameManager;
import com.company.Sale.SaleManager;
import com.company.User.UserManager;

public class Main {

    public static void main(String[] args) {

        UserManager userManager = new UserManager();
        Administrator admin = new Administrator(1,"Robert", "martin","123456","1111","1985","game","manager");

        User gamer = new Gamer(2,"Mert","Cakmak","13245","9999","1998","mertcakmak2","2021");
        userManager.addUser(gamer);
        //userManager.deleteUser(gamer);
        //userManager.updateUser(gamer);

        GameManager gameManager = new GameManager(admin);
        Game game = new Game(1,"Sea of Thieves");
        gameManager.addGame(game);
        //gameManager.deleteGame(game);
        //gameManager.updateGame(game);

        CampaignManager campaignManager = new CampaignManager();
        Campaign campaign = new Campaign(1,"CovidParty");
        campaignManager.addCampaign(campaign,admin);
        //campaignManager.deleteCampaign(campaign,admin);
        //campaignManager.updateCampaign(campaign, admin);

        SaleManager saleManager = new SaleManager(campaign);
        saleManager.saleGame(game,gamer);
    }
}
