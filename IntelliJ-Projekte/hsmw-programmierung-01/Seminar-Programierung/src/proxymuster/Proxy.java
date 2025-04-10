package proxymuster;

import singleton.Bearbeite;
import singleton.Implementierung;

public class Proxy implements Bearbeite {

    private static Implementierung imp;

    public void machWas() {
        if (imp == null) {
            imp = new Implementierung();
        }
        imp.machWas();
    }

}
