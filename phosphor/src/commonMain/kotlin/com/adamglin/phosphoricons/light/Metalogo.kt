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

public val LightGroup.MetaLogo: ImageVector
    get() {
        if (_metaLogo != null) {
            return _metaLogo!!
        }
        _metaLogo = Builder(name = "MetaLogo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(238.0f, 149.31f)
                curveToRelative(0.0f, 15.75f, -3.07f, 29.17f, -8.88f, 38.81f)
                curveToRelative(-7.05f, 11.7f, -18.0f, 17.88f, -31.68f, 17.88f)
                curveToRelative(-26.74f, 0.0f, -46.3f, -36.51f, -67.0f, -75.17f)
                curveTo(113.14f, 98.57f, 93.55f, 62.0f, 74.0f, 62.0f)
                curveToRelative(-23.28f, 0.0f, -44.0f, 48.83f, -44.0f, 87.31f)
                curveToRelative(0.0f, 13.57f, 2.48f, 24.84f, 7.16f, 32.62f)
                curveToRelative(4.9f, 8.12f, 11.9f, 12.07f, 21.4f, 12.07f)
                curveToRelative(16.16f, 0.0f, 32.31f, -25.06f, 46.0f, -49.57f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 115.0f, 150.27f)
                curveTo(100.0f, 177.23f, 82.0f, 206.0f, 58.56f, 206.0f)
                curveToRelative(-13.67f, 0.0f, -24.63f, -6.18f, -31.68f, -17.88f)
                curveTo(21.07f, 178.48f, 18.0f, 165.06f, 18.0f, 149.31f)
                curveTo(18.0f, 108.82f, 39.81f, 50.0f, 74.0f, 50.0f)
                curveToRelative(26.74f, 0.0f, 46.3f, 36.51f, 67.0f, 75.17f)
                curveTo(158.29f, 157.43f, 177.88f, 194.0f, 197.44f, 194.0f)
                curveToRelative(9.5f, 0.0f, 16.5f, -3.95f, 21.4f, -12.07f)
                curveToRelative(4.68f, -7.78f, 7.16f, -19.05f, 7.16f, -32.62f)
                curveTo(226.0f, 110.83f, 205.29f, 62.0f, 182.0f, 62.0f)
                curveToRelative(-9.0f, 0.0f, -18.91f, 7.76f, -30.14f, 23.73f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -9.82f, -6.91f)
                curveTo(150.75f, 66.45f, 164.37f, 50.0f, 182.0f, 50.0f)
                curveTo(216.19f, 50.0f, 238.0f, 108.82f, 238.0f, 149.31f)
                close()
            }
        }
        .build()
        return _metaLogo!!
    }

private var _metaLogo: ImageVector? = null
