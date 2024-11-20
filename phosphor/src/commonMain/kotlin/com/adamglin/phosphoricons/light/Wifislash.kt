package com.adamglin.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.LightGroup

public val LightGroup.WifiSlash: ImageVector
    get() {
        if (_wifiSlash != null) {
            return _wifiSlash!!
        }
        _wifiSlash = Builder(name = "WifiSlash", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(138.0f, 204.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, -10.0f, -10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 138.0f, 204.0f)
                close()
                moveTo(52.44f, 36.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 43.56f, 44.0f)
                lineTo(61.33f, 63.58f)
                arcToRelative(169.41f, 169.41f, 0.0f, false, false, -41.14f, 25.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 7.62f, 9.27f)
                arcTo(157.58f, 157.58f, 0.0f, false, true, 69.91f, 73.0f)
                lineToRelative(26.48f, 29.13f)
                arcToRelative(122.21f, 122.21f, 0.0f, false, false, -44.12f, 22.19f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 7.46f, 9.41f)
                arcToRelative(110.0f, 110.0f, 0.0f, false, true, 45.87f, -21.47f)
                lineToRelative(31.13f, 34.25f)
                arcTo(74.4f, 74.4f, 0.0f, false, false, 128.0f, 146.0f)
                arcToRelative(73.44f, 73.44f, 0.0f, false, false, -43.53f, 14.15f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 88.0f, 171.0f)
                arcToRelative(5.93f, 5.93f, 0.0f, false, false, 3.53f, -1.15f)
                arcToRelative(62.0f, 62.0f, 0.0f, false, true, 59.76f, -7.31f)
                lineTo(203.56f, 220.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.88f, -8.08f)
                close()
                moveTo(235.81f, 88.55f)
                arcTo(170.32f, 170.32f, 0.0f, false, false, 128.0f, 50.0f)
                arcToRelative(173.45f, 173.45f, 0.0f, false, false, -21.76f, 1.38f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 1.52f, 11.9f)
                arcTo(160.58f, 160.58f, 0.0f, false, true, 128.0f, 62.0f)
                arcTo(158.26f, 158.26f, 0.0f, false, true, 228.19f, 97.82f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 7.62f, -9.27f)
                close()
                moveTo(196.27f, 133.75f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 200.0f, 135.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 3.73f, -10.7f)
                arcToRelative(122.26f, 122.26f, 0.0f, false, false, -50.9f, -23.81f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, -2.43f, 11.75f)
                arcTo(110.0f, 110.0f, 0.0f, false, true, 196.27f, 133.75f)
                close()
            }
        }
        .build()
        return _wifiSlash!!
    }

private var _wifiSlash: ImageVector? = null
