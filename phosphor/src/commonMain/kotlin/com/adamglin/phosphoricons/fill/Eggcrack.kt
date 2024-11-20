package com.adamglin.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.FillGroup

public val FillGroup.EggCrack: ImageVector
    get() {
        if (_eggCrack != null) {
            return _eggCrack!!
        }
        _eggCrack = Builder(name = "EggCrack", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 152.0f)
                arcToRelative(88.11f, 88.11f, 0.0f, false, true, -87.8f, 88.0f)
                curveToRelative(-50.66f, 0.12f, -90.21f, -43.0f, -88.12f, -93.62f)
                curveToRelative(1.21f, -29.21f, 11.71f, -60.54f, 29.23f, -86.82f)
                curveTo(87.5f, 32.29f, 109.43f, 16.0f, 128.0f, 16.0f)
                curveToRelative(13.25f, 0.0f, 28.23f, 8.32f, 42.34f, 23.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.09f, 5.44f)
                lineTo(122.0f, 98.67f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 4.0f, 13.09f)
                lineToRelative(24.61f, 6.15f)
                lineToRelative(-6.51f, 32.52f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 6.28f, 9.41f)
                arcTo(7.7f, 7.7f, 0.0f, false, false, 152.0f, 160.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.83f, -6.43f)
                lineToRelative(8.0f, -40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -5.9f, -9.33f)
                lineToRelative(-19.16f, -4.79f)
                lineToRelative(36.89f, -41.33f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 6.29f, 0.41f)
                curveToRelative(0.24f, 0.34f, 0.47f, 0.68f, 0.7f, 1.0f)
                curveTo(205.3f, 87.54f, 216.0f, 121.23f, 216.0f, 152.0f)
                close()
            }
        }
        .build()
        return _eggCrack!!
    }

private var _eggCrack: ImageVector? = null
