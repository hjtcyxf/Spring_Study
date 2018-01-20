package Chapter_02.XMLConfig.properties;
import org.springframework.beans.factory.annotation.Autowired;

import Chapter_02.XMLConfig.CompactDisc;
import Chapter_02.XMLConfig.MediaPlayer;

public class CDPlayer implements MediaPlayer {
  private CompactDisc compactDisc;

  @Autowired
  public void setCompactDisc(CompactDisc compactDisc) {
    this.compactDisc = compactDisc;
  }

  public void play() {
    compactDisc.play();
  }

}
