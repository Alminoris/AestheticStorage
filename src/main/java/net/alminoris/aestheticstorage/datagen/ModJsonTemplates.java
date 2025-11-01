package net.alminoris.aestheticstorage.datagen;

public class ModJsonTemplates
{
    public static String SHAPED_RECIPE = """
            {
              "type": "minecraft:crafting_shaped",
              "category": "building",
              "key": {
                "#": {
                  "item": "INGREDIENT1_NAME"
                },
                "/": {
                  "item": "INGREDIENT2_NAME"
                }
              },
              "pattern": [
                PATTERN1
                PATTERN2
                PATTERN3
              ],
              "result": {
                "count": COUNT,
                "item": "aestheticstorage:OUTPUT_NAME"
              }
            }
            """;

    public static String CABINET_BLOCKSTATE = """
            {
              "variants": {
                "facing=north,variant=normal,open=false": { "model": "aestheticstorage:block/NAME_right" },
                "facing=south,variant=normal,open=false": { "model": "aestheticstorage:block/NAME_right", "y": 180 },
                "facing=west,variant=normal,open=false": { "model": "aestheticstorage:block/NAME_right", "y": 270 },
                "facing=east,variant=normal,open=false": { "model": "aestheticstorage:block/NAME_right", "y": 90 },
                "facing=north,variant=left,open=false": { "model": "aestheticstorage:block/NAME_left" },
                "facing=south,variant=left,open=false": { "model": "aestheticstorage:block/NAME_left", "y": 180 },
                "facing=west,variant=left,open=false": { "model": "aestheticstorage:block/NAME_left", "y": 270 },
                "facing=east,variant=left,open=false": { "model": "aestheticstorage:block/NAME_left", "y": 90 },
                "facing=north,variant=right,open=false": { "model": "aestheticstorage:block/NAME_right" },
                "facing=south,variant=right,open=false": { "model": "aestheticstorage:block/NAME_right", "y": 180 },
                "facing=west,variant=right,open=false": { "model": "aestheticstorage:block/NAME_right", "y": 270 },
                "facing=east,variant=right,open=false": { "model": "aestheticstorage:block/NAME_right", "y": 90 },
                "facing=north,variant=normal,open=true": { "model": "aestheticstorage:block/NAME_right_open" },
                "facing=south,variant=normal,open=true": { "model": "aestheticstorage:block/NAME_right_open", "y": 180 },
                "facing=west,variant=normal,open=true": { "model": "aestheticstorage:block/NAME_right_open", "y": 270 },
                "facing=east,variant=normal,open=true": { "model": "aestheticstorage:block/NAME_right_open", "y": 90 },
                "facing=north,variant=left,open=true": { "model": "aestheticstorage:block/NAME_left_open" },
                "facing=south,variant=left,open=true": { "model": "aestheticstorage:block/NAME_left_open", "y": 180 },
                "facing=west,variant=left,open=true": { "model": "aestheticstorage:block/NAME_left_open", "y": 270 },
                "facing=east,variant=left,open=true": { "model": "aestheticstorage:block/NAME_left_open", "y": 90 },
                "facing=north,variant=right,open=true": { "model": "aestheticstorage:block/NAME_right_open" },
                "facing=south,variant=right,open=true": { "model": "aestheticstorage:block/NAME_right_open", "y": 180 },
                "facing=west,variant=right,open=true": { "model": "aestheticstorage:block/NAME_right_open", "y": 270 },
                "facing=east,variant=right,open=true": { "model": "aestheticstorage:block/NAME_right_open", "y": 90 }
              }
            }
            """;

    public static String FLIP_CABINET_BLOCKSTATE = """
            {
              "variants": {
                "facing=north,variant=normal,open=false": { "model": "aestheticstorage:block/NAME" },
                "facing=south,variant=normal,open=false": { "model": "aestheticstorage:block/NAME", "y": 180 },
                "facing=west,variant=normal,open=false": { "model": "aestheticstorage:block/NAME", "y": 270 },
                "facing=east,variant=normal,open=false": { "model": "aestheticstorage:block/NAME", "y": 90 },
                "facing=north,variant=left,open=false": { "model": "aestheticstorage:block/NAME_left" },
                "facing=south,variant=left,open=false": { "model": "aestheticstorage:block/NAME_left", "y": 180 },
                "facing=west,variant=left,open=false": { "model": "aestheticstorage:block/NAME_left", "y": 270 },
                "facing=east,variant=left,open=false": { "model": "aestheticstorage:block/NAME_left", "y": 90 },
                "facing=north,variant=right,open=false": { "model": "aestheticstorage:block/NAME_right" },
                "facing=south,variant=right,open=false": { "model": "aestheticstorage:block/NAME_right", "y": 180 },
                "facing=west,variant=right,open=false": { "model": "aestheticstorage:block/NAME_right", "y": 270 },
                "facing=east,variant=right,open=false": { "model": "aestheticstorage:block/NAME_right", "y": 90 },
                "facing=north,variant=normal,open=true": { "model": "aestheticstorage:block/NAME_open" },
                "facing=south,variant=normal,open=true": { "model": "aestheticstorage:block/NAME_open", "y": 180 },
                "facing=west,variant=normal,open=true": { "model": "aestheticstorage:block/NAME_open", "y": 270 },
                "facing=east,variant=normal,open=true": { "model": "aestheticstorage:block/NAME_open", "y": 90 },
                "facing=north,variant=left,open=true": { "model": "aestheticstorage:block/NAME_left_open" },
                "facing=south,variant=left,open=true": { "model": "aestheticstorage:block/NAME_left_open", "y": 180 },
                "facing=west,variant=left,open=true": { "model": "aestheticstorage:block/NAME_left_open", "y": 270 },
                "facing=east,variant=left,open=true": { "model": "aestheticstorage:block/NAME_left_open", "y": 90 },
                "facing=north,variant=right,open=true": { "model": "aestheticstorage:block/NAME_right_open" },
                "facing=south,variant=right,open=true": { "model": "aestheticstorage:block/NAME_right_open", "y": 180 },
                "facing=west,variant=right,open=true": { "model": "aestheticstorage:block/NAME_right_open", "y": 270 },
                "facing=east,variant=right,open=true": { "model": "aestheticstorage:block/NAME_right_open", "y": 90 }
              }
            }
            """;

    public static String CUPBOARD_BLOCKSTATE = """
            {
              "variants": {
                "facing=north,variant=normal,open=false,flipped=false": { "model": "aestheticstorage:block/NAME" },
                "facing=south,variant=normal,open=false,flipped=false": { "model": "aestheticstorage:block/NAME", "y": 180 },
                "facing=west,variant=normal,open=false,flipped=false": { "model": "aestheticstorage:block/NAME", "y": 270 },
                "facing=east,variant=normal,open=false,flipped=false": { "model": "aestheticstorage:block/NAME", "y": 90 },
                "facing=north,variant=center,open=false,flipped=false": { "model": "aestheticstorage:block/NAME_center" },
                "facing=south,variant=center,open=false,flipped=false": { "model": "aestheticstorage:block/NAME_center", "y": 180 },
                "facing=west,variant=center,open=false,flipped=false": { "model": "aestheticstorage:block/NAME_center", "y": 270 },
                "facing=east,variant=center,open=false,flipped=false": { "model": "aestheticstorage:block/NAME_center", "y": 90 },
                "facing=north,variant=up,open=false,flipped=false": { "model": "aestheticstorage:block/NAME_up" },
                "facing=south,variant=up,open=false,flipped=false": { "model": "aestheticstorage:block/NAME_up", "y": 180 },
                "facing=west,variant=up,open=false,flipped=false": { "model": "aestheticstorage:block/NAME_up", "y": 270 },
                "facing=east,variant=up,open=false,flipped=false": { "model": "aestheticstorage:block/NAME_up", "y": 90 },
                "facing=north,variant=down,open=false,flipped=false": { "model": "aestheticstorage:block/NAME_down" },
                "facing=south,variant=down,open=false,flipped=false": { "model": "aestheticstorage:block/NAME_down", "y": 180 },
                "facing=west,variant=down,open=false,flipped=false": { "model": "aestheticstorage:block/NAME_down", "y": 270 },
                "facing=east,variant=down,open=false,flipped=false": { "model": "aestheticstorage:block/NAME_down", "y": 90 },
                "facing=north,variant=normal,open=true,flipped=false": { "model": "aestheticstorage:block/NAME_open" },
                "facing=south,variant=normal,open=true,flipped=false": { "model": "aestheticstorage:block/NAME_open", "y": 180 },
                "facing=west,variant=normal,open=true,flipped=false": { "model": "aestheticstorage:block/NAME_open", "y": 270 },
                "facing=east,variant=normal,open=true,flipped=false": { "model": "aestheticstorage:block/NAME_open", "y": 90 },
                "facing=north,variant=center,open=true,flipped=false": { "model": "aestheticstorage:block/NAME_center_open" },
                "facing=south,variant=center,open=true,flipped=false": { "model": "aestheticstorage:block/NAME_center_open", "y": 180 },
                "facing=west,variant=center,open=true,flipped=false": { "model": "aestheticstorage:block/NAME_center_open", "y": 270 },
                "facing=east,variant=center,open=true,flipped=false": { "model": "aestheticstorage:block/NAME_center_open", "y": 90 },
                "facing=north,variant=up,open=true,flipped=false": { "model": "aestheticstorage:block/NAME_up_open" },
                "facing=south,variant=up,open=true,flipped=false": { "model": "aestheticstorage:block/NAME_up_open", "y": 180 },
                "facing=west,variant=up,open=true,flipped=false": { "model": "aestheticstorage:block/NAME_up_open", "y": 270 },
                "facing=east,variant=up,open=true,flipped=false": { "model": "aestheticstorage:block/NAME_up_open", "y": 90 },
                "facing=north,variant=down,open=true,flipped=false": { "model": "aestheticstorage:block/NAME_down_open" },
                "facing=south,variant=down,open=true,flipped=false": { "model": "aestheticstorage:block/NAME_down_open", "y": 180 },
                "facing=west,variant=down,open=true,flipped=false": { "model": "aestheticstorage:block/NAME_down_open", "y": 270 },
                "facing=east,variant=down,open=true,flipped=false": { "model": "aestheticstorage:block/NAME_down_open", "y": 90 },
                "facing=north,variant=normal,open=false,flipped=true": { "model": "aestheticstorage:block/NAME_flipped" },
                "facing=south,variant=normal,open=false,flipped=true": { "model": "aestheticstorage:block/NAME_flipped", "y": 180 },
                "facing=west,variant=normal,open=false,flipped=true": { "model": "aestheticstorage:block/NAME_flipped", "y": 270 },
                "facing=east,variant=normal,open=false,flipped=true": { "model": "aestheticstorage:block/NAME_flipped", "y": 90 },
                "facing=north,variant=center,open=false,flipped=true": { "model": "aestheticstorage:block/NAME_center_flipped" },
                "facing=south,variant=center,open=false,flipped=true": { "model": "aestheticstorage:block/NAME_center_flipped", "y": 180 },
                "facing=west,variant=center,open=false,flipped=true": { "model": "aestheticstorage:block/NAME_center_flipped", "y": 270 },
                "facing=east,variant=center,open=false,flipped=true": { "model": "aestheticstorage:block/NAME_center_flipped", "y": 90 },
                "facing=north,variant=up,open=false,flipped=true": { "model": "aestheticstorage:block/NAME_up_flipped" },
                "facing=south,variant=up,open=false,flipped=true": { "model": "aestheticstorage:block/NAME_up_flipped", "y": 180 },
                "facing=west,variant=up,open=false,flipped=true": { "model": "aestheticstorage:block/NAME_up_flipped", "y": 270 },
                "facing=east,variant=up,open=false,flipped=true": { "model": "aestheticstorage:block/NAME_up_flipped", "y": 90 },
                "facing=north,variant=down,open=false,flipped=true": { "model": "aestheticstorage:block/NAME_down_flipped" },
                "facing=south,variant=down,open=false,flipped=true": { "model": "aestheticstorage:block/NAME_down_flipped", "y": 180 },
                "facing=west,variant=down,open=false,flipped=true": { "model": "aestheticstorage:block/NAME_down_flipped", "y": 270 },
                "facing=east,variant=down,open=false,flipped=true": { "model": "aestheticstorage:block/NAME_down_flipped", "y": 90 },
                "facing=north,variant=normal,open=true,flipped=true": { "model": "aestheticstorage:block/NAME_open_flipped" },
                "facing=south,variant=normal,open=true,flipped=true": { "model": "aestheticstorage:block/NAME_open_flipped", "y": 180 },
                "facing=west,variant=normal,open=true,flipped=true": { "model": "aestheticstorage:block/NAME_open_flipped", "y": 270 },
                "facing=east,variant=normal,open=true,flipped=true": { "model": "aestheticstorage:block/NAME_open_flipped", "y": 90 },
                "facing=north,variant=center,open=true,flipped=true": { "model": "aestheticstorage:block/NAME_center_open_flipped" },
                "facing=south,variant=center,open=true,flipped=true": { "model": "aestheticstorage:block/NAME_center_open_flipped", "y": 180 },
                "facing=west,variant=center,open=true,flipped=true": { "model": "aestheticstorage:block/NAME_center_open_flipped", "y": 270 },
                "facing=east,variant=center,open=true,flipped=true": { "model": "aestheticstorage:block/NAME_center_open_flipped", "y": 90 },
                "facing=north,variant=up,open=true,flipped=true": { "model": "aestheticstorage:block/NAME_up_open_flipped" },
                "facing=south,variant=up,open=true,flipped=true": { "model": "aestheticstorage:block/NAME_up_open_flipped", "y": 180 },
                "facing=west,variant=up,open=true,flipped=true": { "model": "aestheticstorage:block/NAME_up_open_flipped", "y": 270 },
                "facing=east,variant=up,open=true,flipped=true": { "model": "aestheticstorage:block/NAME_up_open_flipped", "y": 90 },
                "facing=north,variant=down,open=true,flipped=true": { "model": "aestheticstorage:block/NAME_down_open_flipped" },
                "facing=south,variant=down,open=true,flipped=true": { "model": "aestheticstorage:block/NAME_down_open_flipped", "y": 180 },
                "facing=west,variant=down,open=true,flipped=true": { "model": "aestheticstorage:block/NAME_down_open_flipped", "y": 270 },
                "facing=east,variant=down,open=true,flipped=true": { "model": "aestheticstorage:block/NAME_down_open_flipped", "y": 90 }
              }
            }
            """;

    public static String BLOCKSTATE = """
            {
              "variants": {
                "facing=north": { "model": "aestheticstorage:block/NAME" },
                "facing=south": { "model": "aestheticstorage:block/NAME", "y": 180 },
                "facing=west": { "model": "aestheticstorage:block/NAME", "y": 270 },
                "facing=east": { "model": "aestheticstorage:block/NAME", "y": 90 }
              }
            }
            """;
    
