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

public val LightGroup.CowboyHat: ImageVector
    get() {
        if (_cowboyHat != null) {
            return _cowboyHat!!
        }
        _cowboyHat = Builder(name = "CowboyHat", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 122.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -5.09f, 2.82f)
                arcToRelative(176.66f, 176.66f, 0.0f, false, true, -16.69f, 22.65f)
                lineToRelative(-17.87f, -94.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -22.5f, -8.35f)
                lineToRelative(-0.1f, 0.08f)
                lineTo(129.22f, 65.59f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.44f, 0.0f)
                lineTo(102.25f, 45.16f)
                lineToRelative(-0.1f, -0.08f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -22.5f, 8.34f)
                lineTo(61.77f, 147.49f)
                arcToRelative(178.33f, 178.33f, 0.0f, false, true, -16.68f, -22.67f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 40.0f, 122.0f)
                arcToRelative(38.0f, 38.0f, 0.0f, false, false, 0.0f, 76.0f)
                lineTo(216.0f, 198.0f)
                arcToRelative(38.0f, 38.0f, 0.0f, false, false, 0.0f, -76.0f)
                close()
                moveTo(91.44f, 55.65f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 3.18f, -1.22f)
                lineToRelative(24.54f, 20.43f)
                lineToRelative(0.09f, 0.08f)
                arcToRelative(13.93f, 13.93f, 0.0f, false, false, 17.5f, 0.0f)
                lineToRelative(0.09f, -0.08f)
                lineToRelative(24.54f, -20.43f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 3.18f, 1.23f)
                lineTo(178.69f, 130.0f)
                lineTo(77.31f, 130.0f)
                close()
                moveTo(40.0f, 186.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, true, -3.17f, -51.81f)
                curveTo(54.5f, 161.44f, 73.53f, 177.05f, 89.62f, 186.0f)
                close()
                moveTo(128.0f, 186.0f)
                curveToRelative(-0.34f, 0.0f, -26.71f, -0.41f, -56.0f, -27.91f)
                lineTo(75.0f, 142.0f)
                lineTo(181.0f, 142.0f)
                lineTo(184.0f, 158.05f)
                arcToRelative(115.79f, 115.79f, 0.0f, false, true, -28.89f, 20.19f)
                curveTo(139.38f, 185.81f, 128.08f, 186.0f, 128.0f, 186.0f)
                close()
                moveTo(216.0f, 186.0f)
                lineTo(166.38f, 186.0f)
                curveToRelative(16.09f, -8.95f, 35.12f, -24.56f, 52.79f, -51.81f)
                arcTo(26.0f, 26.0f, 0.0f, false, true, 216.0f, 186.0f)
                close()
            }
        }
        .build()
        return _cowboyHat!!
    }

private var _cowboyHat: ImageVector? = null
