//package Chapter_01.Test;
//import static org.mockito.Mockito.*;
//import static org.springframework.test.web.client.ExpectedCount.times;
//
//import Chapter_01.BraveKnight;
//import Chapter_01.Quest;
//
//
//import org.junit.jupiter.api.Test;
//
//
//public class BraveKnightTest {
//
//  @Test
//  public void knightShouldEmbarkOnQuest() {
//    Quest mockQuest = mock(Quest.class);
//    BraveKnight knight = new BraveKnight(mockQuest);
//    knight.embarkOnQuest();
//    verify(mockQuest, times(1)).embark();
//  }
//
//}
