package net.duckieman.goosemod.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoodProperties {
    public static final FoodProperties PIZZA = new FoodProperties.Builder().nutrition(7).saturationMod(1.5f).build();

    public static final FoodProperties TOMATO = new FoodProperties.Builder().nutrition(3).saturationMod(0.25f)
            .effect(() -> new MobEffectInstance(MobEffects.HUNGER, 300), 0.1f).build();

    public static final FoodProperties CHEESE = new FoodProperties.Builder().nutrition(5).saturationMod(1f)
            .effect(() -> new MobEffectInstance(MobEffects.CONFUSION, 300), 0.2f).build();

    public static final FoodProperties SAUSAGE = new FoodProperties.Builder().nutrition(4).saturationMod(0.75f)
            .effect(() -> new MobEffectInstance(MobEffects.CONFUSION, 300), 0.2f).build();

    public static final FoodProperties EXTRAORDINARY_SOUP = new FoodProperties.Builder().nutrition(8).saturationMod(1.6f)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 500, 2), 1f)
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 7000, 1), 1f)
            .effect(() -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 7000, 1), 1f)
            .effect(() -> new MobEffectInstance(MobEffects.ABSORPTION, 3400, 4), 1f)
            .build();

    public static final FoodProperties ONION = new FoodProperties.Builder().nutrition(3).saturationMod(0.25f)
            .effect(() -> new MobEffectInstance(MobEffects.BLINDNESS, 300), 1f).build();

    public static final FoodProperties RAW_DUCK_MEAT = new FoodProperties.Builder().nutrition(0).saturationMod(0f)
            .effect(() -> new MobEffectInstance(MobEffects.POISON, 600, 3),1f)
            .effect(() -> new MobEffectInstance(MobEffects.BLINDNESS, 600, 3),1f)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 600, 3),1f).build();

    public static final FoodProperties RAW_GOOSE_MEAT = new FoodProperties.Builder().nutrition(0).saturationMod(0f)
            .effect(() -> new MobEffectInstance(MobEffects.POISON, 600, 3),1f)
            .effect(() -> new MobEffectInstance(MobEffects.BLINDNESS, 600, 3),1f)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 600, 3),1f).build();
}
