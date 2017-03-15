package superdopesquad.superdopejedimod.entity.droid;


import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import superdopesquad.superdopejedimod.SuperDopeJediMod;
import superdopesquad.superdopejedimod.entity.BaseRender;


@SideOnly(Side.CLIENT)
public class RepublicPatrolDroidRender extends BaseRender {
	
	
	public RepublicPatrolDroidRender(RenderManager renderManager, ModelBase par1ModelBase, float parShadowSize) {
	
        super(renderManager, par1ModelBase, parShadowSize, "republicPatrolDroid");      
    }
 
	
    @Override
    protected void preRenderCallback(EntityLivingBase entity, float f) {}
}