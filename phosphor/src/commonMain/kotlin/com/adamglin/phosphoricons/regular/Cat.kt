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

public val RegularGroup.Cat: ImageVector
    get() {
        if (_cat != null) {
            return _cat!!
        }
        _cat = Builder(name = "Cat", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(96.0f, 140.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 96.0f, 140.0f)
                close()
                moveTo(172.0f, 128.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 172.0f, 128.0f)
                close()
                moveTo(232.0f, 48.0f)
                verticalLineToRelative(88.0f)
                curveToRelative(0.0f, 52.93f, -46.65f, 96.0f, -104.0f, 96.0f)
                reflectiveCurveTo(24.0f, 188.93f, 24.0f, 136.0f)
                lineTo(24.0f, 48.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 51.31f, 36.69f)
                curveToRelative(0.14f, 0.14f, 0.26f, 0.27f, 0.38f, 0.41f)
                lineTo(69.0f, 57.0f)
                arcToRelative(111.22f, 111.22f, 0.0f, false, true, 118.1f, 0.0f)
                lineTo(204.31f, 37.1f)
                curveToRelative(0.12f, -0.14f, 0.24f, -0.27f, 0.38f, -0.41f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 232.0f, 48.0f)
                close()
                moveTo(216.0f, 48.0f)
                lineTo(194.44f, 72.8f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 183.63f, 74.0f)
                arcTo(88.86f, 88.86f, 0.0f, false, false, 168.0f, 64.75f)
                lineTo(168.0f, 88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -16.0f, 0.0f)
                lineTo(152.0f, 59.05f)
                arcToRelative(97.43f, 97.43f, 0.0f, false, false, -16.0f, -2.72f)
                lineTo(136.0f, 88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -16.0f, 0.0f)
                lineTo(120.0f, 56.33f)
                arcToRelative(97.43f, 97.43f, 0.0f, false, false, -16.0f, 2.72f)
                lineTo(104.0f, 88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -16.0f, 0.0f)
                lineTo(88.0f, 64.75f)
                arcTo(88.86f, 88.86f, 0.0f, false, false, 72.37f, 74.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -10.81f, -1.17f)
                lineTo(40.0f, 48.0f)
                verticalLineToRelative(88.0f)
                curveToRelative(0.0f, 41.66f, 35.21f, 76.0f, 80.0f, 79.67f)
                lineTo(120.0f, 195.31f)
                lineToRelative(-13.66f, -13.66f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, -11.31f)
                lineTo(128.0f, 180.68f)
                lineToRelative(10.34f, -10.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, 11.31f)
                lineTo(136.0f, 195.31f)
                verticalLineToRelative(20.36f)
                curveToRelative(44.79f, -3.69f, 80.0f, -38.0f, 80.0f, -79.67f)
                close()
            }
        }
        .build()
        return _cat!!
    }

private var _cat: ImageVector? = null
