package org.openmrs.module.oauth2.api;

import org.openmrs.User;
import org.openmrs.api.OpenmrsService;
import org.openmrs.module.oauth2.Client;

import java.util.List;

/**
 *
 */

public interface ClientRegistrationService extends OpenmrsService {

    /**
     * update details of the client if exists, else create new client
     *
     * @param client
     */
    public void saveOrUpdateClient(Client client);

    /**
     * @param client
     */
    public void updateClient(Client client);

    /**
     * @param id
     * @return
     */
    public Client getClient(Integer id);

    /**
     *
     * @param clientDeveloper
     * @return
     */
    public List<Client> getAllClientsForClientDeveloper(User clientDeveloper);

    /**
     * @param client
     * @return
     * @should unregister a client and clear footprint from database
     */
    public Client unregisterClient(Client client);

    /**
     * @param client
     * @should register a new client into the database
     */
    public void registerNewClient(Client client);


}