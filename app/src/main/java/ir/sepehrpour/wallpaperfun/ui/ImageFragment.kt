package ir.sepehrpour.wallpaperfun.ui

class ImageFragment : Fragment() {

    companion object {
        private const val ARG_IMAGE_RES = "imageRes"

        fun newInstance(imageRes: Int): ImageFragment {
            val fragment = ImageFragment()
            val args = Bundle()
            args.putInt(ARG_IMAGE_RES, imageRes)
            fragment.arguments = args
            return fragment
        }
    }

    fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val imageRes = arguments?.getInt(ARG_IMAGE_RES) ?: 0
        val imageView = ImageView(requireContext())
        imageView.setImageResource(imageRes)
        return imageView
    }
}