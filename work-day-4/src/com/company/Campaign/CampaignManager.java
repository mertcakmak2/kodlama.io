package com.company.Campaign;

import com.company.Entities.Administrator;
import com.company.Entities.Campaign;
import com.company.Interfaces.ICampaignManager;

public class CampaignManager implements ICampaignManager {

    @Override
    public void addCampaign(Campaign campaign, Administrator administrator) {
        System.out.println(administrator.getName()+" tarafından "+campaign.getName()+" kapmanyası eklendi.");
    }

    @Override
    public void deleteCampaign(Campaign campaign, Administrator administrator) {
        System.out.println(administrator.getName()+" tarafından "+ campaign.getName()+" kapmanyası silindi.");
    }
}
