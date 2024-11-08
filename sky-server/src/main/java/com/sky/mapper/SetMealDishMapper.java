package com.sky.mapper;

import com.sky.entity.SetmealDish;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface SetMealDishMapper {

    List<Long> getSetMealIdsByDishIds(List<Long> ids);

    void insertBatch(List<SetmealDish> setmealDishes);
}
