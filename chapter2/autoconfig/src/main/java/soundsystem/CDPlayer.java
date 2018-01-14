package soundsystem;

import org.springframework.stereotype.Component;

@Component
public class CDPlayer implements MediaPlayer {

  private CompactDisc cd;

  public CDPlayer(CompactDisc cd) {
    this.cd = cd;
    System.out.println("自动装配");
  }

  public void play() {
    cd.play();
  }

}
