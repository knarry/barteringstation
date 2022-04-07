package fuzs.barteringstation.client.registry;

import fuzs.barteringstation.BarteringStation;
import fuzs.puzzleslib.client.model.geom.ModelLayerRegistry;
import net.minecraft.client.model.geom.ModelLayerLocation;

public class ModClientRegistry {
    private static final ModelLayerRegistry LAYER_REGISTRY = ModelLayerRegistry.of(BarteringStation.MOD_ID);
    public static final ModelLayerLocation PIGLIN_HEAD_MODEL_LAYER_LOCATION = LAYER_REGISTRY.register("piglin_head");
}
