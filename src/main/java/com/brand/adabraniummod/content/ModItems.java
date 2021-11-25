package com.brand.adabraniummod.content;

import com.brand.adabraniummod.Adabranium;
import com.brand.adabraniummod.content.base.HeartShapedHerbItem;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.StewItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    // rods
    public static final Item OBSIDIAN_ROD = register("obsidian_rod", new Item(new Item.Settings().maxCount(64).group(Adabranium.ADABRANIUM_GROUP)));
    public static final Item ADAMANTIUM_ROD = register("adamantium_rod", new Item(new Item.Settings().maxCount(64).group(Adabranium.ADABRANIUM_GROUP)));

    // materials
    public static final Item VIBRANIUM = register("vibranium", new Item(new Item.Settings().maxCount(64).group(Adabranium.ADABRANIUM_GROUP)));
    public static final Item ADAMANTINE = register("adamantine", new Item(new Item.Settings().maxCount(64).group(Adabranium.ADABRANIUM_GROUP)));

    // ingots
    public static final Item VIBRANIUM_INGOT = register("vibranium_ingot", new Item(new Item.Settings().maxCount(64).group(Adabranium.ADABRANIUM_GROUP)));
    public static final Item ADAMANTIUM_INGOT = register("adamantium_ingot", new Item(new Item.Settings().maxCount(64).group(Adabranium.ADABRANIUM_GROUP)));

    public static final Item HEART_SHAPED_HERB = register("heart_shaped_herb", new HeartShapedHerbItem(new Item.Settings().maxCount(64).group(Adabranium.ADABRANIUM_GROUP)));
    public static final Item VIBRANIUM_SOUP = register("vibranium_soup", new StewItem(new Item.Settings().maxCount(1).group(Adabranium.ADABRANIUM_GROUP).food(new FoodComponent.Builder().hunger(8).saturationModifier(0.6F)
            .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 1800, 1, true, false, true), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 3000, 1, true, false, true), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 1200, 1, true, false, true), 1.0F).alwaysEdible().build())));

    // dusts
    public static final Item VIBRANIUM_DUST = register("vibranium_dust", new Item(new Item.Settings().maxCount(64).group(Adabranium.ADABRANIUM_GROUP)));

    public static Item register(String id, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Adabranium.MOD_ID, id), item);
    }
}
