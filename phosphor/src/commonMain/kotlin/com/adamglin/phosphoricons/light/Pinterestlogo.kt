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

public val LightGroup.PinterestLogo: ImageVector
    get() {
        if (_pinterestLogo != null) {
            return _pinterestLogo!!
        }
        _pinterestLogo = Builder(name = "PinterestLogo", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(222.0f, 112.0f)
                curveToRelative(0.0f, 22.05f, -7.7f, 42.19f, -21.68f, 56.73f)
                curveTo(187.32f, 182.25f, 169.71f, 190.0f, 152.0f, 190.0f)
                curveToRelative(-19.42f, 0.0f, -31.55f, -7.07f, -38.63f, -13.64f)
                lineToRelative(-11.53f, 49.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 96.0f, 230.0f)
                arcToRelative(5.89f, 5.89f, 0.0f, false, true, -1.37f, -0.16f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -4.47f, -7.21f)
                lineToRelative(32.0f, -136.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, 11.68f, 2.74f)
                lineTo(116.75f, 162.0f)
                curveToRelative(2.8f, 4.33f, 12.46f, 16.0f, 35.25f, 16.0f)
                curveToRelative(28.51f, 0.0f, 58.0f, -24.69f, 58.0f, -66.0f)
                arcTo(74.0f, 74.0f, 0.0f, true, false, 71.9f, 149.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -10.39f, 6.0f)
                arcTo(86.0f, 86.0f, 0.0f, true, true, 222.0f, 112.0f)
                close()
            }
        }
        .build()
        return _pinterestLogo!!
    }

private var _pinterestLogo: ImageVector? = null
