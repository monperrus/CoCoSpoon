package fil.iagl.opl.rendu.two;

import spoon.Launcher;

/**
 * Hello world!
 *
 */
public class App {
  public static void main(String[] args) throws Exception {
    String[] spoonArgs = {
      "-i",
      "C:/Users/RMS/Documents/workspace-sts-3.7.0.RELEASE/OPL-Rendu2/src/test/java/fil/iagl/opl/rendu/two/samples;C:/Users/RMS/Documents/workspace-sts-3.7.0.RELEASE/rendu.two/src/main/java/instrumenting",
      "-p", "fil.iagl.opl.rendu.two.processors.AddWatcherProcessor",
      "--with-imports"};

    Launcher.main(spoonArgs);
  }

}