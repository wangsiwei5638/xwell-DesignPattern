package com.wsw.designpattern.structure.filter;

import java.util.List;

public interface Filter {
    List<Benz> doFilte(List<Benz> benzs);
}
