package Model;

import java.util.Comparator;
import java.util.Locale;

public class SapXep implements Comparator<HocSinh> {
    @Override
    public int compare(HocSinh o1, HocSinh o2) {
        return o1.getHoVaTen().compareToIgnoreCase(o2.getHoVaTen());
    }
}
