package net.alminoris.aestheticstorage.util.helper;

import java.util.Dictionary;
import java.util.Hashtable;

public class BlockSetsHelper
{
    public static final Dictionary<String, Integer> WOOD_COLORS = new Hashtable<>()
    {{
        put("oak", 0x5e5030);
        put("birch", 0x8a7f57);
        put("spruce", 0x4b3822);
        put("jungle", 0x6a512f);
        put("acacia", 0x6b341e);
        put("dark_oak", 0x2d2416);
        put("crimson", 0x4f2234);
        put("warped", 0x2d6463);
        put("mangrove", 0x471f1f);
        put("cherry", 0x8e4f53);
        put("bamboo", 0x917e28);
        put("hazelnut", 0x5f4e30);
        put("hawthorn", 0x5b2f16);
        put("hornbeam", 0x82816f);
        put("quince", 0x8c643f);
        put("plum", 0x65484e);
        put("mango", 0x804f2b);
        put("fig", 0x86725c);
        put("viburnum", 0x623f30);
        put("white_mulberry", 0x897622);
        put("wild_cherry", 0x946a34);
        put("bauhinia", 0x3b2e22);
        put("pine", 0x77684b);
        put("olive", 0x443f30);
        put("tamarisk", 0x3b2623);
        put("fir", 0x5d4229);
        put("cedar", 0x604336);
        put("araucaria", 0x5d4314);
        put("juniper", 0x753f27);
        put("bald_cypress", 0x414136);
        put("thuja", 0x473029);
        put("sequoia", 0x5f392e);
        put("mountain_hemlock", 0x755938);
        put("cryptomeria", 0x745733);
        put("yew", 0x5a3f1e);
        put("larch", 0x6f5d4a);
        put("western_serviceberry", 0x553e2e);
        put("trembling_aspen", 0x5d5a4a);
        put("cottonwood", 0x564f40);
        put("aspen_nss", 0xa18336);
        put("cedar_nss", 0x6d403f);
        put("coconut_nss", 0x8b5448);
        put("cypress_nss", 0x4b3c2d);
        put("fir_nss", 0x322422);
        put("ghaf_nss", 0x4e3625);
        put("larch_nss", 0x2b2c33);
        put("mahogany_nss", 0x411f1a);
        put("maple_nss", 0x5c3a24);
        put("olive_nss", 0x372f1c);
        put("palo_verde_nss", 0x4c471b);
        put("redwood_nss", 0x301211);
        put("saxaul_nss", 0x382d22);
        put("sugi_nss", 0x36201b);
        put("willow_nss", 0x18110c);
        put("wisteria_nss", 0x62524d);
        put("walnut", 0x543e2e);
        put("silver_maple", 0x977a65);
        put("staghorn_sumac", 0x854938);
        put("silverberry", 0x7c7655);
        put("willow", 0x716b3b);
        put("poplar", 0x947f4a);
        put("alder", 0x652b1f);
        put("aspen", 0x928b72);
        put("azalea", 0x553d31);
        put("apple", 0x6d4d33);
        put("scots_pine", 0x83604d);
        put("swamp_oak", 0x463926);
    }};

    public static final String[] COLORS =
            {
                    "black", "brown", "gray", "light_gray",
                    "white", "red", "orange", "yellow",
                    "purple", "magenta", "pink", "blue",
                    "cyan", "light_blue", "green", "lime"
            };

    public static final String[] STONES =
            {
                    "stone", "tuff", "blackstone", "andesite", "diorite", "granite",  "deepslate", "basalt_side",
                    "quartz_block_bottom", "stone_bricks", "bricks", "mud_bricks", "sandstone"
            };

    public static final String[] EXTRA_STONES_WF =
            {
                    "dolomite_block", "saltmarsh_block", "loessic_marl_block", "loamy_marl_block", "fossil_marlstone_block", "limestone_block"
            };

    public static final String[] WOODS =
            {
                    "oak", "birch", "spruce", "jungle", "acacia", "dark_oak",
                    "crimson", "warped", "mangrove", "cherry", "bamboo"
            };

