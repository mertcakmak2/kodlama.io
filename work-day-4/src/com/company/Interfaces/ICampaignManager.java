package com.company.Interfaces;

import com.company.Entities.Administrator;
import com.company.Entities.Campaign;

public interface ICampaignManager {

    void addCampaign(Campaign campaign, Administrator administrator);

    void deleteCampaign(Campaign campaign, Administrator administrator);

    void updateCampaign(Campaign campaign, Administrator administrator);

}
