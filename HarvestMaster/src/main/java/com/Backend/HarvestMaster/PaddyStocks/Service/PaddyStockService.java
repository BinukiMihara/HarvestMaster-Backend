package com.Backend.HarvestMaster.PaddyStocks.Service;

import com.Backend.HarvestMaster.PaddyStocks.Model.PaddyStock;
import com.Backend.HarvestMaster.PaddyStocks.Model.PaddyStockDTO;

import java.util.List;

public interface PaddyStockService {


    public List<PaddyStock> getPaddyStockDetails(int postharvest_id);

    public List<PaddyStockDTO> getAllPaddyStockDetails();

    public boolean deletePaddyStock(int paddystock_id);

    public PaddyStock updateStock(int paddystock_id,PaddyStock paddyStock);


    public PaddyStock addPaddyStock(Integer fieldId,PaddyStock paddyStock);





}
