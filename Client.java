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

public class Client {
    private Long ClientId;
    private int roomId;

    public Client() {
        ClientId = 0L;
        roomId = 0;
    }

    public Long getId() {
        return ClientId;
    }

    public void setId(Long id) {
        this.ClientId = id;
    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }
}
