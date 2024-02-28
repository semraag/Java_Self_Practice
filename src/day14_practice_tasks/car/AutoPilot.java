package day14_practice_tasks.car;

import day14_practice_tasks.car.AutoPark;

public interface AutoPilot extends AutoPark {
  boolean HAS_AUTO_PILOT = true;
  void selfDrive();

  @Override
  default void autoPark() {

  }
}
