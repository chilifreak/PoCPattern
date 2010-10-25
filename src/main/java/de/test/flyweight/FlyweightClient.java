package de.test.flyweight;

public class FlyweightClient {

  /**
   * Reference to the flyweight
   */
  private Flyweight soldier = FlyweightFactory.getSoldier();

  /**
   * this state is maintained by the client
   */
  private int currentLocationX = 0;

  /**
   * this state is maintained by the client
   */
  private int currentLocationY = 0;

  public void moveSoldier(int newLocationX, int newLocationY) {

    // here the actual rendering is handled by the flyweight object 
    soldier.moveSoldier(currentLocationX, currentLocationY, newLocationX, newLocationY);

    // this object is responsible for maintaining the state
    // that is extrinsic to the flyweight
    currentLocationX = newLocationX;

    currentLocationY = newLocationY;
  }

}
