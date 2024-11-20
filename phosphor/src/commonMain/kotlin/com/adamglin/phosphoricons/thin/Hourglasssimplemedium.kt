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

public val ThinGroup.HourglassSimpleMedium: ImageVector
    get() {
        if (_hourglassSimpleMedium != null) {
            return _hourglassSimpleMedium!!
        }
        _hourglassSimpleMedium = Builder(name = "HourglassSimpleMedium", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(133.78f, 128.0f)
                lineToRelative(74.68f, -71.51f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 200.0f, 36.0f)
                horizontalLineTo(56.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -8.49f, 20.49f)
                lineToRelative(0.07f, 0.06f)
                lineTo(122.22f, 128.0f)
                lineTo(47.61f, 199.45f)
                lineToRelative(-0.07f, 0.06f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 56.0f, 220.0f)
                horizontalLineTo(200.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 8.42f, -20.55f)
                close()
                moveTo(87.84f, 84.0f)
                horizontalLineToRelative(80.32f)
                lineTo(128.0f, 122.46f)
                close()
                moveTo(52.33f, 46.47f)
                arcTo(3.93f, 3.93f, 0.0f, false, true, 56.0f, 44.0f)
                horizontalLineTo(200.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 2.89f, 6.77f)
                lineTo(176.51f, 76.0f)
                horizontalLineToRelative(-97.0f)
                lineTo(53.17f, 50.8f)
                arcTo(3.92f, 3.92f, 0.0f, false, true, 52.33f, 46.47f)
                close()
                moveTo(203.67f, 209.53f)
                arcTo(3.93f, 3.93f, 0.0f, false, true, 200.0f, 212.0f)
                horizontalLineTo(56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.86f, -6.8f)
                lineTo(124.0f, 137.37f)
                verticalLineTo(168.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                verticalLineTo(137.37f)
                lineToRelative(70.8f, 67.8f)
                arcTo(3.93f, 3.93f, 0.0f, false, true, 203.67f, 209.53f)
                close()
            }
        }
        .build()
        return _hourglassSimpleMedium!!
    }

private var _hourglassSimpleMedium: ImageVector? = null
