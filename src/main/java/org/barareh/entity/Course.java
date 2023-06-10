package org.barareh.entity;

import org.barareh.entity.enumeration.CourseStatus;

public record  Course (String name, Integer unit, Professor professor, Integer hours, CourseStatus courseStatus){


}
