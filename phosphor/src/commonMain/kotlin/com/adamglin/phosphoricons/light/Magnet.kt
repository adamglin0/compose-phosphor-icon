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

public val LightGroup.Magnet: ImageVector
    get() {
        if (_magnet != null) {
            return _magnet!!
        }
        _magnet = Builder(name = "Magnet", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(205.56f, 51.65f)
                arcTo(85.5f, 85.5f, 0.0f, false, false, 144.6f, 26.0f)
                horizontalLineToRelative(-0.33f)
                arcTo(85.45f, 85.45f, 0.0f, false, false, 83.42f, 51.22f)
                lineTo(22.0f, 113.39f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 0.06f, 19.74f)
                lineToRelative(28.66f, 28.66f)
                arcToRelative(13.89f, 13.89f, 0.0f, false, false, 9.9f, 4.1f)
                horizontalLineToRelative(0.08f)
                arcToRelative(13.9f, 13.9f, 0.0f, false, false, 9.94f, -4.21f)
                lineToRelative(60.87f, -62.4f)
                arcTo(18.1f, 18.1f, 0.0f, false, true, 156.76f, 99.0f)
                arcToRelative(17.63f, 17.63f, 0.0f, false, true, 5.34f, 12.62f)
                arcToRelative(19.0f, 19.0f, 0.0f, false, true, -5.44f, 13.44f)
                lineTo(94.37f, 185.31f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -0.15f, 19.95f)
                lineToRelative(28.67f, 28.66f)
                arcToRelative(14.05f, 14.05f, 0.0f, false, false, 19.7f, 0.1f)
                lineToRelative(61.8f, -60.49f)
                curveTo(238.07f, 139.86f, 238.6f, 85.18f, 205.56f, 51.65f)
                close()
                moveTo(62.08f, 153.29f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.42f, 0.6f)
                arcToRelative(2.15f, 2.15f, 0.0f, false, true, -1.42f, -0.58f)
                lineTo(30.57f, 124.65f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, -2.82f)
                lineTo(55.79f, 96.28f)
                lineToRelative(31.34f, 31.34f)
                close()
                moveTo(134.19f, 225.44f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.82f, 0.0f)
                lineToRelative(-28.66f, -28.66f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -0.59f, -1.43f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.6f, -1.41f)
                lineTo(128.51f, 169.0f)
                lineToRelative(31.34f, 31.33f)
                close()
                moveTo(196.0f, 165.0f)
                lineToRelative(-27.52f, 26.94f)
                lineToRelative(-31.29f, -31.29f)
                lineToRelative(27.9f, -27.0f)
                lineToRelative(0.07f, -0.08f)
                arcToRelative(30.93f, 30.93f, 0.0f, false, false, 9.0f, -22.06f)
                arcToRelative(29.47f, 29.47f, 0.0f, false, false, -9.0f, -21.15f)
                arcToRelative(30.17f, 30.17f, 0.0f, false, false, -42.08f, 0.46f)
                lineTo(95.51f, 119.0f)
                lineTo(64.22f, 87.74f)
                lineTo(91.94f, 59.68f)
                arcTo(73.47f, 73.47f, 0.0f, false, true, 144.27f, 38.0f)
                horizontalLineToRelative(0.28f)
                arcTo(73.52f, 73.52f, 0.0f, false, true, 197.0f, 60.08f)
                curveTo(225.44f, 88.92f, 224.94f, 136.0f, 196.0f, 165.0f)
                close()
            }
        }
        .build()
        return _magnet!!
    }

private var _magnet: ImageVector? = null
