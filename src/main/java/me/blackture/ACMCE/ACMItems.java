package io.github.blackture.ACMItems;

import java.util.ArrayList;

import java.util.HashMap;

import java.util.List;

import java.util.Map;

import org.bukkit.ChatColor;

import org.bukkit.Color;

import org.bukkit.Material;

import org.bukkit.enchantments.Enchantment;

import org.bukkit.inventory.ItemFlag;

import org.bukkit.inventory.meta.ItemMeta;

import org.bukkit.potion.PotionEffect;

import org.bukkit.potion.PotionEffectType;

import io.github.thebusybiscuit.slimefun4.api.MinecraftVersion;

import io.github.thebusybiscuit it.slimefun4.api.items.SlimefunItemStack;

import io.github.thebusybiscuit.slimefun4.core.attributes.MachineTier;

import io.github.thebusybiscuit.slimefun4.core.attributes.MachineType;

import io.github.thebusybiscuit.slimefun4.core.attributes.Radioactivity;

import io.github.thebusybiscuit.slimefun4.implementation.items.magical.staves.StormStaff;

import io.github.thebusybiscuit.slimefun4.utils.ChatUtils;

import io.github.thebusybiscuit.slimefun4.utils.HeadTexture;

import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder;

import io.github.thebusybiscuit.slimefun4.utils.itemstack.ColoredFireworkStar;

public class ACMItems extends JavaPlugin implements SlimefunAddon {

   private int researchId = 3300;

    private ItemGroup itemGroup;

    @Override

    public void onEnable() {

        Config cfg = new Config(this);

        if (cfg.getBoolean("options.auto-update") && getDescription().getVersion().startsWith("DEV - ")) {

            new GitHubBuildsUpdater(this, getFile(), "blackture/ACMCE/master").start();

        }

        new Metrics(this, 6469);

        itemGroup = new ItemGroup(new NamespacedKey(this, "items"), new CustomItemStack(Material.DIAMOND_SWORD, "&6BlackTure"), 1);

    

    public static final SlimefunItemStack HYPER_HELMET = new SlimefunItemStack("HYPER_HELMET", Material.IRON_HELMET, "&7Damascus Steel Helmet");

    public static final SlimefunItemStack HYPER_CHESTPLATE = new SlimefunItemStack("HYPER_CHESTPLATE", Material.IRON_CHESTPLATE, "&7Damascus Steel Chestplate");

    public static final SlimefunItemStack HYPER_LEGGINGS = new SlimefunItemStack("HYPER_LEGGINGS", Material.IRON_LEGGINGS, "&7Damascus Steel Leggings");

    public static final SlimefunItemStack HYPER_BOOTS = new SlimefunItemStack("HYPER_BOOTS", Material.IRON_BOOTS, "&7Damascus Steel Boots");

        Map<Enchantment, Integer> damascusEnchs = new HashMap<>();

    damascusEnchs.put(Enchantment.DURABILITY, 20);

    damascusEnchs.put(Enchantment.PROTECTION_ENVIRONMENTAL, 40);

    HYPER_HELMET.addUnsafeEnchantments(damascusEnchs);

    HYPER_CHESTPLATE.addUnsafeEnchantments(damascusEnchs);

    HYPER_LEGGINGS.addUnsafeEnchantments(damascusEnchs);

    HYPER_BOOTS.addUnsafeEnchantments(damascusEnchs);

    

    public static final SlimefunItemStack HYPER_PICKAXE = new SlimefunItemStack("HYPER_PICKAXE", Material.IRON_PICKAXE, "&9Cobalt Pickaxe");

    static {

        HYPER_PICKAXE.addUnsafeEnchantment(Enchantment.DURABILITY, 80);

        HYPER_PICKAXE.addUnsafeEnchantment(Enchantment.DIG_SPEED, 40);

    }

}
