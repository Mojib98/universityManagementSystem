package org.uni.barareh.entity;

import org.uni.barareh.entity.enumeration.CourseStatus;

public record  Course (String id,String name, Integer unit, Professor professor, Integer hours, CourseStatus courseStatus){


}
