package com.adamglin.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.BoldGroup

public val BoldGroup.Rabbit: ImageVector
    get() {
        if (_rabbit != null) {
            return _rabbit!!
        }
        _rabbit = Builder(name = "Rabbit", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(120.0f, 160.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 120.0f, 160.0f)
                close()
                moveTo(152.0f, 144.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, 16.0f, 16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 152.0f, 144.0f)
                close()
                moveTo(220.0f, 188.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, false, true, -92.0f, 42.89f)
                arcToRelative(56.0f, 56.0f, 0.0f, false, true, -75.0f, -83.0f)
                arcToRelative(75.47f, 75.47f, 0.0f, false, true, 5.59f, -18.74f)
                arcToRelative(241.48f, 241.48f, 0.0f, false, true, -19.8f, -58.23f)
                curveTo(35.55f, 54.21f, 33.54f, 31.35f, 42.21f, 17.0f)
                arcTo(25.89f, 25.89f, 0.0f, false, true, 65.06f, 4.0f)
                curveToRelative(22.63f, 0.0f, 40.6f, 27.11f, 53.48f, 80.6f)
                arcToRelative(74.88f, 74.88f, 0.0f, false, true, 18.92f, 0.0f)
                curveTo(150.34f, 31.11f, 168.31f, 4.0f, 190.94f, 4.0f)
                arcToRelative(25.89f, 25.89f, 0.0f, false, true, 22.85f, 13.0f)
                curveToRelative(8.67f, 14.34f, 6.66f, 37.2f, 3.45f, 53.86f)
                arcToRelative(241.48f, 241.48f, 0.0f, false, true, -19.8f, 58.23f)
                arcTo(75.6f, 75.6f, 0.0f, false, true, 203.0f, 147.84f)
                arcTo(55.76f, 55.76f, 0.0f, false, true, 220.0f, 188.0f)
                close()
                moveTo(160.53f, 91.32f)
                arcToRelative(75.84f, 75.84f, 0.0f, false, true, 18.72f, 12.56f)
                curveToRelative(0.78f, 0.71f, 1.53f, 1.43f, 2.28f, 2.17f)
                arcToRelative(211.0f, 211.0f, 0.0f, false, false, 12.14f, -39.73f)
                curveToRelative(3.9f, -20.23f, 2.34f, -32.33f, -0.42f, -36.9f)
                curveTo(192.43f, 28.07f, 192.0f, 28.0f, 190.94f, 28.0f)
                curveTo(184.77f, 28.0f, 171.51f, 45.4f, 160.53f, 91.32f)
                close()
                moveTo(74.47f, 106.05f)
                curveToRelative(0.74f, -0.73f, 1.5f, -1.46f, 2.28f, -2.17f)
                arcTo(75.84f, 75.84f, 0.0f, false, true, 95.47f, 91.32f)
                curveTo(84.49f, 45.4f, 71.23f, 28.0f, 65.06f, 28.0f)
                curveToRelative(-1.08f, 0.0f, -1.49f, 0.07f, -2.31f, 1.42f)
                curveTo(56.54f, 39.7f, 60.73f, 72.84f, 74.47f, 106.05f)
                close()
                moveTo(196.0f, 188.0f)
                arcToRelative(31.9f, 31.9f, 0.0f, false, false, -11.86f, -24.87f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -4.38f, -8.17f)
                arcToRelative(52.0f, 52.0f, 0.0f, false, false, -103.52f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -4.38f, 8.17f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 38.47f, 51.08f)
                lineToRelative(-6.0f, -5.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 15.34f, -18.46f)
                lineTo(128.0f, 197.7f)
                lineToRelative(8.33f, -6.93f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 15.34f, 18.46f)
                lineToRelative(-6.0f, 5.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 196.0f, 188.0f)
                close()
            }
        }
        .build()
        return _rabbit!!
    }

private var _rabbit: ImageVector? = null
