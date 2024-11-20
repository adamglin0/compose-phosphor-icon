package com.adamglin.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.ThinGroup

public val ThinGroup.PatreonLogo: ImageVector
    get() {
        if (_patreonLogo != null) {
            return _patreonLogo!!
        }
        _patreonLogo = Builder(name = "PatreonLogo", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(185.85f, 35.7f)
                curveToRelative(-18.11f, -7.41f, -39.68f, -9.56f, -60.76f, -6.06f)
                curveTo(102.5f, 33.4f, 83.0f, 43.1f, 68.62f, 57.7f)
                curveTo(58.0f, 68.5f, 45.11f, 89.65f, 44.06f, 129.0f)
                curveToRelative(-0.69f, 25.95f, 4.29f, 54.29f, 13.3f, 75.79f)
                curveTo(65.8f, 224.92f, 76.51f, 236.0f, 87.52f, 236.0f)
                curveToRelative(20.5f, 0.0f, 29.78f, -18.13f, 39.61f, -37.32f)
                curveToRelative(7.19f, -14.05f, 14.63f, -28.57f, 26.86f, -36.87f)
                curveToRelative(6.25f, -4.23f, 14.39f, -7.37f, 23.0f, -10.7f)
                curveToRelative(22.72f, -8.76f, 51.0f, -19.67f, 51.0f, -57.94f)
                curveTo(228.0f, 67.6f, 212.64f, 46.66f, 185.85f, 35.7f)
                close()
                moveTo(174.13f, 143.64f)
                curveToRelative(-9.06f, 3.5f, -17.63f, 6.8f, -24.63f, 11.55f)
                curveToRelative(-13.93f, 9.45f, -22.2f, 25.6f, -29.49f, 39.84f)
                curveToRelative(-9.06f, 17.69f, -16.88f, 33.0f, -32.49f, 33.0f)
                curveToRelative(-7.36f, 0.0f, -15.88f, -9.83f, -22.78f, -26.3f)
                curveToRelative(-8.6f, -20.51f, -13.34f, -47.61f, -12.68f, -72.49f)
                curveToRelative(1.0f, -36.75f, 12.64f, -56.12f, 22.26f, -65.9f)
                curveToRelative(18.86f, -19.19f, 45.53f, -27.23f, 70.33f, -27.23f)
                curveToRelative(13.88f, 0.0f, 27.18f, 2.52f, 38.17f, 7.0f)
                curveTo(215.17f, 56.34f, 220.0f, 80.15f, 220.0f, 93.17f)
                curveTo(220.0f, 126.0f, 196.68f, 135.0f, 174.13f, 143.64f)
                close()
            }
        }
        .build()
        return _patreonLogo!!
    }

private var _patreonLogo: ImageVector? = null
