package websale.sale.service;

import org.springframework.stereotype.Service;
import websale.sale.dao.ClientDao;
import websale.sale.dao.ItemDao;
import websale.sale.model.Client;
import websale.sale.model.Item;

import javax.annotation.Resource;

@Service
public class ClientService {
    @Resource
    ClientDao clientDao;

    @Resource
    ItemDao itemDao;

    public int addClient(Client client){
        return clientDao.insertClient(client);
    }

    public Client getClient(String phoneNumber){
        return clientDao.selectClient(phoneNumber);
    }

    public Item getItem(int itemId){
        return itemDao.selectItem(itemId);
    }

}
