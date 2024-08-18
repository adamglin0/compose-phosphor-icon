package com.adamglin.phosphor.phosphoricon.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphor.phosphoricon.RegularGroup

public val RegularGroup.Planet: ImageVector
    get() {
        if (_planet != null) {
            return _planet!!
        }
        _planet = Builder(name = "Planet", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(245.11f, 60.68f)
                curveToRelative(-7.65f, -13.19f, -27.84f, -16.16f, -58.5f, -8.66f)
                arcTo(95.93f, 95.93f, 0.0f, false, false, 32.0f, 128.0f)
                arcToRelative(98.0f, 98.0f, 0.0f, false, false, 0.78f, 12.31f)
                curveTo(5.09f, 169.0f, 5.49f, 186.0f, 10.9f, 195.32f)
                curveTo(16.0f, 204.16f, 26.64f, 208.0f, 40.64f, 208.0f)
                arcToRelative(124.11f, 124.11f, 0.0f, false, false, 28.79f, -4.0f)
                arcTo(95.93f, 95.93f, 0.0f, false, false, 224.0f, 128.0f)
                arcToRelative(97.08f, 97.08f, 0.0f, false, false, -0.77f, -12.25f)
                curveToRelative(12.5f, -13.0f, 20.82f, -25.35f, 23.65f, -35.92f)
                curveTo(248.83f, 72.51f, 248.24f, 66.07f, 245.11f, 60.68f)
                close()
                moveTo(128.0f, 48.0f)
                arcToRelative(80.11f, 80.11f, 0.0f, false, true, 78.0f, 62.2f)
                curveToRelative(-17.06f, 16.06f, -40.15f, 32.53f, -62.07f, 45.13f)
                curveTo(116.38f, 171.14f, 92.48f, 181.0f, 73.42f, 186.4f)
                arcTo(79.94f, 79.94f, 0.0f, false, true, 128.0f, 48.0f)
                close()
                moveTo(24.74f, 187.29f)
                curveToRelative(-1.46f, -2.51f, -0.65f, -7.24f, 2.22f, -13.0f)
                arcToRelative(79.05f, 79.05f, 0.0f, false, true, 10.29f, -15.05f)
                arcToRelative(96.0f, 96.0f, 0.0f, false, false, 18.0f, 31.32f)
                curveTo(38.0f, 193.46f, 27.24f, 191.61f, 24.74f, 187.29f)
                close()
                moveTo(128.0f, 208.0f)
                arcToRelative(79.45f, 79.45f, 0.0f, false, true, -38.56f, -9.94f)
                arcToRelative(370.0f, 370.0f, 0.0f, false, false, 62.43f, -28.86f)
                curveToRelative(21.58f, -12.39f, 40.68f, -25.82f, 56.07f, -39.08f)
                arcTo(80.07f, 80.07f, 0.0f, false, true, 128.0f, 208.0f)
                close()
                moveTo(231.42f, 75.69f)
                curveToRelative(-1.7f, 6.31f, -6.19f, 13.53f, -12.63f, 21.13f)
                arcToRelative(95.69f, 95.69f, 0.0f, false, false, -18.0f, -31.35f)
                curveToRelative(14.21f, -2.35f, 27.37f, -2.17f, 30.5f, 3.24f)
                curveTo(232.19f, 70.28f, 232.24f, 72.63f, 231.42f, 75.69f)
                close()
            }
        }
        .build()
        return _planet!!
    }

private var _planet: ImageVector? = null