    public static final String[] EXTRA_WOODS_AN =
            {
                    "hazelnut", "hornbeam", "hawthorn", "quince", "plum", "mango", "fig", "viburnum", "white_mulberry", "wild_cherry",
                    "bauhinia", "pine", "fir", "cedar", "araucaria", "juniper",
                    "bald_cypress", "thuja", "sequoia", "mountain_hemlock", "cryptomeria", "yew", "larch"
            };

    public static final String[] EXTRA_WOODS_WF =
            {
                    "olive", "tamarisk", "western_serviceberry", "trembling_aspen", "cottonwood"
            };

    public static final String[] ST_WOOD_NAMES = new String[] { "walnut", "silver_maple", "staghorn_sumac", "silverberry" };

    public static final String[] WT_WOOD_NAMES = new String[] { "willow", "poplar", "alder", "aspen" };

    public static final String[] MT_WOOD_NAMES = new String[] { "azalea", "apple", "scots_pine", "swamp_oak" };

    public static final String[] NSS_WOOD_NAMES = new String[] { "aspen_nss", "cedar_nss", "coconut_nss", "cypress_nss", "fir_nss", "ghaf_nss",
            "larch_nss", "mahogany_nss", "maple_nss", "olive_nss", "palo_verde_nss", "redwood_nss", "saxaul_nss", "sugi_nss", "willow_nss", "wisteria_nss" };

    public static String[] getWoods()
    {
        String[] combinedWoods = new String[WOODS.length + EXTRA_WOODS_AN.length + EXTRA_WOODS_WF.length+
                ST_WOOD_NAMES.length+ WT_WOOD_NAMES.length+ MT_WOOD_NAMES.length+ NSS_WOOD_NAMES.length];
        System.arraycopy(WOODS, 0, combinedWoods, 0, WOODS.length);
        System.arraycopy(EXTRA_WOODS_AN, 0, combinedWoods, WOODS.length, EXTRA_WOODS_AN.length);
        System.arraycopy(EXTRA_WOODS_WF, 0, combinedWoods, WOODS.length + EXTRA_WOODS_AN.length, EXTRA_WOODS_WF.length);
        System.arraycopy(ST_WOOD_NAMES, 0, combinedWoods, WOODS.length + EXTRA_WOODS_AN.length+EXTRA_WOODS_WF.length, ST_WOOD_NAMES.length);
        System.arraycopy(WT_WOOD_NAMES, 0, combinedWoods, WOODS.length + EXTRA_WOODS_AN.length+EXTRA_WOODS_WF.length
                +ST_WOOD_NAMES.length, WT_WOOD_NAMES.length);
        System.arraycopy(MT_WOOD_NAMES, 0, combinedWoods, WOODS.length + EXTRA_WOODS_AN.length+EXTRA_WOODS_WF.length
                +ST_WOOD_NAMES.length+WT_WOOD_NAMES.length, MT_WOOD_NAMES.length);
        System.arraycopy(NSS_WOOD_NAMES, 0, combinedWoods, WOODS.length + EXTRA_WOODS_AN.length+EXTRA_WOODS_WF.length
                +ST_WOOD_NAMES.length+WT_WOOD_NAMES.length+MT_WOOD_NAMES.length, NSS_WOOD_NAMES.length);
        return combinedWoods;
    }

    public static String[] getStones()
    {
        String[] combinedStones = new String[STONES.length + EXTRA_STONES_WF.length];
        System.arraycopy(STONES, 0, combinedStones, 0, STONES.length);
        System.arraycopy(EXTRA_STONES_WF, 0, combinedStones, STONES.length, EXTRA_STONES_WF.length);
        return combinedStones;
    }

    public static String[] getWoodsNStones()
    {
        String[] combined = new String[getWoods().length + getStones().length];
        System.arraycopy(getWoods(), 0, combined, 0, getWoods().length);
        System.arraycopy(getStones(), 0, combined, getWoods().length, getStones().length);
        return combined;
    }
}