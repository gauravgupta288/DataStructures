package Month08_March.Day119_010323;

public class SumOfSubArrays {
    public static void main(String[] args) {
        System.out.println(solve(new int[]{8454, 3670, 4704, 7827, 5096, 8305, 7986, 907, 4738, 7400, 7501, 5561, 8159, 2793, 1282, 6733, 6619, 9532, 4968, 4366, 2270, 1509, 56, 1108, 211, 1781, 2642, 6644, 4710, 9924, 6588, 3269, 7884, 6547, 2523, 4851, 9085, 2481, 9306, 8576, 5164, 860, 6791, 7042, 3543, 6946, 5165, 7277, 105, 3859, 780, 5869, 3053, 9444, 9285, 8239, 5998, 931, 4097, 6125, 9785, 6306, 2786, 4373, 1748, 2210, 3985, 6742, 2856, 1230, 1765, 6422, 7273, 9088, 2581, 6306, 5606, 7844, 3045, 1970, 2764, 4951, 3837, 120, 7285, 8027, 4520, 8998, 6622, 1594, 5639, 6425, 3222, 8100, 5749, 1861, 209, 2136, 6230, 1486, 6029, 6971, 7128, 8161, 1228, 9911, 780, 2957, 5184, 4963, 3998, 8097, 3574, 3355, 3151, 4627, 280, 4764, 116, 922, 6998, 1534, 823, 2409, 2255, 9822, 4939, 2425, 9225, 1271, 8862, 5890, 4336, 7069, 9591, 8517, 251, 4998, 9038, 2872, 378, 1556, 7739, 8351, 9020, 4835, 6150, 3139, 5981, 588, 3005, 2738, 8412, 2612, 8917, 2084, 5114, 1892, 6616, 645, 2670, 4341, 5357, 2307, 5126, 9383, 8965, 8454, 4056, 6591, 8368, 8006, 647, 6379, 6912, 1406, 3185, 4531, 1222, 204, 5733, 350, 1225, 7169, 9666, 3134, 4373, 971, 3418, 5065, 7503, 4844, 9637, 2437, 2071, 6423, 6770, 4047, 950, 151, 9400, 9111, 9703, 8172, 267, 3516, 7586, 1155, 5819, 6096, 7011, 5792, 6486, 1271, 5161, 6987, 7885, 5986, 5931, 9380, 3907, 7394, 8389, 6980, 5074, 5499, 576, 8706, 8264, 5047, 2111, 9646, 367, 147, 4517, 4717, 1899, 9290, 9653, 1010, 6540, 7372, 289, 869, 2659, 3179, 6052, 2595, 8208, 6114, 3403, 2482, 250, 2963, 2317, 2287, 7480, 8603, 8412, 6902, 8957, 3571, 4644, 5565, 7393, 3606, 9584, 2398, 2217, 3626, 2732, 3343, 7833, 3757, 9764, 9503, 8368, 6701, 6251, 4607, 5969, 6628, 2073, 442, 8898, 1263, 4476, 4851, 7245, 3193, 9519, 2218, 1300, 2920, 3016, 2010, 753, 4964, 2954, 3282, 7787, 6607, 8331, 5758, 533, 7286, 8464, 1921, 1569, 2307, 4997, 6065, 3986, 7771, 313, 5951, 7599, 8347, 325, 2802, 4739, 5898, 7677, 6527, 8321, 6122, 3359, 8343, 3604, 3265, 425, 6957, 8277, 3263, 2919, 6146, 2694, 7867, 3818, 6687, 2075, 6350, 404, 7086, 8824, 1803, 2239, 8166, 6197, 4154, 13, 9569, 1759, 5808, 9626, 5979, 9400, 2413, 9070, 425, 2190, 2385, 7007, 9124, 3689, 5307, 3732, 113, 6350, 7536, 1844, 4894, 3377, 6213, 3308, 4555, 7575, 9945, 623, 4050, 1033, 8785, 1848, 3812, 21, 9345, 251, 226, 7246, 7236, 3753, 5109, 4787, 3641, 5106, 9322, 7997, 1930, 7253, 6109, 5906, 505, 9859, 3473, 8343, 3386, 3826, 4106, 9011, 5095, 1325, 2471, 2446, 484, 8537, 2575, 6648, 4528, 3794, 7095, 5062, 6644, 499, 6173, 5927, 1435, 2293, 8676, 308, 4014, 7599, 3068, 774, 8939, 1531, 3101, 8722, 9169, 569, 944, 799, 8507, 5277, 2058, 3305, 1622, 8708, 6902, 3069, 4721, 3620, 1950, 6548, 8864, 2849, 1766, 6653, 9997, 3083, 8789, 8099, 1052, 8645, 8448, 446, 8169, 449, 1701, 8517, 3856, 6230, 241, 3793, 2232, 1860, 4638, 4972, 3693, 4974, 3373, 6312, 4360, 5990, 5323, 9869, 7438, 6806, 1395, 6410, 1522, 2074, 7825, 3261, 8663, 4172, 4190, 7597, 2230, 8743, 6189, 2932, 4873, 9469, 5296, 8731, 1874, 5492, 1368, 9021, 4762, 5387, 5271, 3837, 9690, 746, 2404, 4452, 5295, 5351, 8074, 7314, 1758, 7557, 445, 5750, 7044, 8103, 4970, 4440, 2360, 5171, 6170, 372, 9360, 3169, 6355, 2721, 7821, 8898, 6331, 9087, 2420, 6846, 2506, 9696, 9721, 485, 9978, 7981, 4874, 8599, 3662, 1001, 6869, 1776, 6812, 6402, 7319, 3707, 2472, 4403, 9586, 7, 3039, 8119, 2875, 5351, 5293, 5433, 5021, 3234, 8363, 9287, 7293, 2027, 1160, 7060, 8427, 5692, 5107, 5532, 8225, 9163, 306, 5154, 2459, 5439, 4515, 2758, 7876, 3707, 204, 8002, 7449, 1288, 1168, 9315, 8059, 1042, 6369, 8709, 5703, 1369, 1165, 7367, 9354, 8135, 6263, 5726, 931, 241, 5026, 4182, 8697, 8567, 9548, 9778, 9157, 8869, 501, 532, 8606, 7724, 8794, 4857, 6111, 2331, 850, 5372, 6743, 4918, 2981, 6842, 9821, 1545, 4340, 6309, 4798, 4710, 9721, 9506, 9045, 8282, 6892, 3406, 5317, 3581, 5758, 8685, 1430, 936, 3094, 4323, 8777, 4961, 5606, 6379, 5786, 9778, 4137, 9684, 6465, 2201, 7643, 6492, 213, 8792, 5557, 2421, 174, 9611, 531, 9668, 2565, 3369, 4164, 136, 2394, 3364, 1838, 4375, 3778, 3803, 4155, 5844, 107, 7055, 2004, 13, 3181, 8339, 5272, 2321, 5022, 4908, 4328, 1039, 4530, 4952, 7155, 6345, 5454, 8523, 9209, 4487, 4631, 2500, 6606, 2312, 5340, 4878, 5470, 6244, 5565, 1810, 4023, 1405, 5222, 762, 3047, 5907, 1979, 7808, 8483, 470, 6738, 1781, 4161, 934, 5656, 8094, 3058, 7047, 9633, 1817, 3679, 4033, 832, 4285, 9503, 7907, 3726, 8175, 467, 7719, 4299, 9825, 127, 7857, 9566, 4325, 6853, 3377, 4459, 6911, 9550, 7160, 8512, 2616, 5096, 247, 3243, 3503, 6487, 3298, 9868, 9530, 3849, 5524, 5202, 6618, 9323, 1628, 5845, 1724, 5969, 8485, 9184, 4780, 8502, 1300, 457, 164, 6256, 4394, 6190, 2947, 958, 8441, 8541, 2745, 2386, 1908, 5744, 7565, 2437, 9775, 5027, 2625, 2235, 6757, 5507, 5646, 3060, 744, 9685, 3129, 7900, 6578, 544, 3031, 6272, 4394, 1465, 1117, 2845, 6739, 3769, 143, 8247, 735, 8461, 2746, 3026, 5633, 1673, 1358, 6497, 7136, 3593, 7907, 1385, 9975, 1510, 2476, 5921, 8457, 2, 4361, 168, 34, 6688, 5494, 5970, 1832, 3010, 3121, 5184, 7952, 1041, 169, 8060, 2046, 4515, 66, 2622, 8068, 4892, 4549, 1134, 1307, 6931, 4755, 2887, 6640, 7375, 8490, 9027, 4773, 6143, 7921, 9064, 5832, 4883, 4957, 3647, 5233, 6394, 5926, 2110, 9765, 2936, 9460, 5505, 6040, 3908, 1523, 6489, 7487, 8428, 7109, 8320, 7555, 4197, 9030, 6824, 2642, 3282, 3787, 8176, 3839, 8928, 8324, 1874, 8266, 2477, 3872, 7068, 9162, 5107, 1184, 3865, 9686, 2276, 5188, 7931, 3651, 3011, 9361, 2103, 728, 4893, 404, 6924, 7421, 8018, 9744, 9041, 6994, 2932, 1539, 5323, 4316, 6395, 6407, 8681, 1898, 2130, 5268, 4860, 9013, 9457, 8562, 7365, 8598, 2424, 9804, 6941, 5778, 9813, 8193, 9435, 5488, 8147, 6084, 902, 1388, 1007, 6548, 7223, 1220, 5799, 8181, 5705, 815, 3058, 2605, 3920, 9485, 4486, 5899, 3987, 8392, 3882, 7361, 9304, 4570, 3848, 3282, 7771, 7978, 9038, 9254, 8170, 2286, 5330, 7195, 7792, 8996, 9264, 6342, 1004, 5611, 3521, 6807, 397, 7292, 9929, 1163, 3837, 9766, 365, 4410, 9942, 1063, 3232, 9920, 5269, 9030, 3705, 4873, 2442, 4493, 2578, 5429, 7273, 4357, 6367, 5196, 8960, 3625, 5896, 2587, 9141, 2668, 7253, 6396, 6396, 1639, 5350, 5204, 1794, 3179, 4988, 789, 7145, 9556, 3383, 1348, 7520, 4558, 2157, 7157, 4733, 4273, 2468, 9122, 5082, 40, 9372, 6363, 9066, 9440, 1532, 6311, 4358, 5644, 3751, 1544, 8361, 3173, 1035, 7197, 6788, 2718, 1718, 7185, 8414, 9429, 7173, 2800, 4316, 4229, 7130, 426, 9881, 793, 2825, 9008, 2, 6764, 9887, 2476, 2001, 4764, 7552, 6301, 659, 6844, 5259, 8847, 9768, 8488, 828, 4057, 2647, 7316, 3247, 960, 9115, 9101, 6667, 1209, 3311, 2577, 1203, 300, 8801, 9402, 9860, 9636, 3477, 7381, 1419, 2642, 3225, 2081, 6311, 993, 9264, 3875, 3398, 261, 8558, 7511, 1967, 2925, 303, 368, 3243, 4519, 500, 8176, 7808, 1618, 5547, 4324, 3419, 8511, 7033, 3063, 8970, 3681, 9911, 7287, 4404, 2931, 455, 4596, 3142, 8601, 3361, 7396, 4282, 1230, 3822, 8851, 2565, 764, 8048, 4424, 1790, 1963, 2188, 4051, 1510, 7728, 2709, 1219, 4057, 1255, 102, 900, 7199, 5036, 1708, 4837, 7422, 7266, 2510, 231, 1824, 8934, 2426, 6946, 4813, 2142, 6173, 9010, 3509, 6523, 6750, 5614, 8588, 5214, 199, 649, 4434, 2343, 4033, 5825, 7006, 1784, 3468, 6213, 2774, 4680, 3832, 7956, 3998, 6131, 2866, 4080, 8058, 8879, 3470, 9922, 5730, 1033, 7390, 2647, 2097, 9694, 1164, 6823, 6298, 3334, 8714, 9910, 9736, 6970, 931, 6804, 2543, 6918, 5373, 9999, 1780, 9145, 9022, 6744, 6246, 8298, 4200, 51, 5592, 629, 2803, 5096, 7597, 3955, 3621, 7638, 9022, 616, 3504, 2615, 3402, 4949, 88, 4591, 315, 1325, 7759, 8574, 5697, 8613, 6047, 7461, 9325, 2709, 4420, 1333, 2348, 3067, 4804, 962, 2110, 5215, 5659, 1991, 4498, 5904, 7047, 4852, 3584, 2589, 6749, 5474, 3698, 2112, 9542, 8406, 7456, 6453, 5705, 708, 5126, 2281, 7094, 7451, 5829, 9470, 1420, 4110, 9923, 1066, 2344, 6083, 9663, 4318, 8108, 4804, 2421, 9284, 3799, 1763, 1290, 5858, 6566, 8395, 6117, 796, 6215, 8177, 9258, 4230, 1877, 4282, 7604, 1926, 3589, 5717, 8879, 5384, 8828, 1529, 7695, 8267, 5979, 9817, 5680, 1977, 7768, 3124, 891, 9284, 346, 1738, 3345, 4091, 2032, 3383, 8471, 1052, 9839, 7220, 7166, 8595, 3399, 7139, 1118, 7441, 9072, 2024, 5615, 3144, 1126, 5816, 9540, 7618, 6622, 5945, 404, 802, 4100, 9768, 1990, 5970, 2483, 9850, 7576, 155, 4144, 762, 1532, 4755, 8371, 2369, 4992, 9521, 4818, 8820, 8169, 6140, 7836, 7431, 4203, 1345, 863, 7216, 9526, 3891, 5575, 5846, 5857, 9149, 4676, 8391, 8044, 1411, 1846, 4377, 4901, 2631, 6648, 3576, 681, 9367, 5702, 4142, 5220, 6947, 5116, 1697, 3095, 9980, 6460, 4503, 1493, 2040, 9803, 7892, 6506, 4386, 2249, 4036, 6504, 7279, 8444, 8068, 7632, 4459, 8808, 5770, 6409, 9602, 1149, 5381, 2480, 3738, 2220, 1470, 5917, 1918, 4375, 4478, 3373, 1477, 5349, 506, 5057, 3521, 1486, 3658, 771, 4612, 249, 7687, 4416, 4459, 1200, 5762, 2966, 8671, 4524, 353, 7627, 3313, 8995, 2436, 1399, 5474, 4506, 390, 6688, 6869, 56, 4623, 6576, 2860, 3162, 7062, 7893, 5950, 2556, 7364, 3780, 763, 8906, 4404, 5995, 4118, 7236, 2262, 4786, 7073, 5847, 562, 4461, 9399, 6494, 4570, 5233, 1282, 9636, 5545, 2656, 2173, 9284, 7719, 5891, 9075, 1247, 1022, 4659, 1414, 9145, 4711, 899, 6236, 4929, 8446, 1310, 1828, 5899, 5988, 8489, 9126, 5740, 9090, 9028, 6041, 1633, 4091, 5266, 7806, 3341, 2939, 7362, 6297, 4381, 8476, 6026, 1455, 4617, 9095, 8831, 4923, 4729, 5239, 3556, 2235, 6929, 5337, 6076, 8632, 3387, 2031, 8717, 7235, 6560, 4980, 7043, 5802, 4818, 3499, 8526, 4761, 8057, 4560, 8282, 3294, 776, 8672, 1065, 6181, 1979, 4516, 3279, 9842, 2095, 4919, 9001, 6061, 2638, 9385, 4346, 726, 4038, 9069, 6132, 9098, 3301, 1741, 2512, 2927, 8532, 2877, 1386, 3833, 2124, 3309, 2203, 6479, 5449, 375, 5540, 8679, 7850, 6649, 3381, 8862, 5969, 7581, 3959, 9844, 6301, 8643, 2908, 20, 8626, 1504, 881, 561, 8898, 4831, 332, 4267, 7370, 806, 7016, 817, 9003, 2628, 7690, 385, 4100, 3415, 5696, 6731, 7241, 1690, 1941, 5747, 7857, 9691, 5059, 6021, 8881, 1018, 2741, 3747, 2273, 5965, 9880, 2410, 4072, 1040, 8782, 9187, 3226, 3066, 5006, 6357, 2922, 2668, 1995, 9031, 5212, 7986, 4783, 5603, 4316, 7243, 4756, 4391, 1557, 7622, 3968, 1493, 3727, 8770, 8666, 5913, 7352, 4664, 1869, 9563, 4525, 884, 984, 2282, 3798, 9325, 367, 6153, 5612, 4918, 6002, 3158, 6487, 9885, 439, 5669, 8216, 8817, 2438, 1467, 5471, 8273, 4850, 4870, 7882, 8624, 9567, 6842, 7083, 2292, 9924, 6902, 2805, 3021, 6255, 485, 6947, 5043, 4703, 5297, 6645, 552, 8082, 2146, 872, 1692, 4203, 9347, 9072, 5727, 1263, 2630, 3700, 7714, 1933, 526, 2502, 263, 6808, 905, 9518, 8966, 9730, 9265, 3859, 2385, 5718, 7576, 4853, 8527, 9474, 4785, 7561, 9125, 1519, 3950, 6850, 4691, 4063, 4051, 1321, 2570, 4610, 7017, 4072, 9403, 3045, 8559, 9736, 9627, 7000, 9659, 7637, 1042, 5561, 1854, 8923, 5987, 2514, 1190, 1312, 4150, 4124, 8509, 9726, 9089, 9903, 5006, 2794, 7813, 3735, 1880, 6262, 8213, 852, 7883, 2927, 9617, 9614, 623, 3300, 5056, 7299, 9507, 9012, 1756, 4607, 7379, 3906, 6903, 6279, 1828, 8712, 7068, 8194, 7017, 9493, 560, 1492, 9351, 1925, 9896, 376, 7893, 4619, 1300, 4537, 2477, 4269, 8808, 9933, 3424, 8348, 5531, 9775, 3014, 8751, 4328, 8055, 8211, 8939, 402, 7496, 1653, 1921, 453, 3702, 7161, 8052, 6247, 7090, 5693, 8757, 1790, 9844, 7024, 8349, 7867, 1188, 3590, 6614, 2867, 8884, 5384, 326, 8111, 62, 1912, 249, 1113, 8885, 802, 8779, 9319, 1786, 7053, 911, 9764, 3278, 2161, 5870, 2745, 2303, 3699, 7791, 2603, 9713, 1452, 9743, 2638, 1882, 1160, 8542, 7624, 2697, 2857, 8646, 1120, 9556, 8348, 2872, 3460, 3469, 5939, 1541, 1450, 3937, 8289, 7461, 9407, 9629, 3909, 8168, 9179, 4237, 8366, 1927, 4981, 5106, 6493, 6134, 7970, 4142, 6487, 1256, 2297, 2991, 8569, 1231, 7474, 2023, 6070, 142, 5853, 8244, 4908, 5709, 4432, 9168, 3845, 729, 1960, 6983, 281, 4053, 671, 3408, 2529, 9601, 6270, 5931, 1542, 9189, 1066, 1669, 2872, 1610, 779, 6667, 5019, 1877, 4570, 88, 7019, 7569, 8872, 1004, 2432, 5352, 5339, 9676, 9980, 5949, 9795, 2928, 9154, 7625, 1995, 3870, 7585, 3281, 8732, 6128, 1421, 8864, 6827, 7683, 3439, 2006, 4578, 6031, 98, 5085, 3499, 6030, 7038, 5571, 3737, 3627, 8227, 6441, 4129, 3689, 6875, 2007, 1974, 589, 6610, 2745, 5923, 9353, 5057, 6810, 1168, 8773, 3589, 1948, 1927, 3452, 3503, 18}));
    }

    static long solve(int []A){
        long ans = 0;
        System.out.println((long)(1234121) * (long)334243 * (long)32434);
        for(int i = 0; i < A.length; i++){
            long temp = A[i];
            ans += (temp * ((i + 1) * (A.length - i)));
        }
        return ans;
    }
}
