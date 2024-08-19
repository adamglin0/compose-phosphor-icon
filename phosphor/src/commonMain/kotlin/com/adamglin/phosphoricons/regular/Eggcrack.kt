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

public val RegularGroup.Eggcrack: ImageVector
    get() {
        if (_eggcrack != null) {
            return _eggcrack!!
        }
        _eggcrack = Builder(name = "Eggcrack", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(186.66f, 59.56f)
                curveTo(168.47f, 32.29f, 146.54f, 16.0f, 128.0f, 16.0f)
                reflectiveCurveTo(87.53f, 32.29f, 69.34f, 59.56f)
                curveTo(50.7f, 87.54f, 40.0f, 121.23f, 40.0f, 152.0f)
                arcToRelative(88.0f, 88.0f, 0.0f, false, false, 176.0f, 0.0f)
                curveTo(216.0f, 121.23f, 205.3f, 87.54f, 186.66f, 59.56f)
                close()
                moveTo(128.0f, 224.0f)
                arcToRelative(72.08f, 72.08f, 0.0f, false, true, -72.0f, -72.0f)
                curveToRelative(0.0f, -27.69f, 9.72f, -58.15f, 26.66f, -83.56f)
                curveTo(97.19f, 46.64f, 115.41f, 32.0f, 128.0f, 32.0f)
                curveToRelative(9.5f, 0.0f, 22.2f, 8.33f, 34.1f, 21.78f)
                lineTo(122.0f, 98.67f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 4.0f, 13.09f)
                lineToRelative(24.6f, 6.15f)
                lineToRelative(-6.5f, 32.52f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 6.27f, 9.41f)
                arcTo(7.77f, 7.77f, 0.0f, false, false, 152.0f, 160.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.83f, -6.43f)
                lineToRelative(8.0f, -40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -5.9f, -9.33f)
                lineToRelative(-19.16f, -4.79f)
                lineTo(172.1f, 66.6f)
                curveToRelative(0.42f, 0.61f, 0.83f, 1.22f, 1.24f, 1.84f)
                curveTo(190.28f, 93.85f, 200.0f, 124.31f, 200.0f, 152.0f)
                arcTo(72.08f, 72.08f, 0.0f, false, true, 128.0f, 224.0f)
                close()
            }
        }
        .build()
        return _eggcrack!!
    }

private var _eggcrack: ImageVector? = null
