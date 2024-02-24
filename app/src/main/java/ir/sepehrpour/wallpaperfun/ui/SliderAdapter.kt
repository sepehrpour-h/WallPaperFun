package ir.sepehrpour.wallpaperfun.ui

class SliderAdapter(fm: FragmentManager, private val images: List<Int>) : FragmentPagerAdapter(fm) {
    fun getCount(): Int {
        return images.size
    }

    fun getItem(position: Int): Fragment {
        return ImageFragment.newInstance(images[position])
    }
}