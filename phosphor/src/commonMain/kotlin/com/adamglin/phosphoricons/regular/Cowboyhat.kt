package com.adamglin.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.RegularGroup

public val RegularGroup.CowboyHat: ImageVector
    get() {
        if (_cowboyHat != null) {
            return _cowboyHat!!
        }
        _cowboyHat = Builder(name = "CowboyHat", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 120.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -6.78f, 3.76f)
                arcTo(179.9f, 179.9f, 0.0f, false, true, 195.41f, 143.0f)
                lineTo(178.32f, 53.07f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -25.72f, -9.55f)
                lineToRelative(-0.13f, 0.1f)
                lineTo(128.0f, 64.0f)
                lineTo(103.53f, 43.62f)
                lineToRelative(-0.13f, -0.1f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -25.72f, 9.53f)
                lineTo(60.59f, 143.0f)
                arcToRelative(179.27f, 179.27f, 0.0f, false, true, -13.81f, -19.25f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 40.0f, 120.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, 0.0f, 80.0f)
                lineTo(216.0f, 200.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, 0.0f, -80.0f)
                close()
                moveTo(93.41f, 56.0f)
                lineTo(117.88f, 76.4f)
                lineToRelative(0.12f, 0.1f)
                arcToRelative(15.92f, 15.92f, 0.0f, false, false, 20.0f, 0.0f)
                lineToRelative(0.12f, -0.1f)
                lineTo(162.59f, 56.0f)
                lineToRelative(13.68f, 72.0f)
                lineTo(79.73f, 128.0f)
                close()
                moveTo(40.0f, 184.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, -4.14f, -47.64f)
                curveTo(51.28f, 159.83f, 67.73f, 174.65f, 82.4f, 184.0f)
                close()
                moveTo(128.0f, 184.0f)
                curveToRelative(-0.33f, 0.0f, -25.49f, -0.4f, -53.86f, -26.6f)
                lineTo(76.68f, 144.0f)
                lineTo(179.31f, 144.0f)
                lineToRelative(2.54f, 13.35f)
                arcToRelative(113.28f, 113.28f, 0.0f, false, true, -27.35f, 19.0f)
                curveTo(139.1f, 183.77f, 128.06f, 184.0f, 128.0f, 184.0f)
                close()
                moveTo(216.0f, 184.0f)
                lineTo(173.6f, 184.0f)
                curveToRelative(14.67f, -9.35f, 31.12f, -24.17f, 46.54f, -47.64f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 216.0f, 184.0f)
                close()
            }
        }
        .build()
        return _cowboyHat!!
    }

private var _cowboyHat: ImageVector? = null
