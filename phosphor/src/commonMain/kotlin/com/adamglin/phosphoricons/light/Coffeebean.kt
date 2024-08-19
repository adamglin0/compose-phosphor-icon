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

public val LightGroup.Coffeebean: ImageVector
    get() {
        if (_coffeebean != null) {
            return _coffeebean!!
        }
        _coffeebean = Builder(name = "Coffeebean", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(210.34f, 45.66f)
                curveTo(194.0f, 29.35f, 170.0f, 22.87f, 142.79f, 27.42f)
                curveTo(116.28f, 31.83f, 89.71f, 46.24f, 68.0f, 68.0f)
                reflectiveCurveToRelative(-36.14f, 48.3f, -40.56f, 74.81f)
                curveTo(22.87f, 170.0f, 29.35f, 194.0f, 45.66f, 210.34f)
                curveTo(58.57f, 223.25f, 76.29f, 230.0f, 96.64f, 230.0f)
                arcToRelative(101.59f, 101.59f, 0.0f, false, false, 16.57f, -1.41f)
                curveToRelative(26.51f, -4.42f, 53.08f, -18.83f, 74.82f, -40.56f)
                reflectiveCurveToRelative(36.14f, -48.31f, 40.56f, -74.82f)
                curveTo(233.13f, 86.0f, 226.65f, 62.0f, 210.34f, 45.66f)
                close()
                moveTo(76.46f, 76.46f)
                curveTo(101.52f, 51.4f, 132.46f, 38.0f, 159.18f, 38.0f)
                curveToRelative(12.58f, 0.0f, 24.22f, 3.0f, 33.87f, 9.12f)
                arcToRelative(108.0f, 108.0f, 0.0f, false, false, -34.71f, 18.0f)
                curveToRelative(-18.82f, 14.86f, -31.0f, 35.62f, -36.22f, 61.71f)
                curveTo(112.0f, 177.35f, 75.18f, 194.0f, 52.0f, 199.5f)
                curveTo(26.3f, 170.42f, 36.83f, 116.09f, 76.46f, 76.46f)
                close()
                moveTo(179.54f, 179.54f)
                curveTo(142.68f, 216.4f, 93.1f, 228.1f, 63.0f, 208.91f)
                arcToRelative(108.0f, 108.0f, 0.0f, false, false, 34.71f, -18.0f)
                curveToRelative(18.82f, -14.86f, 31.0f, -35.62f, 36.22f, -61.71f)
                curveTo(144.0f, 78.65f, 180.82f, 62.0f, 204.05f, 56.5f)
                curveTo(229.7f, 85.59f, 219.17f, 139.91f, 179.54f, 179.54f)
                close()
            }
        }
        .build()
        return _coffeebean!!
    }

private var _coffeebean: ImageVector? = null
