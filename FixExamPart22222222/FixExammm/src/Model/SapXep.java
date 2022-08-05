package Model;

import java.util.Comparator;
import java.util.Locale;

public class SapXep implements Comparator<HocSinh> {
    @Override
    public int compare(HocSinh o1, HocSinh o2) {
        String hocSinh1 = o1.getHoVaTen().replaceAll(" ","");
        String hocSinh2 = o1.getHoVaTen().replaceAll(" ","");
        return hocSinh1.toUpperCase(Locale.ROOT).compareTo(hocSinh2.toUpperCase(Locale.ROOT));
    }
}
