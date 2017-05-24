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
import org.apache.commons.codec.binary.Base64;
import org.json.JSONException;
import org.json.JSONObject;


public class RequestService {

    
    public static Client clientRegister(String request) {
        String res = new String(Base64.decodeBase64(request));
        JSONObject json = new JSONObject(res);

        Client client = new Client();

        if (!json.has("roomId")) {
            return client;
        }

        try {
            client.setRoomId(json.getInt("roomId"));
        } catch (JSONException e) {
            e.printStackTrace();
            return client;
        }

        if (!json.has("id") || !json.has("token")) {
            return client;
        }

        Long id;
        String token;

        try {
            id = json.getLong("id");
            token = json.getString("token");
        } catch (JSONException e) {
            e.printStackTrace();
            return client;
        }

        if (!checkToken(id, token)) {
            return client;
        }

        client.setId(id);

        return client;
    }

   
    private static boolean checkToken(Long id, String token) {
        return true;
    }
}
