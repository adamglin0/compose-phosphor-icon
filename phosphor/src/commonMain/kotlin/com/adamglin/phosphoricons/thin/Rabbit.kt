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

public val ThinGroup.Rabbit: ImageVector
    get() {
        if (_rabbit != null) {
            return _rabbit!!
        }
        _rabbit = Builder(name = "Rabbit", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(108.0f, 164.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -8.0f, -8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 108.0f, 164.0f)
                close()
                moveTo(156.0f, 156.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 8.0f, 8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 156.0f, 156.0f)
                close()
                moveTo(212.0f, 188.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, true, -84.0f, 31.75f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, true, -67.51f, -68.0f)
                arcToRelative(67.64f, 67.64f, 0.0f, false, true, 7.0f, -22.78f)
                curveTo(48.85f, 92.61f, 36.63f, 41.7f, 49.06f, 21.15f)
                arcToRelative(17.92f, 17.92f, 0.0f, false, true, 16.0f, -9.15f)
                curveToRelative(12.17f, 0.0f, 23.19f, 11.41f, 32.76f, 33.92f)
                curveTo(104.53f, 61.7f, 109.37f, 80.0f, 112.45f, 93.79f)
                arcToRelative(68.44f, 68.44f, 0.0f, false, true, 31.1f, 0.0f)
                curveToRelative(3.08f, -13.8f, 7.92f, -32.09f, 14.63f, -47.87f)
                curveTo(167.75f, 23.41f, 178.77f, 12.0f, 190.94f, 12.0f)
                arcToRelative(17.92f, 17.92f, 0.0f, false, true, 16.0f, 9.15f)
                curveToRelative(12.43f, 20.55f, 0.21f, 71.46f, -18.4f, 107.86f)
                arcToRelative(67.64f, 67.64f, 0.0f, false, true, 7.0f, 22.78f)
                arcTo(47.81f, 47.81f, 0.0f, false, true, 212.0f, 188.0f)
                close()
                moveTo(151.23f, 96.1f)
                arcToRelative(67.9f, 67.9f, 0.0f, false, true, 22.63f, 13.69f)
                arcToRelative(69.0f, 69.0f, 0.0f, false, true, 9.78f, 11.11f)
                curveToRelative(17.88f, -37.07f, 25.59f, -80.5f, 16.45f, -95.61f)
                arcTo(9.91f, 9.91f, 0.0f, false, false, 190.94f, 20.0f)
                curveTo(176.54f, 20.0f, 161.78f, 48.37f, 151.23f, 96.1f)
                close()
                moveTo(72.36f, 120.9f)
                arcToRelative(69.0f, 69.0f, 0.0f, false, true, 9.78f, -11.11f)
                arcTo(67.9f, 67.9f, 0.0f, false, true, 104.77f, 96.1f)
                curveTo(94.22f, 48.37f, 79.46f, 20.0f, 65.06f, 20.0f)
                arcToRelative(9.91f, 9.91f, 0.0f, false, false, -9.15f, 5.29f)
                curveTo(46.77f, 40.4f, 54.48f, 83.83f, 72.36f, 120.9f)
                close()
                moveTo(204.0f, 188.0f)
                arcToRelative(39.86f, 39.86f, 0.0f, false, false, -14.82f, -31.08f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -1.46f, -2.72f)
                arcToRelative(60.0f, 60.0f, 0.0f, false, false, -119.44f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -1.46f, 2.72f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, false, 55.64f, 57.0f)
                lineToRelative(-13.0f, -10.82f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 5.12f, -6.16f)
                lineTo(128.0f, 208.1f)
                lineToRelative(13.44f, -11.18f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.12f, 6.16f)
                lineToRelative(-13.0f, 10.82f)
                arcTo(40.0f, 40.0f, 0.0f, false, false, 204.0f, 188.0f)
                close()
            }
        }
        .build()
        return _rabbit!!
    }

private var _rabbit: ImageVector? = null
