package prog.ua.prog.core.service;

import prog.ua.prog.core.model.Point;

import java.util.List;
import java.util.Map;

public interface ExtremePointsContourSorting {
    Map<Integer, List<List<Point>>> getMapListStartAndEndPointInContourObjects();
}
