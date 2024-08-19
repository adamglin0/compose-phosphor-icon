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

public val LightGroup.Speedometer: ImageVector
    get() {
        if (_speedometer != null) {
            return _speedometer!!
        }
        _speedometer = Builder(name = "Speedometer", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(115.76f, 155.76f)
                lineToRelative(96.0f, -96.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 8.48f, 8.48f)
                lineToRelative(-96.0f, 96.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.48f, -8.48f)
                close()
                moveTo(128.0f, 86.0f)
                arcToRelative(65.9f, 65.9f, 0.0f, false, true, 21.08f, 3.44f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 3.83f, -11.38f)
                arcToRelative(78.0f, 78.0f, 0.0f, false, false, -102.43f, 82.6f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, 5.34f)
                arcToRelative(5.12f, 5.12f, 0.0f, false, false, 0.67f, 0.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 5.3f, -6.62f)
                arcTo(69.0f, 69.0f, 0.0f, false, true, 62.0f, 152.0f)
                arcTo(66.08f, 66.08f, 0.0f, false, true, 128.0f, 86.0f)
                close()
                moveTo(226.0f, 101.9f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, -10.68f, 5.48f)
                arcToRelative(98.35f, 98.35f, 0.0f, false, true, 5.16f, 77.25f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.91f, 1.37f)
                lineTo(37.46f, 186.0f)
                arcToRelative(2.07f, 2.07f, 0.0f, false, true, -1.91f, -1.41f)
                arcTo(98.23f, 98.23f, 0.0f, false, true, 128.0f, 54.0f)
                horizontalLineToRelative(0.9f)
                arcToRelative(97.0f, 97.0f, 0.0f, false, true, 43.71f, 10.72f)
                arcTo(6.0f, 6.0f, 0.0f, true, false, 178.1f, 54.0f)
                arcTo(108.92f, 108.92f, 0.0f, false, false, 129.0f, 42.0f)
                horizontalLineToRelative(-1.0f)
                arcTo(110.06f, 110.06f, 0.0f, false, false, 24.23f, 188.58f)
                arcTo(14.08f, 14.08f, 0.0f, false, false, 37.46f, 198.0f)
                lineTo(218.53f, 198.0f)
                arcToRelative(14.06f, 14.06f, 0.0f, false, false, 13.22f, -9.37f)
                arcTo(110.34f, 110.34f, 0.0f, false, false, 226.0f, 101.9f)
                close()
            }
        }
        .build()
        return _speedometer!!
    }

private var _speedometer: ImageVector? = null
