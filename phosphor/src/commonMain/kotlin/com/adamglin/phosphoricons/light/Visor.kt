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

public val LightGroup.Visor: ImageVector
    get() {
        if (_visor != null) {
            return _visor!!
        }
        _visor = Builder(name = "Visor", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(183.05f, 58.0f)
                lineTo(72.0f, 58.0f)
                arcTo(70.0f, 70.0f, 0.0f, false, false, 2.08f, 131.3f)
                curveTo(3.72f, 167.0f, 33.0f, 196.24f, 68.62f, 197.92f)
                curveToRelative(15.31f, 0.71f, 31.0f, -5.77f, 48.0f, -19.84f)
                arcToRelative(17.89f, 17.89f, 0.0f, false, true, 22.8f, 0.0f)
                curveTo(149.75f, 186.66f, 165.6f, 198.0f, 184.0f, 198.0f)
                arcToRelative(70.0f, 70.0f, 0.0f, false, false, 70.0f, -70.93f)
                curveTo(253.5f, 89.0f, 221.67f, 58.0f, 183.05f, 58.0f)
                close()
                moveTo(225.28f, 168.74f)
                arcTo(57.57f, 57.57f, 0.0f, false, true, 184.0f, 186.0f)
                curveToRelative(-14.53f, 0.0f, -28.0f, -9.77f, -36.93f, -17.13f)
                arcToRelative(29.9f, 29.9f, 0.0f, false, false, -38.09f, 0.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-14.58f, 12.09f, -27.6f, 17.67f, -39.78f, 17.1f)
                arcToRelative(58.36f, 58.36f, 0.0f, false, true, -55.12f, -55.18f)
                arcTo(58.0f, 58.0f, 0.0f, false, true, 72.0f, 70.0f)
                lineTo(183.05f, 70.0f)
                curveToRelative(32.09f, 0.0f, 58.54f, 25.67f, 58.95f, 57.23f)
                arcTo(57.62f, 57.62f, 0.0f, false, true, 225.28f, 168.74f)
                close()
                moveTo(182.0f, 96.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                lineTo(80.0f, 102.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineToRelative(96.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 182.0f, 96.0f)
                close()
            }
        }
        .build()
        return _visor!!
    }

private var _visor: ImageVector? = null
