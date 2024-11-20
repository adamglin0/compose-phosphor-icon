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

public val ThinGroup.CowboyHat: ImageVector
    get() {
        if (_cowboyHat != null) {
            return _cowboyHat!!
        }
        _cowboyHat = Builder(name = "CowboyHat", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 124.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.39f, 1.88f)
                arcTo(174.9f, 174.9f, 0.0f, false, true, 193.0f, 151.81f)
                lineToRelative(-18.62f, -98.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 155.0f, 46.69f)
                lineTo(130.5f, 67.13f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.94f, 0.05f)
                lineTo(100.9f, 46.64f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -19.29f, 7.15f)
                lineTo(63.0f, 151.81f)
                arcToRelative(174.9f, 174.9f, 0.0f, false, true, -19.6f, -25.93f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 40.0f, 124.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, 0.0f, 72.0f)
                lineTo(216.0f, 196.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, 0.0f, -72.0f)
                close()
                moveTo(89.48f, 55.28f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 6.37f, -2.44f)
                lineTo(120.5f, 73.38f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 15.06f, -0.06f)
                lineToRelative(24.53f, -20.43f)
                arcToRelative(3.92f, 3.92f, 0.0f, false, true, 3.89f, -0.63f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 2.55f, 3.0f)
                lineTo(181.11f, 132.0f)
                lineTo(74.89f, 132.0f)
                close()
                moveTo(40.0f, 188.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, -2.15f, -55.92f)
                curveTo(58.3f, 164.0f, 80.59f, 180.0f, 97.9f, 188.0f)
                close()
                moveTo(128.0f, 188.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.27f, 0.0f, -11.78f, -0.21f, -27.77f, -7.84f)
                arcToRelative(118.23f, 118.23f, 0.0f, false, true, -30.43f, -21.4f)
                lineTo(73.37f, 140.0f)
                lineTo(182.63f, 140.0f)
                lineToRelative(3.56f, 18.76f)
                arcToRelative(118.23f, 118.23f, 0.0f, false, true, -30.43f, 21.4f)
                curveTo(139.77f, 187.79f, 128.26f, 188.0f, 128.0f, 188.0f)
                close()
                moveTo(216.0f, 188.0f)
                lineTo(158.1f, 188.0f)
                curveToRelative(17.31f, -8.0f, 39.6f, -24.0f, 60.05f, -55.92f)
                arcTo(28.0f, 28.0f, 0.0f, false, true, 216.0f, 188.0f)
                close()
            }
        }
        .build()
        return _cowboyHat!!
    }

private var _cowboyHat: ImageVector? = null
