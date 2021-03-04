package com.rarael.studycards.model;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class FlashCards {
    public enum classes {BIOL101, BIOL101L, COMP455, COMP311, DRAM120};
    Map<String,String> set;

    public FlashCards(Map<String,String> studySet) {
        set = studySet;
    }

    public Set<String> getQuestions(int i) {
       return set.keySet();
    }
    public Collection<String> getAnswers() {
        return set.values();
    }
    public int getSize() {
        return set.size();
    }
}