    public static String FLIPUP_CABINET = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		"1": "LEG_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
            		{
            			"from": [0, 0, 0],
            			"to": [1, 16, 15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [0.5, 8, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"east": {"uv": [0, 0, 15, 16], "texture": "#1"},
            				"south": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"west": {"uv": [0, 0, 15, 16], "texture": "#1"},
            				"up": {"uv": [0, 0, 1, 15], "texture": "#1"},
            				"down": {"uv": [0, 0, 1, 15], "texture": "#1"}
            			}
            		},
            		{
            			"from": [15, 0, 0],
            			"to": [16, 16, 15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [15.5, 8, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"east": {"uv": [0, 0, 15, 16], "texture": "#1"},
            				"south": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"west": {"uv": [0, 0, 15, 16], "texture": "#1"},
            				"up": {"uv": [0, 0, 1, 15], "texture": "#1"},
            				"down": {"uv": [0, 0, 1, 15], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 0, 0],
            			"to": [15, 1, 15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 0.5, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 14, 15], "texture": "#1"},
            				"down": {"uv": [0, 0, 14, 15], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 7, 1],
            			"to": [15, 8, 15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 7.5, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 14, 14], "texture": "#1"},
            				"down": {"uv": [0, 0, 14, 14], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 1, 0],
            			"to": [15, 15, 2],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 1]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 14], "texture": "#1"},
            				"east": {"uv": [0, 0, 2, 14], "texture": "#1"},
            				"south": {"uv": [0, 0, 14, 14], "texture": "#1"},
            				"west": {"uv": [0, 0, 2, 14], "texture": "#1"},
            				"up": {"uv": [0, 0, 14, 2], "texture": "#1"},
            				"down": {"uv": [0, 0, 14, 2], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 15, 0],
            			"to": [15, 16, 15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 15.5, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 14, 15], "texture": "#1"},
            				"down": {"uv": [0, 0, 14, 15], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 1, 14.5],
            			"to": [15, 15, 15.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 15]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 14], "texture": "#0"},
            				"east": {"uv": [0, 0, 1, 14], "texture": "#0"},
            				"south": {"uv": [0, 0, 14, 14], "texture": "#0"},
            				"west": {"uv": [0, 0, 1, 14], "texture": "#0"},
            				"up": {"uv": [0, 0, 14, 1], "texture": "#0"},
            				"down": {"uv": [0, 0, 14, 1], "texture": "#0"}
            			}
            		},
            		{
            			"from": [6, 2, 14],
            			"to": [10, 3, 16],
            			"rotation": {"angle": 0, "axis": "y", "origin": [7, 1, 14]},
            			"faces": {
            				"north": {"uv": [4, 2, 8, 3], "texture": "#1"},
            				"east": {"uv": [4, 2, 6, 3], "texture": "#1"},
            				"south": {"uv": [4, 2, 8, 3], "texture": "#1"},
            				"west": {"uv": [4, 2, 6, 3], "texture": "#1"},
            				"up": {"uv": [4, 2, 8, 4], "texture": "#1"},
            				"down": {"uv": [4, 2, 8, 4], "texture": "#1"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [1, 2.25, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"thirdperson_lefthand": {
            			"translation": [1, 2.25, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_righthand": {
            			"translation": [1, 3, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_lefthand": {
            			"translation": [1, 3, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"ground": {
            			"translation": [0, 1.5, 0],
            			"scale": [0.33, 0.33, 0.33]
            		},
            		"gui": {
            			"rotation": [20, -45, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"fixed": {
            			"rotation": [180, 0, 180],
            			"translation": [0, 0, 1],
            			"scale": [0.5, 0.5, 0.5]
            		}
            	}
            }
            """;

    public static String FLIPUP_CABINET_OPEN = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		"1": "LEG_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
            		{
            			"from": [0, 0, 0],
            			"to": [1, 16, 15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [0.5, 8, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"east": {"uv": [0, 0, 15, 16], "texture": "#1"},
            				"south": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"west": {"uv": [0, 0, 15, 16], "texture": "#1"},
            				"up": {"uv": [0, 0, 1, 15], "texture": "#1"},
            				"down": {"uv": [0, 0, 1, 15], "texture": "#1"}
            			}
            		},
            		{
            			"from": [15, 0, 0],
            			"to": [16, 16, 15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [15.5, 8, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"east": {"uv": [0, 0, 15, 16], "texture": "#1"},
            				"south": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"west": {"uv": [0, 0, 15, 16], "texture": "#1"},
            				"up": {"uv": [0, 0, 1, 15], "texture": "#1"},
            				"down": {"uv": [0, 0, 1, 15], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 0, 0],
            			"to": [15, 1, 15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 0.5, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 14, 15], "texture": "#1"},
            				"down": {"uv": [0, 0, 14, 15], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 7, 1],
            			"to": [15, 8, 15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 7.5, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 14, 14], "texture": "#1"},
            				"down": {"uv": [0, 0, 14, 14], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 1, 0],
            			"to": [15, 15, 2],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 1]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 14], "texture": "#1"},
            				"east": {"uv": [0, 0, 2, 14], "texture": "#1"},
            				"south": {"uv": [0, 0, 14, 14], "texture": "#1"},
            				"west": {"uv": [0, 0, 2, 14], "texture": "#1"},
            				"up": {"uv": [0, 0, 14, 2], "texture": "#1"},
            				"down": {"uv": [0, 0, 14, 2], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 15, 0],
            			"to": [15, 16, 15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 15.5, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 14, 15], "texture": "#1"},
            				"down": {"uv": [0, 0, 14, 15], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 14, 14.25],
            			"to": [15, 15, 28.25],
            			"rotation": {"angle": 0, "axis": "x", "origin": [8, 14.5, 24]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 1], "rotation": 180, "texture": "#0"},
            				"east": {"uv": [0, 0, 1, 14], "rotation": 90, "texture": "#0"},
            				"south": {"uv": [0, 0, 14, 1], "texture": "#0"},
            				"west": {"uv": [0, 0, 1, 14], "rotation": 270, "texture": "#0"},
            				"up": {"uv": [0, 0, 14, 14], "texture": "#0"},
            				"down": {"uv": [0, 0, 14, 14], "rotation": 180, "texture": "#0"}
            			}
            		},
            		{
            			"from": [6, 14.5, 26.25],
            			"to": [10, 15.5, 27.25],
            			"rotation": {"angle": 0, "axis": "x", "origin": [8, 14.5, 24]},
            			"faces": {
            				"north": {"uv": [4, 2, 8, 3], "rotation": 180, "texture": "#1"},
            				"east": {"uv": [4, 2, 6, 3], "rotation": 90, "texture": "#1"},
            				"south": {"uv": [4, 2, 8, 3], "texture": "#1"},
            				"west": {"uv": [4, 2, 6, 3], "rotation": 270, "texture": "#1"},
            				"up": {"uv": [4, 2, 8, 3], "texture": "#1"},
            				"down": {"uv": [4, 2, 8, 3], "rotation": 180, "texture": "#1"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [1, 2.25, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"thirdperson_lefthand": {
            			"translation": [1, 2.25, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_righthand": {
            			"translation": [1, 3, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_lefthand": {
            			"translation": [1, 3, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"ground": {
            			"translation": [0, 1.5, 0],
            			"scale": [0.33, 0.33, 0.33]
            		},
            		"gui": {
            			"rotation": [20, -45, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"fixed": {
            			"rotation": [180, 0, 180],
            			"translation": [0, 0, 1],
            			"scale": [0.5, 0.5, 0.5]
            		}
            	}
            }
            """;

    public static String FLIPUP_CABINET_RIGHT = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		"1": "LEG_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
            		{
            			"from": [15, 0, 0],
            			"to": [16, 16, 15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [15.5, 8, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"east": {"uv": [0, 0, 15, 16], "texture": "#1"},
            				"south": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"west": {"uv": [0, 0, 15, 16], "texture": "#1"},
            				"up": {"uv": [0, 0, 1, 15], "texture": "#1"},
            				"down": {"uv": [0, 0, 1, 15], "texture": "#1"}
            			}
            		},
            		{
            			"from": [0, 0, 0],
            			"to": [15, 1, 15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 0.5, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 15, 15], "texture": "#1"},
            				"down": {"uv": [0, 0, 15, 15], "texture": "#1"}
            			}
            		},
            		{
            			"from": [0, 7, 1],
            			"to": [15, 8, 15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 7.5, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 15, 14], "texture": "#1"},
            				"down": {"uv": [0, 0, 15, 14], "texture": "#1"}
            			}
            		},
            		{
            			"from": [0, 1, 0],
            			"to": [15, 15, 2],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 1]},
            			"faces": {
            				"north": {"uv": [0, 0, 15, 14], "texture": "#1"},
            				"east": {"uv": [0, 0, 2, 14], "texture": "#1"},
            				"south": {"uv": [0, 0, 15, 14], "texture": "#1"},
            				"west": {"uv": [0, 0, 2, 14], "texture": "#1"},
            				"up": {"uv": [0, 0, 15, 2], "texture": "#1"},
            				"down": {"uv": [0, 0, 15, 2], "texture": "#1"}
            			}
            		},
            		{
            			"from": [0, 15, 0],
            			"to": [15, 16, 15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 15.5, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 15, 15], "texture": "#1"},
            				"down": {"uv": [0, 0, 15, 15], "texture": "#1"}
            			}
            		},
            		{
            			"from": [0, 1, 14.5],
            			"to": [15, 15, 15.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 15]},
            			"faces": {
            				"north": {"uv": [0, 0, 15, 14], "texture": "#0"},
            				"east": {"uv": [0, 0, 1, 14], "texture": "#0"},
            				"south": {"uv": [0, 0, 15, 14], "texture": "#0"},
            				"west": {"uv": [0, 0, 1, 14], "texture": "#0"},
            				"up": {"uv": [0, 0, 15, 1], "texture": "#0"},
            				"down": {"uv": [0, 0, 15, 1], "texture": "#0"}
            			}
            		},
            		{
            			"from": [0, 2, 14],
            			"to": [4, 3, 16],
            			"rotation": {"angle": 0, "axis": "y", "origin": [1, 1, 14]},
            			"faces": {
            				"north": {"uv": [4, 2, 8, 3], "texture": "#1"},
            				"east": {"uv": [4, 2, 6, 3], "texture": "#1"},
            				"south": {"uv": [4, 2, 8, 3], "texture": "#1"},
            				"west": {"uv": [4, 2, 6, 3], "texture": "#1"},
            				"up": {"uv": [4, 2, 8, 4], "texture": "#1"},
            				"down": {"uv": [4, 2, 8, 4], "texture": "#1"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [1, 2.25, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"thirdperson_lefthand": {
            			"translation": [1, 2.25, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_righthand": {
            			"translation": [1, 3, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_lefthand": {
            			"translation": [1, 3, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"ground": {
            			"translation": [0, 1.5, 0],
            			"scale": [0.33, 0.33, 0.33]
            		},
            		"gui": {
            			"rotation": [20, -45, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"fixed": {
            			"rotation": [180, 0, 180],
            			"translation": [0, 0, 1],
            			"scale": [0.5, 0.5, 0.5]
            		}
            	}
            }
            """;

    public static String FLIPUP_CABINET_RIGHT_OPEN = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		"1": "LEG_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
            		{
            			"from": [15, 0, 0],
            			"to": [16, 16, 15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [15.5, 8, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"east": {"uv": [0, 0, 15, 16], "texture": "#1"},
            				"south": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"west": {"uv": [0, 0, 15, 16], "texture": "#1"},
            				"up": {"uv": [0, 0, 1, 15], "texture": "#1"},
            				"down": {"uv": [0, 0, 1, 15], "texture": "#1"}
            			}
            		},
            		{
            			"from": [0, 0, 0],
            			"to": [15, 1, 15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 0.5, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 15, 15], "texture": "#1"},
            				"down": {"uv": [0, 0, 15, 15], "texture": "#1"}
            			}
            		},
            		{
            			"from": [0, 7, 1],
            			"to": [15, 8, 15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 7.5, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 15, 14], "texture": "#1"},
            				"down": {"uv": [0, 0, 15, 14], "texture": "#1"}
            			}
            		},
            		{
            			"from": [0, 1, 0],
            			"to": [15, 15, 2],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 1]},
            			"faces": {
            				"north": {"uv": [0, 0, 15, 14], "texture": "#1"},
            				"east": {"uv": [0, 0, 2, 14], "texture": "#1"},
            				"south": {"uv": [0, 0, 15, 14], "texture": "#1"},
            				"west": {"uv": [0, 0, 2, 14], "texture": "#1"},
            				"up": {"uv": [0, 0, 15, 2], "texture": "#1"},
            				"down": {"uv": [0, 0, 15, 2], "texture": "#1"}
            			}
            		},
            		{
            			"from": [0, 15, 0],
            			"to": [15, 16, 15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 15.5, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 15, 15], "texture": "#1"},
            				"down": {"uv": [0, 0, 15, 15], "texture": "#1"}
            			}
            		},
            		{
            			"from": [0, 14, 14.25],
            			"to": [15, 15, 28.25],
            			"rotation": {"angle": 0, "axis": "x", "origin": [8, 14.5, 24]},
            			"faces": {
            				"north": {"uv": [0, 0, 15, 1], "rotation": 180, "texture": "#0"},
            				"east": {"uv": [0, 0, 1, 14], "rotation": 90, "texture": "#0"},
            				"south": {"uv": [0, 0, 15, 1], "texture": "#0"},
            				"west": {"uv": [0, 0, 1, 14], "rotation": 270, "texture": "#0"},
            				"up": {"uv": [0, 0, 15, 14], "texture": "#0"},
            				"down": {"uv": [0, 0, 15, 14], "rotation": 180, "texture": "#0"}
            			}
            		},
            		{
            			"from": [0, 14.5, 26.25],
            			"to": [4, 15.5, 27.25],
            			"rotation": {"angle": 0, "axis": "x", "origin": [2, 14.5, 24]},
            			"faces": {
            				"north": {"uv": [4, 2, 8, 3], "rotation": 180, "texture": "#1"},
            				"east": {"uv": [4, 2, 6, 3], "rotation": 90, "texture": "#1"},
            				"south": {"uv": [4, 2, 8, 3], "texture": "#1"},
            				"west": {"uv": [4, 2, 6, 3], "rotation": 270, "texture": "#1"},
            				"up": {"uv": [4, 2, 8, 3], "texture": "#1"},
            				"down": {"uv": [4, 2, 8, 3], "rotation": 180, "texture": "#1"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [1, 2.25, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"thirdperson_lefthand": {
            			"translation": [1, 2.25, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_righthand": {
            			"translation": [1, 3, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_lefthand": {
            			"translation": [1, 3, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"ground": {
            			"translation": [0, 1.5, 0],
            			"scale": [0.33, 0.33, 0.33]
            		},
            		"gui": {
            			"rotation": [20, -45, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"fixed": {
            			"rotation": [180, 0, 180],
            			"translation": [0, 0, 1],
            			"scale": [0.5, 0.5, 0.5]
            		}
            	}
            }
            """;

    public static String FLIPUP_CABINET_LEFT = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		"1": "LEG_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
            		{
            			"from": [0, 0, 0],
            			"to": [1, 16, 15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [0.5, 8, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"east": {"uv": [0, 0, 15, 16], "texture": "#1"},
            				"south": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"west": {"uv": [0, 0, 15, 16], "texture": "#1"},
            				"up": {"uv": [0, 0, 1, 15], "texture": "#1"},
            				"down": {"uv": [0, 0, 1, 15], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 0, 0],
            			"to": [16, 1, 15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 0.5, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 15, 15], "texture": "#1"},
            				"down": {"uv": [0, 0, 15, 15], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 7, 1],
            			"to": [16, 8, 15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 7.5, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 15, 14], "texture": "#1"},
            				"down": {"uv": [0, 0, 15, 14], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 1, 0],
            			"to": [16, 15, 2],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 1]},
            			"faces": {
            				"north": {"uv": [0, 0, 15, 14], "texture": "#1"},
            				"east": {"uv": [0, 0, 2, 14], "texture": "#1"},
            				"south": {"uv": [0, 0, 15, 14], "texture": "#1"},
            				"west": {"uv": [0, 0, 2, 14], "texture": "#1"},
            				"up": {"uv": [0, 0, 14, 2], "texture": "#1"},
            				"down": {"uv": [0, 0, 14, 2], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 15, 0],
            			"to": [16, 16, 15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 15.5, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 15, 15], "texture": "#1"},
            				"down": {"uv": [0, 0, 15, 15], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 1, 14.5],
            			"to": [16, 15, 15.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 15]},
            			"faces": {
            				"north": {"uv": [0, 0, 15, 14], "texture": "#0"},
            				"east": {"uv": [0, 0, 1, 14], "texture": "#0"},
            				"south": {"uv": [0, 0, 15, 14], "texture": "#0"},
            				"west": {"uv": [0, 0, 1, 14], "texture": "#0"},
            				"up": {"uv": [0, 0, 14, 1], "texture": "#0"},
            				"down": {"uv": [0, 0, 14, 1], "texture": "#0"}
            			}
            		},
            		{
            			"from": [12, 2, 14],
            			"to": [16, 3, 16],
            			"rotation": {"angle": 0, "axis": "y", "origin": [13, 1, 14]},
            			"faces": {
            				"north": {"uv": [4, 2, 8, 3], "texture": "#1"},
            				"east": {"uv": [4, 2, 6, 3], "texture": "#1"},
            				"south": {"uv": [4, 2, 8, 3], "texture": "#1"},
            				"west": {"uv": [4, 2, 6, 3], "texture": "#1"},
            				"up": {"uv": [4, 2, 8, 4], "texture": "#1"},
            				"down": {"uv": [4, 2, 8, 4], "texture": "#1"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [1, 2.25, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"thirdperson_lefthand": {
            			"translation": [1, 2.25, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_righthand": {
            			"translation": [1, 3, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_lefthand": {
            			"translation": [1, 3, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"ground": {
            			"translation": [0, 1.5, 0],
            			"scale": [0.33, 0.33, 0.33]
            		},
            		"gui": {
            			"rotation": [20, -45, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"fixed": {
            			"rotation": [180, 0, 180],
            			"translation": [0, 0, 1],
            			"scale": [0.5, 0.5, 0.5]
            		}
            	}
            }
            """;

    public static String FLIPUP_CABINET_LEFT_OPEN = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		"1": "LEG_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
            		{
            			"from": [0, 0, 0],
            			"to": [1, 16, 15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [0.5, 8, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"east": {"uv": [0, 0, 15, 16], "texture": "#1"},
            				"south": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"west": {"uv": [0, 0, 15, 16], "texture": "#1"},
            				"up": {"uv": [0, 0, 1, 15], "texture": "#1"},
            				"down": {"uv": [0, 0, 1, 15], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 0, 0],
            			"to": [16, 1, 15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 0.5, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 15, 15], "texture": "#1"},
            				"down": {"uv": [0, 0, 15, 15], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 7, 1],
            			"to": [16, 8, 15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 7.5, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 15, 14], "texture": "#1"},
            				"down": {"uv": [0, 0, 15, 14], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 1, 0],
            			"to": [16, 15, 2],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 1]},
            			"faces": {
            				"north": {"uv": [0, 0, 15, 14], "texture": "#1"},
            				"east": {"uv": [0, 0, 2, 14], "texture": "#1"},
            				"south": {"uv": [0, 0, 15, 14], "texture": "#1"},
            				"west": {"uv": [0, 0, 2, 14], "texture": "#1"},
            				"up": {"uv": [0, 0, 14, 2], "texture": "#1"},
            				"down": {"uv": [0, 0, 14, 2], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 15, 0],
            			"to": [16, 16, 15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 15.5, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 15, 15], "texture": "#1"},
            				"down": {"uv": [0, 0, 15, 15], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 14, 14.25],
            			"to": [16, 15, 28.25],
            			"rotation": {"angle": 0, "axis": "x", "origin": [8, 14.5, 24]},
            			"faces": {
            				"north": {"uv": [0, 0, 15, 1], "rotation": 180, "texture": "#0"},
            				"east": {"uv": [0, 0, 1, 14], "rotation": 90, "texture": "#0"},
            				"south": {"uv": [0, 0, 15, 1], "texture": "#0"},
            				"west": {"uv": [0, 0, 1, 14], "rotation": 270, "texture": "#0"},
            				"up": {"uv": [0, 0, 15, 14], "texture": "#0"},
            				"down": {"uv": [0, 0, 15, 14], "rotation": 180, "texture": "#0"}
            			}
            		},
            		{
            			"from": [12, 14.5, 26.25],
            			"to": [16, 15.5, 27.25],
            			"rotation": {"angle": 0, "axis": "x", "origin": [14, 14.5, 24]},
            			"faces": {
            				"north": {"uv": [4, 2, 8, 3], "rotation": 180, "texture": "#1"},
            				"east": {"uv": [4, 2, 6, 3], "rotation": 90, "texture": "#1"},
            				"south": {"uv": [4, 2, 8, 3], "texture": "#1"},
            				"west": {"uv": [4, 2, 6, 3], "rotation": 270, "texture": "#1"},
            				"up": {"uv": [4, 2, 8, 3], "texture": "#1"},
            				"down": {"uv": [4, 2, 8, 3], "rotation": 180, "texture": "#1"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [1, 2.25, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"thirdperson_lefthand": {
            			"translation": [1, 2.25, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_righthand": {
            			"translation": [1, 3, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_lefthand": {
            			"translation": [1, 3, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"ground": {
            			"translation": [0, 1.5, 0],
            			"scale": [0.33, 0.33, 0.33]
            		},
            		"gui": {
            			"rotation": [20, -45, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"fixed": {
            			"rotation": [180, 0, 180],
            			"translation": [0, 0, 1],
            			"scale": [0.5, 0.5, 0.5]
            		}
            	}
            }
            """;

    public static String FLIPDOWN_CABINET = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		"1": "LEG_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
            		{
            			"from": [0, 0, 0],
            			"to": [1, 16, 15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [0.5, 8, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"east": {"uv": [0, 0, 15, 16], "texture": "#1"},
            				"south": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"west": {"uv": [0, 0, 15, 16], "texture": "#1"},
            				"up": {"uv": [0, 0, 1, 15], "texture": "#1"},
            				"down": {"uv": [0, 0, 1, 15], "texture": "#1"}
            			}
            		},
            		{
            			"from": [15, 0, 0],
            			"to": [16, 16, 15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [15.5, 8, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"east": {"uv": [0, 0, 15, 16], "texture": "#1"},
            				"south": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"west": {"uv": [0, 0, 15, 16], "texture": "#1"},
            				"up": {"uv": [0, 0, 1, 15], "texture": "#1"},
            				"down": {"uv": [0, 0, 1, 15], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 0, 0],
            			"to": [15, 1, 15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 0.5, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 14, 15], "texture": "#1"},
            				"down": {"uv": [0, 0, 14, 15], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 7, 1],
            			"to": [15, 8, 15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 7.5, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 14, 14], "texture": "#1"},
            				"down": {"uv": [0, 0, 14, 14], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 1, 0],
            			"to": [15, 15, 2],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 1]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 14], "texture": "#1"},
            				"east": {"uv": [0, 0, 2, 14], "texture": "#1"},
            				"south": {"uv": [0, 0, 14, 14], "texture": "#1"},
            				"west": {"uv": [0, 0, 2, 14], "texture": "#1"},
            				"up": {"uv": [0, 0, 14, 2], "texture": "#1"},
            				"down": {"uv": [0, 0, 14, 2], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 15, 0],
            			"to": [15, 16, 15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 15.5, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 14, 15], "texture": "#1"},
            				"down": {"uv": [0, 0, 14, 15], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 1, 14.5],
            			"to": [15, 15, 15.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 15]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 14], "texture": "#0"},
            				"east": {"uv": [0, 0, 1, 14], "texture": "#0"},
            				"south": {"uv": [0, 0, 14, 14], "texture": "#0"},
            				"west": {"uv": [0, 0, 1, 14], "texture": "#0"},
            				"up": {"uv": [0, 0, 14, 1], "texture": "#0"},
            				"down": {"uv": [0, 0, 14, 1], "texture": "#0"}
            			}
            		},
            		{
            			"from": [6, 13, 14],
            			"to": [10, 14, 16],
            			"rotation": {"angle": 0, "axis": "y", "origin": [7, 12, 14]},
            			"faces": {
            				"north": {"uv": [4, 2, 8, 3], "texture": "#1"},
            				"east": {"uv": [4, 2, 6, 3], "texture": "#1"},
            				"south": {"uv": [4, 2, 8, 3], "texture": "#1"},
            				"west": {"uv": [4, 2, 6, 3], "texture": "#1"},
            				"up": {"uv": [4, 2, 8, 4], "texture": "#1"},
            				"down": {"uv": [4, 2, 8, 4], "texture": "#1"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [1, 2.25, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"thirdperson_lefthand": {
            			"translation": [1, 2.25, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_righthand": {
            			"translation": [1, 3, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_lefthand": {
            			"translation": [1, 3, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"ground": {
            			"translation": [0, 1.5, 0],
            			"scale": [0.33, 0.33, 0.33]
            		},
            		"gui": {
            			"rotation": [20, -45, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"fixed": {
            			"rotation": [180, 0, 180],
            			"translation": [0, 0, 1],
            			"scale": [0.5, 0.5, 0.5]
            		}
            	}
            }
            """;

    public static String FLIPDOWN_CABINET_OPEN = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		"1": "LEG_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
            		{
            			"from": [0, 0, 0],
            			"to": [1, 16, 15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [0.5, 8, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"east": {"uv": [0, 0, 15, 16], "texture": "#1"},
            				"south": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"west": {"uv": [0, 0, 15, 16], "texture": "#1"},
            				"up": {"uv": [0, 0, 1, 15], "texture": "#1"},
            				"down": {"uv": [0, 0, 1, 15], "texture": "#1"}
            			}
            		},
            		{
            			"from": [15, 0, 0],
            			"to": [16, 16, 15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [15.5, 8, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"east": {"uv": [0, 0, 15, 16], "texture": "#1"},
            				"south": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"west": {"uv": [0, 0, 15, 16], "texture": "#1"},
            				"up": {"uv": [0, 0, 1, 15], "texture": "#1"},
            				"down": {"uv": [0, 0, 1, 15], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 0, 0],
            			"to": [15, 1, 15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 0.5, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 14, 15], "texture": "#1"},
            				"down": {"uv": [0, 0, 14, 15], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 7, 1],
            			"to": [15, 8, 15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 7.5, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 14, 14], "texture": "#1"},
            				"down": {"uv": [0, 0, 14, 14], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 1, 0],
            			"to": [15, 15, 2],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 1]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 14], "texture": "#1"},
            				"east": {"uv": [0, 0, 2, 14], "texture": "#1"},
            				"south": {"uv": [0, 0, 14, 14], "texture": "#1"},
            				"west": {"uv": [0, 0, 2, 14], "texture": "#1"},
            				"up": {"uv": [0, 0, 14, 2], "texture": "#1"},
            				"down": {"uv": [0, 0, 14, 2], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 15, 0],
            			"to": [15, 16, 15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 15.5, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 14, 15], "texture": "#1"},
            				"down": {"uv": [0, 0, 14, 15], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 1, 14],
            			"to": [15, 2, 28],
            			"rotation": {"angle": 0, "axis": "x", "origin": [8, 1.25, 23.75]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 1], "rotation": 180, "texture": "#0"},
            				"east": {"uv": [0, 0, 1, 14], "rotation": 270, "texture": "#0"},
            				"south": {"uv": [0, 0, 14, 1], "texture": "#0"},
            				"west": {"uv": [0, 0, 1, 14], "rotation": 90, "texture": "#0"},
            				"up": {"uv": [0, 0, 14, 14], "rotation": 180, "texture": "#0"},
            				"down": {"uv": [0, 0, 14, 14], "texture": "#0"}
            			}
            		},
            		{
            			"from": [6, 0.5, 26],
            			"to": [10, 1.5, 27],
            			"rotation": {"angle": 0, "axis": "x", "origin": [8, 1.25, 23.75]},
            			"faces": {
            				"north": {"uv": [4, 2, 8, 3], "rotation": 180, "texture": "#1"},
            				"east": {"uv": [4, 2, 6, 3], "rotation": 270, "texture": "#1"},
            				"south": {"uv": [4, 2, 8, 3], "texture": "#1"},
            				"west": {"uv": [4, 2, 6, 3], "rotation": 90, "texture": "#1"},
            				"up": {"uv": [4, 2, 8, 3], "rotation": 180, "texture": "#1"},
            				"down": {"uv": [4, 2, 8, 3], "texture": "#1"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [1, 2.25, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"thirdperson_lefthand": {
            			"translation": [1, 2.25, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_righthand": {
            			"translation": [1, 3, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_lefthand": {
            			"translation": [1, 3, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"ground": {
            			"translation": [0, 1.5, 0],
            			"scale": [0.33, 0.33, 0.33]
            		},
            		"gui": {
            			"rotation": [20, -45, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"fixed": {
            			"rotation": [180, 0, 180],
            			"translation": [0, 0, 1],
            			"scale": [0.5, 0.5, 0.5]
            		}
            	}
            }
            """;

    public static String FLIPDOWN_CABINET_RIGHT = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		"1": "LEG_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
            		{
            			"from": [15, 0, 0],
            			"to": [16, 16, 15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [15.5, 8, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"east": {"uv": [0, 0, 15, 16], "texture": "#1"},
            				"south": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"west": {"uv": [0, 0, 15, 16], "texture": "#1"},
            				"up": {"uv": [0, 0, 1, 15], "texture": "#1"},
            				"down": {"uv": [0, 0, 1, 15], "texture": "#1"}
            			}
            		},
            		{
            			"from": [0, 0, 0],
            			"to": [15, 1, 15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 0.5, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 15, 15], "texture": "#1"},
            				"down": {"uv": [0, 0, 15, 15], "texture": "#1"}
            			}
            		},
            		{
            			"from": [0, 7, 1],
            			"to": [15, 8, 15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 7.5, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 15, 14], "texture": "#1"},
            				"down": {"uv": [0, 0, 15, 14], "texture": "#1"}
            			}
            		},
            		{
            			"from": [0, 1, 0],
            			"to": [15, 15, 2],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 1]},
            			"faces": {
            				"north": {"uv": [0, 0, 15, 14], "texture": "#1"},
            				"east": {"uv": [0, 0, 2, 14], "texture": "#1"},
            				"south": {"uv": [0, 0, 15, 14], "texture": "#1"},
            				"west": {"uv": [0, 0, 2, 14], "texture": "#1"},
            				"up": {"uv": [0, 0, 15, 2], "texture": "#1"},
            				"down": {"uv": [0, 0, 15, 2], "texture": "#1"}
            			}
            		},
            		{
            			"from": [0, 15, 0],
            			"to": [15, 16, 15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 15.5, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 15, 15], "texture": "#1"},
            				"down": {"uv": [0, 0, 15, 15], "texture": "#1"}
            			}
            		},
            		{
            			"from": [0, 1, 14.5],
            			"to": [15, 15, 15.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 15]},
            			"faces": {
            				"north": {"uv": [0, 0, 15, 14], "texture": "#0"},
            				"east": {"uv": [0, 0, 1, 14], "texture": "#0"},
            				"south": {"uv": [0, 0, 15, 14], "texture": "#0"},
            				"west": {"uv": [0, 0, 1, 14], "texture": "#0"},
            				"up": {"uv": [0, 0, 15, 1], "texture": "#0"},
            				"down": {"uv": [0, 0, 15, 1], "texture": "#0"}
            			}
            		},
            		{
            			"from": [0, 13, 14],
            			"to": [4, 14, 16],
            			"rotation": {"angle": 0, "axis": "y", "origin": [1, 12, 14]},
            			"faces": {
            				"north": {"uv": [4, 2, 8, 3], "texture": "#1"},
            				"east": {"uv": [4, 2, 6, 3], "texture": "#1"},
            				"south": {"uv": [4, 2, 8, 3], "texture": "#1"},
            				"west": {"uv": [4, 2, 6, 3], "texture": "#1"},
            				"up": {"uv": [4, 2, 8, 4], "texture": "#1"},
            				"down": {"uv": [4, 2, 8, 4], "texture": "#1"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [1, 2.25, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"thirdperson_lefthand": {
            			"translation": [1, 2.25, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_righthand": {
            			"translation": [1, 3, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_lefthand": {
            			"translation": [1, 3, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"ground": {
            			"translation": [0, 1.5, 0],
            			"scale": [0.33, 0.33, 0.33]
            		},
            		"gui": {
            			"rotation": [20, -45, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"fixed": {
            			"rotation": [180, 0, 180],
            			"translation": [0, 0, 1],
            			"scale": [0.5, 0.5, 0.5]
            		}
            	}
            }
            """;

    public static String FLIPDOWN_CABINET_RIGHT_OPEN = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		"1": "LEG_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
            		{
            			"from": [15, 0, 0],
            			"to": [16, 16, 15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [15.5, 8, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"east": {"uv": [0, 0, 15, 16], "texture": "#1"},
            				"south": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"west": {"uv": [0, 0, 15, 16], "texture": "#1"},
            				"up": {"uv": [0, 0, 1, 15], "texture": "#1"},
            				"down": {"uv": [0, 0, 1, 15], "texture": "#1"}
            			}
            		},
            		{
            			"from": [0, 0, 0],
            			"to": [15, 1, 15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 0.5, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 15, 15], "texture": "#1"},
            				"down": {"uv": [0, 0, 15, 15], "texture": "#1"}
            			}
            		},
            		{
            			"from": [0, 7, 1],
            			"to": [15, 8, 15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 7.5, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 15, 14], "texture": "#1"},
            				"down": {"uv": [0, 0, 15, 14], "texture": "#1"}
            			}
            		},
            		{
            			"from": [0, 1, 0],
            			"to": [15, 15, 2],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 1]},
            			"faces": {
            				"north": {"uv": [0, 0, 15, 14], "texture": "#1"},
            				"east": {"uv": [0, 0, 2, 14], "texture": "#1"},
            				"south": {"uv": [0, 0, 15, 14], "texture": "#1"},
            				"west": {"uv": [0, 0, 2, 14], "texture": "#1"},
            				"up": {"uv": [0, 0, 15, 2], "texture": "#1"},
            				"down": {"uv": [0, 0, 15, 2], "texture": "#1"}
            			}
            		},
            		{
            			"from": [0, 15, 0],
            			"to": [15, 16, 15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 15.5, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 15, 15], "texture": "#1"},
            				"down": {"uv": [0, 0, 15, 15], "texture": "#1"}
            			}
            		},
            		{
            			"from": [0, 1, 14],
            			"to": [15, 2, 28],
            			"rotation": {"angle": 0, "axis": "x", "origin": [8, 1.25, 23.75]},
            			"faces": {
            				"north": {"uv": [0, 0, 15, 1], "rotation": 180, "texture": "#0"},
            				"east": {"uv": [0, 0, 1, 14], "rotation": 270, "texture": "#0"},
            				"south": {"uv": [0, 0, 15, 1], "texture": "#0"},
            				"west": {"uv": [0, 0, 1, 14], "rotation": 90, "texture": "#0"},
            				"up": {"uv": [0, 0, 15, 14], "rotation": 180, "texture": "#0"},
            				"down": {"uv": [0, 0, 15, 14], "texture": "#0"}
            			}
            		},
            		{
            			"from": [0, 0.5, 26],
            			"to": [4, 1.5, 27],
            			"rotation": {"angle": 0, "axis": "x", "origin": [2, 1.25, 23.75]},
            			"faces": {
            				"north": {"uv": [4, 2, 8, 3], "rotation": 180, "texture": "#1"},
            				"east": {"uv": [4, 2, 6, 3], "rotation": 270, "texture": "#1"},
            				"south": {"uv": [4, 2, 8, 3], "texture": "#1"},
            				"west": {"uv": [4, 2, 6, 3], "rotation": 90, "texture": "#1"},
            				"up": {"uv": [4, 2, 8, 3], "rotation": 180, "texture": "#1"},
            				"down": {"uv": [4, 2, 8, 3], "texture": "#1"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [1, 2.25, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"thirdperson_lefthand": {
            			"translation": [1, 2.25, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_righthand": {
            			"translation": [1, 3, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_lefthand": {
            			"translation": [1, 3, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"ground": {
            			"translation": [0, 1.5, 0],
            			"scale": [0.33, 0.33, 0.33]
            		},
            		"gui": {
            			"rotation": [20, -45, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"fixed": {
            			"rotation": [180, 0, 180],
            			"translation": [0, 0, 1],
            			"scale": [0.5, 0.5, 0.5]
            		}
            	}
            }
            """;

    public static String FLIPDOWN_CABINET_LEFT = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		"1": "LEG_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
            		{
            			"from": [0, 0, 0],
            			"to": [1, 16, 15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [0.5, 8, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"east": {"uv": [0, 0, 15, 16], "texture": "#1"},
            				"south": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"west": {"uv": [0, 0, 15, 16], "texture": "#1"},
            				"up": {"uv": [0, 0, 1, 15], "texture": "#1"},
            				"down": {"uv": [0, 0, 1, 15], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 0, 0],
            			"to": [16, 1, 15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 0.5, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 15, 15], "texture": "#1"},
            				"down": {"uv": [0, 0, 15, 15], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 7, 1],
            			"to": [16, 8, 15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 7.5, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 15, 14], "texture": "#1"},
            				"down": {"uv": [0, 0, 15, 14], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 1, 0],
            			"to": [16, 15, 2],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 1]},
            			"faces": {
            				"north": {"uv": [0, 0, 15, 14], "texture": "#1"},
            				"east": {"uv": [0, 0, 2, 14], "texture": "#1"},
            				"south": {"uv": [0, 0, 15, 14], "texture": "#1"},
            				"west": {"uv": [0, 0, 2, 14], "texture": "#1"},
            				"up": {"uv": [0, 0, 15, 2], "texture": "#1"},
            				"down": {"uv": [0, 0, 15, 2], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 15, 0],
            			"to": [16, 16, 15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 15.5, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 15, 15], "texture": "#1"},
            				"down": {"uv": [0, 0, 15, 15], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 1, 14.5],
            			"to": [16, 15, 15.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 15]},
            			"faces": {
            				"north": {"uv": [0, 0, 15, 14], "texture": "#0"},
            				"east": {"uv": [0, 0, 1, 14], "texture": "#0"},
            				"south": {"uv": [0, 0, 15, 14], "texture": "#0"},
            				"west": {"uv": [0, 0, 1, 14], "texture": "#0"},
            				"up": {"uv": [0, 0, 15, 1], "texture": "#0"},
            				"down": {"uv": [0, 0, 15, 1], "texture": "#0"}
            			}
            		},
            		{
            			"from": [12, 13, 14],
            			"to": [16, 14, 16],
            			"rotation": {"angle": 0, "axis": "y", "origin": [13, 12, 14]},
            			"faces": {
            				"north": {"uv": [4, 2, 8, 3], "texture": "#1"},
            				"east": {"uv": [4, 2, 6, 3], "texture": "#1"},
            				"south": {"uv": [4, 2, 8, 3], "texture": "#1"},
            				"west": {"uv": [4, 2, 6, 3], "texture": "#1"},
            				"up": {"uv": [4, 2, 8, 4], "texture": "#1"},
            				"down": {"uv": [4, 2, 8, 4], "texture": "#1"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [1, 2.25, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"thirdperson_lefthand": {
            			"translation": [1, 2.25, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_righthand": {
            			"translation": [1, 3, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_lefthand": {
            			"translation": [1, 3, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"ground": {
            			"translation": [0, 1.5, 0],
            			"scale": [0.33, 0.33, 0.33]
            		},
            		"gui": {
            			"rotation": [20, -45, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"fixed": {
            			"rotation": [180, 0, 180],
            			"translation": [0, 0, 1],
            			"scale": [0.5, 0.5, 0.5]
            		}
            	}
            }
            """;

    public static String FLIPDOWN_CABINET_LEFT_OPEN = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		"1": "LEG_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
            		{
            			"from": [0, 0, 0],
            			"to": [1, 16, 15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [0.5, 8, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"east": {"uv": [0, 0, 15, 16], "texture": "#1"},
            				"south": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"west": {"uv": [0, 0, 15, 16], "texture": "#1"},
            				"up": {"uv": [0, 0, 1, 15], "texture": "#1"},
            				"down": {"uv": [0, 0, 1, 15], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 0, 0],
            			"to": [16, 1, 15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 0.5, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 15, 15], "texture": "#1"},
            				"down": {"uv": [0, 0, 15, 15], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 7, 1],
            			"to": [16, 8, 15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 7.5, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 15, 14], "texture": "#1"},
            				"down": {"uv": [0, 0, 15, 14], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 1, 0],
            			"to": [16, 15, 2],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 1]},
            			"faces": {
            				"north": {"uv": [0, 0, 15, 14], "texture": "#1"},
            				"east": {"uv": [0, 0, 2, 14], "texture": "#1"},
            				"south": {"uv": [0, 0, 15, 14], "texture": "#1"},
            				"west": {"uv": [0, 0, 2, 14], "texture": "#1"},
            				"up": {"uv": [0, 0, 15, 2], "texture": "#1"},
            				"down": {"uv": [0, 0, 15, 2], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 15, 0],
            			"to": [16, 16, 15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 15.5, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 14, 15], "texture": "#1"},
            				"down": {"uv": [0, 0, 14, 15], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 1, 14],
            			"to": [16, 2, 28],
            			"rotation": {"angle": 0, "axis": "x", "origin": [8, 1.25, 23.75]},
            			"faces": {
            				"north": {"uv": [0, 0, 15, 1], "rotation": 180, "texture": "#0"},
            				"east": {"uv": [0, 0, 1, 14], "rotation": 270, "texture": "#0"},
            				"south": {"uv": [0, 0, 15, 1], "texture": "#0"},
            				"west": {"uv": [0, 0, 1, 14], "rotation": 90, "texture": "#0"},
            				"up": {"uv": [0, 0, 15, 14], "rotation": 180, "texture": "#0"},
            				"down": {"uv": [0, 0, 15, 14], "texture": "#0"}
            			}
            		},
            		{
            			"from": [12, 0.5, 26],
            			"to": [16, 1.5, 27],
            			"rotation": {"angle": 0, "axis": "x", "origin": [14, 1.25, 23.75]},
            			"faces": {
            				"north": {"uv": [4, 2, 8, 3], "rotation": 180, "texture": "#1"},
            				"east": {"uv": [4, 2, 6, 3], "rotation": 270, "texture": "#1"},
            				"south": {"uv": [4, 2, 8, 3], "texture": "#1"},
            				"west": {"uv": [4, 2, 6, 3], "rotation": 90, "texture": "#1"},
            				"up": {"uv": [4, 2, 8, 3], "rotation": 180, "texture": "#1"},
            				"down": {"uv": [4, 2, 8, 3], "texture": "#1"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [1, 2.25, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"thirdperson_lefthand": {
            			"translation": [1, 2.25, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_righthand": {
            			"translation": [1, 3, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_lefthand": {
            			"translation": [1, 3, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"ground": {
            			"translation": [0, 1.5, 0],
            			"scale": [0.33, 0.33, 0.33]
            		},
            		"gui": {
            			"rotation": [20, -45, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"fixed": {
            			"rotation": [180, 0, 180],
            			"translation": [0, 0, 1],
            			"scale": [0.5, 0.5, 0.5]
            		}
            	}
            }
            """;

    public static String CUPBOARD_RIGHT = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		"1": "LEG_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
            		{
            			"from": [0, 0, 0],
            			"to": [1, 16, 15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [0.5, 8, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"east": {"uv": [0, 0, 15, 16], "texture": "#1"},
            				"south": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"west": {"uv": [0, 0, 15, 16], "texture": "#1"},
            				"up": {"uv": [0, 0, 1, 15], "texture": "#1"},
            				"down": {"uv": [0, 0, 1, 15], "texture": "#1"}
            			}
            		},
            		{
            			"from": [15, 0, 0],
            			"to": [16, 16, 15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [15.5, 8, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"east": {"uv": [0, 0, 15, 16], "texture": "#1"},
            				"south": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"west": {"uv": [0, 0, 15, 16], "texture": "#1"},
            				"up": {"uv": [0, 0, 1, 15], "texture": "#1"},
            				"down": {"uv": [0, 0, 1, 15], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 0, 0],
            			"to": [15, 1, 15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 0.5, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 14, 15], "texture": "#1"},
            				"down": {"uv": [0, 0, 14, 15], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 7, 1],
            			"to": [15, 8, 15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 7.5, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 14, 14], "texture": "#1"},
            				"down": {"uv": [0, 0, 14, 14], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 1, 0],
            			"to": [15, 15, 2],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 1]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 14], "texture": "#1"},
            				"east": {"uv": [0, 0, 2, 14], "texture": "#1"},
            				"south": {"uv": [0, 0, 14, 14], "texture": "#1"},
            				"west": {"uv": [0, 0, 2, 14], "texture": "#1"},
            				"up": {"uv": [0, 0, 14, 2], "texture": "#1"},
            				"down": {"uv": [0, 0, 14, 2], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 15, 0],
            			"to": [15, 16, 15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 15.5, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 14, 15], "texture": "#1"},
            				"down": {"uv": [0, 0, 14, 15], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 1, 14.5],
            			"to": [15, 15, 15.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 15]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 14], "texture": "#0"},
            				"east": {"uv": [0, 0, 1, 14], "texture": "#0"},
            				"south": {"uv": [0, 0, 14, 14], "texture": "#0"},
            				"west": {"uv": [0, 0, 1, 14], "texture": "#0"},
            				"up": {"uv": [0, 0, 14, 1], "texture": "#0"},
            				"down": {"uv": [0, 0, 14, 1], "texture": "#0"}
            			}
            		},
            		{
            			"from": [1.5, 5.5, 15],
            			"to": [2.5, 9.5, 16],
            			"rotation": {"angle": 0, "axis": "y", "origin": [2, 7, 15.5]},
            			"faces": {
            				"north": {"uv": [5, 0, 6, 4], "texture": "#1"},
            				"east": {"uv": [5, 0, 6, 4], "texture": "#1"},
            				"south": {"uv": [5, 0, 6, 4], "texture": "#1"},
            				"west": {"uv": [5, 0, 6, 4], "texture": "#1"},
            				"up": {"uv": [5, 0, 6, 1], "texture": "#1"},
            				"down": {"uv": [5, 0, 6, 1], "texture": "#1"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [1, 2.25, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"thirdperson_lefthand": {
            			"translation": [1, 2.25, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_righthand": {
            			"translation": [1, 3, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_lefthand": {
            			"translation": [1, 3, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"ground": {
            			"translation": [0, 1.5, 0],
            			"scale": [0.33, 0.33, 0.33]
            		},
            		"gui": {
            			"rotation": [20, -45, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"fixed": {
            			"rotation": [180, 0, 180],
            			"translation": [0, 0, 1],
            			"scale": [0.5, 0.5, 0.5]
            		}
            	}
            }
            """;

    public static String CUPBOARD_LEFT = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		"1": "LEG_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
            		{
            			"from": [0, 0, 0],
            			"to": [1, 16, 15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [0.5, 8, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"east": {"uv": [0, 0, 15, 16], "texture": "#1"},
            				"south": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"west": {"uv": [0, 0, 15, 16], "texture": "#1"},
            				"up": {"uv": [0, 0, 1, 15], "texture": "#1"},
            				"down": {"uv": [0, 0, 1, 15], "texture": "#1"}
            			}
            		},
            		{
            			"from": [15, 0, 0],
            			"to": [16, 16, 15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [15.5, 8, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"east": {"uv": [0, 0, 15, 16], "texture": "#1"},
            				"south": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"west": {"uv": [0, 0, 15, 16], "texture": "#1"},
            				"up": {"uv": [0, 0, 1, 15], "texture": "#1"},
            				"down": {"uv": [0, 0, 1, 15], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 0, 0],
            			"to": [15, 1, 15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 0.5, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 14, 15], "texture": "#1"},
            				"down": {"uv": [0, 0, 14, 15], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 7, 1],
            			"to": [15, 8, 15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 7.5, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 14, 14], "texture": "#1"},
            				"down": {"uv": [0, 0, 14, 14], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 1, 0],
            			"to": [15, 15, 2],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 1]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 14], "texture": "#1"},
            				"east": {"uv": [0, 0, 2, 14], "texture": "#1"},
            				"south": {"uv": [0, 0, 14, 14], "texture": "#1"},
            				"west": {"uv": [0, 0, 2, 14], "texture": "#1"},
            				"up": {"uv": [0, 0, 14, 2], "texture": "#1"},
            				"down": {"uv": [0, 0, 14, 2], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 15, 0],
            			"to": [15, 16, 15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 15.5, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 14, 15], "texture": "#1"},
            				"down": {"uv": [0, 0, 14, 15], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 1, 14.5],
            			"to": [15, 15, 15.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 15]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 14], "texture": "#0"},
            				"east": {"uv": [0, 0, 1, 14], "texture": "#0"},
            				"south": {"uv": [0, 0, 14, 14], "texture": "#0"},
            				"west": {"uv": [0, 0, 1, 14], "texture": "#0"},
            				"up": {"uv": [0, 0, 14, 1], "texture": "#0"},
            				"down": {"uv": [0, 0, 14, 1], "texture": "#0"}
            			}
            		},
            		{
            			"from": [13.5, 5.5, 15],
            			"to": [14.5, 9.5, 16],
            			"rotation": {"angle": 0, "axis": "y", "origin": [14, 7, 15.5]},
            			"faces": {
            				"north": {"uv": [6, 0, 5, 4], "texture": "#1"},
            				"east": {"uv": [6, 0, 5, 4], "texture": "#1"},
            				"south": {"uv": [6, 0, 5, 4], "texture": "#1"},
            				"west": {"uv": [6, 0, 5, 4], "texture": "#1"},
            				"up": {"uv": [6, 0, 5, 1], "texture": "#1"},
            				"down": {"uv": [6, 0, 5, 1], "texture": "#1"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [1, 2.25, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"thirdperson_lefthand": {
            			"translation": [1, 2.25, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_righthand": {
            			"translation": [1, 3, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_lefthand": {
            			"translation": [1, 3, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"ground": {
            			"translation": [0, 1.5, 0],
            			"scale": [0.33, 0.33, 0.33]
            		},
            		"gui": {
            			"rotation": [20, -45, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"fixed": {
            			"rotation": [180, 0, 180],
            			"translation": [0, 0, 1],
            			"scale": [0.5, 0.5, 0.5]
            		}
            	}
            }
            """;

    public static String CUPBOARD_CENTER = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		"1": "LEG_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
            		{
            			"from": [0, 0, 0],
            			"to": [1, 16, 15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [0.5, 8, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"east": {"uv": [0, 0, 15, 16], "texture": "#1"},
            				"south": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"west": {"uv": [0, 0, 15, 16], "texture": "#1"},
            				"up": {"uv": [0, 0, 1, 15], "texture": "#1"},
            				"down": {"uv": [0, 0, 1, 15], "texture": "#1"}
            			}
            		},
            		{
            			"from": [15, 0, 0],
            			"to": [16, 16, 15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [15.5, 8, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"east": {"uv": [0, 0, 15, 16], "texture": "#1"},
            				"south": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"west": {"uv": [0, 0, 15, 16], "texture": "#1"},
            				"up": {"uv": [0, 0, 1, 15], "texture": "#1"},
            				"down": {"uv": [0, 0, 1, 15], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 7, 1],
            			"to": [15, 8, 15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 7.5, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 14, 14], "texture": "#1"},
            				"down": {"uv": [0, 0, 14, 14], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 0, 0],
            			"to": [15, 15, 2],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 1]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 15], "texture": "#1"},
            				"east": {"uv": [0, 0, 2, 15], "texture": "#1"},
            				"south": {"uv": [0, 0, 14, 15], "texture": "#1"},
            				"west": {"uv": [0, 0, 2, 15], "texture": "#1"},
            				"up": {"uv": [0, 0, 14, 2], "texture": "#1"},
            				"down": {"uv": [0, 0, 14, 2], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 14.99, 0],
            			"to": [15, 15.99, 15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 15.5, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 14, 15], "texture": "#1"},
            				"down": {"uv": [0, 0, 14, 15], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 0, 14.5],
            			"to": [15, 16, 15.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 15]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 16], "texture": "#0"},
            				"east": {"uv": [0, 0, 1, 16], "texture": "#0"},
            				"south": {"uv": [0, 0, 14, 16], "texture": "#0"},
            				"west": {"uv": [0, 0, 1, 16], "texture": "#0"},
            				"up": {"uv": [0, 0, 14, 1], "texture": "#0"},
            				"down": {"uv": [0, 0, 14, 1], "texture": "#0"}
            			}
            		},
            		{
            			"from": [1.5, 0, 15],
            			"to": [2.5, 16, 16],
            			"rotation": {"angle": 0, "axis": "y", "origin": [2, 7, 15.5]},
            			"faces": {
            				"north": {"uv": [5, 0, 6, 16], "texture": "#1"},
            				"east": {"uv": [5, 0, 6, 16], "texture": "#1"},
            				"south": {"uv": [5, 0, 6, 16], "texture": "#1"},
            				"west": {"uv": [5, 0, 6, 16], "texture": "#1"},
            				"up": {"uv": [5, 0, 6, 1], "texture": "#1"},
            				"down": {"uv": [5, 0, 6, 1], "texture": "#1"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [1, 2.25, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"thirdperson_lefthand": {
            			"translation": [1, 2.25, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_righthand": {
            			"translation": [1, 3, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_lefthand": {
            			"translation": [1, 3, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"ground": {
            			"translation": [0, 1.5, 0],
            			"scale": [0.33, 0.33, 0.33]
            		},
            		"gui": {
            			"rotation": [20, -45, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"fixed": {
            			"rotation": [180, 0, 180],
            			"translation": [0, 0, 1],
            			"scale": [0.5, 0.5, 0.5]
            		}
            	}
            }
            """;

    public static String CUPBOARD_UP = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		"1": "LEG_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
            		{
            			"from": [0, 0, 0],
            			"to": [1, 16, 15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [0.5, 8, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"east": {"uv": [0, 0, 15, 16], "texture": "#1"},
            				"south": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"west": {"uv": [0, 0, 15, 16], "texture": "#1"},
            				"up": {"uv": [0, 0, 1, 15], "texture": "#1"},
            				"down": {"uv": [0, 0, 1, 15], "texture": "#1"}
            			}
            		},
            		{
            			"from": [15, 0, 0],
            			"to": [16, 16, 15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [15.5, 8, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"east": {"uv": [0, 0, 15, 16], "texture": "#1"},
            				"south": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"west": {"uv": [0, 0, 15, 16], "texture": "#1"},
            				"up": {"uv": [0, 0, 1, 15], "texture": "#1"},
            				"down": {"uv": [0, 0, 1, 15], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 7, 1],
            			"to": [15, 8, 15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 7.5, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 14, 14], "texture": "#1"},
            				"down": {"uv": [0, 0, 14, 14], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 0, 0],
            			"to": [15, 15, 2],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 1]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 15], "texture": "#1"},
            				"east": {"uv": [0, 0, 2, 15], "texture": "#1"},
            				"south": {"uv": [0, 0, 14, 15], "texture": "#1"},
            				"west": {"uv": [0, 0, 2, 15], "texture": "#1"},
            				"up": {"uv": [0, 0, 14, 2], "texture": "#1"},
            				"down": {"uv": [0, 0, 14, 2], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 15, 0],
            			"to": [15, 16, 15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 15.5, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 14, 15], "texture": "#1"},
            				"down": {"uv": [0, 0, 14, 15], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 0, 14.5],
            			"to": [15, 15, 15.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 15]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 15], "texture": "#0"},
            				"east": {"uv": [0, 0, 1, 15], "texture": "#0"},
            				"south": {"uv": [0, 0, 14, 15], "texture": "#0"},
            				"west": {"uv": [0, 0, 1, 15], "texture": "#0"},
            				"up": {"uv": [0, 0, 14, 1], "texture": "#0"},
            				"down": {"uv": [0, 0, 14, 1], "texture": "#0"}
            			}
            		},
            		{
            			"from": [1.5, 0, 15],
            			"to": [2.5, 4, 16],
            			"rotation": {"angle": 0, "axis": "y", "origin": [2, 1.5, 15.5]},
            			"faces": {
            				"north": {"uv": [5, 0, 6, 4], "texture": "#1"},
            				"east": {"uv": [5, 0, 6, 4], "texture": "#1"},
            				"south": {"uv": [5, 0, 6, 4], "texture": "#1"},
            				"west": {"uv": [5, 0, 6, 4], "texture": "#1"},
            				"up": {"uv": [5, 0, 6, 1], "texture": "#1"},
            				"down": {"uv": [5, 0, 6, 1], "texture": "#1"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [1, 2.25, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"thirdperson_lefthand": {
            			"translation": [1, 2.25, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_righthand": {
            			"translation": [1, 3, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_lefthand": {
            			"translation": [1, 3, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"ground": {
            			"translation": [0, 1.5, 0],
            			"scale": [0.33, 0.33, 0.33]
            		},
            		"gui": {
            			"rotation": [20, -45, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"fixed": {
            			"rotation": [180, 0, 180],
            			"translation": [0, 0, 1],
            			"scale": [0.5, 0.5, 0.5]
            		}
            	}
            }
            """;

    public static String CUPBOARD_DOWN = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		"1": "LEG_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
            		{
            			"from": [0, 0, 0],
            			"to": [1, 16, 15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [0.5, 8, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"east": {"uv": [0, 0, 15, 16], "texture": "#1"},
            				"south": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"west": {"uv": [0, 0, 15, 16], "texture": "#1"},
            				"up": {"uv": [0, 0, 1, 15], "texture": "#1"},
            				"down": {"uv": [0, 0, 1, 15], "texture": "#1"}
            			}
            		},
            		{
            			"from": [15, 0, 0],
            			"to": [16, 16, 15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [15.5, 8, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"east": {"uv": [0, 0, 15, 16], "texture": "#1"},
            				"south": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"west": {"uv": [0, 0, 15, 16], "texture": "#1"},
            				"up": {"uv": [0, 0, 1, 15], "texture": "#1"},
            				"down": {"uv": [0, 0, 1, 15], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 0, 0],
            			"to": [15, 1, 15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 0.5, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 14, 15], "texture": "#1"},
            				"down": {"uv": [0, 0, 14, 15], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 7, 1],
            			"to": [15, 8, 15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 7.5, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 14, 14], "texture": "#1"},
            				"down": {"uv": [0, 0, 14, 14], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 1, 0],
            			"to": [15, 15, 2],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 1]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 14], "texture": "#1"},
            				"east": {"uv": [0, 0, 2, 14], "texture": "#1"},
            				"south": {"uv": [0, 0, 14, 14], "texture": "#1"},
            				"west": {"uv": [0, 0, 2, 14], "texture": "#1"},
            				"up": {"uv": [0, 0, 14, 2], "texture": "#1"},
            				"down": {"uv": [0, 0, 14, 2], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 14.99, 0],
            			"to": [15, 15.99, 15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 15.5, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 14, 15], "texture": "#1"},
            				"down": {"uv": [0, 0, 14, 15], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 1, 14.5],
            			"to": [15, 16, 15.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 15]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 15], "texture": "#0"},
            				"east": {"uv": [0, 0, 1, 15], "texture": "#0"},
            				"south": {"uv": [0, 0, 14, 15], "texture": "#0"},
            				"west": {"uv": [0, 0, 1, 15], "texture": "#0"},
            				"up": {"uv": [0, 0, 14, 1], "texture": "#0"},
            				"down": {"uv": [0, 0, 14, 1], "texture": "#0"}
            			}
            		},
            		{
            			"from": [1.5, 12, 15],
            			"to": [2.5, 16, 16],
            			"rotation": {"angle": 0, "axis": "y", "origin": [2, 13.5, 15.5]},
            			"faces": {
            				"north": {"uv": [5, 0, 6, 4], "texture": "#1"},
            				"east": {"uv": [5, 0, 6, 4], "texture": "#1"},
            				"south": {"uv": [5, 0, 6, 4], "texture": "#1"},
            				"west": {"uv": [5, 0, 6, 4], "texture": "#1"},
            				"up": {"uv": [5, 0, 6, 1], "texture": "#1"},
            				"down": {"uv": [5, 0, 6, 1], "texture": "#1"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [1, 2.25, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"thirdperson_lefthand": {
            			"translation": [1, 2.25, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_righthand": {
            			"translation": [1, 3, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_lefthand": {
            			"translation": [1, 3, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"ground": {
            			"translation": [0, 1.5, 0],
            			"scale": [0.33, 0.33, 0.33]
            		},
            		"gui": {
            			"rotation": [20, -45, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"fixed": {
            			"rotation": [180, 0, 180],
            			"translation": [0, 0, 1],
            			"scale": [0.5, 0.5, 0.5]
            		}
            	}
            }
            """;

    public static String CUPBOARD_RIGHT_OPEN = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		"1": "LEG_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
            		{
            			"from": [0, 0, 0],
            			"to": [1, 16, 15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [0.5, 8, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"east": {"uv": [0, 0, 15, 16], "texture": "#1"},
            				"south": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"west": {"uv": [0, 0, 15, 16], "texture": "#1"},
            				"up": {"uv": [0, 0, 1, 15], "texture": "#1"},
            				"down": {"uv": [0, 0, 1, 15], "texture": "#1"}
            			}
            		},
            		{
            			"from": [15, 0, 0],
            			"to": [16, 16, 15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [15.5, 8, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"east": {"uv": [0, 0, 15, 16], "texture": "#1"},
            				"south": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"west": {"uv": [0, 0, 15, 16], "texture": "#1"},
            				"up": {"uv": [0, 0, 1, 15], "texture": "#1"},
            				"down": {"uv": [0, 0, 1, 15], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 0, 0],
            			"to": [15, 1, 15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 0.5, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 14, 15], "texture": "#1"},
            				"down": {"uv": [0, 0, 14, 15], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 7, 1],
            			"to": [15, 8, 15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 7.5, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 14, 14], "texture": "#1"},
            				"down": {"uv": [0, 0, 14, 14], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 1, 0],
            			"to": [15, 15, 2],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 1]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 14], "texture": "#1"},
            				"east": {"uv": [0, 0, 2, 14], "texture": "#1"},
            				"south": {"uv": [0, 0, 14, 14], "texture": "#1"},
            				"west": {"uv": [0, 0, 2, 14], "texture": "#1"},
            				"up": {"uv": [0, 0, 14, 2], "texture": "#1"},
            				"down": {"uv": [0, 0, 14, 2], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 15, 0],
            			"to": [15, 16, 15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 15.5, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 14, 15], "texture": "#1"},
            				"down": {"uv": [0, 0, 14, 15], "texture": "#1"}
            			}
            		},
            		{
            			"from": [14.25, 1, 14.25],
            			"to": [15.25, 15, 28.25],
            			"rotation": {"angle": 0, "axis": "y", "origin": [15, 8.75, 24.25]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 14], "texture": "#0"},
            				"east": {"uv": [0, 0, 14, 14], "texture": "#0"},
            				"south": {"uv": [0, 0, 1, 14], "texture": "#0"},
            				"west": {"uv": [0, 0, 14, 14], "texture": "#0"},
            				"up": {"uv": [0, 0, 14, 1], "rotation": 270, "texture": "#0"},
            				"down": {"uv": [0, 0, 14, 1], "rotation": 90, "texture": "#0"}
            			}
            		},
            		{
            			"from": [14.75, 5.5, 26.75],
            			"to": [15.75, 9.5, 27.75],
            			"rotation": {"angle": 0, "axis": "y", "origin": [15, 6.75, 24.25]},
            			"faces": {
            				"north": {"uv": [5, 0, 6, 4], "texture": "#1"},
            				"east": {"uv": [5, 0, 6, 4], "texture": "#1"},
            				"south": {"uv": [5, 0, 6, 4], "texture": "#1"},
            				"west": {"uv": [5, 0, 6, 4], "texture": "#1"},
            				"up": {"uv": [5, 0, 6, 1], "rotation": 270, "texture": "#1"},
            				"down": {"uv": [5, 0, 6, 1], "rotation": 90, "texture": "#1"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [1, 2.25, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"thirdperson_lefthand": {
            			"translation": [1, 2.25, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_righthand": {
            			"translation": [1, 3, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_lefthand": {
            			"translation": [1, 3, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"ground": {
            			"translation": [0, 1.5, 0],
            			"scale": [0.33, 0.33, 0.33]
            		},
            		"gui": {
            			"rotation": [20, -45, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"fixed": {
            			"rotation": [180, 0, 180],
            			"translation": [0, 0, 1],
            			"scale": [0.5, 0.5, 0.5]
            		}
            	}
            }
            """;

    public static String CUPBOARD_LEFT_OPEN = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		"1": "LEG_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
               		{
               			"from": [0, 0, 0],
               			"to": [1, 16, 15],
               			"rotation": {"angle": 0, "axis": "y", "origin": [0.5, 8, 7.5]},
               			"faces": {
               				"north": {"uv": [0, 0, 1, 16], "texture": "#1"},
               				"east": {"uv": [0, 0, 15, 16], "texture": "#1"},
               				"south": {"uv": [0, 0, 1, 16], "texture": "#1"},
               				"west": {"uv": [0, 0, 15, 16], "texture": "#1"},
               				"up": {"uv": [0, 0, 1, 15], "texture": "#1"},
               				"down": {"uv": [0, 0, 1, 15], "texture": "#1"}
               			}
               		},
               		{
               			"from": [15, 0, 0],
               			"to": [16, 16, 15],
               			"rotation": {"angle": 0, "axis": "y", "origin": [15.5, 8, 7.5]},
               			"faces": {
               				"north": {"uv": [0, 0, 1, 16], "texture": "#1"},
               				"east": {"uv": [0, 0, 15, 16], "texture": "#1"},
               				"south": {"uv": [0, 0, 1, 16], "texture": "#1"},
               				"west": {"uv": [0, 0, 15, 16], "texture": "#1"},
               				"up": {"uv": [0, 0, 1, 15], "texture": "#1"},
               				"down": {"uv": [0, 0, 1, 15], "texture": "#1"}
               			}
               		},
               		{
               			"from": [1, 0, 0],
               			"to": [15, 1, 15],
               			"rotation": {"angle": 0, "axis": "y", "origin": [8, 0.5, 7.5]},
               			"faces": {
               				"north": {"uv": [0, 0, 14, 1], "texture": "#1"},
               				"east": {"uv": [0, 0, 15, 1], "texture": "#1"},
               				"south": {"uv": [0, 0, 14, 1], "texture": "#1"},
               				"west": {"uv": [0, 0, 15, 1], "texture": "#1"},
               				"up": {"uv": [0, 0, 14, 15], "texture": "#1"},
               				"down": {"uv": [0, 0, 14, 15], "texture": "#1"}
               			}
               		},
               		{
               			"from": [1, 7, 1],
               			"to": [15, 8, 15],
               			"rotation": {"angle": 0, "axis": "y", "origin": [8, 7.5, 7.5]},
               			"faces": {
               				"north": {"uv": [0, 0, 14, 1], "texture": "#1"},
               				"east": {"uv": [0, 0, 15, 1], "texture": "#1"},
               				"south": {"uv": [0, 0, 14, 1], "texture": "#1"},
               				"west": {"uv": [0, 0, 15, 1], "texture": "#1"},
               				"up": {"uv": [0, 0, 14, 14], "texture": "#1"},
               				"down": {"uv": [0, 0, 14, 14], "texture": "#1"}
               			}
               		},
               		{
               			"from": [1, 1, 0],
               			"to": [15, 15, 2],
               			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 1]},
               			"faces": {
               				"north": {"uv": [0, 0, 14, 14], "texture": "#1"},
               				"east": {"uv": [0, 0, 2, 14], "texture": "#1"},
               				"south": {"uv": [0, 0, 14, 14], "texture": "#1"},
               				"west": {"uv": [0, 0, 2, 14], "texture": "#1"},
               				"up": {"uv": [0, 0, 14, 2], "texture": "#1"},
               				"down": {"uv": [0, 0, 14, 2], "texture": "#1"}
               			}
               		},
               		{
               			"from": [1, 15, 0],
               			"to": [15, 16, 15],
               			"rotation": {"angle": 0, "axis": "y", "origin": [8, 15.5, 7.5]},
               			"faces": {
               				"north": {"uv": [0, 0, 14, 1], "texture": "#1"},
               				"east": {"uv": [0, 0, 15, 1], "texture": "#1"},
               				"south": {"uv": [0, 0, 14, 1], "texture": "#1"},
               				"west": {"uv": [0, 0, 15, 1], "texture": "#1"},
               				"up": {"uv": [0, 0, 14, 15], "texture": "#1"},
               				"down": {"uv": [0, 0, 14, 15], "texture": "#1"}
               			}
               		},
               		{
               			"from": [0.75, 1, 14.25],
               			"to": [1.75, 15, 28.25],
               			"rotation": {"angle": 0, "axis": "y", "origin": [1, 8.75, 24.25]},
               			"faces": {
               				"north": {"uv": [0, 0, 1, 14], "texture": "#0"},
               				"east": {"uv": [0, 0, 14, 14], "texture": "#0"},
               				"south": {"uv": [0, 0, 1, 14], "texture": "#0"},
               				"west": {"uv": [0, 0, 14, 14], "texture": "#0"},
               				"up": {"uv": [0, 0, 14, 1], "rotation": 90, "texture": "#0"},
               				"down": {"uv": [0, 0, 14, 1], "rotation": 270, "texture": "#0"}
               			}
               		},
               		{
               			"from": [0.25, 5.5, 26.75],
               			"to": [1.25, 9.5, 27.75],
               			"rotation": {"angle": 0, "axis": "y", "origin": [1, 6.75, 24.25]},
               			"faces": {
               				"north": {"uv": [6, 0, 5, 4], "texture": "#1"},
               				"east": {"uv": [6, 0, 5, 4], "texture": "#1"},
               				"south": {"uv": [6, 0, 5, 4], "texture": "#1"},
               				"west": {"uv": [6, 0, 5, 4], "texture": "#1"},
               				"up": {"uv": [6, 0, 5, 1], "rotation": 90, "texture": "#1"},
               				"down": {"uv": [6, 0, 5, 1], "rotation": 270, "texture": "#1"}
               			}
               		}
               	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [1, 2.25, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"thirdperson_lefthand": {
            			"translation": [1, 2.25, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_righthand": {
            			"translation": [1, 3, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_lefthand": {
            			"translation": [1, 3, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"ground": {
            			"translation": [0, 1.5, 0],
            			"scale": [0.33, 0.33, 0.33]
            		},
            		"gui": {
            			"rotation": [20, -45, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"fixed": {
            			"rotation": [180, 0, 180],
            			"translation": [0, 0, 1],
            			"scale": [0.5, 0.5, 0.5]
            		}
            	}
            }
            """;

    public static String CUPBOARD_CENTER_OPEN = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		"1": "LEG_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
            		{
            			"from": [0, 0, 0],
            			"to": [1, 16, 15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [0.5, 8, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"east": {"uv": [0, 0, 15, 16], "texture": "#1"},
            				"south": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"west": {"uv": [0, 0, 15, 16], "texture": "#1"},
            				"up": {"uv": [0, 0, 1, 15], "texture": "#1"},
            				"down": {"uv": [0, 0, 1, 15], "texture": "#1"}
            			}
            		},
            		{
            			"from": [15, 0, 0],
            			"to": [16, 16, 15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [15.5, 8, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"east": {"uv": [0, 0, 15, 16], "texture": "#1"},
            				"south": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"west": {"uv": [0, 0, 15, 16], "texture": "#1"},
            				"up": {"uv": [0, 0, 1, 15], "texture": "#1"},
            				"down": {"uv": [0, 0, 1, 15], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 7, 1],
            			"to": [15, 8, 15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 7.5, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 14, 14], "texture": "#1"},
            				"down": {"uv": [0, 0, 14, 14], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 0, 0],
            			"to": [15, 15, 2],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 1]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 15], "texture": "#1"},
            				"east": {"uv": [0, 0, 2, 15], "texture": "#1"},
            				"south": {"uv": [0, 0, 14, 15], "texture": "#1"},
            				"west": {"uv": [0, 0, 2, 15], "texture": "#1"},
            				"up": {"uv": [0, 0, 14, 2], "texture": "#1"},
            				"down": {"uv": [0, 0, 14, 2], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 14.99, 0],
            			"to": [15, 15.99, 15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 15.5, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 14, 15], "texture": "#1"},
            				"down": {"uv": [0, 0, 14, 15], "texture": "#1"}
            			}
            		},
            		{
            			"from": [14.25, 0, 14.25],
            			"to": [15.25, 16, 28.25],
            			"rotation": {"angle": 0, "axis": "y", "origin": [15, 8.75, 24.25]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 16], "texture": "#0"},
            				"east": {"uv": [0, 0, 14, 16], "texture": "#0"},
            				"south": {"uv": [0, 0, 1, 16], "texture": "#0"},
            				"west": {"uv": [0, 0, 14, 16], "texture": "#0"},
            				"up": {"uv": [0, 0, 14, 1], "rotation": 270, "texture": "#0"},
            				"down": {"uv": [0, 0, 14, 1], "rotation": 90, "texture": "#0"}
            			}
            		},
            		{
            			"from": [14.75, 0, 26.75],
            			"to": [15.75, 16, 27.75],
            			"rotation": {"angle": 0, "axis": "y", "origin": [15, 6.75, 24.25]},
            			"faces": {
            				"north": {"uv": [5, 0, 6, 16], "texture": "#1"},
            				"east": {"uv": [5, 0, 6, 16], "texture": "#1"},
            				"south": {"uv": [5, 0, 6, 16], "texture": "#1"},
            				"west": {"uv": [5, 0, 6, 16], "texture": "#1"},
            				"up": {"uv": [5, 0, 6, 1], "rotation": 270, "texture": "#1"},
            				"down": {"uv": [5, 0, 6, 1], "rotation": 90, "texture": "#1"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [1, 2.25, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"thirdperson_lefthand": {
            			"translation": [1, 2.25, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_righthand": {
            			"translation": [1, 3, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_lefthand": {
            			"translation": [1, 3, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"ground": {
            			"translation": [0, 1.5, 0],
            			"scale": [0.33, 0.33, 0.33]
            		},
            		"gui": {
            			"rotation": [20, -45, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"fixed": {
            			"rotation": [180, 0, 180],
            			"translation": [0, 0, 1],
            			"scale": [0.5, 0.5, 0.5]
            		}
            	}
            }
            """;

    public static String CUPBOARD_UP_OPEN = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		"1": "LEG_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
            		{
            			"from": [0, 0, 0],
            			"to": [1, 16, 15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [0.5, 8, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"east": {"uv": [0, 0, 15, 16], "texture": "#1"},
            				"south": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"west": {"uv": [0, 0, 15, 16], "texture": "#1"},
            				"up": {"uv": [0, 0, 1, 15], "texture": "#1"},
            				"down": {"uv": [0, 0, 1, 15], "texture": "#1"}
            			}
            		},
            		{
            			"from": [15, 0, 0],
            			"to": [16, 16, 15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [15.5, 8, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"east": {"uv": [0, 0, 15, 16], "texture": "#1"},
            				"south": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"west": {"uv": [0, 0, 15, 16], "texture": "#1"},
            				"up": {"uv": [0, 0, 1, 15], "texture": "#1"},
            				"down": {"uv": [0, 0, 1, 15], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 7, 1],
            			"to": [15, 8, 15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 7.5, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 14, 14], "texture": "#1"},
            				"down": {"uv": [0, 0, 14, 14], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 0, 0],
            			"to": [15, 15, 2],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 1]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 15], "texture": "#1"},
            				"east": {"uv": [0, 0, 2, 15], "texture": "#1"},
            				"south": {"uv": [0, 0, 14, 15], "texture": "#1"},
            				"west": {"uv": [0, 0, 2, 15], "texture": "#1"},
            				"up": {"uv": [0, 0, 14, 2], "texture": "#1"},
            				"down": {"uv": [0, 0, 14, 2], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 15, 0],
            			"to": [15, 16, 15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 15.5, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 14, 15], "texture": "#1"},
            				"down": {"uv": [0, 0, 14, 15], "texture": "#1"}
            			}
            		},
            		{
            			"from": [14.25, 0, 14.25],
            			"to": [15.25, 15, 28.25],
            			"rotation": {"angle": 0, "axis": "y", "origin": [15, 8.75, 24.25]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 15], "texture": "#0"},
            				"east": {"uv": [0, 0, 14, 15], "texture": "#0"},
            				"south": {"uv": [0, 0, 1, 15], "texture": "#0"},
            				"west": {"uv": [0, 0, 14, 15], "texture": "#0"},
            				"up": {"uv": [0, 0, 14, 1], "rotation": 270, "texture": "#0"},
            				"down": {"uv": [0, 0, 14, 1], "rotation": 90, "texture": "#0"}
            			}
            		},
            		{
            			"from": [14.75, 0, 26.75],
            			"to": [15.75, 4, 27.75],
            			"rotation": {"angle": 0, "axis": "y", "origin": [15, 1.25, 24.25]},
            			"faces": {
            				"north": {"uv": [5, 0, 6, 4], "texture": "#1"},
            				"east": {"uv": [5, 0, 6, 4], "texture": "#1"},
            				"south": {"uv": [5, 0, 6, 4], "texture": "#1"},
            				"west": {"uv": [5, 0, 6, 4], "texture": "#1"},
            				"up": {"uv": [5, 0, 6, 1], "rotation": 270, "texture": "#1"},
            				"down": {"uv": [5, 0, 6, 1], "rotation": 90, "texture": "#1"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [1, 2.25, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"thirdperson_lefthand": {
            			"translation": [1, 2.25, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_righthand": {
            			"translation": [1, 3, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_lefthand": {
            			"translation": [1, 3, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"ground": {
            			"translation": [0, 1.5, 0],
            			"scale": [0.33, 0.33, 0.33]
            		},
            		"gui": {
            			"rotation": [20, -45, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"fixed": {
            			"rotation": [180, 0, 180],
            			"translation": [0, 0, 1],
            			"scale": [0.5, 0.5, 0.5]
            		}
            	}
            }
            """;

    public static String CUPBOARD_DOWN_OPEN = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		"1": "LEG_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
             		{
             			"from": [0, 0, 0],
             			"to": [1, 16, 15],
             			"rotation": {"angle": 0, "axis": "y", "origin": [0.5, 8, 7.5]},
             			"faces": {
             				"north": {"uv": [0, 0, 1, 16], "texture": "#1"},
             				"east": {"uv": [0, 0, 15, 16], "texture": "#1"},
             				"south": {"uv": [0, 0, 1, 16], "texture": "#1"},
             				"west": {"uv": [0, 0, 15, 16], "texture": "#1"},
             				"up": {"uv": [0, 0, 1, 15], "texture": "#1"},
             				"down": {"uv": [0, 0, 1, 15], "texture": "#1"}
             			}
             		},
             		{
             			"from": [15, 0, 0],
             			"to": [16, 16, 15],
             			"rotation": {"angle": 0, "axis": "y", "origin": [15.5, 8, 7.5]},
             			"faces": {
             				"north": {"uv": [0, 0, 1, 16], "texture": "#1"},
             				"east": {"uv": [0, 0, 15, 16], "texture": "#1"},
             				"south": {"uv": [0, 0, 1, 16], "texture": "#1"},
             				"west": {"uv": [0, 0, 15, 16], "texture": "#1"},
             				"up": {"uv": [0, 0, 1, 15], "texture": "#1"},
             				"down": {"uv": [0, 0, 1, 15], "texture": "#1"}
             			}
             		},
             		{
             			"from": [1, 0, 0],
             			"to": [15, 1, 15],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 0.5, 7.5]},
             			"faces": {
             				"north": {"uv": [0, 0, 14, 1], "texture": "#1"},
             				"east": {"uv": [0, 0, 15, 1], "texture": "#1"},
             				"south": {"uv": [0, 0, 14, 1], "texture": "#1"},
             				"west": {"uv": [0, 0, 15, 1], "texture": "#1"},
             				"up": {"uv": [0, 0, 14, 15], "texture": "#1"},
             				"down": {"uv": [0, 0, 14, 15], "texture": "#1"}
             			}
             		},
             		{
             			"from": [1, 7, 1],
             			"to": [15, 8, 15],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 7.5, 7.5]},
             			"faces": {
             				"north": {"uv": [0, 0, 14, 1], "texture": "#1"},
             				"east": {"uv": [0, 0, 15, 1], "texture": "#1"},
             				"south": {"uv": [0, 0, 14, 1], "texture": "#1"},
             				"west": {"uv": [0, 0, 15, 1], "texture": "#1"},
             				"up": {"uv": [0, 0, 14, 14], "texture": "#1"},
             				"down": {"uv": [0, 0, 14, 14], "texture": "#1"}
             			}
             		},
             		{
             			"from": [1, 1, 0],
             			"to": [15, 15, 2],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 1]},
             			"faces": {
             				"north": {"uv": [0, 0, 14, 14], "texture": "#1"},
             				"east": {"uv": [0, 0, 2, 14], "texture": "#1"},
             				"south": {"uv": [0, 0, 14, 14], "texture": "#1"},
             				"west": {"uv": [0, 0, 2, 14], "texture": "#1"},
             				"up": {"uv": [0, 0, 14, 2], "texture": "#1"},
             				"down": {"uv": [0, 0, 14, 2], "texture": "#1"}
             			}
             		},
             		{
             			"from": [1, 14.99, 0],
             			"to": [15, 15.99, 15],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 15.5, 7.5]},
             			"faces": {
             				"north": {"uv": [0, 0, 14, 1], "texture": "#1"},
             				"east": {"uv": [0, 0, 15, 1], "texture": "#1"},
             				"south": {"uv": [0, 0, 14, 1], "texture": "#1"},
             				"west": {"uv": [0, 0, 15, 1], "texture": "#1"},
             				"up": {"uv": [0, 0, 14, 15], "texture": "#1"},
             				"down": {"uv": [0, 0, 14, 15], "texture": "#1"}
             			}
             		},
             		{
             			"from": [14.25, 1, 14.25],
             			"to": [15.25, 16, 28.25],
             			"rotation": {"angle": 0, "axis": "y", "origin": [15, 8.75, 24.25]},
             			"faces": {
             				"north": {"uv": [0, 0, 1, 15], "texture": "#0"},
             				"east": {"uv": [0, 0, 14, 15], "texture": "#0"},
             				"south": {"uv": [0, 0, 1, 15], "texture": "#0"},
             				"west": {"uv": [0, 0, 14, 15], "texture": "#0"},
             				"up": {"uv": [0, 0, 14, 1], "rotation": 270, "texture": "#0"},
             				"down": {"uv": [0, 0, 14, 1], "rotation": 90, "texture": "#0"}
             			}
             		},
             		{
             			"from": [14.75, 12, 26.75],
             			"to": [15.75, 16, 27.75],
             			"rotation": {"angle": 0, "axis": "y", "origin": [15, 13.25, 24.25]},
             			"faces": {
             				"north": {"uv": [5, 0, 6, 4], "texture": "#1"},
             				"east": {"uv": [5, 0, 6, 4], "texture": "#1"},
             				"south": {"uv": [5, 0, 6, 4], "texture": "#1"},
             				"west": {"uv": [5, 0, 6, 4], "texture": "#1"},
             				"up": {"uv": [5, 0, 6, 1], "rotation": 270, "texture": "#1"},
             				"down": {"uv": [5, 0, 6, 1], "rotation": 90, "texture": "#1"}
             			}
             		}
             	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [1, 2.25, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"thirdperson_lefthand": {
            			"translation": [1, 2.25, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_righthand": {
            			"translation": [1, 3, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_lefthand": {
            			"translation": [1, 3, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"ground": {
            			"translation": [0, 1.5, 0],
            			"scale": [0.33, 0.33, 0.33]
            		},
            		"gui": {
            			"rotation": [20, -45, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"fixed": {
            			"rotation": [180, 0, 180],
            			"translation": [0, 0, 1],
            			"scale": [0.5, 0.5, 0.5]
            		}
            	}
            }
            """;

    public static String CUPBOARD_CENTER_FLIPPED = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		"1": "LEG_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
            		{
            			"from": [0, 0, 0],
            			"to": [1, 16, 15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [0.5, 8, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"east": {"uv": [0, 0, 15, 16], "texture": "#1"},
            				"south": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"west": {"uv": [0, 0, 15, 16], "texture": "#1"},
            				"up": {"uv": [0, 0, 1, 15], "texture": "#1"},
            				"down": {"uv": [0, 0, 1, 15], "texture": "#1"}
            			}
            		},
            		{
            			"from": [15, 0, 0],
            			"to": [16, 16, 15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [15.5, 8, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"east": {"uv": [0, 0, 15, 16], "texture": "#1"},
            				"south": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"west": {"uv": [0, 0, 15, 16], "texture": "#1"},
            				"up": {"uv": [0, 0, 1, 15], "texture": "#1"},
            				"down": {"uv": [0, 0, 1, 15], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 7, 1],
            			"to": [15, 8, 15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 7.5, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 14, 14], "texture": "#1"},
            				"down": {"uv": [0, 0, 14, 14], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 0, 0],
            			"to": [15, 15, 2],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 1]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 15], "texture": "#1"},
            				"east": {"uv": [0, 0, 2, 15], "texture": "#1"},
            				"south": {"uv": [0, 0, 14, 15], "texture": "#1"},
            				"west": {"uv": [0, 0, 2, 15], "texture": "#1"},
            				"up": {"uv": [0, 0, 14, 2], "texture": "#1"},
            				"down": {"uv": [0, 0, 14, 2], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 14.99, 0],
            			"to": [15, 15.99, 15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 15.5, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 14, 15], "texture": "#1"},
            				"down": {"uv": [0, 0, 14, 15], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 0, 14.5],
            			"to": [15, 16, 15.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 15]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 16], "texture": "#0"},
            				"east": {"uv": [0, 0, 1, 16], "texture": "#0"},
            				"south": {"uv": [0, 0, 14, 16], "texture": "#0"},
            				"west": {"uv": [0, 0, 1, 16], "texture": "#0"},
            				"up": {"uv": [0, 0, 14, 1], "texture": "#0"},
            				"down": {"uv": [0, 0, 14, 1], "texture": "#0"}
            			}
            		},
            		{
            			"from": [13.5, 0, 15],
            			"to": [14.5, 16, 16],
            			"rotation": {"angle": 0, "axis": "y", "origin": [14, 7, 15.5]},
            			"faces": {
            				"north": {"uv": [6, 0, 5, 16], "texture": "#1"},
            				"east": {"uv": [6, 0, 5, 16], "texture": "#1"},
            				"south": {"uv": [6, 0, 5, 16], "texture": "#1"},
            				"west": {"uv": [6, 0, 5, 16], "texture": "#1"},
            				"up": {"uv": [6, 0, 5, 1], "texture": "#1"},
            				"down": {"uv": [6, 0, 5, 1], "texture": "#1"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [1, 2.25, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"thirdperson_lefthand": {
            			"translation": [1, 2.25, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_righthand": {
            			"translation": [1, 3, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_lefthand": {
            			"translation": [1, 3, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"ground": {
            			"translation": [0, 1.5, 0],
            			"scale": [0.33, 0.33, 0.33]
            		},
            		"gui": {
            			"rotation": [20, -45, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"fixed": {
            			"rotation": [180, 0, 180],
            			"translation": [0, 0, 1],
            			"scale": [0.5, 0.5, 0.5]
            		}
            	}
            }
            """;

    public static String CUPBOARD_UP_FLIPPED = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		"1": "LEG_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
            		{
            			"from": [0, 0, 0],
            			"to": [1, 16, 15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [0.5, 8, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"east": {"uv": [0, 0, 15, 16], "texture": "#1"},
            				"south": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"west": {"uv": [0, 0, 15, 16], "texture": "#1"},
            				"up": {"uv": [0, 0, 1, 15], "texture": "#1"},
            				"down": {"uv": [0, 0, 1, 15], "texture": "#1"}
            			}
            		},
            		{
            			"from": [15, 0, 0],
            			"to": [16, 16, 15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [15.5, 8, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"east": {"uv": [0, 0, 15, 16], "texture": "#1"},
            				"south": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"west": {"uv": [0, 0, 15, 16], "texture": "#1"},
            				"up": {"uv": [0, 0, 1, 15], "texture": "#1"},
            				"down": {"uv": [0, 0, 1, 15], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 7, 1],
            			"to": [15, 8, 15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 7.5, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 14, 14], "texture": "#1"},
            				"down": {"uv": [0, 0, 14, 14], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 0, 0],
            			"to": [15, 15, 2],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 1]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 15], "texture": "#1"},
            				"east": {"uv": [0, 0, 2, 15], "texture": "#1"},
            				"south": {"uv": [0, 0, 14, 15], "texture": "#1"},
            				"west": {"uv": [0, 0, 2, 15], "texture": "#1"},
            				"up": {"uv": [0, 0, 14, 2], "texture": "#1"},
            				"down": {"uv": [0, 0, 14, 2], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 15, 0],
            			"to": [15, 16, 15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 15.5, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 14, 15], "texture": "#1"},
            				"down": {"uv": [0, 0, 14, 15], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 0, 14.5],
            			"to": [15, 15, 15.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 15]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 15], "texture": "#0"},
            				"east": {"uv": [0, 0, 1, 15], "texture": "#0"},
            				"south": {"uv": [0, 0, 14, 15], "texture": "#0"},
            				"west": {"uv": [0, 0, 1, 15], "texture": "#0"},
            				"up": {"uv": [0, 0, 14, 1], "texture": "#0"},
            				"down": {"uv": [0, 0, 14, 1], "texture": "#0"}
            			}
            		},
            		{
            			"from": [13.5, 0, 15],
            			"to": [14.5, 4, 16],
            			"rotation": {"angle": 0, "axis": "y", "origin": [14, 1.5, 15.5]},
            			"faces": {
            				"north": {"uv": [6, 0, 5, 4], "texture": "#1"},
            				"east": {"uv": [6, 0, 5, 4], "texture": "#1"},
            				"south": {"uv": [6, 0, 5, 4], "texture": "#1"},
            				"west": {"uv": [6, 0, 5, 4], "texture": "#1"},
            				"up": {"uv": [6, 0, 5, 1], "texture": "#1"},
            				"down": {"uv": [6, 0, 5, 1], "texture": "#1"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [1, 2.25, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"thirdperson_lefthand": {
            			"translation": [1, 2.25, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_righthand": {
            			"translation": [1, 3, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_lefthand": {
            			"translation": [1, 3, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"ground": {
            			"translation": [0, 1.5, 0],
            			"scale": [0.33, 0.33, 0.33]
            		},
            		"gui": {
            			"rotation": [20, -45, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"fixed": {
            			"rotation": [180, 0, 180],
            			"translation": [0, 0, 1],
            			"scale": [0.5, 0.5, 0.5]
            		}
            	}
            }
            """;

    public static String CUPBOARD_DOWN_FLIPPED = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		"1": "LEG_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
            		{
            			"from": [0, 0, 0],
            			"to": [1, 16, 15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [0.5, 8, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"east": {"uv": [0, 0, 15, 16], "texture": "#1"},
            				"south": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"west": {"uv": [0, 0, 15, 16], "texture": "#1"},
            				"up": {"uv": [0, 0, 1, 15], "texture": "#1"},
            				"down": {"uv": [0, 0, 1, 15], "texture": "#1"}
            			}
            		},
            		{
            			"from": [15, 0, 0],
            			"to": [16, 16, 15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [15.5, 8, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"east": {"uv": [0, 0, 15, 16], "texture": "#1"},
            				"south": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"west": {"uv": [0, 0, 15, 16], "texture": "#1"},
            				"up": {"uv": [0, 0, 1, 15], "texture": "#1"},
            				"down": {"uv": [0, 0, 1, 15], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 0, 0],
            			"to": [15, 1, 15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 0.5, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 14, 15], "texture": "#1"},
            				"down": {"uv": [0, 0, 14, 15], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 7, 1],
            			"to": [15, 8, 15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 7.5, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 14, 14], "texture": "#1"},
            				"down": {"uv": [0, 0, 14, 14], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 1, 0],
            			"to": [15, 15, 2],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 1]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 14], "texture": "#1"},
            				"east": {"uv": [0, 0, 2, 14], "texture": "#1"},
            				"south": {"uv": [0, 0, 14, 14], "texture": "#1"},
            				"west": {"uv": [0, 0, 2, 14], "texture": "#1"},
            				"up": {"uv": [0, 0, 14, 2], "texture": "#1"},
            				"down": {"uv": [0, 0, 14, 2], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 14.99, 0],
            			"to": [15, 15.99, 15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 15.5, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 14, 15], "texture": "#1"},
            				"down": {"uv": [0, 0, 14, 15], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 1, 14.5],
            			"to": [15, 16, 15.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 15]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 15], "texture": "#0"},
            				"east": {"uv": [0, 0, 1, 15], "texture": "#0"},
            				"south": {"uv": [0, 0, 14, 15], "texture": "#0"},
            				"west": {"uv": [0, 0, 1, 15], "texture": "#0"},
            				"up": {"uv": [0, 0, 14, 1], "texture": "#0"},
            				"down": {"uv": [0, 0, 14, 1], "texture": "#0"}
            			}
            		},
            		{
            			"from": [13.5, 12, 15],
            			"to": [14.5, 16, 16],
            			"rotation": {"angle": 0, "axis": "y", "origin": [14, 13.5, 15.5]},
            			"faces": {
            				"north": {"uv": [6, 0, 5, 4], "texture": "#1"},
            				"east": {"uv": [6, 0, 5, 4], "texture": "#1"},
            				"south": {"uv": [6, 0, 5, 4], "texture": "#1"},
            				"west": {"uv": [6, 0, 5, 4], "texture": "#1"},
            				"up": {"uv": [6, 0, 5, 1], "texture": "#1"},
            				"down": {"uv": [6, 0, 5, 1], "texture": "#1"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [1, 2.25, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"thirdperson_lefthand": {
            			"translation": [1, 2.25, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_righthand": {
            			"translation": [1, 3, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_lefthand": {
            			"translation": [1, 3, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"ground": {
            			"translation": [0, 1.5, 0],
            			"scale": [0.33, 0.33, 0.33]
            		},
            		"gui": {
            			"rotation": [20, -45, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"fixed": {
            			"rotation": [180, 0, 180],
            			"translation": [0, 0, 1],
            			"scale": [0.5, 0.5, 0.5]
            		}
            	}
            }
            """;

    public static String CUPBOARD_CENTER_OPEN_FLIPPED = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		"1": "LEG_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
            		{
            			"from": [0, 0, 0],
            			"to": [1, 16, 15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [0.5, 8, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"east": {"uv": [0, 0, 15, 16], "texture": "#1"},
            				"south": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"west": {"uv": [0, 0, 15, 16], "texture": "#1"},
            				"up": {"uv": [0, 0, 1, 15], "texture": "#1"},
            				"down": {"uv": [0, 0, 1, 15], "texture": "#1"}
            			}
            		},
            		{
            			"from": [15, 0, 0],
            			"to": [16, 16, 15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [15.5, 8, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"east": {"uv": [0, 0, 15, 16], "texture": "#1"},
            				"south": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"west": {"uv": [0, 0, 15, 16], "texture": "#1"},
            				"up": {"uv": [0, 0, 1, 15], "texture": "#1"},
            				"down": {"uv": [0, 0, 1, 15], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 7, 1],
            			"to": [15, 8, 15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 7.5, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 14, 14], "texture": "#1"},
            				"down": {"uv": [0, 0, 14, 14], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 0, 0],
            			"to": [15, 15, 2],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 1]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 15], "texture": "#1"},
            				"east": {"uv": [0, 0, 2, 15], "texture": "#1"},
            				"south": {"uv": [0, 0, 14, 15], "texture": "#1"},
            				"west": {"uv": [0, 0, 2, 15], "texture": "#1"},
            				"up": {"uv": [0, 0, 14, 2], "texture": "#1"},
            				"down": {"uv": [0, 0, 14, 2], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 14.99, 0],
            			"to": [15, 15.99, 15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 15.5, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 14, 15], "texture": "#1"},
            				"down": {"uv": [0, 0, 14, 15], "texture": "#1"}
            			}
            		},
            		{
            			"from": [0.75, 0, 14.25],
            			"to": [1.75, 16, 28.25],
            			"rotation": {"angle": 0, "axis": "y", "origin": [1, 8.75, 24.25]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 16], "texture": "#0"},
            				"east": {"uv": [0, 0, 14, 16], "texture": "#0"},
            				"south": {"uv": [0, 0, 1, 16], "texture": "#0"},
            				"west": {"uv": [0, 0, 14, 16], "texture": "#0"},
            				"up": {"uv": [0, 0, 14, 1], "rotation": 90, "texture": "#0"},
            				"down": {"uv": [0, 0, 14, 1], "rotation": 270, "texture": "#0"}
            			}
            		},
            		{
            			"from": [0.25, 0, 26.75],
            			"to": [1.25, 16, 27.75],
            			"rotation": {"angle": 0, "axis": "y", "origin": [1, 6.75, 24.25]},
            			"faces": {
            				"north": {"uv": [6, 0, 5, 16], "texture": "#1"},
            				"east": {"uv": [6, 0, 5, 16], "texture": "#1"},
            				"south": {"uv": [6, 0, 5, 16], "texture": "#1"},
            				"west": {"uv": [6, 0, 5, 16], "texture": "#1"},
            				"up": {"uv": [6, 0, 5, 1], "rotation": 90, "texture": "#1"},
            				"down": {"uv": [6, 0, 5, 1], "rotation": 270, "texture": "#1"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [1, 2.25, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"thirdperson_lefthand": {
            			"translation": [1, 2.25, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_righthand": {
            			"translation": [1, 3, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_lefthand": {
            			"translation": [1, 3, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"ground": {
            			"translation": [0, 1.5, 0],
            			"scale": [0.33, 0.33, 0.33]
            		},
            		"gui": {
            			"rotation": [20, -45, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"fixed": {
            			"rotation": [180, 0, 180],
            			"translation": [0, 0, 1],
            			"scale": [0.5, 0.5, 0.5]
            		}
            	}
            }
            """;

    public static String CUPBOARD_UP_OPEN_FLIPPED = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		"1": "LEG_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
            		{
            			"from": [0, 0, 0],
            			"to": [1, 16, 15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [0.5, 8, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"east": {"uv": [0, 0, 15, 16], "texture": "#1"},
            				"south": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"west": {"uv": [0, 0, 15, 16], "texture": "#1"},
            				"up": {"uv": [0, 0, 1, 15], "texture": "#1"},
            				"down": {"uv": [0, 0, 1, 15], "texture": "#1"}
            			}
            		},
            		{
            			"from": [15, 0, 0],
            			"to": [16, 16, 15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [15.5, 8, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"east": {"uv": [0, 0, 15, 16], "texture": "#1"},
            				"south": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"west": {"uv": [0, 0, 15, 16], "texture": "#1"},
            				"up": {"uv": [0, 0, 1, 15], "texture": "#1"},
            				"down": {"uv": [0, 0, 1, 15], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 7, 1],
            			"to": [15, 8, 15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 7.5, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 14, 14], "texture": "#1"},
            				"down": {"uv": [0, 0, 14, 14], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 0, 0],
            			"to": [15, 15, 2],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 1]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 15], "texture": "#1"},
            				"east": {"uv": [0, 0, 2, 15], "texture": "#1"},
            				"south": {"uv": [0, 0, 14, 15], "texture": "#1"},
            				"west": {"uv": [0, 0, 2, 15], "texture": "#1"},
            				"up": {"uv": [0, 0, 14, 2], "texture": "#1"},
            				"down": {"uv": [0, 0, 14, 2], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 15, 0],
            			"to": [15, 16, 15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 15.5, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 14, 15], "texture": "#1"},
            				"down": {"uv": [0, 0, 14, 15], "texture": "#1"}
            			}
            		},
            		{
            			"from": [0.75, 0, 14.25],
            			"to": [1.75, 15, 28.25],
            			"rotation": {"angle": 0, "axis": "y", "origin": [1, 8.75, 24.25]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 15], "texture": "#0"},
            				"east": {"uv": [0, 0, 14, 15], "texture": "#0"},
            				"south": {"uv": [0, 0, 1, 15], "texture": "#0"},
            				"west": {"uv": [0, 0, 14, 15], "texture": "#0"},
            				"up": {"uv": [0, 0, 14, 1], "rotation": 90, "texture": "#0"},
            				"down": {"uv": [0, 0, 14, 1], "rotation": 270, "texture": "#0"}
            			}
            		},
            		{
            			"from": [0.25, 0, 26.75],
            			"to": [1.25, 4, 27.75],
            			"rotation": {"angle": 0, "axis": "y", "origin": [1, 1.25, 24.25]},
            			"faces": {
            				"north": {"uv": [6, 0, 5, 4], "texture": "#1"},
            				"east": {"uv": [6, 0, 5, 4], "texture": "#1"},
            				"south": {"uv": [6, 0, 5, 4], "texture": "#1"},
            				"west": {"uv": [6, 0, 5, 4], "texture": "#1"},
            				"up": {"uv": [6, 0, 5, 1], "rotation": 90, "texture": "#1"},
            				"down": {"uv": [6, 0, 5, 1], "rotation": 270, "texture": "#1"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [1, 2.25, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"thirdperson_lefthand": {
            			"translation": [1, 2.25, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_righthand": {
            			"translation": [1, 3, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_lefthand": {
            			"translation": [1, 3, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"ground": {
            			"translation": [0, 1.5, 0],
            			"scale": [0.33, 0.33, 0.33]
            		},
            		"gui": {
            			"rotation": [20, -45, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"fixed": {
            			"rotation": [180, 0, 180],
            			"translation": [0, 0, 1],
            			"scale": [0.5, 0.5, 0.5]
            		}
            	}
            }
            """;

    public static String CUPBOARD_DOWN_OPEN_FLIPPED = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		"1": "LEG_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
            		{
            			"from": [0, 0, 0],
            			"to": [1, 16, 15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [0.5, 8, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"east": {"uv": [0, 0, 15, 16], "texture": "#1"},
            				"south": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"west": {"uv": [0, 0, 15, 16], "texture": "#1"},
            				"up": {"uv": [0, 0, 1, 15], "texture": "#1"},
            				"down": {"uv": [0, 0, 1, 15], "texture": "#1"}
            			}
            		},
            		{
            			"from": [15, 0, 0],
            			"to": [16, 16, 15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [15.5, 8, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"east": {"uv": [0, 0, 15, 16], "texture": "#1"},
            				"south": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"west": {"uv": [0, 0, 15, 16], "texture": "#1"},
            				"up": {"uv": [0, 0, 1, 15], "texture": "#1"},
            				"down": {"uv": [0, 0, 1, 15], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 0, 0],
            			"to": [15, 1, 15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 0.5, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 14, 15], "texture": "#1"},
            				"down": {"uv": [0, 0, 14, 15], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 7, 1],
            			"to": [15, 8, 15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 7.5, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 14, 14], "texture": "#1"},
            				"down": {"uv": [0, 0, 14, 14], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 1, 0],
            			"to": [15, 15, 2],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 1]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 14], "texture": "#1"},
            				"east": {"uv": [0, 0, 2, 14], "texture": "#1"},
            				"south": {"uv": [0, 0, 14, 14], "texture": "#1"},
            				"west": {"uv": [0, 0, 2, 14], "texture": "#1"},
            				"up": {"uv": [0, 0, 14, 2], "texture": "#1"},
            				"down": {"uv": [0, 0, 14, 2], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 14.99, 0],
            			"to": [15, 15.99, 15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 15.5, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 14, 15], "texture": "#1"},
            				"down": {"uv": [0, 0, 14, 15], "texture": "#1"}
            			}
            		},
            		{
            			"from": [0.75, 1, 14.25],
            			"to": [1.75, 16, 28.25],
            			"rotation": {"angle": 0, "axis": "y", "origin": [1, 8.75, 24.25]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 15], "texture": "#0"},
            				"east": {"uv": [0, 0, 14, 15], "texture": "#0"},
            				"south": {"uv": [0, 0, 1, 15], "texture": "#0"},
            				"west": {"uv": [0, 0, 14, 15], "texture": "#0"},
            				"up": {"uv": [0, 0, 14, 1], "rotation": 90, "texture": "#0"},
            				"down": {"uv": [0, 0, 14, 1], "rotation": 270, "texture": "#0"}
            			}
            		},
            		{
            			"from": [0.25, 12, 26.75],
            			"to": [1.25, 16, 27.75],
            			"rotation": {"angle": 0, "axis": "y", "origin": [1, 13.25, 24.25]},
            			"faces": {
            				"north": {"uv": [6, 0, 5, 4], "texture": "#1"},
            				"east": {"uv": [6, 0, 5, 4], "texture": "#1"},
            				"south": {"uv": [6, 0, 5, 4], "texture": "#1"},
            				"west": {"uv": [6, 0, 5, 4], "texture": "#1"},
            				"up": {"uv": [6, 0, 5, 1], "rotation": 90, "texture": "#1"},
            				"down": {"uv": [6, 0, 5, 1], "rotation": 270, "texture": "#1"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [1, 2.25, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"thirdperson_lefthand": {
            			"translation": [1, 2.25, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_righthand": {
            			"translation": [1, 3, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_lefthand": {
            			"translation": [1, 3, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"ground": {
            			"translation": [0, 1.5, 0],
            			"scale": [0.33, 0.33, 0.33]
            		},
            		"gui": {
            			"rotation": [20, -45, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"fixed": {
            			"rotation": [180, 0, 180],
            			"translation": [0, 0, 1],
            			"scale": [0.5, 0.5, 0.5]
            		}
            	}
            }
            """;

    public static String CABINET_LEFT = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		"1": "LEG_NAME",
            		"particle": "BASE_NAME"
            	},
                "elements": [
                		{
                			"from": [0, 0, 0],
                			"to": [1, 16, 15],
                			"rotation": {"angle": 0, "axis": "y", "origin": [0.5, 8, 7.5]},
                			"faces": {
                				"north": {"uv": [0, 0, 1, 16], "texture": "#1"},
                				"east": {"uv": [0, 0, 15, 16], "texture": "#1"},
                				"south": {"uv": [0, 0, 1, 16], "texture": "#1"},
                				"west": {"uv": [0, 0, 15, 16], "texture": "#1"},
                				"up": {"uv": [0, 0, 1, 15], "texture": "#1"},
                				"down": {"uv": [0, 0, 1, 15], "texture": "#1"}
                			}
                		},
                		{
                			"from": [15, 0, 0],
                			"to": [16, 16, 15],
                			"rotation": {"angle": 0, "axis": "y", "origin": [15.5, 8, 7.5]},
                			"faces": {
                				"north": {"uv": [0, 0, 1, 16], "texture": "#1"},
                				"east": {"uv": [0, 0, 15, 16], "texture": "#1"},
                				"south": {"uv": [0, 0, 1, 16], "texture": "#1"},
                				"west": {"uv": [0, 0, 15, 16], "texture": "#1"},
                				"up": {"uv": [0, 0, 1, 15], "texture": "#1"},
                				"down": {"uv": [0, 0, 1, 15], "texture": "#1"}
                			}
                		},
                		{
                			"from": [1, 0, 0],
                			"to": [15, 1, 15],
                			"rotation": {"angle": 0, "axis": "y", "origin": [8, 0.5, 7.5]},
                			"faces": {
                				"north": {"uv": [0, 0, 14, 1], "texture": "#1"},
                				"east": {"uv": [0, 0, 15, 1], "texture": "#1"},
                				"south": {"uv": [0, 0, 14, 1], "texture": "#1"},
                				"west": {"uv": [0, 0, 15, 1], "texture": "#1"},
                				"up": {"uv": [0, 0, 14, 15], "texture": "#1"},
                				"down": {"uv": [0, 0, 14, 15], "texture": "#1"}
                			}
                		},
                		{
                			"from": [1, 7, 1],
                			"to": [15, 8, 15],
                			"rotation": {"angle": 0, "axis": "y", "origin": [8, 7.5, 7.5]},
                			"faces": {
                				"north": {"uv": [0, 0, 14, 1], "texture": "#1"},
                				"east": {"uv": [0, 0, 15, 1], "texture": "#1"},
                				"south": {"uv": [0, 0, 14, 1], "texture": "#1"},
                				"west": {"uv": [0, 0, 15, 1], "texture": "#1"},
                				"up": {"uv": [0, 0, 14, 14], "texture": "#1"},
                				"down": {"uv": [0, 0, 14, 14], "texture": "#1"}
                			}
                		},
                		{
                			"from": [1, 1, 0],
                			"to": [15, 15, 2],
                			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 1]},
                			"faces": {
                				"north": {"uv": [0, 0, 14, 14], "texture": "#1"},
                				"east": {"uv": [0, 0, 2, 14], "texture": "#1"},
                				"south": {"uv": [0, 0, 14, 14], "texture": "#1"},
                				"west": {"uv": [0, 0, 2, 14], "texture": "#1"},
                				"up": {"uv": [0, 0, 14, 2], "texture": "#1"},
                				"down": {"uv": [0, 0, 14, 2], "texture": "#1"}
                			}
                		},
                		{
                			"from": [1, 15, 0],
                			"to": [15, 16, 15],
                			"rotation": {"angle": 0, "axis": "y", "origin": [8, 15.5, 7.5]},
                			"faces": {
                				"north": {"uv": [0, 0, 14, 1], "texture": "#1"},
                				"east": {"uv": [0, 0, 15, 1], "texture": "#1"},
                				"south": {"uv": [0, 0, 14, 1], "texture": "#1"},
                				"west": {"uv": [0, 0, 15, 1], "texture": "#1"},
                				"up": {"uv": [0, 0, 14, 15], "texture": "#1"},
                				"down": {"uv": [0, 0, 14, 15], "texture": "#1"}
                			}
                		},
                		{
                			"from": [1, 1, 14.5],
                			"to": [15, 15, 15.5],
                			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 15]},
                			"faces": {
                				"north": {"uv": [0, 0, 14, 14], "texture": "#0"},
                				"east": {"uv": [0, 0, 1, 14], "texture": "#0"},
                				"south": {"uv": [0, 0, 14, 14], "texture": "#0"},
                				"west": {"uv": [0, 0, 1, 14], "texture": "#0"},
                				"up": {"uv": [0, 0, 14, 1], "texture": "#0"},
                				"down": {"uv": [0, 0, 14, 1], "texture": "#0"}
                			}
                		},
                		{
                			"from": [13.5, 7.5, 15],
                			"to": [14.5, 11.5, 16],
                			"rotation": {"angle": 0, "axis": "y", "origin": [14, 9, 15.5]},
                			"faces": {
                				"north": {"uv": [6, 0, 5, 4], "texture": "#1"},
                				"east": {"uv": [6, 0, 5, 4], "texture": "#1"},
                				"south": {"uv": [6, 0, 5, 4], "texture": "#1"},
                				"west": {"uv": [6, 0, 5, 4], "texture": "#1"},
                				"up": {"uv": [6, 0, 5, 1], "texture": "#1"},
                				"down": {"uv": [6, 0, 5, 1], "texture": "#1"}
                			}
                		}
                	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [1, 2.25, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"thirdperson_lefthand": {
            			"translation": [1, 2.25, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_righthand": {
            			"translation": [1, 3, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_lefthand": {
            			"translation": [1, 3, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"ground": {
            			"translation": [0, 1.5, 0],
            			"scale": [0.33, 0.33, 0.33]
            		},
            		"gui": {
            			"rotation": [20, -45, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"fixed": {
            			"rotation": [180, 0, 180],
            			"translation": [0, 0, 1],
            			"scale": [0.5, 0.5, 0.5]
            		}
            	}
            }
            """;

    public static String CABINET_RIGHT = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		"1": "LEG_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
             		{
             			"from": [0, 0, 0],
             			"to": [1, 16, 15],
             			"rotation": {"angle": 0, "axis": "y", "origin": [0.5, 8, 7.5]},
             			"faces": {
             				"north": {"uv": [0, 0, 1, 16], "texture": "#1"},
             				"east": {"uv": [0, 0, 15, 16], "texture": "#1"},
             				"south": {"uv": [0, 0, 1, 16], "texture": "#1"},
             				"west": {"uv": [0, 0, 15, 16], "texture": "#1"},
             				"up": {"uv": [0, 0, 1, 15], "texture": "#1"},
             				"down": {"uv": [0, 0, 1, 15], "texture": "#1"}
             			}
             		},
             		{
             			"from": [15, 0, 0],
             			"to": [16, 16, 15],
             			"rotation": {"angle": 0, "axis": "y", "origin": [15.5, 8, 7.5]},
             			"faces": {
             				"north": {"uv": [0, 0, 1, 16], "texture": "#1"},
             				"east": {"uv": [0, 0, 15, 16], "texture": "#1"},
             				"south": {"uv": [0, 0, 1, 16], "texture": "#1"},
             				"west": {"uv": [0, 0, 15, 16], "texture": "#1"},
             				"up": {"uv": [0, 0, 1, 15], "texture": "#1"},
             				"down": {"uv": [0, 0, 1, 15], "texture": "#1"}
             			}
             		},
             		{
             			"from": [1, 0, 0],
             			"to": [15, 1, 15],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 0.5, 7.5]},
             			"faces": {
             				"north": {"uv": [0, 0, 14, 1], "texture": "#1"},
             				"east": {"uv": [0, 0, 15, 1], "texture": "#1"},
             				"south": {"uv": [0, 0, 14, 1], "texture": "#1"},
             				"west": {"uv": [0, 0, 15, 1], "texture": "#1"},
             				"up": {"uv": [0, 0, 14, 15], "texture": "#1"},
             				"down": {"uv": [0, 0, 14, 15], "texture": "#1"}
             			}
             		},
             		{
             			"from": [1, 7, 1],
             			"to": [15, 8, 15],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 7.5, 7.5]},
             			"faces": {
             				"north": {"uv": [0, 0, 14, 1], "texture": "#1"},
             				"east": {"uv": [0, 0, 15, 1], "texture": "#1"},
             				"south": {"uv": [0, 0, 14, 1], "texture": "#1"},
             				"west": {"uv": [0, 0, 15, 1], "texture": "#1"},
             				"up": {"uv": [0, 0, 14, 14], "texture": "#1"},
             				"down": {"uv": [0, 0, 14, 14], "texture": "#1"}
             			}
             		},
             		{
             			"from": [1, 1, 0],
             			"to": [15, 15, 2],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 1]},
             			"faces": {
             				"north": {"uv": [0, 0, 14, 14], "texture": "#1"},
             				"east": {"uv": [0, 0, 2, 14], "texture": "#1"},
             				"south": {"uv": [0, 0, 14, 14], "texture": "#1"},
             				"west": {"uv": [0, 0, 2, 14], "texture": "#1"},
             				"up": {"uv": [0, 0, 14, 2], "texture": "#1"},
             				"down": {"uv": [0, 0, 14, 2], "texture": "#1"}
             			}
             		},
             		{
             			"from": [1, 15, 0],
             			"to": [15, 16, 15],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 15.5, 7.5]},
             			"faces": {
             				"north": {"uv": [0, 0, 14, 1], "texture": "#1"},
             				"east": {"uv": [0, 0, 15, 1], "texture": "#1"},
             				"south": {"uv": [0, 0, 14, 1], "texture": "#1"},
             				"west": {"uv": [0, 0, 15, 1], "texture": "#1"},
             				"up": {"uv": [0, 0, 14, 15], "texture": "#1"},
             				"down": {"uv": [0, 0, 14, 15], "texture": "#1"}
             			}
             		},
             		{
             			"from": [1, 1, 14.5],
             			"to": [15, 15, 15.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 15]},
             			"faces": {
             				"north": {"uv": [0, 0, 14, 14], "texture": "#0"},
             				"east": {"uv": [0, 0, 1, 14], "texture": "#0"},
             				"south": {"uv": [0, 0, 14, 14], "texture": "#0"},
             				"west": {"uv": [0, 0, 1, 14], "texture": "#0"},
             				"up": {"uv": [0, 0, 14, 1], "texture": "#0"},
             				"down": {"uv": [0, 0, 14, 1], "texture": "#0"}
             			}
             		},
             		{
             			"from": [1.5, 7.5, 15],
             			"to": [2.5, 11.5, 16],
             			"rotation": {"angle": 0, "axis": "y", "origin": [2, 9, 15.5]},
             			"faces": {
             				"north": {"uv": [5, 0, 6, 4], "texture": "#1"},
             				"east": {"uv": [5, 0, 6, 4], "texture": "#1"},
             				"south": {"uv": [5, 0, 6, 4], "texture": "#1"},
             				"west": {"uv": [5, 0, 6, 4], "texture": "#1"},
             				"up": {"uv": [5, 0, 6, 1], "texture": "#1"},
             				"down": {"uv": [5, 0, 6, 1], "texture": "#1"}
             			}
             		}
             	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [1, 2.25, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"thirdperson_lefthand": {
            			"translation": [1, 2.25, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_righthand": {
            			"translation": [1, 3, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_lefthand": {
            			"translation": [1, 3, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"ground": {
            			"translation": [0, 1.5, 0],
            			"scale": [0.33, 0.33, 0.33]
            		},
            		"gui": {
            			"rotation": [20, -45, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"fixed": {
            			"rotation": [180, 0, 180],
            			"translation": [0, 0, 1],
            			"scale": [0.5, 0.5, 0.5]
            		}
            	}
            }
            """;

    public static String CABINET_RIGHT_OPEN = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		"1": "LEG_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
             		{
             			"from": [0, 0, 0],
             			"to": [1, 16, 15],
             			"rotation": {"angle": 0, "axis": "y", "origin": [0.5, 8, 7.5]},
             			"faces": {
             				"north": {"uv": [0, 0, 1, 16], "texture": "#1"},
             				"east": {"uv": [0, 0, 15, 16], "texture": "#1"},
             				"south": {"uv": [0, 0, 1, 16], "texture": "#1"},
             				"west": {"uv": [0, 0, 15, 16], "texture": "#1"},
             				"up": {"uv": [0, 0, 1, 15], "texture": "#1"},
             				"down": {"uv": [0, 0, 1, 15], "texture": "#1"}
             			}
             		},
             		{
             			"from": [15, 0, 0],
             			"to": [16, 16, 15],
             			"rotation": {"angle": 0, "axis": "y", "origin": [15.5, 8, 7.5]},
             			"faces": {
             				"north": {"uv": [0, 0, 1, 16], "texture": "#1"},
             				"east": {"uv": [0, 0, 15, 16], "texture": "#1"},
             				"south": {"uv": [0, 0, 1, 16], "texture": "#1"},
             				"west": {"uv": [0, 0, 15, 16], "texture": "#1"},
             				"up": {"uv": [0, 0, 1, 15], "texture": "#1"},
             				"down": {"uv": [0, 0, 1, 15], "texture": "#1"}
             			}
             		},
             		{
             			"from": [1, 0, 0],
             			"to": [15, 1, 15],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 0.5, 7.5]},
             			"faces": {
             				"north": {"uv": [0, 0, 14, 1], "texture": "#1"},
             				"east": {"uv": [0, 0, 15, 1], "texture": "#1"},
             				"south": {"uv": [0, 0, 14, 1], "texture": "#1"},
             				"west": {"uv": [0, 0, 15, 1], "texture": "#1"},
             				"up": {"uv": [0, 0, 14, 15], "texture": "#1"},
             				"down": {"uv": [0, 0, 14, 15], "texture": "#1"}
             			}
             		},
             		{
             			"from": [1, 7, 1],
             			"to": [15, 8, 15],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 7.5, 7.5]},
             			"faces": {
             				"north": {"uv": [0, 0, 14, 1], "texture": "#1"},
             				"east": {"uv": [0, 0, 15, 1], "texture": "#1"},
             				"south": {"uv": [0, 0, 14, 1], "texture": "#1"},
             				"west": {"uv": [0, 0, 15, 1], "texture": "#1"},
             				"up": {"uv": [0, 0, 14, 14], "texture": "#1"},
             				"down": {"uv": [0, 0, 14, 14], "texture": "#1"}
             			}
             		},
             		{
             			"from": [1, 1, 0],
             			"to": [15, 15, 2],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 1]},
             			"faces": {
             				"north": {"uv": [0, 0, 14, 14], "texture": "#1"},
             				"east": {"uv": [0, 0, 2, 14], "texture": "#1"},
             				"south": {"uv": [0, 0, 14, 14], "texture": "#1"},
             				"west": {"uv": [0, 0, 2, 14], "texture": "#1"},
             				"up": {"uv": [0, 0, 14, 2], "texture": "#1"},
             				"down": {"uv": [0, 0, 14, 2], "texture": "#1"}
             			}
             		},
             		{
             			"from": [1, 15, 0],
             			"to": [15, 16, 15],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 15.5, 7.5]},
             			"faces": {
             				"north": {"uv": [0, 0, 14, 1], "texture": "#1"},
             				"east": {"uv": [0, 0, 15, 1], "texture": "#1"},
             				"south": {"uv": [0, 0, 14, 1], "texture": "#1"},
             				"west": {"uv": [0, 0, 15, 1], "texture": "#1"},
             				"up": {"uv": [0, 0, 14, 15], "texture": "#1"},
             				"down": {"uv": [0, 0, 14, 15], "texture": "#1"}
             			}
             		},
             		{
             			"from": [14.25, 1, 14.25],
             			"to": [15.25, 15, 28.25],
             			"rotation": {"angle": 0, "axis": "y", "origin": [15, 8.75, 24.25]},
             			"faces": {
             				"north": {"uv": [0, 0, 1, 14], "texture": "#0"},
             				"east": {"uv": [0, 0, 14, 14], "texture": "#0"},
             				"south": {"uv": [0, 0, 1, 14], "texture": "#0"},
             				"west": {"uv": [0, 0, 14, 14], "texture": "#0"},
             				"up": {"uv": [0, 0, 14, 1], "rotation": 270, "texture": "#0"},
             				"down": {"uv": [0, 0, 14, 1], "rotation": 90, "texture": "#0"}
             			}
             		},
             		{
             			"from": [14.75, 7.5, 26.75],
             			"to": [15.75, 11.5, 27.75],
             			"rotation": {"angle": 0, "axis": "y", "origin": [15, 8.75, 24.25]},
             			"faces": {
             				"north": {"uv": [5, 0, 6, 4], "texture": "#1"},
             				"east": {"uv": [5, 0, 6, 4], "texture": "#1"},
             				"south": {"uv": [5, 0, 6, 4], "texture": "#1"},
             				"west": {"uv": [5, 0, 6, 4], "texture": "#1"},
             				"up": {"uv": [5, 0, 6, 1], "rotation": 270, "texture": "#1"},
             				"down": {"uv": [5, 0, 6, 1], "rotation": 90, "texture": "#1"}
             			}
             		}
             	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [1, 2.25, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"thirdperson_lefthand": {
            			"translation": [1, 2.25, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_righthand": {
            			"translation": [1, 3, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_lefthand": {
            			"translation": [1, 3, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"ground": {
            			"translation": [0, 1.5, 0],
            			"scale": [0.33, 0.33, 0.33]
            		},
            		"gui": {
            			"rotation": [20, -45, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"fixed": {
            			"rotation": [180, 0, 180],
            			"translation": [0, 0, 1],
            			"scale": [0.5, 0.5, 0.5]
            		}
            	}
            }
            """;

    public static String CABINET_LEFT_OPEN = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		"1": "LEG_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
             		{
             			"from": [0, 0, 0],
             			"to": [1, 16, 15],
             			"rotation": {"angle": 0, "axis": "y", "origin": [0.5, 8, 7.5]},
             			"faces": {
             				"north": {"uv": [0, 0, 1, 16], "texture": "#1"},
             				"east": {"uv": [0, 0, 15, 16], "texture": "#1"},
             				"south": {"uv": [0, 0, 1, 16], "texture": "#1"},
             				"west": {"uv": [0, 0, 15, 16], "texture": "#1"},
             				"up": {"uv": [0, 0, 1, 15], "texture": "#1"},
             				"down": {"uv": [0, 0, 1, 15], "texture": "#1"}
             			}
             		},
             		{
             			"from": [15, 0, 0],
             			"to": [16, 16, 15],
             			"rotation": {"angle": 0, "axis": "y", "origin": [15.5, 8, 7.5]},
             			"faces": {
             				"north": {"uv": [0, 0, 1, 16], "texture": "#1"},
             				"east": {"uv": [0, 0, 15, 16], "texture": "#1"},
             				"south": {"uv": [0, 0, 1, 16], "texture": "#1"},
             				"west": {"uv": [0, 0, 15, 16], "texture": "#1"},
             				"up": {"uv": [0, 0, 1, 15], "texture": "#1"},
             				"down": {"uv": [0, 0, 1, 15], "texture": "#1"}
             			}
             		},
             		{
             			"from": [1, 0, 0],
             			"to": [15, 1, 15],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 0.5, 7.5]},
             			"faces": {
             				"north": {"uv": [0, 0, 14, 1], "texture": "#1"},
             				"east": {"uv": [0, 0, 15, 1], "texture": "#1"},
             				"south": {"uv": [0, 0, 14, 1], "texture": "#1"},
             				"west": {"uv": [0, 0, 15, 1], "texture": "#1"},
             				"up": {"uv": [0, 0, 14, 15], "texture": "#1"},
             				"down": {"uv": [0, 0, 14, 15], "texture": "#1"}
             			}
             		},
             		{
             			"from": [1, 7, 1],
             			"to": [15, 8, 15],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 7.5, 7.5]},
             			"faces": {
             				"north": {"uv": [0, 0, 14, 1], "texture": "#1"},
             				"east": {"uv": [0, 0, 15, 1], "texture": "#1"},
             				"south": {"uv": [0, 0, 14, 1], "texture": "#1"},
             				"west": {"uv": [0, 0, 15, 1], "texture": "#1"},
             				"up": {"uv": [0, 0, 14, 14], "texture": "#1"},
             				"down": {"uv": [0, 0, 14, 14], "texture": "#1"}
             			}
             		},
             		{
             			"from": [1, 1, 0],
             			"to": [15, 15, 2],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 1]},
             			"faces": {
             				"north": {"uv": [0, 0, 14, 14], "texture": "#1"},
             				"east": {"uv": [0, 0, 2, 14], "texture": "#1"},
             				"south": {"uv": [0, 0, 14, 14], "texture": "#1"},
             				"west": {"uv": [0, 0, 2, 14], "texture": "#1"},
             				"up": {"uv": [0, 0, 14, 2], "texture": "#1"},
             				"down": {"uv": [0, 0, 14, 2], "texture": "#1"}
             			}
             		},
             		{
             			"from": [1, 15, 0],
             			"to": [15, 16, 15],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 15.5, 7.5]},
             			"faces": {
             				"north": {"uv": [0, 0, 14, 1], "texture": "#1"},
             				"east": {"uv": [0, 0, 15, 1], "texture": "#1"},
             				"south": {"uv": [0, 0, 14, 1], "texture": "#1"},
             				"west": {"uv": [0, 0, 15, 1], "texture": "#1"},
             				"up": {"uv": [0, 0, 14, 15], "texture": "#1"},
             				"down": {"uv": [0, 0, 14, 15], "texture": "#1"}
             			}
             		},
             		{
             			"from": [0.75, 1, 14.25],
             			"to": [1.75, 15, 28.25],
             			"rotation": {"angle": 0, "axis": "y", "origin": [1, 8.75, 24.25]},
             			"faces": {
             				"north": {"uv": [0, 0, 1, 14], "texture": "#0"},
             				"east": {"uv": [0, 0, 14, 14], "texture": "#0"},
             				"south": {"uv": [0, 0, 1, 14], "texture": "#0"},
             				"west": {"uv": [0, 0, 14, 14], "texture": "#0"},
             				"up": {"uv": [0, 0, 14, 1], "rotation": 90, "texture": "#0"},
             				"down": {"uv": [0, 0, 14, 1], "rotation": 270, "texture": "#0"}
             			}
             		},
             		{
             			"from": [0.25, 7.5, 26.75],
             			"to": [1.25, 11.5, 27.75],
             			"rotation": {"angle": 0, "axis": "y", "origin": [1, 8.75, 24.25]},
             			"faces": {
             				"north": {"uv": [6, 0, 5, 4], "texture": "#1"},
             				"east": {"uv": [6, 0, 5, 4], "texture": "#1"},
             				"south": {"uv": [6, 0, 5, 4], "texture": "#1"},
             				"west": {"uv": [6, 0, 5, 4], "texture": "#1"},
             				"up": {"uv": [6, 0, 5, 1], "rotation": 90, "texture": "#1"},
             				"down": {"uv": [6, 0, 5, 1], "rotation": 270, "texture": "#1"}
             			}
             		}
             	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [1, 2.25, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"thirdperson_lefthand": {
            			"translation": [1, 2.25, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_righthand": {
            			"translation": [1, 3, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_lefthand": {
            			"translation": [1, 3, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"ground": {
            			"translation": [0, 1.5, 0],
            			"scale": [0.33, 0.33, 0.33]
            		},
            		"gui": {
            			"rotation": [20, -45, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"fixed": {
            			"rotation": [180, 0, 180],
            			"translation": [0, 0, 1],
            			"scale": [0.5, 0.5, 0.5]
            		}
            	}
            }
            """;

    public static String FLIPUP_HALFCABINET = """
            {
            	"format_version": "1.21.6",
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		"1": "LEG_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
            		{
            			"from": [0, 0, 0],
            			"to": [1, 16, 7],
            			"rotation": {"angle": 0, "axis": "y", "origin": [0.5, 8, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"east": {"uv": [0, 0, 7, 16], "texture": "#1"},
            				"south": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"west": {"uv": [0, 0, 7, 16], "texture": "#1"},
            				"up": {"uv": [0, 0, 1, 7], "texture": "#1"},
            				"down": {"uv": [0, 0, 1, 7], "texture": "#1"}
            			}
            		},
            		{
            			"from": [15, 0, 0],
            			"to": [16, 16, 7],
            			"rotation": {"angle": 0, "axis": "y", "origin": [15.5, 8, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"east": {"uv": [0, 0, 7, 16], "texture": "#1"},
            				"south": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"west": {"uv": [0, 0, 7, 16], "texture": "#1"},
            				"up": {"uv": [0, 0, 1, 7], "texture": "#1"},
            				"down": {"uv": [0, 0, 1, 7], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 0, 0],
            			"to": [15, 1, 7],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 0.5, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 7, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 7, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 14, 7], "texture": "#1"},
            				"down": {"uv": [0, 0, 14, 7], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 7, 1],
            			"to": [15, 8, 7],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 7.5, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 6, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 6, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 14, 6], "texture": "#1"},
            				"down": {"uv": [0, 0, 14, 6], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 1, 0],
            			"to": [15, 15, 2],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 1]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 14], "texture": "#1"},
            				"east": {"uv": [0, 0, 2, 14], "texture": "#1"},
            				"south": {"uv": [0, 0, 14, 14], "texture": "#1"},
            				"west": {"uv": [0, 0, 2, 14], "texture": "#1"},
            				"up": {"uv": [0, 0, 14, 2], "texture": "#1"},
            				"down": {"uv": [0, 0, 14, 2], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 15, 0],
            			"to": [15, 16, 7],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 15.5, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 7, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 7, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 14, 7], "texture": "#1"},
            				"down": {"uv": [0, 0, 14, 7], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 1, 6.5],
            			"to": [15, 15, 7.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 7]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 14], "texture": "#0"},
            				"east": {"uv": [0, 0, 1, 14], "texture": "#0"},
            				"south": {"uv": [0, 0, 14, 14], "texture": "#0"},
            				"west": {"uv": [0, 0, 1, 14], "texture": "#0"},
            				"up": {"uv": [0, 0, 14, 1], "texture": "#0"},
            				"down": {"uv": [0, 0, 14, 1], "texture": "#0"}
            			}
            		},
            		{
            			"from": [6, 2, 6],
            			"to": [10, 3, 8],
            			"rotation": {"angle": 0, "axis": "y", "origin": [7, 1, 6]},
            			"faces": {
            				"north": {"uv": [4, 2, 8, 3], "texture": "#1"},
            				"east": {"uv": [4, 2, 6, 3], "texture": "#1"},
            				"south": {"uv": [4, 2, 8, 3], "texture": "#1"},
            				"west": {"uv": [4, 2, 6, 3], "texture": "#1"},
            				"up": {"uv": [4, 2, 8, 4], "texture": "#1"},
            				"down": {"uv": [4, 2, 8, 4], "texture": "#1"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [1, 2.25, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"thirdperson_lefthand": {
            			"translation": [1, 2.25, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_righthand": {
            			"translation": [1, 3, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_lefthand": {
            			"translation": [1, 3, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"ground": {
            			"translation": [0, 1.5, 0],
            			"scale": [0.33, 0.33, 0.33]
            		},
            		"gui": {
            			"rotation": [20, -45, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"fixed": {
            			"rotation": [-180, 0, -180],
            			"translation": [0, 0, 1],
            			"scale": [0.5, 0.5, 0.5]
            		}
            	}
            }
            """;

    public static String FLIPUP_HALFCABINET_OPEN = """
            {
            	"format_version": "1.21.6",
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		"1": "LEG_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
            		{
            			"from": [0, 0, 0],
            			"to": [1, 16, 7],
            			"rotation": {"angle": 0, "axis": "y", "origin": [0.5, 8, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"east": {"uv": [0, 0, 7, 16], "texture": "#1"},
            				"south": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"west": {"uv": [0, 0, 7, 16], "texture": "#1"},
            				"up": {"uv": [0, 0, 1, 7], "texture": "#1"},
            				"down": {"uv": [0, 0, 1, 7], "texture": "#1"}
            			}
            		},
            		{
            			"from": [15, 0, 0],
            			"to": [16, 16, 7],
            			"rotation": {"angle": 0, "axis": "y", "origin": [15.5, 8, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"east": {"uv": [0, 0, 7, 16], "texture": "#1"},
            				"south": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"west": {"uv": [0, 0, 7, 16], "texture": "#1"},
            				"up": {"uv": [0, 0, 1, 7], "texture": "#1"},
            				"down": {"uv": [0, 0, 1, 7], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 0, 0],
            			"to": [15, 1, 7],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 0.5, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 7, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 7, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 14, 7], "texture": "#1"},
            				"down": {"uv": [0, 0, 14, 7], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 7, 1],
            			"to": [15, 8, 7],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 7.5, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 6, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 6, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 14, 6], "texture": "#1"},
            				"down": {"uv": [0, 0, 14, 6], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 1, 0],
            			"to": [15, 15, 2],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 1]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 14], "texture": "#1"},
            				"east": {"uv": [0, 0, 2, 14], "texture": "#1"},
            				"south": {"uv": [0, 0, 14, 14], "texture": "#1"},
            				"west": {"uv": [0, 0, 2, 14], "texture": "#1"},
            				"up": {"uv": [0, 0, 14, 2], "texture": "#1"},
            				"down": {"uv": [0, 0, 14, 2], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 15, 0],
            			"to": [15, 16, 7],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 15.5, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 7, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 7, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 14, 7], "texture": "#1"},
            				"down": {"uv": [0, 0, 14, 7], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 14, 6.25],
            			"to": [15, 15, 20.25],
            			"rotation": {"angle": 0, "axis": "x", "origin": [8, 14.5, 16]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 1], "rotation": 180, "texture": "#0"},
            				"east": {"uv": [0, 0, 1, 14], "rotation": 90, "texture": "#0"},
            				"south": {"uv": [0, 0, 14, 1], "texture": "#0"},
            				"west": {"uv": [0, 0, 1, 14], "rotation": 270, "texture": "#0"},
            				"up": {"uv": [0, 0, 14, 14], "texture": "#0"},
            				"down": {"uv": [0, 0, 14, 14], "rotation": 180, "texture": "#0"}
            			}
            		},
            		{
            			"from": [6, 14.5, 18.25],
            			"to": [10, 15.5, 19.25],
            			"rotation": {"angle": 0, "axis": "x", "origin": [8, 14.5, 16]},
            			"faces": {
            				"north": {"uv": [4, 2, 8, 3], "rotation": 180, "texture": "#1"},
            				"east": {"uv": [4, 2, 6, 3], "rotation": 90, "texture": "#1"},
            				"south": {"uv": [4, 2, 8, 3], "texture": "#1"},
            				"west": {"uv": [4, 2, 6, 3], "rotation": 270, "texture": "#1"},
            				"up": {"uv": [4, 2, 8, 3], "texture": "#1"},
            				"down": {"uv": [4, 2, 8, 3], "rotation": 180, "texture": "#1"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [1, 2.25, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"thirdperson_lefthand": {
            			"translation": [1, 2.25, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_righthand": {
            			"translation": [1, 3, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_lefthand": {
            			"translation": [1, 3, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"ground": {
            			"translation": [0, 1.5, 0],
            			"scale": [0.33, 0.33, 0.33]
            		},
            		"gui": {
            			"rotation": [20, -45, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"fixed": {
            			"rotation": [-180, 0, -180],
            			"translation": [0, 0, 1],
            			"scale": [0.5, 0.5, 0.5]
            		}
            	}
            }
            """;

    public static String FLIPUP_HALFCABINET_RIGHT = """
            {
            	"format_version": "1.21.6",
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		"1": "LEG_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
            		{
            			"from": [15, 0, 0],
            			"to": [16, 16, 7],
            			"rotation": {"angle": 0, "axis": "y", "origin": [15.5, 8, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"east": {"uv": [0, 0, 7, 16], "texture": "#1"},
            				"south": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"west": {"uv": [0, 0, 7, 16], "texture": "#1"},
            				"up": {"uv": [0, 0, 1, 7], "texture": "#1"},
            				"down": {"uv": [0, 0, 1, 7], "texture": "#1"}
            			}
            		},
            		{
            			"from": [0, 0, 0],
            			"to": [15, 1, 7],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 0.5, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 7, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 7, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 15, 7], "texture": "#1"},
            				"down": {"uv": [0, 0, 15, 7], "texture": "#1"}
            			}
            		},
            		{
            			"from": [0, 7, 1],
            			"to": [15, 8, 7],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 7.5, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 6, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 6, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 15, 6], "texture": "#1"},
            				"down": {"uv": [0, 0, 15, 6], "texture": "#1"}
            			}
            		},
            		{
            			"from": [0, 1, 0],
            			"to": [15, 15, 2],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 1]},
            			"faces": {
            				"north": {"uv": [0, 0, 15, 14], "texture": "#1"},
            				"east": {"uv": [0, 0, 2, 14], "texture": "#1"},
            				"south": {"uv": [0, 0, 15, 14], "texture": "#1"},
            				"west": {"uv": [0, 0, 2, 14], "texture": "#1"},
            				"up": {"uv": [0, 0, 15, 2], "texture": "#1"},
            				"down": {"uv": [0, 0, 15, 2], "texture": "#1"}
            			}
            		},
            		{
            			"from": [0, 15, 0],
            			"to": [15, 16, 7],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 15.5, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 7, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 7, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 15, 7], "texture": "#1"},
            				"down": {"uv": [0, 0, 15, 7], "texture": "#1"}
            			}
            		},
            		{
            			"from": [0, 1, 6.5],
            			"to": [15, 15, 7.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 7]},
            			"faces": {
            				"north": {"uv": [0, 0, 15, 14], "texture": "#0"},
            				"east": {"uv": [0, 0, 1, 14], "texture": "#0"},
            				"south": {"uv": [0, 0, 15, 14], "texture": "#0"},
            				"west": {"uv": [0, 0, 1, 14], "texture": "#0"},
            				"up": {"uv": [0, 0, 15, 1], "texture": "#0"},
            				"down": {"uv": [0, 0, 15, 1], "texture": "#0"}
            			}
            		},
            		{
            			"from": [0, 2, 6],
            			"to": [4, 3, 8],
            			"rotation": {"angle": 0, "axis": "y", "origin": [1, 1, 6]},
            			"faces": {
            				"north": {"uv": [4, 2, 8, 3], "texture": "#1"},
            				"east": {"uv": [4, 2, 6, 3], "texture": "#1"},
            				"south": {"uv": [4, 2, 8, 3], "texture": "#1"},
            				"west": {"uv": [4, 2, 6, 3], "texture": "#1"},
            				"up": {"uv": [4, 2, 8, 4], "texture": "#1"},
            				"down": {"uv": [4, 2, 8, 4], "texture": "#1"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [1, 2.25, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"thirdperson_lefthand": {
            			"translation": [1, 2.25, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_righthand": {
            			"translation": [1, 3, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_lefthand": {
            			"translation": [1, 3, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"ground": {
            			"translation": [0, 1.5, 0],
            			"scale": [0.33, 0.33, 0.33]
            		},
            		"gui": {
            			"rotation": [20, -45, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"fixed": {
            			"rotation": [-180, 0, -180],
            			"translation": [0, 0, 1],
            			"scale": [0.5, 0.5, 0.5]
            		}
            	}
            }
            """;

    public static String FLIPUP_HALFCABINET_RIGHT_OPEN = """
            {
            	"format_version": "1.21.6",
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		"1": "LEG_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
            		{
            			"from": [15, 0, 0],
            			"to": [16, 16, 7],
            			"rotation": {"angle": 0, "axis": "y", "origin": [15.5, 8, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"east": {"uv": [0, 0, 7, 16], "texture": "#1"},
            				"south": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"west": {"uv": [0, 0, 7, 16], "texture": "#1"},
            				"up": {"uv": [0, 0, 1, 7], "texture": "#1"},
            				"down": {"uv": [0, 0, 1, 7], "texture": "#1"}
            			}
            		},
            		{
            			"from": [0, 0, 0],
            			"to": [15, 1, 7],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 0.5, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 7, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 7, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 15, 7], "texture": "#1"},
            				"down": {"uv": [0, 0, 15, 7], "texture": "#1"}
            			}
            		},
            		{
            			"from": [0, 7, 1],
            			"to": [15, 8, 7],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 7.5, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 6, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 6, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 15, 6], "texture": "#1"},
            				"down": {"uv": [0, 0, 15, 6], "texture": "#1"}
            			}
            		},
            		{
            			"from": [0, 1, 0],
            			"to": [15, 15, 2],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 1]},
            			"faces": {
            				"north": {"uv": [0, 0, 15, 14], "texture": "#1"},
            				"east": {"uv": [0, 0, 2, 14], "texture": "#1"},
            				"south": {"uv": [0, 0, 15, 14], "texture": "#1"},
            				"west": {"uv": [0, 0, 2, 14], "texture": "#1"},
            				"up": {"uv": [0, 0, 15, 2], "texture": "#1"},
            				"down": {"uv": [0, 0, 15, 2], "texture": "#1"}
            			}
            		},
            		{
            			"from": [0, 15, 0],
            			"to": [15, 16, 7],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 15.5, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 7, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 7, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 15, 7], "texture": "#1"},
            				"down": {"uv": [0, 0, 15, 7], "texture": "#1"}
            			}
            		},
            		{
            			"from": [0, 14, 6.25],
            			"to": [15, 15, 20.25],
            			"rotation": {"angle": 0, "axis": "x", "origin": [8, 14.5, 16]},
            			"faces": {
            				"north": {"uv": [0, 0, 15, 1], "rotation": 180, "texture": "#0"},
            				"east": {"uv": [0, 0, 1, 14], "rotation": 90, "texture": "#0"},
            				"south": {"uv": [0, 0, 15, 1], "texture": "#0"},
            				"west": {"uv": [0, 0, 1, 14], "rotation": 270, "texture": "#0"},
            				"up": {"uv": [0, 0, 15, 14], "texture": "#0"},
            				"down": {"uv": [0, 0, 15, 14], "rotation": 180, "texture": "#0"}
            			}
            		},
            		{
            			"from": [0, 14.5, 18.25],
            			"to": [4, 15.5, 19.25],
            			"rotation": {"angle": 0, "axis": "x", "origin": [2, 14.5, 16]},
            			"faces": {
            				"north": {"uv": [4, 2, 8, 3], "rotation": 180, "texture": "#1"},
            				"east": {"uv": [4, 2, 6, 3], "rotation": 90, "texture": "#1"},
            				"south": {"uv": [4, 2, 8, 3], "texture": "#1"},
            				"west": {"uv": [4, 2, 6, 3], "rotation": 270, "texture": "#1"},
            				"up": {"uv": [4, 2, 8, 3], "texture": "#1"},
            				"down": {"uv": [4, 2, 8, 3], "rotation": 180, "texture": "#1"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [1, 2.25, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"thirdperson_lefthand": {
            			"translation": [1, 2.25, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_righthand": {
            			"translation": [1, 3, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_lefthand": {
            			"translation": [1, 3, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"ground": {
            			"translation": [0, 1.5, 0],
            			"scale": [0.33, 0.33, 0.33]
            		},
            		"gui": {
            			"rotation": [20, -45, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"fixed": {
            			"rotation": [-180, 0, -180],
            			"translation": [0, 0, 1],
            			"scale": [0.5, 0.5, 0.5]
            		}
            	}
            }
            """;

    public static String FLIPUP_HALFCABINET_LEFT = """
            {
            	"format_version": "1.21.6",
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		"1": "LEG_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
            		{
            			"from": [0, 0, 0],
            			"to": [1, 16, 7],
            			"rotation": {"angle": 0, "axis": "y", "origin": [0.5, 8, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"east": {"uv": [0, 0, 7, 16], "texture": "#1"},
            				"south": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"west": {"uv": [0, 0, 7, 16], "texture": "#1"},
            				"up": {"uv": [0, 0, 1, 7], "texture": "#1"},
            				"down": {"uv": [0, 0, 1, 7], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 0, 0],
            			"to": [16, 1, 7],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 0.5, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 7, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 7, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 15, 7], "texture": "#1"},
            				"down": {"uv": [0, 0, 15, 7], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 7, 1],
            			"to": [16, 8, 7],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 7.5, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 7, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 7, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 15, 6], "texture": "#1"},
            				"down": {"uv": [0, 0, 15, 6], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 1, 0],
            			"to": [16, 15, 2],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 1]},
            			"faces": {
            				"north": {"uv": [0, 0, 15, 14], "texture": "#1"},
            				"east": {"uv": [0, 0, 2, 14], "texture": "#1"},
            				"south": {"uv": [0, 0, 15, 14], "texture": "#1"},
            				"west": {"uv": [0, 0, 2, 14], "texture": "#1"},
            				"up": {"uv": [0, 0, 14, 2], "texture": "#1"},
            				"down": {"uv": [0, 0, 14, 2], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 15, 0],
            			"to": [16, 16, 7],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 15.5, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 7, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 7, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 15, 7], "texture": "#1"},
            				"down": {"uv": [0, 0, 15, 7], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 1, 6.5],
            			"to": [16, 15, 7.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 7]},
            			"faces": {
            				"north": {"uv": [0, 0, 15, 14], "texture": "#0"},
            				"east": {"uv": [0, 0, 1, 14], "texture": "#0"},
            				"south": {"uv": [0, 0, 15, 14], "texture": "#0"},
            				"west": {"uv": [0, 0, 1, 14], "texture": "#0"},
            				"up": {"uv": [0, 0, 14, 1], "texture": "#0"},
            				"down": {"uv": [0, 0, 14, 1], "texture": "#0"}
            			}
            		},
            		{
            			"from": [12, 2, 6],
            			"to": [16, 3, 8],
            			"rotation": {"angle": 0, "axis": "y", "origin": [13, 1, 6]},
            			"faces": {
            				"north": {"uv": [4, 2, 8, 3], "texture": "#1"},
            				"east": {"uv": [4, 2, 6, 3], "texture": "#1"},
            				"south": {"uv": [4, 2, 8, 3], "texture": "#1"},
            				"west": {"uv": [4, 2, 6, 3], "texture": "#1"},
            				"up": {"uv": [4, 2, 8, 4], "texture": "#1"},
            				"down": {"uv": [4, 2, 8, 4], "texture": "#1"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [1, 2.25, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"thirdperson_lefthand": {
            			"translation": [1, 2.25, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_righthand": {
            			"translation": [1, 3, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_lefthand": {
            			"translation": [1, 3, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"ground": {
            			"translation": [0, 1.5, 0],
            			"scale": [0.33, 0.33, 0.33]
            		},
            		"gui": {
            			"rotation": [20, -45, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"fixed": {
            			"rotation": [-180, 0, -180],
            			"translation": [0, 0, 1],
            			"scale": [0.5, 0.5, 0.5]
            		}
            	}
            }
            """;

    public static String FLIPUP_HALFCABINET_LEFT_OPEN = """
            {
            	"format_version": "1.21.6",
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		"1": "LEG_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
            		{
            			"from": [0, 0, 0],
            			"to": [1, 16, 7],
            			"rotation": {"angle": 0, "axis": "y", "origin": [0.5, 8, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"east": {"uv": [0, 0, 7, 16], "texture": "#1"},
            				"south": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"west": {"uv": [0, 0, 7, 16], "texture": "#1"},
            				"up": {"uv": [0, 0, 1, 7], "texture": "#1"},
            				"down": {"uv": [0, 0, 1, 7], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 0, 0],
            			"to": [16, 1, 7],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 0.5, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 7, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 7, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 15, 7], "texture": "#1"},
            				"down": {"uv": [0, 0, 15, 7], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 7, 1],
            			"to": [16, 8, 7],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 7.5, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 6, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 6, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 15, 6], "texture": "#1"},
            				"down": {"uv": [0, 0, 15, 6], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 1, 0],
            			"to": [16, 15, 2],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 1]},
            			"faces": {
            				"north": {"uv": [0, 0, 15, 14], "texture": "#1"},
            				"east": {"uv": [0, 0, 2, 14], "texture": "#1"},
            				"south": {"uv": [0, 0, 15, 14], "texture": "#1"},
            				"west": {"uv": [0, 0, 2, 14], "texture": "#1"},
            				"up": {"uv": [0, 0, 14, 2], "texture": "#1"},
            				"down": {"uv": [0, 0, 14, 2], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 15, 0],
            			"to": [16, 16, 7],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 15.5, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 7, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 7, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 15, 7], "texture": "#1"},
            				"down": {"uv": [0, 0, 15, 7], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 14, 6.25],
            			"to": [16, 15, 20.25],
            			"rotation": {"angle": 0, "axis": "x", "origin": [8, 14.5, 16]},
            			"faces": {
            				"north": {"uv": [0, 0, 15, 1], "rotation": 180, "texture": "#0"},
            				"east": {"uv": [0, 0, 1, 14], "rotation": 90, "texture": "#0"},
            				"south": {"uv": [0, 0, 15, 1], "texture": "#0"},
            				"west": {"uv": [0, 0, 1, 14], "rotation": 270, "texture": "#0"},
            				"up": {"uv": [0, 0, 15, 14], "texture": "#0"},
            				"down": {"uv": [0, 0, 15, 14], "rotation": 180, "texture": "#0"}
            			}
            		},
            		{
            			"from": [12, 14.5, 18.25],
            			"to": [16, 15.5, 19.25],
            			"rotation": {"angle": 0, "axis": "x", "origin": [14, 14.5, 16]},
            			"faces": {
            				"north": {"uv": [4, 2, 8, 3], "rotation": 180, "texture": "#1"},
            				"east": {"uv": [4, 2, 6, 3], "rotation": 90, "texture": "#1"},
            				"south": {"uv": [4, 2, 8, 3], "texture": "#1"},
            				"west": {"uv": [4, 2, 6, 3], "rotation": 270, "texture": "#1"},
            				"up": {"uv": [4, 2, 8, 3], "texture": "#1"},
            				"down": {"uv": [4, 2, 8, 3], "rotation": 180, "texture": "#1"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [1, 2.25, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"thirdperson_lefthand": {
            			"translation": [1, 2.25, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_righthand": {
            			"translation": [1, 3, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_lefthand": {
            			"translation": [1, 3, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"ground": {
            			"translation": [0, 1.5, 0],
            			"scale": [0.33, 0.33, 0.33]
            		},
            		"gui": {
            			"rotation": [20, -45, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"fixed": {
            			"rotation": [-180, 0, -180],
            			"translation": [0, 0, 1],
            			"scale": [0.5, 0.5, 0.5]
            		}
            	}
            }
            """;

    public static String FLIPDOWN_HALFCABINET = """
            {
            	"format_version": "1.21.6",
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		"1": "LEG_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
            		{
            			"from": [0, 0, 0],
            			"to": [1, 16, 7],
            			"rotation": {"angle": 0, "axis": "y", "origin": [0.5, 8, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"east": {"uv": [0, 0, 7, 16], "texture": "#1"},
            				"south": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"west": {"uv": [0, 0, 7, 16], "texture": "#1"},
            				"up": {"uv": [0, 0, 1, 7], "texture": "#1"},
            				"down": {"uv": [0, 0, 1, 7], "texture": "#1"}
            			}
            		},
            		{
            			"from": [15, 0, 0],
            			"to": [16, 16, 7],
            			"rotation": {"angle": 0, "axis": "y", "origin": [15.5, 8, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"east": {"uv": [0, 0, 7, 16], "texture": "#1"},
            				"south": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"west": {"uv": [0, 0, 7, 16], "texture": "#1"},
            				"up": {"uv": [0, 0, 1, 7], "texture": "#1"},
            				"down": {"uv": [0, 0, 1, 7], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 0, 0],
            			"to": [15, 1, 7],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 0.5, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 7, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 7, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 14, 7], "texture": "#1"},
            				"down": {"uv": [0, 0, 14, 7], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 7, 1],
            			"to": [15, 8, 7],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 7.5, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 6, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 6, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 14, 6], "texture": "#1"},
            				"down": {"uv": [0, 0, 14, 6], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 1, 0],
            			"to": [15, 15, 2],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 1]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 14], "texture": "#1"},
            				"east": {"uv": [0, 0, 2, 14], "texture": "#1"},
            				"south": {"uv": [0, 0, 14, 14], "texture": "#1"},
            				"west": {"uv": [0, 0, 2, 14], "texture": "#1"},
            				"up": {"uv": [0, 0, 14, 2], "texture": "#1"},
            				"down": {"uv": [0, 0, 14, 2], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 15, 0],
            			"to": [15, 16, 7],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 15.5, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 7, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 7, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 14, 7], "texture": "#1"},
            				"down": {"uv": [0, 0, 14, 7], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 1, 6.5],
            			"to": [15, 15, 7.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 7]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 14], "texture": "#0"},
            				"east": {"uv": [0, 0, 1, 14], "texture": "#0"},
            				"south": {"uv": [0, 0, 14, 14], "texture": "#0"},
            				"west": {"uv": [0, 0, 1, 14], "texture": "#0"},
            				"up": {"uv": [0, 0, 14, 1], "texture": "#0"},
            				"down": {"uv": [0, 0, 14, 1], "texture": "#0"}
            			}
            		},
            		{
            			"from": [6, 13, 6],
            			"to": [10, 14, 8],
            			"rotation": {"angle": 0, "axis": "y", "origin": [7, 12, 6]},
            			"faces": {
            				"north": {"uv": [4, 2, 8, 3], "texture": "#1"},
            				"east": {"uv": [4, 2, 6, 3], "texture": "#1"},
            				"south": {"uv": [4, 2, 8, 3], "texture": "#1"},
            				"west": {"uv": [4, 2, 6, 3], "texture": "#1"},
            				"up": {"uv": [4, 2, 8, 4], "texture": "#1"},
            				"down": {"uv": [4, 2, 8, 4], "texture": "#1"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [1, 2.25, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"thirdperson_lefthand": {
            			"translation": [1, 2.25, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_righthand": {
            			"translation": [1, 3, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_lefthand": {
            			"translation": [1, 3, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"ground": {
            			"translation": [0, 1.5, 0],
            			"scale": [0.33, 0.33, 0.33]
            		},
            		"gui": {
            			"rotation": [20, -45, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"fixed": {
            			"rotation": [-180, 0, -180],
            			"translation": [0, 0, 1],
            			"scale": [0.5, 0.5, 0.5]
            		}
            	}
            }
            """;

    public static String FLIPDOWN_HALFCABINET_OPEN = """
            {
            	"format_version": "1.21.6",
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		"1": "LEG_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
            		{
            			"from": [0, 0, 0],
            			"to": [1, 16, 7],
            			"rotation": {"angle": 0, "axis": "y", "origin": [0.5, 8, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"east": {"uv": [0, 0, 7, 16], "texture": "#1"},
            				"south": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"west": {"uv": [0, 0, 7, 16], "texture": "#1"},
            				"up": {"uv": [0, 0, 1, 7], "texture": "#1"},
            				"down": {"uv": [0, 0, 1, 7], "texture": "#1"}
            			}
            		},
            		{
            			"from": [15, 0, 0],
            			"to": [16, 16, 7],
            			"rotation": {"angle": 0, "axis": "y", "origin": [15.5, 8, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"east": {"uv": [0, 0, 7, 16], "texture": "#1"},
            				"south": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"west": {"uv": [0, 0, 7, 16], "texture": "#1"},
            				"up": {"uv": [0, 0, 1, 7], "texture": "#1"},
            				"down": {"uv": [0, 0, 1, 7], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 0, 0],
            			"to": [15, 1, 7],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 0.5, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 7, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 7, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 14, 7], "texture": "#1"},
            				"down": {"uv": [0, 0, 14, 7], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 7, 1],
            			"to": [15, 8, 7],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 7.5, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 6, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 6, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 14, 6], "texture": "#1"},
            				"down": {"uv": [0, 0, 14, 6], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 1, 0],
            			"to": [15, 15, 2],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 1]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 14], "texture": "#1"},
            				"east": {"uv": [0, 0, 2, 14], "texture": "#1"},
            				"south": {"uv": [0, 0, 14, 14], "texture": "#1"},
            				"west": {"uv": [0, 0, 2, 14], "texture": "#1"},
            				"up": {"uv": [0, 0, 14, 2], "texture": "#1"},
            				"down": {"uv": [0, 0, 14, 2], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 15, 0],
            			"to": [15, 16, 7],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 15.5, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 7, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 7, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 14, 7], "texture": "#1"},
            				"down": {"uv": [0, 0, 14, 7], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 1, 6],
            			"to": [15, 2, 20],
            			"rotation": {"angle": 0, "axis": "x", "origin": [8, 1.25, 15.75]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 1], "rotation": 180, "texture": "#0"},
            				"east": {"uv": [0, 0, 1, 14], "rotation": 270, "texture": "#0"},
            				"south": {"uv": [0, 0, 14, 1], "texture": "#0"},
            				"west": {"uv": [0, 0, 1, 14], "rotation": 90, "texture": "#0"},
            				"up": {"uv": [0, 0, 14, 14], "rotation": 180, "texture": "#0"},
            				"down": {"uv": [0, 0, 14, 14], "texture": "#0"}
            			}
            		},
            		{
            			"from": [6, 0.5, 18],
            			"to": [10, 1.5, 19],
            			"rotation": {"angle": 0, "axis": "x", "origin": [8, 1.25, 15.75]},
            			"faces": {
            				"north": {"uv": [4, 2, 8, 3], "rotation": 180, "texture": "#1"},
            				"east": {"uv": [4, 2, 6, 3], "rotation": 270, "texture": "#1"},
            				"south": {"uv": [4, 2, 8, 3], "texture": "#1"},
            				"west": {"uv": [4, 2, 6, 3], "rotation": 90, "texture": "#1"},
            				"up": {"uv": [4, 2, 8, 3], "rotation": 180, "texture": "#1"},
            				"down": {"uv": [4, 2, 8, 3], "texture": "#1"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [1, 2.25, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"thirdperson_lefthand": {
            			"translation": [1, 2.25, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_righthand": {
            			"translation": [1, 3, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_lefthand": {
            			"translation": [1, 3, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"ground": {
            			"translation": [0, 1.5, 0],
            			"scale": [0.33, 0.33, 0.33]
            		},
            		"gui": {
            			"rotation": [20, -45, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"fixed": {
            			"rotation": [-180, 0, -180],
            			"translation": [0, 0, 1],
            			"scale": [0.5, 0.5, 0.5]
            		}
            	}
            }
            """;

    public static String FLIPDOWN_HALFCABINET_RIGHT = """
            {
            	"format_version": "1.21.6",
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		"1": "LEG_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
            		{
            			"from": [15, 0, 0],
            			"to": [16, 16, 7],
            			"rotation": {"angle": 0, "axis": "y", "origin": [15.5, 8, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"east": {"uv": [0, 0, 7, 16], "texture": "#1"},
            				"south": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"west": {"uv": [0, 0, 7, 16], "texture": "#1"},
            				"up": {"uv": [0, 0, 1, 7], "texture": "#1"},
            				"down": {"uv": [0, 0, 1, 7], "texture": "#1"}
            			}
            		},
            		{
            			"from": [0, 0, 0],
            			"to": [15, 1, 7],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 0.5, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 7, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 7, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 15, 7], "texture": "#1"},
            				"down": {"uv": [0, 0, 15, 7], "texture": "#1"}
            			}
            		},
            		{
            			"from": [0, 7, 1],
            			"to": [15, 8, 7],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 7.5, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 6, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 6, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 15, 6], "texture": "#1"},
            				"down": {"uv": [0, 0, 15, 6], "texture": "#1"}
            			}
            		},
            		{
            			"from": [0, 1, 0],
            			"to": [15, 15, 2],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 1]},
            			"faces": {
            				"north": {"uv": [0, 0, 15, 14], "texture": "#1"},
            				"east": {"uv": [0, 0, 2, 14], "texture": "#1"},
            				"south": {"uv": [0, 0, 15, 14], "texture": "#1"},
            				"west": {"uv": [0, 0, 2, 14], "texture": "#1"},
            				"up": {"uv": [0, 0, 15, 2], "texture": "#1"},
            				"down": {"uv": [0, 0, 15, 2], "texture": "#1"}
            			}
            		},
            		{
            			"from": [0, 15, 0],
            			"to": [15, 16, 7],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 15.5, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 7, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 7, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 15, 7], "texture": "#1"},
            				"down": {"uv": [0, 0, 15, 7], "texture": "#1"}
            			}
            		},
            		{
            			"from": [0, 1, 6.5],
            			"to": [15, 15, 7.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 7]},
            			"faces": {
            				"north": {"uv": [0, 0, 15, 14], "texture": "#0"},
            				"east": {"uv": [0, 0, 1, 14], "texture": "#0"},
            				"south": {"uv": [0, 0, 15, 14], "texture": "#0"},
            				"west": {"uv": [0, 0, 1, 14], "texture": "#0"},
            				"up": {"uv": [0, 0, 15, 1], "texture": "#0"},
            				"down": {"uv": [0, 0, 15, 1], "texture": "#0"}
            			}
            		},
            		{
            			"from": [0, 13, 6],
            			"to": [4, 14, 8],
            			"rotation": {"angle": 0, "axis": "y", "origin": [1, 12, 6]},
            			"faces": {
            				"north": {"uv": [4, 2, 8, 3], "texture": "#1"},
            				"east": {"uv": [4, 2, 6, 3], "texture": "#1"},
            				"south": {"uv": [4, 2, 8, 3], "texture": "#1"},
            				"west": {"uv": [4, 2, 6, 3], "texture": "#1"},
            				"up": {"uv": [4, 2, 8, 4], "texture": "#1"},
            				"down": {"uv": [4, 2, 8, 4], "texture": "#1"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [1, 2.25, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"thirdperson_lefthand": {
            			"translation": [1, 2.25, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_righthand": {
            			"translation": [1, 3, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_lefthand": {
            			"translation": [1, 3, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"ground": {
            			"translation": [0, 1.5, 0],
            			"scale": [0.33, 0.33, 0.33]
            		},
            		"gui": {
            			"rotation": [20, -45, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"fixed": {
            			"rotation": [-180, 0, -180],
            			"translation": [0, 0, 1],
            			"scale": [0.5, 0.5, 0.5]
            		}
            	}
            }
            """;

    public static String FLIPDOWN_HALFCABINET_RIGHT_OPEN = """
            {
            	"format_version": "1.21.6",
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		"1": "LEG_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
            		{
            			"from": [15, 0, 0],
            			"to": [16, 16, 7],
            			"rotation": {"angle": 0, "axis": "y", "origin": [15.5, 8, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"east": {"uv": [0, 0, 7, 16], "texture": "#1"},
            				"south": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"west": {"uv": [0, 0, 7, 16], "texture": "#1"},
            				"up": {"uv": [0, 0, 1, 7], "texture": "#1"},
            				"down": {"uv": [0, 0, 1, 7], "texture": "#1"}
            			}
            		},
            		{
            			"from": [0, 0, 0],
            			"to": [15, 1, 7],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 0.5, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 7, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 7, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 15, 7], "texture": "#1"},
            				"down": {"uv": [0, 0, 15, 7], "texture": "#1"}
            			}
            		},
            		{
            			"from": [0, 7, 1],
            			"to": [15, 8, 7],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 7.5, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 6, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 6, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 15, 6], "texture": "#1"},
            				"down": {"uv": [0, 0, 15, 6], "texture": "#1"}
            			}
            		},
            		{
            			"from": [0, 1, 0],
            			"to": [15, 15, 2],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 1]},
            			"faces": {
            				"north": {"uv": [0, 0, 15, 14], "texture": "#1"},
            				"east": {"uv": [0, 0, 2, 14], "texture": "#1"},
            				"south": {"uv": [0, 0, 15, 14], "texture": "#1"},
            				"west": {"uv": [0, 0, 2, 14], "texture": "#1"},
            				"up": {"uv": [0, 0, 15, 2], "texture": "#1"},
            				"down": {"uv": [0, 0, 15, 2], "texture": "#1"}
            			}
            		},
            		{
            			"from": [0, 15, 0],
            			"to": [15, 16, 7],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 15.5, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 7, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 7, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 15, 7], "texture": "#1"},
            				"down": {"uv": [0, 0, 15, 7], "texture": "#1"}
            			}
            		},
            		{
            			"from": [0, 1, 6],
            			"to": [15, 2, 20],
            			"rotation": {"angle": 0, "axis": "x", "origin": [8, 1.25, 15.75]},
            			"faces": {
            				"north": {"uv": [0, 0, 15, 1], "rotation": 180, "texture": "#0"},
            				"east": {"uv": [0, 0, 1, 14], "rotation": 270, "texture": "#0"},
            				"south": {"uv": [0, 0, 15, 1], "texture": "#0"},
            				"west": {"uv": [0, 0, 1, 14], "rotation": 90, "texture": "#0"},
            				"up": {"uv": [0, 0, 15, 14], "rotation": 180, "texture": "#0"},
            				"down": {"uv": [0, 0, 15, 14], "texture": "#0"}
            			}
            		},
            		{
            			"from": [0, 0.5, 18],
            			"to": [4, 1.5, 19],
            			"rotation": {"angle": 0, "axis": "x", "origin": [2, 1.25, 15.75]},
            			"faces": {
            				"north": {"uv": [4, 2, 8, 3], "rotation": 180, "texture": "#1"},
            				"east": {"uv": [4, 2, 6, 3], "rotation": 270, "texture": "#1"},
            				"south": {"uv": [4, 2, 8, 3], "texture": "#1"},
            				"west": {"uv": [4, 2, 6, 3], "rotation": 90, "texture": "#1"},
            				"up": {"uv": [4, 2, 8, 3], "rotation": 180, "texture": "#1"},
            				"down": {"uv": [4, 2, 8, 3], "texture": "#1"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [1, 2.25, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"thirdperson_lefthand": {
            			"translation": [1, 2.25, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_righthand": {
            			"translation": [1, 3, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_lefthand": {
            			"translation": [1, 3, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"ground": {
            			"translation": [0, 1.5, 0],
            			"scale": [0.33, 0.33, 0.33]
            		},
            		"gui": {
            			"rotation": [20, -45, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"fixed": {
            			"rotation": [-180, 0, -180],
            			"translation": [0, 0, 1],
            			"scale": [0.5, 0.5, 0.5]
            		}
            	}
            }
            """;

    public static String FLIPDOWN_HALFCABINET_LEFT = """
            {
            	"format_version": "1.21.6",
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		"1": "LEG_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
            		{
            			"from": [0, 0, 0],
            			"to": [1, 16, 7],
            			"rotation": {"angle": 0, "axis": "y", "origin": [0.5, 8, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"east": {"uv": [0, 0, 7, 16], "texture": "#1"},
            				"south": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"west": {"uv": [0, 0, 7, 16], "texture": "#1"},
            				"up": {"uv": [0, 0, 1, 7], "texture": "#1"},
            				"down": {"uv": [0, 0, 1, 7], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 0, 0],
            			"to": [16, 1, 7],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 0.5, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 7, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 7, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 15, 7], "texture": "#1"},
            				"down": {"uv": [0, 0, 15, 7], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 7, 1],
            			"to": [16, 8, 7],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 7.5, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 6, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 6, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 15, 6], "texture": "#1"},
            				"down": {"uv": [0, 0, 15, 6], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 1, 0],
            			"to": [16, 15, 2],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 1]},
            			"faces": {
            				"north": {"uv": [0, 0, 15, 14], "texture": "#1"},
            				"east": {"uv": [0, 0, 2, 14], "texture": "#1"},
            				"south": {"uv": [0, 0, 15, 14], "texture": "#1"},
            				"west": {"uv": [0, 0, 2, 14], "texture": "#1"},
            				"up": {"uv": [0, 0, 15, 2], "texture": "#1"},
            				"down": {"uv": [0, 0, 15, 2], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 15, 0],
            			"to": [16, 16, 7],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 15.5, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 7, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 7, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 15, 7], "texture": "#1"},
            				"down": {"uv": [0, 0, 15, 7], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 1, 6.5],
            			"to": [16, 15, 7.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 7]},
            			"faces": {
            				"north": {"uv": [0, 0, 15, 14], "texture": "#0"},
            				"east": {"uv": [0, 0, 1, 14], "texture": "#0"},
            				"south": {"uv": [0, 0, 15, 14], "texture": "#0"},
            				"west": {"uv": [0, 0, 1, 14], "texture": "#0"},
            				"up": {"uv": [0, 0, 15, 1], "texture": "#0"},
            				"down": {"uv": [0, 0, 15, 1], "texture": "#0"}
            			}
            		},
            		{
            			"from": [12, 13, 6],
            			"to": [16, 14, 8],
            			"rotation": {"angle": 0, "axis": "y", "origin": [13, 12, 6]},
            			"faces": {
            				"north": {"uv": [4, 2, 8, 3], "texture": "#1"},
            				"east": {"uv": [4, 2, 6, 3], "texture": "#1"},
            				"south": {"uv": [4, 2, 8, 3], "texture": "#1"},
            				"west": {"uv": [4, 2, 6, 3], "texture": "#1"},
            				"up": {"uv": [4, 2, 8, 4], "texture": "#1"},
            				"down": {"uv": [4, 2, 8, 4], "texture": "#1"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [1, 2.25, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"thirdperson_lefthand": {
            			"translation": [1, 2.25, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_righthand": {
            			"translation": [1, 3, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_lefthand": {
            			"translation": [1, 3, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"ground": {
            			"translation": [0, 1.5, 0],
            			"scale": [0.33, 0.33, 0.33]
            		},
            		"gui": {
            			"rotation": [20, -45, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"fixed": {
            			"rotation": [-180, 0, -180],
            			"translation": [0, 0, 1],
            			"scale": [0.5, 0.5, 0.5]
            		}
            	}
            }
            """;

    public static String FLIPDOWN_HALFCABINET_LEFT_OPEN = """
            {
            	"format_version": "1.21.6",
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		"1": "LEG_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
            		{
            			"from": [0, 0, 0],
            			"to": [1, 16, 7],
            			"rotation": {"angle": 0, "axis": "y", "origin": [0.5, 8, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"east": {"uv": [0, 0, 7, 16], "texture": "#1"},
            				"south": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"west": {"uv": [0, 0, 7, 16], "texture": "#1"},
            				"up": {"uv": [0, 0, 1, 7], "texture": "#1"},
            				"down": {"uv": [0, 0, 1, 7], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 0, 0],
            			"to": [16, 1, 7],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 0.5, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 7, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 7, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 15, 7], "texture": "#1"},
            				"down": {"uv": [0, 0, 15, 7], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 7, 1],
            			"to": [16, 8, 7],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 7.5, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 6, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 6, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 15, 6], "texture": "#1"},
            				"down": {"uv": [0, 0, 15, 6], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 1, 0],
            			"to": [16, 15, 2],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 1]},
            			"faces": {
            				"north": {"uv": [0, 0, 15, 14], "texture": "#1"},
            				"east": {"uv": [0, 0, 2, 14], "texture": "#1"},
            				"south": {"uv": [0, 0, 15, 14], "texture": "#1"},
            				"west": {"uv": [0, 0, 2, 14], "texture": "#1"},
            				"up": {"uv": [0, 0, 15, 2], "texture": "#1"},
            				"down": {"uv": [0, 0, 15, 2], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 15, 0],
            			"to": [16, 16, 7],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 15.5, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 7, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 7, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 14, 7], "texture": "#1"},
            				"down": {"uv": [0, 0, 14, 7], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 1, 6],
            			"to": [16, 2, 20],
            			"rotation": {"angle": 0, "axis": "x", "origin": [8, 1.25, 15.75]},
            			"faces": {
            				"north": {"uv": [0, 0, 15, 1], "rotation": 180, "texture": "#0"},
            				"east": {"uv": [0, 0, 1, 14], "rotation": 270, "texture": "#0"},
            				"south": {"uv": [0, 0, 15, 1], "texture": "#0"},
            				"west": {"uv": [0, 0, 1, 14], "rotation": 90, "texture": "#0"},
            				"up": {"uv": [0, 0, 15, 14], "rotation": 180, "texture": "#0"},
            				"down": {"uv": [0, 0, 15, 14], "texture": "#0"}
            			}
            		},
            		{
            			"from": [12, 0.5, 18],
            			"to": [16, 1.5, 19],
            			"rotation": {"angle": 0, "axis": "x", "origin": [14, 1.25, 15.75]},
            			"faces": {
            				"north": {"uv": [4, 2, 8, 3], "rotation": 180, "texture": "#1"},
            				"east": {"uv": [4, 2, 6, 3], "rotation": 270, "texture": "#1"},
            				"south": {"uv": [4, 2, 8, 3], "texture": "#1"},
            				"west": {"uv": [4, 2, 6, 3], "rotation": 90, "texture": "#1"},
            				"up": {"uv": [4, 2, 8, 3], "rotation": 180, "texture": "#1"},
            				"down": {"uv": [4, 2, 8, 3], "texture": "#1"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [1, 2.25, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"thirdperson_lefthand": {
            			"translation": [1, 2.25, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_righthand": {
            			"translation": [1, 3, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_lefthand": {
            			"translation": [1, 3, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"ground": {
            			"translation": [0, 1.5, 0],
            			"scale": [0.33, 0.33, 0.33]
            		},
            		"gui": {
            			"rotation": [20, -45, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"fixed": {
            			"rotation": [-180, 0, -180],
            			"translation": [0, 0, 1],
            			"scale": [0.5, 0.5, 0.5]
            		}
            	}
            }
            """;

    public static String HALFCUPBOARD_RIGHT = """
            {
            	"format_version": "1.21.6",
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		"1": "LEG_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
            		{
            			"from": [0, 0, 0],
            			"to": [1, 16, 7],
            			"rotation": {"angle": 0, "axis": "y", "origin": [0.5, 8, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"east": {"uv": [0, 0, 7, 16], "texture": "#1"},
            				"south": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"west": {"uv": [0, 0, 7, 16], "texture": "#1"},
            				"up": {"uv": [0, 0, 1, 7], "texture": "#1"},
            				"down": {"uv": [0, 0, 1, 7], "texture": "#1"}
            			}
            		},
            		{
            			"from": [15, 0, 0],
            			"to": [16, 16, 7],
            			"rotation": {"angle": 0, "axis": "y", "origin": [15.5, 8, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"east": {"uv": [0, 0, 7, 16], "texture": "#1"},
            				"south": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"west": {"uv": [0, 0, 7, 16], "texture": "#1"},
            				"up": {"uv": [0, 0, 1, 7], "texture": "#1"},
            				"down": {"uv": [0, 0, 1, 7], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 0, 0],
            			"to": [15, 1, 7],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 0.5, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 7, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 7, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 14, 7], "texture": "#1"},
            				"down": {"uv": [0, 0, 14, 7], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 7, 1],
            			"to": [15, 8, 7],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 7.5, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 6, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 6, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 14, 6], "texture": "#1"},
            				"down": {"uv": [0, 0, 14, 6], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 1, 0],
            			"to": [15, 15, 2],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 1]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 14], "texture": "#1"},
            				"east": {"uv": [0, 0, 2, 14], "texture": "#1"},
            				"south": {"uv": [0, 0, 14, 14], "texture": "#1"},
            				"west": {"uv": [0, 0, 2, 14], "texture": "#1"},
            				"up": {"uv": [0, 0, 14, 2], "texture": "#1"},
            				"down": {"uv": [0, 0, 14, 2], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 15, 0],
            			"to": [15, 16, 7],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 15.5, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 7, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 7, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 14, 7], "texture": "#1"},
            				"down": {"uv": [0, 0, 14, 7], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 1, 6.5],
            			"to": [15, 15, 7.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 7]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 14], "texture": "#0"},
            				"east": {"uv": [0, 0, 1, 14], "texture": "#0"},
            				"south": {"uv": [0, 0, 14, 14], "texture": "#0"},
            				"west": {"uv": [0, 0, 1, 14], "texture": "#0"},
            				"up": {"uv": [0, 0, 14, 1], "texture": "#0"},
            				"down": {"uv": [0, 0, 14, 1], "texture": "#0"}
            			}
            		},
            		{
            			"from": [1.5, 5.5, 7],
            			"to": [2.5, 9.5, 8],
            			"rotation": {"angle": 0, "axis": "y", "origin": [2, 7, 7.5]},
            			"faces": {
            				"north": {"uv": [5, 0, 6, 4], "texture": "#1"},
            				"east": {"uv": [5, 0, 6, 4], "texture": "#1"},
            				"south": {"uv": [5, 0, 6, 4], "texture": "#1"},
            				"west": {"uv": [5, 0, 6, 4], "texture": "#1"},
            				"up": {"uv": [5, 0, 6, 1], "texture": "#1"},
            				"down": {"uv": [5, 0, 6, 1], "texture": "#1"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [1, 2.25, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"thirdperson_lefthand": {
            			"translation": [1, 2.25, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_righthand": {
            			"translation": [1, 3, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_lefthand": {
            			"translation": [1, 3, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"ground": {
            			"translation": [0, 1.5, 0],
            			"scale": [0.33, 0.33, 0.33]
            		},
            		"gui": {
            			"rotation": [20, -45, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"fixed": {
            			"rotation": [-180, 0, -180],
            			"translation": [0, 0, 1],
            			"scale": [0.5, 0.5, 0.5]
            		}
            	}
            }
            """;

    public static String HALFCUPBOARD_LEFT = """
            {
            	"format_version": "1.21.6",
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		"1": "LEG_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
            		{
            			"from": [0, 0, 0],
            			"to": [1, 16, 7],
            			"rotation": {"angle": 0, "axis": "y", "origin": [0.5, 8, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"east": {"uv": [0, 0, 7, 16], "texture": "#1"},
            				"south": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"west": {"uv": [0, 0, 7, 16], "texture": "#1"},
            				"up": {"uv": [0, 0, 1, 7], "texture": "#1"},
            				"down": {"uv": [0, 0, 1, 7], "texture": "#1"}
            			}
            		},
            		{
            			"from": [15, 0, 0],
            			"to": [16, 16, 7],
            			"rotation": {"angle": 0, "axis": "y", "origin": [15.5, 8, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"east": {"uv": [0, 0, 7, 16], "texture": "#1"},
            				"south": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"west": {"uv": [0, 0, 7, 16], "texture": "#1"},
            				"up": {"uv": [0, 0, 1, 7], "texture": "#1"},
            				"down": {"uv": [0, 0, 1, 7], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 0, 0],
            			"to": [15, 1, 7],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 0.5, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 7, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 7, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 14, 7], "texture": "#1"},
            				"down": {"uv": [0, 0, 14, 7], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 7, 1],
            			"to": [15, 8, 7],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 7.5, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 6, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 6, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 14, 6], "texture": "#1"},
            				"down": {"uv": [0, 0, 14, 6], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 1, 0],
            			"to": [15, 15, 2],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 1]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 14], "texture": "#1"},
            				"east": {"uv": [0, 0, 2, 14], "texture": "#1"},
            				"south": {"uv": [0, 0, 14, 14], "texture": "#1"},
            				"west": {"uv": [0, 0, 2, 14], "texture": "#1"},
            				"up": {"uv": [0, 0, 14, 2], "texture": "#1"},
            				"down": {"uv": [0, 0, 14, 2], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 15, 0],
            			"to": [15, 16, 7],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 15.5, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 7, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 7, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 14, 7], "texture": "#1"},
            				"down": {"uv": [0, 0, 14, 7], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 1, 6.5],
            			"to": [15, 15, 7.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 7]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 14], "texture": "#0"},
            				"east": {"uv": [0, 0, 1, 14], "texture": "#0"},
            				"south": {"uv": [0, 0, 14, 14], "texture": "#0"},
            				"west": {"uv": [0, 0, 1, 14], "texture": "#0"},
            				"up": {"uv": [0, 0, 14, 1], "texture": "#0"},
            				"down": {"uv": [0, 0, 14, 1], "texture": "#0"}
            			}
            		},
            		{
            			"from": [13.5, 5.5, 7],
            			"to": [14.5, 9.5, 8],
            			"rotation": {"angle": 0, "axis": "y", "origin": [14, 7, 7.5]},
            			"faces": {
            				"north": {"uv": [6, 0, 5, 4], "texture": "#1"},
            				"east": {"uv": [6, 0, 5, 4], "texture": "#1"},
            				"south": {"uv": [6, 0, 5, 4], "texture": "#1"},
            				"west": {"uv": [6, 0, 5, 4], "texture": "#1"},
            				"up": {"uv": [6, 0, 5, 1], "texture": "#1"},
            				"down": {"uv": [6, 0, 5, 1], "texture": "#1"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [1, 2.25, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"thirdperson_lefthand": {
            			"translation": [1, 2.25, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_righthand": {
            			"translation": [1, 3, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_lefthand": {
            			"translation": [1, 3, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"ground": {
            			"translation": [0, 1.5, 0],
            			"scale": [0.33, 0.33, 0.33]
            		},
            		"gui": {
            			"rotation": [20, -45, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"fixed": {
            			"rotation": [-180, 0, -180],
            			"translation": [0, 0, 1],
            			"scale": [0.5, 0.5, 0.5]
            		}
            	}
            }
            """;

    public static String HALFCUPBOARD_CENTER = """
            {
            	"format_version": "1.21.6",
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		"1": "LEG_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
            		{
            			"from": [0, 0, 0],
            			"to": [1, 16, 7],
            			"rotation": {"angle": 0, "axis": "y", "origin": [0.5, 8, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"east": {"uv": [0, 0, 7, 16], "texture": "#1"},
            				"south": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"west": {"uv": [0, 0, 7, 16], "texture": "#1"},
            				"up": {"uv": [0, 0, 1, 7], "texture": "#1"},
            				"down": {"uv": [0, 0, 1, 7], "texture": "#1"}
            			}
            		},
            		{
            			"from": [15, 0, 0],
            			"to": [16, 16, 7],
            			"rotation": {"angle": 0, "axis": "y", "origin": [15.5, 8, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"east": {"uv": [0, 0, 7, 16], "texture": "#1"},
            				"south": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"west": {"uv": [0, 0, 7, 16], "texture": "#1"},
            				"up": {"uv": [0, 0, 1, 7], "texture": "#1"},
            				"down": {"uv": [0, 0, 1, 7], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 7, 1],
            			"to": [15, 8, 7],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 7.5, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 6, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 6, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 14, 6], "texture": "#1"},
            				"down": {"uv": [0, 0, 14, 6], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 0, 0],
            			"to": [15, 15, 2],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 1]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 15], "texture": "#1"},
            				"east": {"uv": [0, 0, 2, 15], "texture": "#1"},
            				"south": {"uv": [0, 0, 14, 15], "texture": "#1"},
            				"west": {"uv": [0, 0, 2, 15], "texture": "#1"},
            				"up": {"uv": [0, 0, 14, 2], "texture": "#1"},
            				"down": {"uv": [0, 0, 14, 2], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 14.99, 0],
            			"to": [15, 15.99, 7],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 15.5, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 7, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 7, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 14, 7], "texture": "#1"},
            				"down": {"uv": [0, 0, 14, 7], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 0, 6.5],
            			"to": [15, 16, 7.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 7]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 16], "texture": "#0"},
            				"east": {"uv": [0, 0, 1, 16], "texture": "#0"},
            				"south": {"uv": [0, 0, 14, 16], "texture": "#0"},
            				"west": {"uv": [0, 0, 1, 16], "texture": "#0"},
            				"up": {"uv": [0, 0, 14, 1], "texture": "#0"},
            				"down": {"uv": [0, 0, 14, 1], "texture": "#0"}
            			}
            		},
            		{
            			"from": [1.5, 0, 7],
            			"to": [2.5, 16, 8],
            			"rotation": {"angle": 0, "axis": "y", "origin": [2, 7, 7.5]},
            			"faces": {
            				"north": {"uv": [5, 0, 6, 16], "texture": "#1"},
            				"east": {"uv": [5, 0, 6, 16], "texture": "#1"},
            				"south": {"uv": [5, 0, 6, 16], "texture": "#1"},
            				"west": {"uv": [5, 0, 6, 16], "texture": "#1"},
            				"up": {"uv": [5, 0, 6, 1], "texture": "#1"},
            				"down": {"uv": [5, 0, 6, 1], "texture": "#1"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [1, 2.25, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"thirdperson_lefthand": {
            			"translation": [1, 2.25, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_righthand": {
            			"translation": [1, 3, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_lefthand": {
            			"translation": [1, 3, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"ground": {
            			"translation": [0, 1.5, 0],
            			"scale": [0.33, 0.33, 0.33]
            		},
            		"gui": {
            			"rotation": [20, -45, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"fixed": {
            			"rotation": [-180, 0, -180],
            			"translation": [0, 0, 1],
            			"scale": [0.5, 0.5, 0.5]
            		}
            	}
            }
            """;

    public static String HALFCUPBOARD_UP = """
            {
            	"format_version": "1.21.6",
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		"1": "LEG_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
            		{
            			"from": [0, 0, 0],
            			"to": [1, 16, 7],
            			"rotation": {"angle": 0, "axis": "y", "origin": [0.5, 8, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"east": {"uv": [0, 0, 7, 16], "texture": "#1"},
            				"south": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"west": {"uv": [0, 0, 7, 16], "texture": "#1"},
            				"up": {"uv": [0, 0, 1, 7], "texture": "#1"},
            				"down": {"uv": [0, 0, 1, 7], "texture": "#1"}
            			}
            		},
            		{
            			"from": [15, 0, 0],
            			"to": [16, 16, 7],
            			"rotation": {"angle": 0, "axis": "y", "origin": [15.5, 8, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"east": {"uv": [0, 0, 7, 16], "texture": "#1"},
            				"south": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"west": {"uv": [0, 0, 7, 16], "texture": "#1"},
            				"up": {"uv": [0, 0, 1, 7], "texture": "#1"},
            				"down": {"uv": [0, 0, 1, 7], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 7, 1],
            			"to": [15, 8, 7],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 7.5, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 6, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 6, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 14, 6], "texture": "#1"},
            				"down": {"uv": [0, 0, 14, 6], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 0, 0],
            			"to": [15, 15, 2],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 1]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 15], "texture": "#1"},
            				"east": {"uv": [0, 0, 2, 15], "texture": "#1"},
            				"south": {"uv": [0, 0, 14, 15], "texture": "#1"},
            				"west": {"uv": [0, 0, 2, 15], "texture": "#1"},
            				"up": {"uv": [0, 0, 14, 2], "texture": "#1"},
            				"down": {"uv": [0, 0, 14, 2], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 15, 0],
            			"to": [15, 16, 7],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 15.5, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 7, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 7, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 14, 7], "texture": "#1"},
            				"down": {"uv": [0, 0, 14, 7], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 0, 6.5],
            			"to": [15, 15, 7.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 7]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 15], "texture": "#0"},
            				"east": {"uv": [0, 0, 1, 15], "texture": "#0"},
            				"south": {"uv": [0, 0, 14, 15], "texture": "#0"},
            				"west": {"uv": [0, 0, 1, 15], "texture": "#0"},
            				"up": {"uv": [0, 0, 14, 1], "texture": "#0"},
            				"down": {"uv": [0, 0, 14, 1], "texture": "#0"}
            			}
            		},
            		{
            			"from": [1.5, 0, 7],
            			"to": [2.5, 4, 8],
            			"rotation": {"angle": 0, "axis": "y", "origin": [2, 1.5, 7.5]},
            			"faces": {
            				"north": {"uv": [5, 0, 6, 4], "texture": "#1"},
            				"east": {"uv": [5, 0, 6, 4], "texture": "#1"},
            				"south": {"uv": [5, 0, 6, 4], "texture": "#1"},
            				"west": {"uv": [5, 0, 6, 4], "texture": "#1"},
            				"up": {"uv": [5, 0, 6, 1], "texture": "#1"},
            				"down": {"uv": [5, 0, 6, 1], "texture": "#1"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [1, 2.25, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"thirdperson_lefthand": {
            			"translation": [1, 2.25, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_righthand": {
            			"translation": [1, 3, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_lefthand": {
            			"translation": [1, 3, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"ground": {
            			"translation": [0, 1.5, 0],
            			"scale": [0.33, 0.33, 0.33]
            		},
            		"gui": {
            			"rotation": [20, -45, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"fixed": {
            			"rotation": [-180, 0, -180],
            			"translation": [0, 0, 1],
            			"scale": [0.5, 0.5, 0.5]
            		}
            	}
            }
            """;

    public static String HALFCUPBOARD_DOWN = """
            {
            	"format_version": "1.21.6",
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		"1": "LEG_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
            		{
            			"from": [0, 0, 0],
            			"to": [1, 16, 7],
            			"rotation": {"angle": 0, "axis": "y", "origin": [0.5, 8, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"east": {"uv": [0, 0, 7, 16], "texture": "#1"},
            				"south": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"west": {"uv": [0, 0, 7, 16], "texture": "#1"},
            				"up": {"uv": [0, 0, 1, 7], "texture": "#1"},
            				"down": {"uv": [0, 0, 1, 7], "texture": "#1"}
            			}
            		},
            		{
            			"from": [15, 0, 0],
            			"to": [16, 16, 7],
            			"rotation": {"angle": 0, "axis": "y", "origin": [15.5, 8, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"east": {"uv": [0, 0, 7, 16], "texture": "#1"},
            				"south": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"west": {"uv": [0, 0, 7, 16], "texture": "#1"},
            				"up": {"uv": [0, 0, 1, 7], "texture": "#1"},
            				"down": {"uv": [0, 0, 1, 7], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 0, 0],
            			"to": [15, 1, 7],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 0.5, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 7, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 7, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 14, 7], "texture": "#1"},
            				"down": {"uv": [0, 0, 14, 7], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 7, 1],
            			"to": [15, 8, 7],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 7.5, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 6, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 6, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 14, 6], "texture": "#1"},
            				"down": {"uv": [0, 0, 14, 6], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 1, 0],
            			"to": [15, 15, 2],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 1]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 14], "texture": "#1"},
            				"east": {"uv": [0, 0, 2, 14], "texture": "#1"},
            				"south": {"uv": [0, 0, 14, 14], "texture": "#1"},
            				"west": {"uv": [0, 0, 2, 14], "texture": "#1"},
            				"up": {"uv": [0, 0, 14, 2], "texture": "#1"},
            				"down": {"uv": [0, 0, 14, 2], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 14.99, 0],
            			"to": [15, 15.99, 7],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 15.5, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 7, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 7, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 14, 7], "texture": "#1"},
            				"down": {"uv": [0, 0, 14, 7], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 1, 6.5],
            			"to": [15, 16, 7.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 7]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 15], "texture": "#0"},
            				"east": {"uv": [0, 0, 1, 15], "texture": "#0"},
            				"south": {"uv": [0, 0, 14, 15], "texture": "#0"},
            				"west": {"uv": [0, 0, 1, 15], "texture": "#0"},
            				"up": {"uv": [0, 0, 14, 1], "texture": "#0"},
            				"down": {"uv": [0, 0, 14, 1], "texture": "#0"}
            			}
            		},
            		{
            			"from": [1.5, 12, 7],
            			"to": [2.5, 16, 8],
            			"rotation": {"angle": 0, "axis": "y", "origin": [2, 13.5, 7.5]},
            			"faces": {
            				"north": {"uv": [5, 0, 6, 4], "texture": "#1"},
            				"east": {"uv": [5, 0, 6, 4], "texture": "#1"},
            				"south": {"uv": [5, 0, 6, 4], "texture": "#1"},
            				"west": {"uv": [5, 0, 6, 4], "texture": "#1"},
            				"up": {"uv": [5, 0, 6, 1], "texture": "#1"},
            				"down": {"uv": [5, 0, 6, 1], "texture": "#1"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [1, 2.25, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"thirdperson_lefthand": {
            			"translation": [1, 2.25, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_righthand": {
            			"translation": [1, 3, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_lefthand": {
            			"translation": [1, 3, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"ground": {
            			"translation": [0, 1.5, 0],
            			"scale": [0.33, 0.33, 0.33]
            		},
            		"gui": {
            			"rotation": [20, -45, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"fixed": {
            			"rotation": [-180, 0, -180],
            			"translation": [0, 0, 1],
            			"scale": [0.5, 0.5, 0.5]
            		}
            	}
            }
            """;

    public static String HALFCUPBOARD_RIGHT_OPEN = """
            {
            	"format_version": "1.21.6",
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		"1": "LEG_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
            		{
            			"from": [0, 0, 0],
            			"to": [1, 16, 7],
            			"rotation": {"angle": 0, "axis": "y", "origin": [0.5, 8, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"east": {"uv": [0, 0, 7, 16], "texture": "#1"},
            				"south": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"west": {"uv": [0, 0, 7, 16], "texture": "#1"},
            				"up": {"uv": [0, 0, 1, 7], "texture": "#1"},
            				"down": {"uv": [0, 0, 1, 7], "texture": "#1"}
            			}
            		},
            		{
            			"from": [15, 0, 0],
            			"to": [16, 16, 7],
            			"rotation": {"angle": 0, "axis": "y", "origin": [15.5, 8, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"east": {"uv": [0, 0, 7, 16], "texture": "#1"},
            				"south": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"west": {"uv": [0, 0, 7, 16], "texture": "#1"},
            				"up": {"uv": [0, 0, 1, 7], "texture": "#1"},
            				"down": {"uv": [0, 0, 1, 7], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 0, 0],
            			"to": [15, 1, 7],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 0.5, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 7, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 7, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 14, 7], "texture": "#1"},
            				"down": {"uv": [0, 0, 14, 7], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 7, 1],
            			"to": [15, 8, 7],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 7.5, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 6, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 6, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 14, 6], "texture": "#1"},
            				"down": {"uv": [0, 0, 14, 6], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 1, 0],
            			"to": [15, 15, 2],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 1]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 14], "texture": "#1"},
            				"east": {"uv": [0, 0, 2, 14], "texture": "#1"},
            				"south": {"uv": [0, 0, 14, 14], "texture": "#1"},
            				"west": {"uv": [0, 0, 2, 14], "texture": "#1"},
            				"up": {"uv": [0, 0, 14, 2], "texture": "#1"},
            				"down": {"uv": [0, 0, 14, 2], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 15, 0],
            			"to": [15, 16, 7],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 15.5, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 7, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 7, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 14, 7], "texture": "#1"},
            				"down": {"uv": [0, 0, 14, 7], "texture": "#1"}
            			}
            		},
            		{
            			"from": [14.25, 1, 6.25],
            			"to": [15.25, 15, 20.25],
            			"rotation": {"angle": 0, "axis": "y", "origin": [15, 8.75, 16.25]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 14], "texture": "#0"},
            				"east": {"uv": [0, 0, 14, 14], "texture": "#0"},
            				"south": {"uv": [0, 0, 1, 14], "texture": "#0"},
            				"west": {"uv": [0, 0, 14, 14], "texture": "#0"},
            				"up": {"uv": [0, 0, 14, 1], "rotation": 270, "texture": "#0"},
            				"down": {"uv": [0, 0, 14, 1], "rotation": 90, "texture": "#0"}
            			}
            		},
            		{
            			"from": [14.75, 5.5, 18.75],
            			"to": [15.75, 9.5, 19.75],
            			"rotation": {"angle": 0, "axis": "y", "origin": [15, 6.75, 16.25]},
            			"faces": {
            				"north": {"uv": [5, 0, 6, 4], "texture": "#1"},
            				"east": {"uv": [5, 0, 6, 4], "texture": "#1"},
            				"south": {"uv": [5, 0, 6, 4], "texture": "#1"},
            				"west": {"uv": [5, 0, 6, 4], "texture": "#1"},
            				"up": {"uv": [5, 0, 6, 1], "rotation": 270, "texture": "#1"},
            				"down": {"uv": [5, 0, 6, 1], "rotation": 90, "texture": "#1"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [1, 2.25, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"thirdperson_lefthand": {
            			"translation": [1, 2.25, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_righthand": {
            			"translation": [1, 3, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_lefthand": {
            			"translation": [1, 3, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"ground": {
            			"translation": [0, 1.5, 0],
            			"scale": [0.33, 0.33, 0.33]
            		},
            		"gui": {
            			"rotation": [20, -45, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"fixed": {
            			"rotation": [-180, 0, -180],
            			"translation": [0, 0, 1],
            			"scale": [0.5, 0.5, 0.5]
            		}
            	}
            }
            """;

    public static String HALFCUPBOARD_LEFT_OPEN = """
            {
            	"format_version": "1.21.6",
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		"1": "LEG_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
            		{
            			"from": [0, 0, 0],
            			"to": [1, 16, 7],
            			"rotation": {"angle": 0, "axis": "y", "origin": [0.5, 8, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"east": {"uv": [0, 0, 7, 16], "texture": "#1"},
            				"south": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"west": {"uv": [0, 0, 7, 16], "texture": "#1"},
            				"up": {"uv": [0, 0, 1, 7], "texture": "#1"},
            				"down": {"uv": [0, 0, 1, 7], "texture": "#1"}
            			}
            		},
            		{
            			"from": [15, 0, 0],
            			"to": [16, 16, 7],
            			"rotation": {"angle": 0, "axis": "y", "origin": [15.5, 8, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"east": {"uv": [0, 0, 7, 16], "texture": "#1"},
            				"south": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"west": {"uv": [0, 0, 7, 16], "texture": "#1"},
            				"up": {"uv": [0, 0, 1, 7], "texture": "#1"},
            				"down": {"uv": [0, 0, 1, 7], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 0, 0],
            			"to": [15, 1, 7],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 0.5, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 7, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 7, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 14, 7], "texture": "#1"},
            				"down": {"uv": [0, 0, 14, 7], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 7, 1],
            			"to": [15, 8, 7],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 7.5, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 6, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 6, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 14, 6], "texture": "#1"},
            				"down": {"uv": [0, 0, 14, 6], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 1, 0],
            			"to": [15, 15, 2],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 1]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 14], "texture": "#1"},
            				"east": {"uv": [0, 0, 2, 14], "texture": "#1"},
            				"south": {"uv": [0, 0, 14, 14], "texture": "#1"},
            				"west": {"uv": [0, 0, 2, 14], "texture": "#1"},
            				"up": {"uv": [0, 0, 14, 2], "texture": "#1"},
            				"down": {"uv": [0, 0, 14, 2], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 15, 0],
            			"to": [15, 16, 7],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 15.5, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 7, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 7, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 14, 7], "texture": "#1"},
            				"down": {"uv": [0, 0, 14, 7], "texture": "#1"}
            			}
            		},
            		{
            			"from": [0.75, 1, 6.25],
            			"to": [1.75, 15, 20.25],
            			"rotation": {"angle": 0, "axis": "y", "origin": [1, 8.75, 16.25]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 14], "texture": "#0"},
            				"east": {"uv": [0, 0, 14, 14], "texture": "#0"},
            				"south": {"uv": [0, 0, 1, 14], "texture": "#0"},
            				"west": {"uv": [0, 0, 14, 14], "texture": "#0"},
            				"up": {"uv": [0, 0, 14, 1], "rotation": 90, "texture": "#0"},
            				"down": {"uv": [0, 0, 14, 1], "rotation": 270, "texture": "#0"}
            			}
            		},
            		{
            			"from": [0.25, 5.5, 18.75],
            			"to": [1.25, 9.5, 19.75],
            			"rotation": {"angle": 0, "axis": "y", "origin": [1, 6.75, 16.25]},
            			"faces": {
            				"north": {"uv": [6, 0, 5, 4], "texture": "#1"},
            				"east": {"uv": [6, 0, 5, 4], "texture": "#1"},
            				"south": {"uv": [6, 0, 5, 4], "texture": "#1"},
            				"west": {"uv": [6, 0, 5, 4], "texture": "#1"},
            				"up": {"uv": [6, 0, 5, 1], "rotation": 90, "texture": "#1"},
            				"down": {"uv": [6, 0, 5, 1], "rotation": 270, "texture": "#1"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [1, 2.25, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"thirdperson_lefthand": {
            			"translation": [1, 2.25, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_righthand": {
            			"translation": [1, 3, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_lefthand": {
            			"translation": [1, 3, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"ground": {
            			"translation": [0, 1.5, 0],
            			"scale": [0.33, 0.33, 0.33]
            		},
            		"gui": {
            			"rotation": [20, -45, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"fixed": {
            			"rotation": [-180, 0, -180],
            			"translation": [0, 0, 1],
            			"scale": [0.5, 0.5, 0.5]
            		}
            	}
            }
            """;

    public static String HALFCUPBOARD_CENTER_OPEN = """
            {
            	"format_version": "1.21.6",
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		"1": "LEG_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
            		{
            			"from": [0, 0, 0],
            			"to": [1, 16, 7],
            			"rotation": {"angle": 0, "axis": "y", "origin": [0.5, 8, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"east": {"uv": [0, 0, 7, 16], "texture": "#1"},
            				"south": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"west": {"uv": [0, 0, 7, 16], "texture": "#1"},
            				"up": {"uv": [0, 0, 1, 7], "texture": "#1"},
            				"down": {"uv": [0, 0, 1, 7], "texture": "#1"}
            			}
            		},
            		{
            			"from": [15, 0, 0],
            			"to": [16, 16, 7],
            			"rotation": {"angle": 0, "axis": "y", "origin": [15.5, 8, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"east": {"uv": [0, 0, 7, 16], "texture": "#1"},
            				"south": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"west": {"uv": [0, 0, 7, 16], "texture": "#1"},
            				"up": {"uv": [0, 0, 1, 7], "texture": "#1"},
            				"down": {"uv": [0, 0, 1, 7], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 7, 1],
            			"to": [15, 8, 7],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 7.5, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 6, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 6, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 14, 6], "texture": "#1"},
            				"down": {"uv": [0, 0, 14, 6], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 0, 0],
            			"to": [15, 15, 2],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 1]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 15], "texture": "#1"},
            				"east": {"uv": [0, 0, 2, 15], "texture": "#1"},
            				"south": {"uv": [0, 0, 14, 15], "texture": "#1"},
            				"west": {"uv": [0, 0, 2, 15], "texture": "#1"},
            				"up": {"uv": [0, 0, 14, 2], "texture": "#1"},
            				"down": {"uv": [0, 0, 14, 2], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 14.99, 0],
            			"to": [15, 15.99, 7],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 15.5, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 7, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 7, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 14, 7], "texture": "#1"},
            				"down": {"uv": [0, 0, 14, 7], "texture": "#1"}
            			}
            		},
            		{
            			"from": [14.25, 0, 6.25],
            			"to": [15.25, 16, 20.25],
            			"rotation": {"angle": 0, "axis": "y", "origin": [15, 8.75, 16.25]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 16], "texture": "#0"},
            				"east": {"uv": [0, 0, 14, 16], "texture": "#0"},
            				"south": {"uv": [0, 0, 1, 16], "texture": "#0"},
            				"west": {"uv": [0, 0, 14, 16], "texture": "#0"},
            				"up": {"uv": [0, 0, 14, 1], "rotation": 270, "texture": "#0"},
            				"down": {"uv": [0, 0, 14, 1], "rotation": 90, "texture": "#0"}
            			}
            		},
            		{
            			"from": [14.75, 0, 18.75],
            			"to": [15.75, 16, 19.75],
            			"rotation": {"angle": 0, "axis": "y", "origin": [15, 6.75, 16.25]},
            			"faces": {
            				"north": {"uv": [5, 0, 6, 16], "texture": "#1"},
            				"east": {"uv": [5, 0, 6, 16], "texture": "#1"},
            				"south": {"uv": [5, 0, 6, 16], "texture": "#1"},
            				"west": {"uv": [5, 0, 6, 16], "texture": "#1"},
            				"up": {"uv": [5, 0, 6, 1], "rotation": 270, "texture": "#1"},
            				"down": {"uv": [5, 0, 6, 1], "rotation": 90, "texture": "#1"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [1, 2.25, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"thirdperson_lefthand": {
            			"translation": [1, 2.25, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_righthand": {
            			"translation": [1, 3, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_lefthand": {
            			"translation": [1, 3, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"ground": {
            			"translation": [0, 1.5, 0],
            			"scale": [0.33, 0.33, 0.33]
            		},
            		"gui": {
            			"rotation": [20, -45, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"fixed": {
            			"rotation": [-180, 0, -180],
            			"translation": [0, 0, 1],
            			"scale": [0.5, 0.5, 0.5]
            		}
            	}
            }
            """;

    public static String HALFCUPBOARD_UP_OPEN = """
            {
            	"format_version": "1.21.6",
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		"1": "LEG_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
            		{
            			"from": [0, 0, 0],
            			"to": [1, 16, 7],
            			"rotation": {"angle": 0, "axis": "y", "origin": [0.5, 8, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"east": {"uv": [0, 0, 7, 16], "texture": "#1"},
            				"south": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"west": {"uv": [0, 0, 7, 16], "texture": "#1"},
            				"up": {"uv": [0, 0, 1, 7], "texture": "#1"},
            				"down": {"uv": [0, 0, 1, 7], "texture": "#1"}
            			}
            		},
            		{
            			"from": [15, 0, 0],
            			"to": [16, 16, 7],
            			"rotation": {"angle": 0, "axis": "y", "origin": [15.5, 8, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"east": {"uv": [0, 0, 7, 16], "texture": "#1"},
            				"south": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"west": {"uv": [0, 0, 7, 16], "texture": "#1"},
            				"up": {"uv": [0, 0, 1, 7], "texture": "#1"},
            				"down": {"uv": [0, 0, 1, 7], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 7, 1],
            			"to": [15, 8, 7],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 7.5, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 6, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 6, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 14, 6], "texture": "#1"},
            				"down": {"uv": [0, 0, 14, 6], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 0, 0],
            			"to": [15, 15, 2],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 1]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 15], "texture": "#1"},
            				"east": {"uv": [0, 0, 2, 15], "texture": "#1"},
            				"south": {"uv": [0, 0, 14, 15], "texture": "#1"},
            				"west": {"uv": [0, 0, 2, 15], "texture": "#1"},
            				"up": {"uv": [0, 0, 14, 2], "texture": "#1"},
            				"down": {"uv": [0, 0, 14, 2], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 15, 0],
            			"to": [15, 16, 7],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 15.5, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 7, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 7, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 14, 7], "texture": "#1"},
            				"down": {"uv": [0, 0, 14, 7], "texture": "#1"}
            			}
            		},
            		{
            			"from": [14.25, 0, 6.25],
            			"to": [15.25, 15, 20.25],
            			"rotation": {"angle": 0, "axis": "y", "origin": [15, 8.75, 16.25]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 15], "texture": "#0"},
            				"east": {"uv": [0, 0, 14, 15], "texture": "#0"},
            				"south": {"uv": [0, 0, 1, 15], "texture": "#0"},
            				"west": {"uv": [0, 0, 14, 15], "texture": "#0"},
            				"up": {"uv": [0, 0, 14, 1], "rotation": 270, "texture": "#0"},
            				"down": {"uv": [0, 0, 14, 1], "rotation": 90, "texture": "#0"}
            			}
            		},
            		{
            			"from": [14.75, 0, 18.75],
            			"to": [15.75, 4, 19.75],
            			"rotation": {"angle": 0, "axis": "y", "origin": [15, 1.25, 16.25]},
            			"faces": {
            				"north": {"uv": [5, 0, 6, 4], "texture": "#1"},
            				"east": {"uv": [5, 0, 6, 4], "texture": "#1"},
            				"south": {"uv": [5, 0, 6, 4], "texture": "#1"},
            				"west": {"uv": [5, 0, 6, 4], "texture": "#1"},
            				"up": {"uv": [5, 0, 6, 1], "rotation": 270, "texture": "#1"},
            				"down": {"uv": [5, 0, 6, 1], "rotation": 90, "texture": "#1"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [1, 2.25, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"thirdperson_lefthand": {
            			"translation": [1, 2.25, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_righthand": {
            			"translation": [1, 3, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_lefthand": {
            			"translation": [1, 3, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"ground": {
            			"translation": [0, 1.5, 0],
            			"scale": [0.33, 0.33, 0.33]
            		},
            		"gui": {
            			"rotation": [20, -45, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"fixed": {
            			"rotation": [-180, 0, -180],
            			"translation": [0, 0, 1],
            			"scale": [0.5, 0.5, 0.5]
            		}
            	}
            }
            """;

    public static String HALFCUPBOARD_DOWN_OPEN = """
            {
            	"format_version": "1.21.6",
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		"1": "LEG_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
            		{
            			"from": [0, 0, 0],
            			"to": [1, 16, 7],
            			"rotation": {"angle": 0, "axis": "y", "origin": [0.5, 8, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"east": {"uv": [0, 0, 7, 16], "texture": "#1"},
            				"south": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"west": {"uv": [0, 0, 7, 16], "texture": "#1"},
            				"up": {"uv": [0, 0, 1, 7], "texture": "#1"},
            				"down": {"uv": [0, 0, 1, 7], "texture": "#1"}
            			}
            		},
            		{
            			"from": [15, 0, 0],
            			"to": [16, 16, 7],
            			"rotation": {"angle": 0, "axis": "y", "origin": [15.5, 8, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"east": {"uv": [0, 0, 7, 16], "texture": "#1"},
            				"south": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"west": {"uv": [0, 0, 7, 16], "texture": "#1"},
            				"up": {"uv": [0, 0, 1, 7], "texture": "#1"},
            				"down": {"uv": [0, 0, 1, 7], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 0, 0],
            			"to": [15, 1, 7],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 0.5, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 7, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 7, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 14, 7], "texture": "#1"},
            				"down": {"uv": [0, 0, 14, 7], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 7, 1],
            			"to": [15, 8, 7],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 7.5, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 6, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 6, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 14, 6], "texture": "#1"},
            				"down": {"uv": [0, 0, 14, 6], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 1, 0],
            			"to": [15, 15, 2],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 1]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 14], "texture": "#1"},
            				"east": {"uv": [0, 0, 2, 14], "texture": "#1"},
            				"south": {"uv": [0, 0, 14, 14], "texture": "#1"},
            				"west": {"uv": [0, 0, 2, 14], "texture": "#1"},
            				"up": {"uv": [0, 0, 14, 2], "texture": "#1"},
            				"down": {"uv": [0, 0, 14, 2], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 14.99, 0],
            			"to": [15, 15.99, 7],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 15.5, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 7, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 7, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 14, 7], "texture": "#1"},
            				"down": {"uv": [0, 0, 14, 7], "texture": "#1"}
            			}
            		},
            		{
            			"from": [14.25, 1, 6.25],
            			"to": [15.25, 16, 20.25],
            			"rotation": {"angle": 0, "axis": "y", "origin": [15, 8.75, 16.25]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 15], "texture": "#0"},
            				"east": {"uv": [0, 0, 14, 15], "texture": "#0"},
            				"south": {"uv": [0, 0, 1, 15], "texture": "#0"},
            				"west": {"uv": [0, 0, 14, 15], "texture": "#0"},
            				"up": {"uv": [0, 0, 14, 1], "rotation": 270, "texture": "#0"},
            				"down": {"uv": [0, 0, 14, 1], "rotation": 90, "texture": "#0"}
            			}
            		},
            		{
            			"from": [14.75, 12, 18.75],
            			"to": [15.75, 16, 19.75],
            			"rotation": {"angle": 0, "axis": "y", "origin": [15, 13.25, 16.25]},
            			"faces": {
            				"north": {"uv": [5, 0, 6, 4], "texture": "#1"},
            				"east": {"uv": [5, 0, 6, 4], "texture": "#1"},
            				"south": {"uv": [5, 0, 6, 4], "texture": "#1"},
            				"west": {"uv": [5, 0, 6, 4], "texture": "#1"},
            				"up": {"uv": [5, 0, 6, 1], "rotation": 270, "texture": "#1"},
            				"down": {"uv": [5, 0, 6, 1], "rotation": 90, "texture": "#1"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [1, 2.25, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"thirdperson_lefthand": {
            			"translation": [1, 2.25, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_righthand": {
            			"translation": [1, 3, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_lefthand": {
            			"translation": [1, 3, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"ground": {
            			"translation": [0, 1.5, 0],
            			"scale": [0.33, 0.33, 0.33]
            		},
            		"gui": {
            			"rotation": [20, -45, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"fixed": {
            			"rotation": [-180, 0, -180],
            			"translation": [0, 0, 1],
            			"scale": [0.5, 0.5, 0.5]
            		}
            	}
            }
            """;

    public static String HALFCUPBOARD_CENTER_FLIPPED = """
            {
            	"format_version": "1.21.6",
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		"1": "LEG_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
            		{
            			"from": [0, 0, 0],
            			"to": [1, 16, 7],
            			"rotation": {"angle": 0, "axis": "y", "origin": [0.5, 8, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"east": {"uv": [0, 0, 7, 16], "texture": "#1"},
            				"south": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"west": {"uv": [0, 0, 7, 16], "texture": "#1"},
            				"up": {"uv": [0, 0, 1, 7], "texture": "#1"},
            				"down": {"uv": [0, 0, 1, 7], "texture": "#1"}
            			}
            		},
            		{
            			"from": [15, 0, 0],
            			"to": [16, 16, 7],
            			"rotation": {"angle": 0, "axis": "y", "origin": [15.5, 8, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"east": {"uv": [0, 0, 7, 16], "texture": "#1"},
            				"south": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"west": {"uv": [0, 0, 7, 16], "texture": "#1"},
            				"up": {"uv": [0, 0, 1, 7], "texture": "#1"},
            				"down": {"uv": [0, 0, 1, 7], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 7, 1],
            			"to": [15, 8, 7],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 7.5, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 6, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 6, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 14, 6], "texture": "#1"},
            				"down": {"uv": [0, 0, 14, 6], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 0, 0],
            			"to": [15, 15, 2],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 1]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 15], "texture": "#1"},
            				"east": {"uv": [0, 0, 2, 15], "texture": "#1"},
            				"south": {"uv": [0, 0, 14, 15], "texture": "#1"},
            				"west": {"uv": [0, 0, 2, 15], "texture": "#1"},
            				"up": {"uv": [0, 0, 14, 2], "texture": "#1"},
            				"down": {"uv": [0, 0, 14, 2], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 14.99, 0],
            			"to": [15, 15.99, 7],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 15.5, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 7, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 7, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 14, 7], "texture": "#1"},
            				"down": {"uv": [0, 0, 14, 7], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 0, 6.5],
            			"to": [15, 16, 7.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 7]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 16], "texture": "#0"},
            				"east": {"uv": [0, 0, 1, 16], "texture": "#0"},
            				"south": {"uv": [0, 0, 14, 16], "texture": "#0"},
            				"west": {"uv": [0, 0, 1, 16], "texture": "#0"},
            				"up": {"uv": [0, 0, 14, 1], "texture": "#0"},
            				"down": {"uv": [0, 0, 14, 1], "texture": "#0"}
            			}
            		},
            		{
            			"from": [13.5, 0, 7],
            			"to": [14.5, 16, 8],
            			"rotation": {"angle": 0, "axis": "y", "origin": [14, 7, 7.5]},
            			"faces": {
            				"north": {"uv": [6, 0, 5, 16], "texture": "#1"},
            				"east": {"uv": [6, 0, 5, 16], "texture": "#1"},
            				"south": {"uv": [6, 0, 5, 16], "texture": "#1"},
            				"west": {"uv": [6, 0, 5, 16], "texture": "#1"},
            				"up": {"uv": [6, 0, 5, 1], "texture": "#1"},
            				"down": {"uv": [6, 0, 5, 1], "texture": "#1"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [1, 2.25, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"thirdperson_lefthand": {
            			"translation": [1, 2.25, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_righthand": {
            			"translation": [1, 3, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_lefthand": {
            			"translation": [1, 3, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"ground": {
            			"translation": [0, 1.5, 0],
            			"scale": [0.33, 0.33, 0.33]
            		},
            		"gui": {
            			"rotation": [20, -45, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"fixed": {
            			"rotation": [-180, 0, -180],
            			"translation": [0, 0, 1],
            			"scale": [0.5, 0.5, 0.5]
            		}
            	}
            }
            """;

    public static String HALFCUPBOARD_UP_FLIPPED = """
            {
            	"format_version": "1.21.6",
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		"1": "LEG_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
            		{
            			"from": [0, 0, 0],
            			"to": [1, 16, 7],
            			"rotation": {"angle": 0, "axis": "y", "origin": [0.5, 8, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"east": {"uv": [0, 0, 7, 16], "texture": "#1"},
            				"south": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"west": {"uv": [0, 0, 7, 16], "texture": "#1"},
            				"up": {"uv": [0, 0, 1, 7], "texture": "#1"},
            				"down": {"uv": [0, 0, 1, 7], "texture": "#1"}
            			}
            		},
            		{
            			"from": [15, 0, 0],
            			"to": [16, 16, 7],
            			"rotation": {"angle": 0, "axis": "y", "origin": [15.5, 8, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"east": {"uv": [0, 0, 7, 16], "texture": "#1"},
            				"south": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"west": {"uv": [0, 0, 7, 16], "texture": "#1"},
            				"up": {"uv": [0, 0, 1, 7], "texture": "#1"},
            				"down": {"uv": [0, 0, 1, 7], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 7, 1],
            			"to": [15, 8, 7],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 7.5, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 6, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 6, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 14, 6], "texture": "#1"},
            				"down": {"uv": [0, 0, 14, 6], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 0, 0],
            			"to": [15, 15, 2],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 1]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 15], "texture": "#1"},
            				"east": {"uv": [0, 0, 2, 15], "texture": "#1"},
            				"south": {"uv": [0, 0, 14, 15], "texture": "#1"},
            				"west": {"uv": [0, 0, 2, 15], "texture": "#1"},
            				"up": {"uv": [0, 0, 14, 2], "texture": "#1"},
            				"down": {"uv": [0, 0, 14, 2], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 15, 0],
            			"to": [15, 16, 7],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 15.5, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 7, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 7, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 14, 7], "texture": "#1"},
            				"down": {"uv": [0, 0, 14, 7], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 0, 6.5],
            			"to": [15, 15, 7.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 7]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 15], "texture": "#0"},
            				"east": {"uv": [0, 0, 1, 15], "texture": "#0"},
            				"south": {"uv": [0, 0, 14, 15], "texture": "#0"},
            				"west": {"uv": [0, 0, 1, 15], "texture": "#0"},
            				"up": {"uv": [0, 0, 14, 1], "texture": "#0"},
            				"down": {"uv": [0, 0, 14, 1], "texture": "#0"}
            			}
            		},
            		{
            			"from": [13.5, 0, 7],
            			"to": [14.5, 4, 8],
            			"rotation": {"angle": 0, "axis": "y", "origin": [14, 1.5, 7.5]},
            			"faces": {
            				"north": {"uv": [6, 0, 5, 4], "texture": "#1"},
            				"east": {"uv": [6, 0, 5, 4], "texture": "#1"},
            				"south": {"uv": [6, 0, 5, 4], "texture": "#1"},
            				"west": {"uv": [6, 0, 5, 4], "texture": "#1"},
            				"up": {"uv": [6, 0, 5, 1], "texture": "#1"},
            				"down": {"uv": [6, 0, 5, 1], "texture": "#1"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [1, 2.25, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"thirdperson_lefthand": {
            			"translation": [1, 2.25, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_righthand": {
            			"translation": [1, 3, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_lefthand": {
            			"translation": [1, 3, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"ground": {
            			"translation": [0, 1.5, 0],
            			"scale": [0.33, 0.33, 0.33]
            		},
            		"gui": {
            			"rotation": [20, -45, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"fixed": {
            			"rotation": [-180, 0, -180],
            			"translation": [0, 0, 1],
            			"scale": [0.5, 0.5, 0.5]
            		}
            	}
            }
            """;

    public static String HALFCUPBOARD_DOWN_FLIPPED = """
            {
            	"format_version": "1.21.6",
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		"1": "LEG_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
            		{
            			"from": [0, 0, 0],
            			"to": [1, 16, 7],
            			"rotation": {"angle": 0, "axis": "y", "origin": [0.5, 8, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"east": {"uv": [0, 0, 7, 16], "texture": "#1"},
            				"south": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"west": {"uv": [0, 0, 7, 16], "texture": "#1"},
            				"up": {"uv": [0, 0, 1, 7], "texture": "#1"},
            				"down": {"uv": [0, 0, 1, 7], "texture": "#1"}
            			}
            		},
            		{
            			"from": [15, 0, 0],
            			"to": [16, 16, 7],
            			"rotation": {"angle": 0, "axis": "y", "origin": [15.5, 8, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"east": {"uv": [0, 0, 7, 16], "texture": "#1"},
            				"south": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"west": {"uv": [0, 0, 7, 16], "texture": "#1"},
            				"up": {"uv": [0, 0, 1, 7], "texture": "#1"},
            				"down": {"uv": [0, 0, 1, 7], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 0, 0],
            			"to": [15, 1, 7],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 0.5, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 7, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 7, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 14, 7], "texture": "#1"},
            				"down": {"uv": [0, 0, 14, 7], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 7, 1],
            			"to": [15, 8, 7],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 7.5, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 6, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 6, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 14, 6], "texture": "#1"},
            				"down": {"uv": [0, 0, 14, 6], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 1, 0],
            			"to": [15, 15, 2],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 1]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 14], "texture": "#1"},
            				"east": {"uv": [0, 0, 2, 14], "texture": "#1"},
            				"south": {"uv": [0, 0, 14, 14], "texture": "#1"},
            				"west": {"uv": [0, 0, 2, 14], "texture": "#1"},
            				"up": {"uv": [0, 0, 14, 2], "texture": "#1"},
            				"down": {"uv": [0, 0, 14, 2], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 14.99, 0],
            			"to": [15, 15.99, 7],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 15.5, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 7, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 7, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 14, 7], "texture": "#1"},
            				"down": {"uv": [0, 0, 14, 7], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 1, 6.5],
            			"to": [15, 16, 7.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 7]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 15], "texture": "#0"},
            				"east": {"uv": [0, 0, 1, 15], "texture": "#0"},
            				"south": {"uv": [0, 0, 14, 15], "texture": "#0"},
            				"west": {"uv": [0, 0, 1, 15], "texture": "#0"},
            				"up": {"uv": [0, 0, 14, 1], "texture": "#0"},
            				"down": {"uv": [0, 0, 14, 1], "texture": "#0"}
            			}
            		},
            		{
            			"from": [13.5, 12, 7],
            			"to": [14.5, 16, 8],
            			"rotation": {"angle": 0, "axis": "y", "origin": [14, 13.5, 7.5]},
            			"faces": {
            				"north": {"uv": [6, 0, 5, 4], "texture": "#1"},
            				"east": {"uv": [6, 0, 5, 4], "texture": "#1"},
            				"south": {"uv": [6, 0, 5, 4], "texture": "#1"},
            				"west": {"uv": [6, 0, 5, 4], "texture": "#1"},
            				"up": {"uv": [6, 0, 5, 1], "texture": "#1"},
            				"down": {"uv": [6, 0, 5, 1], "texture": "#1"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [1, 2.25, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"thirdperson_lefthand": {
            			"translation": [1, 2.25, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_righthand": {
            			"translation": [1, 3, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_lefthand": {
            			"translation": [1, 3, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"ground": {
            			"translation": [0, 1.5, 0],
            			"scale": [0.33, 0.33, 0.33]
            		},
            		"gui": {
            			"rotation": [20, -45, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"fixed": {
            			"rotation": [-180, 0, -180],
            			"translation": [0, 0, 1],
            			"scale": [0.5, 0.5, 0.5]
            		}
            	}
            }
            """;

    public static String HALFCUPBOARD_CENTER_OPEN_FLIPPED = """
            {
            	"format_version": "1.21.6",
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		"1": "LEG_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
            		{
            			"from": [0, 0, 0],
            			"to": [1, 16, 7],
            			"rotation": {"angle": 0, "axis": "y", "origin": [0.5, 8, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"east": {"uv": [0, 0, 7, 16], "texture": "#1"},
            				"south": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"west": {"uv": [0, 0, 7, 16], "texture": "#1"},
            				"up": {"uv": [0, 0, 1, 7], "texture": "#1"},
            				"down": {"uv": [0, 0, 1, 7], "texture": "#1"}
            			}
            		},
            		{
            			"from": [15, 0, 0],
            			"to": [16, 16, 7],
            			"rotation": {"angle": 0, "axis": "y", "origin": [15.5, 8, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"east": {"uv": [0, 0, 7, 16], "texture": "#1"},
            				"south": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"west": {"uv": [0, 0, 7, 16], "texture": "#1"},
            				"up": {"uv": [0, 0, 1, 7], "texture": "#1"},
            				"down": {"uv": [0, 0, 1, 7], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 7, 1],
            			"to": [15, 8, 7],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 7.5, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 6, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 6, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 14, 6], "texture": "#1"},
            				"down": {"uv": [0, 0, 14, 6], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 0, 0],
            			"to": [15, 15, 2],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 1]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 15], "texture": "#1"},
            				"east": {"uv": [0, 0, 2, 15], "texture": "#1"},
            				"south": {"uv": [0, 0, 14, 15], "texture": "#1"},
            				"west": {"uv": [0, 0, 2, 15], "texture": "#1"},
            				"up": {"uv": [0, 0, 14, 2], "texture": "#1"},
            				"down": {"uv": [0, 0, 14, 2], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 14.99, 0],
            			"to": [15, 15.99, 7],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 15.5, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 7, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 7, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 14, 7], "texture": "#1"},
            				"down": {"uv": [0, 0, 14, 7], "texture": "#1"}
            			}
            		},
            		{
            			"from": [0.75, 0, 6.25],
            			"to": [1.75, 16, 20.25],
            			"rotation": {"angle": 0, "axis": "y", "origin": [1, 8.75, 16.25]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 16], "texture": "#0"},
            				"east": {"uv": [0, 0, 14, 16], "texture": "#0"},
            				"south": {"uv": [0, 0, 1, 16], "texture": "#0"},
            				"west": {"uv": [0, 0, 14, 16], "texture": "#0"},
            				"up": {"uv": [0, 0, 14, 1], "rotation": 90, "texture": "#0"},
            				"down": {"uv": [0, 0, 14, 1], "rotation": 270, "texture": "#0"}
            			}
            		},
            		{
            			"from": [0.25, 0, 18.75],
            			"to": [1.25, 16, 19.75],
            			"rotation": {"angle": 0, "axis": "y", "origin": [1, 6.75, 16.25]},
            			"faces": {
            				"north": {"uv": [6, 0, 5, 16], "texture": "#1"},
            				"east": {"uv": [6, 0, 5, 16], "texture": "#1"},
            				"south": {"uv": [6, 0, 5, 16], "texture": "#1"},
            				"west": {"uv": [6, 0, 5, 16], "texture": "#1"},
            				"up": {"uv": [6, 0, 5, 1], "rotation": 90, "texture": "#1"},
            				"down": {"uv": [6, 0, 5, 1], "rotation": 270, "texture": "#1"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [1, 2.25, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"thirdperson_lefthand": {
            			"translation": [1, 2.25, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_righthand": {
            			"translation": [1, 3, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_lefthand": {
            			"translation": [1, 3, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"ground": {
            			"translation": [0, 1.5, 0],
            			"scale": [0.33, 0.33, 0.33]
            		},
            		"gui": {
            			"rotation": [20, -45, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"fixed": {
            			"rotation": [-180, 0, -180],
            			"translation": [0, 0, 1],
            			"scale": [0.5, 0.5, 0.5]
            		}
            	}
            }
            """;

    public static String HALFCUPBOARD_UP_OPEN_FLIPPED = """
            {
            	"format_version": "1.21.6",
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		"1": "LEG_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
            		{
            			"from": [0, 0, 0],
            			"to": [1, 16, 7],
            			"rotation": {"angle": 0, "axis": "y", "origin": [0.5, 8, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"east": {"uv": [0, 0, 7, 16], "texture": "#1"},
            				"south": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"west": {"uv": [0, 0, 7, 16], "texture": "#1"},
            				"up": {"uv": [0, 0, 1, 7], "texture": "#1"},
            				"down": {"uv": [0, 0, 1, 7], "texture": "#1"}
            			}
            		},
            		{
            			"from": [15, 0, 0],
            			"to": [16, 16, 7],
            			"rotation": {"angle": 0, "axis": "y", "origin": [15.5, 8, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"east": {"uv": [0, 0, 7, 16], "texture": "#1"},
            				"south": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"west": {"uv": [0, 0, 7, 16], "texture": "#1"},
            				"up": {"uv": [0, 0, 1, 7], "texture": "#1"},
            				"down": {"uv": [0, 0, 1, 7], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 7, 1],
            			"to": [15, 8, 7],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 7.5, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 6, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 6, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 14, 6], "texture": "#1"},
            				"down": {"uv": [0, 0, 14, 6], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 0, 0],
            			"to": [15, 15, 2],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 1]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 15], "texture": "#1"},
            				"east": {"uv": [0, 0, 2, 15], "texture": "#1"},
            				"south": {"uv": [0, 0, 14, 15], "texture": "#1"},
            				"west": {"uv": [0, 0, 2, 15], "texture": "#1"},
            				"up": {"uv": [0, 0, 14, 2], "texture": "#1"},
            				"down": {"uv": [0, 0, 14, 2], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 15, 0],
            			"to": [15, 16, 7],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 15.5, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 7, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 7, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 14, 7], "texture": "#1"},
            				"down": {"uv": [0, 0, 14, 7], "texture": "#1"}
            			}
            		},
            		{
            			"from": [0.75, 0, 6.25],
            			"to": [1.75, 15, 20.25],
            			"rotation": {"angle": 0, "axis": "y", "origin": [1, 8.75, 16.25]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 15], "texture": "#0"},
            				"east": {"uv": [0, 0, 14, 15], "texture": "#0"},
            				"south": {"uv": [0, 0, 1, 15], "texture": "#0"},
            				"west": {"uv": [0, 0, 14, 15], "texture": "#0"},
            				"up": {"uv": [0, 0, 14, 1], "rotation": 90, "texture": "#0"},
            				"down": {"uv": [0, 0, 14, 1], "rotation": 270, "texture": "#0"}
            			}
            		},
            		{
            			"from": [0.25, 0, 18.75],
            			"to": [1.25, 4, 19.75],
            			"rotation": {"angle": 0, "axis": "y", "origin": [1, 1.25, 16.25]},
            			"faces": {
            				"north": {"uv": [6, 0, 5, 4], "texture": "#1"},
            				"east": {"uv": [6, 0, 5, 4], "texture": "#1"},
            				"south": {"uv": [6, 0, 5, 4], "texture": "#1"},
            				"west": {"uv": [6, 0, 5, 4], "texture": "#1"},
            				"up": {"uv": [6, 0, 5, 1], "rotation": 90, "texture": "#1"},
            				"down": {"uv": [6, 0, 5, 1], "rotation": 270, "texture": "#1"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [1, 2.25, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"thirdperson_lefthand": {
            			"translation": [1, 2.25, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_righthand": {
            			"translation": [1, 3, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_lefthand": {
            			"translation": [1, 3, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"ground": {
            			"translation": [0, 1.5, 0],
            			"scale": [0.33, 0.33, 0.33]
            		},
            		"gui": {
            			"rotation": [20, -45, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"fixed": {
            			"rotation": [-180, 0, -180],
            			"translation": [0, 0, 1],
            			"scale": [0.5, 0.5, 0.5]
            		}
            	}
            }
            """;

    public static String HALFCUPBOARD_DOWN_OPEN_FLIPPED = """
            {
            	"format_version": "1.21.6",
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		"1": "LEG_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
            		{
            			"from": [0, 0, 0],
            			"to": [1, 16, 7],
            			"rotation": {"angle": 0, "axis": "y", "origin": [0.5, 8, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"east": {"uv": [0, 0, 7, 16], "texture": "#1"},
            				"south": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"west": {"uv": [0, 0, 7, 16], "texture": "#1"},
            				"up": {"uv": [0, 0, 1, 7], "texture": "#1"},
            				"down": {"uv": [0, 0, 1, 7], "texture": "#1"}
            			}
            		},
            		{
            			"from": [15, 0, 0],
            			"to": [16, 16, 7],
            			"rotation": {"angle": 0, "axis": "y", "origin": [15.5, 8, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"east": {"uv": [0, 0, 7, 16], "texture": "#1"},
            				"south": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"west": {"uv": [0, 0, 7, 16], "texture": "#1"},
            				"up": {"uv": [0, 0, 1, 7], "texture": "#1"},
            				"down": {"uv": [0, 0, 1, 7], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 0, 0],
            			"to": [15, 1, 7],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 0.5, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 7, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 7, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 14, 7], "texture": "#1"},
            				"down": {"uv": [0, 0, 14, 7], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 7, 1],
            			"to": [15, 8, 7],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 7.5, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 6, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 6, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 14, 6], "texture": "#1"},
            				"down": {"uv": [0, 0, 14, 6], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 1, 0],
            			"to": [15, 15, 2],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 1]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 14], "texture": "#1"},
            				"east": {"uv": [0, 0, 2, 14], "texture": "#1"},
            				"south": {"uv": [0, 0, 14, 14], "texture": "#1"},
            				"west": {"uv": [0, 0, 2, 14], "texture": "#1"},
            				"up": {"uv": [0, 0, 14, 2], "texture": "#1"},
            				"down": {"uv": [0, 0, 14, 2], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 14.99, 0],
            			"to": [15, 15.99, 7],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 15.5, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 7, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 7, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 14, 7], "texture": "#1"},
            				"down": {"uv": [0, 0, 14, 7], "texture": "#1"}
            			}
            		},
            		{
            			"from": [0.75, 1, 6.25],
            			"to": [1.75, 16, 20.25],
            			"rotation": {"angle": 0, "axis": "y", "origin": [1, 8.75, 16.25]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 15], "texture": "#0"},
            				"east": {"uv": [0, 0, 14, 15], "texture": "#0"},
            				"south": {"uv": [0, 0, 1, 15], "texture": "#0"},
            				"west": {"uv": [0, 0, 14, 15], "texture": "#0"},
            				"up": {"uv": [0, 0, 14, 1], "rotation": 90, "texture": "#0"},
            				"down": {"uv": [0, 0, 14, 1], "rotation": 270, "texture": "#0"}
            			}
            		},
            		{
            			"from": [0.25, 12, 18.75],
            			"to": [1.25, 16, 19.75],
            			"rotation": {"angle": 0, "axis": "y", "origin": [1, 13.25, 16.25]},
            			"faces": {
            				"north": {"uv": [6, 0, 5, 4], "texture": "#1"},
            				"east": {"uv": [6, 0, 5, 4], "texture": "#1"},
            				"south": {"uv": [6, 0, 5, 4], "texture": "#1"},
            				"west": {"uv": [6, 0, 5, 4], "texture": "#1"},
            				"up": {"uv": [6, 0, 5, 1], "rotation": 90, "texture": "#1"},
            				"down": {"uv": [6, 0, 5, 1], "rotation": 270, "texture": "#1"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [1, 2.25, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"thirdperson_lefthand": {
            			"translation": [1, 2.25, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_righthand": {
            			"translation": [1, 3, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_lefthand": {
            			"translation": [1, 3, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"ground": {
            			"translation": [0, 1.5, 0],
            			"scale": [0.33, 0.33, 0.33]
            		},
            		"gui": {
            			"rotation": [20, -45, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"fixed": {
            			"rotation": [-180, 0, -180],
            			"translation": [0, 0, 1],
            			"scale": [0.5, 0.5, 0.5]
            		}
            	}
            }
            """;

    public static String HALFCABINET_LEFT = """
            {
            	"format_version": "1.21.6",
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		"1": "LEG_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
            		{
            			"from": [0, 0, 0],
            			"to": [1, 16, 7],
            			"rotation": {"angle": 0, "axis": "y", "origin": [0.5, 8, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"east": {"uv": [0, 0, 7, 16], "texture": "#1"},
            				"south": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"west": {"uv": [0, 0, 7, 16], "texture": "#1"},
            				"up": {"uv": [0, 0, 1, 7], "texture": "#1"},
            				"down": {"uv": [0, 0, 1, 7], "texture": "#1"}
            			}
            		},
            		{
            			"from": [15, 0, 0],
            			"to": [16, 16, 7],
            			"rotation": {"angle": 0, "axis": "y", "origin": [15.5, 8, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"east": {"uv": [0, 0, 7, 16], "texture": "#1"},
            				"south": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"west": {"uv": [0, 0, 7, 16], "texture": "#1"},
            				"up": {"uv": [0, 0, 1, 7], "texture": "#1"},
            				"down": {"uv": [0, 0, 1, 7], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 0, 0],
            			"to": [15, 1, 7],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 0.5, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 7, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 7, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 14, 7], "texture": "#1"},
            				"down": {"uv": [0, 0, 14, 7], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 7, 1],
            			"to": [15, 8, 7],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 7.5, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 15, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 14, 6], "texture": "#1"},
            				"down": {"uv": [0, 0, 14, 6], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 1, 0],
            			"to": [15, 15, 2],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 1]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 14], "texture": "#1"},
            				"east": {"uv": [0, 0, 2, 14], "texture": "#1"},
            				"south": {"uv": [0, 0, 14, 14], "texture": "#1"},
            				"west": {"uv": [0, 0, 2, 14], "texture": "#1"},
            				"up": {"uv": [0, 0, 14, 2], "texture": "#1"},
            				"down": {"uv": [0, 0, 14, 2], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 15, 0],
            			"to": [15, 16, 7],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 15.5, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 7, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 7, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 14, 7], "texture": "#1"},
            				"down": {"uv": [0, 0, 14, 7], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 1, 6.5],
            			"to": [15, 15, 7.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 7]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 14], "texture": "#0"},
            				"east": {"uv": [0, 0, 1, 14], "texture": "#0"},
            				"south": {"uv": [0, 0, 14, 14], "texture": "#0"},
            				"west": {"uv": [0, 0, 1, 14], "texture": "#0"},
            				"up": {"uv": [0, 0, 14, 1], "texture": "#0"},
            				"down": {"uv": [0, 0, 14, 1], "texture": "#0"}
            			}
            		},
            		{
            			"from": [13.5, 7.5, 7],
            			"to": [14.5, 11.5, 8],
            			"rotation": {"angle": 0, "axis": "y", "origin": [14, 9, 7.5]},
            			"faces": {
            				"north": {"uv": [6, 0, 5, 4], "texture": "#1"},
            				"east": {"uv": [6, 0, 5, 4], "texture": "#1"},
            				"south": {"uv": [6, 0, 5, 4], "texture": "#1"},
            				"west": {"uv": [6, 0, 5, 4], "texture": "#1"},
            				"up": {"uv": [6, 0, 5, 1], "texture": "#1"},
            				"down": {"uv": [6, 0, 5, 1], "texture": "#1"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [1, 2.25, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"thirdperson_lefthand": {
            			"translation": [1, 2.25, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_righthand": {
            			"translation": [1, 3, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_lefthand": {
            			"translation": [1, 3, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"ground": {
            			"translation": [0, 1.5, 0],
            			"scale": [0.33, 0.33, 0.33]
            		},
            		"gui": {
            			"rotation": [20, -45, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"fixed": {
            			"rotation": [-180, 0, -180],
            			"translation": [0, 0, 1],
            			"scale": [0.5, 0.5, 0.5]
            		}
            	}
            }
            """;

    public static String HALFCABINET_RIGHT = """
            {
            	"format_version": "1.21.6",
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		"1": "LEG_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
            		{
            			"from": [0, 0, 0],
            			"to": [1, 16, 7],
            			"rotation": {"angle": 0, "axis": "y", "origin": [0.5, 8, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"east": {"uv": [0, 0, 7, 16], "texture": "#1"},
            				"south": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"west": {"uv": [0, 0, 7, 16], "texture": "#1"},
            				"up": {"uv": [0, 0, 1, 7], "texture": "#1"},
            				"down": {"uv": [0, 0, 1, 7], "texture": "#1"}
            			}
            		},
            		{
            			"from": [15, 0, 0],
            			"to": [16, 16, 7],
            			"rotation": {"angle": 0, "axis": "y", "origin": [15.5, 8, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"east": {"uv": [0, 0, 7, 16], "texture": "#1"},
            				"south": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"west": {"uv": [0, 0, 7, 16], "texture": "#1"},
            				"up": {"uv": [0, 0, 1, 7], "texture": "#1"},
            				"down": {"uv": [0, 0, 1, 7], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 0, 0],
            			"to": [15, 1, 7],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 0.5, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 7, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 7, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 14, 7], "texture": "#1"},
            				"down": {"uv": [0, 0, 14, 7], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 7, 1],
            			"to": [15, 8, 7],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 7.5, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 7, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 7, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 14, 6], "texture": "#1"},
            				"down": {"uv": [0, 0, 14, 6], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 1, 0],
            			"to": [15, 15, 2],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 1]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 14], "texture": "#1"},
            				"east": {"uv": [0, 0, 2, 14], "texture": "#1"},
            				"south": {"uv": [0, 0, 14, 14], "texture": "#1"},
            				"west": {"uv": [0, 0, 2, 14], "texture": "#1"},
            				"up": {"uv": [0, 0, 14, 2], "texture": "#1"},
            				"down": {"uv": [0, 0, 14, 2], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 15, 0],
            			"to": [15, 16, 7],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 15.5, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 7, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 7, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 14, 7], "texture": "#1"},
            				"down": {"uv": [0, 0, 14, 7], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 1, 6.5],
            			"to": [15, 15, 7.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 7]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 14], "texture": "#0"},
            				"east": {"uv": [0, 0, 1, 14], "texture": "#0"},
            				"south": {"uv": [0, 0, 14, 14], "texture": "#0"},
            				"west": {"uv": [0, 0, 1, 14], "texture": "#0"},
            				"up": {"uv": [0, 0, 14, 1], "texture": "#0"},
            				"down": {"uv": [0, 0, 14, 1], "texture": "#0"}
            			}
            		},
            		{
            			"from": [1.5, 7.5, 7],
            			"to": [2.5, 11.5, 8],
            			"rotation": {"angle": 0, "axis": "y", "origin": [2, 9, 7.5]},
            			"faces": {
            				"north": {"uv": [5, 0, 6, 4], "texture": "#1"},
            				"east": {"uv": [5, 0, 6, 4], "texture": "#1"},
            				"south": {"uv": [5, 0, 6, 4], "texture": "#1"},
            				"west": {"uv": [5, 0, 6, 4], "texture": "#1"},
            				"up": {"uv": [5, 0, 6, 1], "texture": "#1"},
            				"down": {"uv": [5, 0, 6, 1], "texture": "#1"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [1, 2.25, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"thirdperson_lefthand": {
            			"translation": [1, 2.25, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_righthand": {
            			"translation": [1, 3, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_lefthand": {
            			"translation": [1, 3, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"ground": {
            			"translation": [0, 1.5, 0],
            			"scale": [0.33, 0.33, 0.33]
            		},
            		"gui": {
            			"rotation": [20, -45, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"fixed": {
            			"rotation": [-180, 0, -180],
            			"translation": [0, 0, 1],
            			"scale": [0.5, 0.5, 0.5]
            		}
            	}
            }
            """;

    public static String HALFCABINET_RIGHT_OPEN = """
            {
            	"format_version": "1.21.6",
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		"1": "LEG_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
            		{
            			"from": [0, 0, 0],
            			"to": [1, 16, 7],
            			"rotation": {"angle": 0, "axis": "y", "origin": [0.5, 8, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"east": {"uv": [0, 0, 7, 16], "texture": "#1"},
            				"south": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"west": {"uv": [0, 0, 7, 16], "texture": "#1"},
            				"up": {"uv": [0, 0, 1, 7], "texture": "#1"},
            				"down": {"uv": [0, 0, 1, 7], "texture": "#1"}
            			}
            		},
            		{
            			"from": [15, 0, 0],
            			"to": [16, 16, 7],
            			"rotation": {"angle": 0, "axis": "y", "origin": [15.5, 8, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"east": {"uv": [0, 0, 7, 16], "texture": "#1"},
            				"south": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"west": {"uv": [0, 0, 7, 16], "texture": "#1"},
            				"up": {"uv": [0, 0, 1, 7], "texture": "#1"},
            				"down": {"uv": [0, 0, 1, 7], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 0, 0],
            			"to": [15, 1, 7],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 0.5, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 7, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 7, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 14, 7], "texture": "#1"},
            				"down": {"uv": [0, 0, 14, 7], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 7, 1],
            			"to": [15, 8, 7],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 7.5, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 6, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 6, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 14, 6], "texture": "#1"},
            				"down": {"uv": [0, 0, 14, 6], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 1, 0],
            			"to": [15, 15, 2],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 1]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 14], "texture": "#1"},
            				"east": {"uv": [0, 0, 2, 14], "texture": "#1"},
            				"south": {"uv": [0, 0, 14, 14], "texture": "#1"},
            				"west": {"uv": [0, 0, 2, 14], "texture": "#1"},
            				"up": {"uv": [0, 0, 14, 2], "texture": "#1"},
            				"down": {"uv": [0, 0, 14, 2], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 15, 0],
            			"to": [15, 16, 7],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 15.5, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 7, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 7, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 14, 7], "texture": "#1"},
            				"down": {"uv": [0, 0, 14, 7], "texture": "#1"}
            			}
            		},
            		{
            			"from": [14.25, 1, 6.25],
            			"to": [15.25, 15, 20.25],
            			"rotation": {"angle": 0, "axis": "y", "origin": [15, 8.75, 16.25]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 14], "texture": "#0"},
            				"east": {"uv": [0, 0, 14, 14], "texture": "#0"},
            				"south": {"uv": [0, 0, 1, 14], "texture": "#0"},
            				"west": {"uv": [0, 0, 14, 14], "texture": "#0"},
            				"up": {"uv": [0, 0, 14, 1], "rotation": 270, "texture": "#0"},
            				"down": {"uv": [0, 0, 14, 1], "rotation": 90, "texture": "#0"}
            			}
            		},
            		{
            			"from": [14.75, 7.5, 18.75],
            			"to": [15.75, 11.5, 19.75],
            			"rotation": {"angle": 0, "axis": "y", "origin": [15, 8.75, 16.25]},
            			"faces": {
            				"north": {"uv": [5, 0, 6, 4], "texture": "#1"},
            				"east": {"uv": [5, 0, 6, 4], "texture": "#1"},
            				"south": {"uv": [5, 0, 6, 4], "texture": "#1"},
            				"west": {"uv": [5, 0, 6, 4], "texture": "#1"},
            				"up": {"uv": [5, 0, 6, 1], "rotation": 270, "texture": "#1"},
            				"down": {"uv": [5, 0, 6, 1], "rotation": 90, "texture": "#1"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [1, 2.25, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"thirdperson_lefthand": {
            			"translation": [1, 2.25, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_righthand": {
            			"translation": [1, 3, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_lefthand": {
            			"translation": [1, 3, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"ground": {
            			"translation": [0, 1.5, 0],
            			"scale": [0.33, 0.33, 0.33]
            		},
            		"gui": {
            			"rotation": [20, -45, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"fixed": {
            			"rotation": [-180, 0, -180],
            			"translation": [0, 0, 1],
            			"scale": [0.5, 0.5, 0.5]
            		}
            	}
            }
            """;

    public static String HALFCABINET_LEFT_OPEN = """
            {
            	"format_version": "1.21.6",
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "BASE_NAME",
            		"1": "LEG_NAME",
            		"particle": "BASE_NAME"
            	},
            	"elements": [
            		{
            			"from": [0, 0, 0],
            			"to": [1, 16, 7],
            			"rotation": {"angle": 0, "axis": "y", "origin": [0.5, 8, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"east": {"uv": [0, 0, 7, 16], "texture": "#1"},
            				"south": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"west": {"uv": [0, 0, 7, 16], "texture": "#1"},
            				"up": {"uv": [0, 0, 1, 7], "texture": "#1"},
            				"down": {"uv": [0, 0, 1, 7], "texture": "#1"}
            			}
            		},
            		{
            			"from": [15, 0, 0],
            			"to": [16, 16, 7],
            			"rotation": {"angle": 0, "axis": "y", "origin": [15.5, 8, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"east": {"uv": [0, 0, 7, 16], "texture": "#1"},
            				"south": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"west": {"uv": [0, 0, 7, 16], "texture": "#1"},
            				"up": {"uv": [0, 0, 1, 7], "texture": "#1"},
            				"down": {"uv": [0, 0, 1, 7], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 0, 0],
            			"to": [15, 1, 7],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 0.5, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 7, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 7, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 14, 7], "texture": "#1"},
            				"down": {"uv": [0, 0, 14, 7], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 7, 1],
            			"to": [15, 8, 7],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 7.5, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 6, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 6, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 14, 6], "texture": "#1"},
            				"down": {"uv": [0, 0, 14, 6], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 1, 0],
            			"to": [15, 15, 2],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 1]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 14], "texture": "#1"},
            				"east": {"uv": [0, 0, 2, 14], "texture": "#1"},
            				"south": {"uv": [0, 0, 14, 14], "texture": "#1"},
            				"west": {"uv": [0, 0, 2, 14], "texture": "#1"},
            				"up": {"uv": [0, 0, 14, 2], "texture": "#1"},
            				"down": {"uv": [0, 0, 14, 2], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 15, 0],
            			"to": [15, 16, 7],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 15.5, 7.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 7, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 14, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 7, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 14, 7], "texture": "#1"},
            				"down": {"uv": [0, 0, 14, 7], "texture": "#1"}
            			}
            		},
            		{
            			"from": [0.75, 1, 6.25],
            			"to": [1.75, 15, 20.25],
            			"rotation": {"angle": 0, "axis": "y", "origin": [1, 8.75, 16.25]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 14], "texture": "#0"},
            				"east": {"uv": [0, 0, 14, 14], "texture": "#0"},
            				"south": {"uv": [0, 0, 1, 14], "texture": "#0"},
            				"west": {"uv": [0, 0, 14, 14], "texture": "#0"},
            				"up": {"uv": [0, 0, 14, 1], "rotation": 90, "texture": "#0"},
            				"down": {"uv": [0, 0, 14, 1], "rotation": 270, "texture": "#0"}
            			}
            		},
            		{
            			"from": [0.25, 7.5, 18.75],
            			"to": [1.25, 11.5, 19.75],
            			"rotation": {"angle": 0, "axis": "y", "origin": [1, 8.75, 16.25]},
            			"faces": {
            				"north": {"uv": [6, 0, 5, 4], "texture": "#1"},
            				"east": {"uv": [6, 0, 5, 4], "texture": "#1"},
            				"south": {"uv": [6, 0, 5, 4], "texture": "#1"},
            				"west": {"uv": [6, 0, 5, 4], "texture": "#1"},
            				"up": {"uv": [6, 0, 5, 1], "rotation": 90, "texture": "#1"},
            				"down": {"uv": [6, 0, 5, 1], "rotation": 270, "texture": "#1"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [1, 2.25, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"thirdperson_lefthand": {
            			"translation": [1, 2.25, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_righthand": {
            			"translation": [1, 3, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_lefthand": {
            			"translation": [1, 3, -0.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"ground": {
            			"translation": [0, 1.5, 0],
            			"scale": [0.33, 0.33, 0.33]
            		},
            		"gui": {
            			"rotation": [20, -45, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"fixed": {
            			"rotation": [-180, 0, -180],
            			"translation": [0, 0, 1],
            			"scale": [0.5, 0.5, 0.5]
            		}
            	}
            }
            """;
}