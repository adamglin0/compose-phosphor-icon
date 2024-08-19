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

public val RegularGroup.Phonedisconnect: ImageVector
    get() {
        if (_phonedisconnect != null) {
            return _phonedisconnect!!
        }
        _phonedisconnect = Builder(name = "Phonedisconnect", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(231.59f, 90.13f)
                horizontalLineToRelative(0.0f)
                curveTo(175.44f, 34.0f, 80.56f, 34.0f, 24.41f, 90.13f)
                curveToRelative(-20.0f, 20.0f, -21.92f, 49.49f, -4.69f, 71.71f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 32.35f, 168.0f)
                arcToRelative(15.8f, 15.8f, 0.0f, false, false, 5.75f, -1.08f)
                lineToRelative(49.0f, -17.37f)
                lineToRelative(0.29f, -0.11f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 9.75f, -11.73f)
                lineToRelative(5.9f, -29.52f)
                arcToRelative(76.52f, 76.52f, 0.0f, false, true, 49.68f, -0.11f)
                horizontalLineToRelative(0.0f)
                lineToRelative(6.21f, 29.75f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 9.72f, 11.59f)
                lineToRelative(0.29f, 0.11f)
                lineToRelative(49.0f, 17.39f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 18.38f, -5.06f)
                curveTo(253.51f, 139.62f, 251.58f, 110.13f, 231.59f, 90.13f)
                close()
                moveTo(223.67f, 152.0f)
                lineToRelative(-0.3f, -0.12f)
                lineToRelative(-48.82f, -17.33f)
                lineToRelative(-6.21f, -29.74f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 158.0f, 93.0f)
                arcToRelative(92.56f, 92.56f, 0.0f, false, false, -60.34f, 0.13f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -10.32f, 12.0f)
                lineToRelative(-5.9f, 29.51f)
                lineTo(32.63f, 151.86f)
                curveToRelative(-0.1f, 0.0f, -0.17f, 0.13f, -0.27f, 0.17f)
                curveToRelative(-12.33f, -15.91f, -11.0f, -36.23f, 3.36f, -50.58f)
                curveToRelative(25.0f, -25.0f, 58.65f, -37.53f, 92.28f, -37.53f)
                reflectiveCurveToRelative(67.27f, 12.51f, 92.28f, 37.53f)
                curveTo(234.61f, 115.8f, 236.0f, 136.12f, 223.67f, 152.0f)
                close()
                moveTo(223.99f, 200.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                lineTo(40.0f, 208.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                lineTo(216.0f, 192.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 224.0f, 200.0f)
                close()
            }
        }
        .build()
        return _phonedisconnect!!
    }

private var _phonedisconnect: ImageVector? = null
