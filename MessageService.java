/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package websocket;

/**
 *
 * @author Kavya Gupta
 */

public class MessageService {

    public static Response sendMessage(Client client, String message) {
        Response response = new Response();
        response.getData().put("id", client.getId());
        response.getData().put("message", message);
        response.getData().put("time", System.currentTimeMillis());
        return response;
    }
}
