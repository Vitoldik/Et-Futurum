package ganymedes01.etfuturum.blocks;

import ganymedes01.etfuturum.EtFuturum;
import ganymedes01.etfuturum.IConfigurable;
import ganymedes01.etfuturum.core.utils.Utils;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class CoarseDirt extends Block implements IConfigurable {

	public CoarseDirt() {
		super(Material.ground);
		setHardness(0.5F);
		setStepSound(soundTypeGravel);
		setBlockTextureName("coarse_dirt");
		setBlockName(Utils.getUnlocalisedName("coarse_dirt"));
		setCreativeTab(EtFuturum.enableCoarseDirt ? EtFuturum.creativeTab : null);
	}

	@Override
	public boolean isEnabled() {
		return EtFuturum.enableCoarseDirt;
	}
}