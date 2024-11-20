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

public val LightGroup.ClockCounterClockwise: ImageVector
    get() {
        if (_clockCounterClockwise != null) {
            return _clockCounterClockwise!!
        }
        _clockCounterClockwise = Builder(name = "ClockCounterClockwise", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(134.0f, 80.0f)
                verticalLineToRelative(44.6f)
                lineToRelative(37.09f, 22.25f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.18f, 10.3f)
                lineToRelative(-40.0f, -24.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 122.0f, 128.0f)
                lineTo(122.0f, 80.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                close()
                moveTo(128.0f, 34.0f)
                arcTo(93.4f, 93.4f, 0.0f, false, false, 61.51f, 61.56f)
                curveToRelative(-8.58f, 8.68f, -16.0f, 17.0f, -23.51f, 25.8f)
                lineTo(38.0f, 64.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, 6.0f)
                lineTo(72.0f, 110.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                lineTo(44.73f, 98.0f)
                curveTo(52.86f, 88.29f, 60.79f, 79.35f, 70.0f, 70.0f)
                arcToRelative(82.0f, 82.0f, 0.0f, true, true, 1.7f, 117.62f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, -8.24f, 8.72f)
                arcTo(94.0f, 94.0f, 0.0f, true, false, 128.0f, 34.0f)
                close()
            }
        }
        .build()
        return _clockCounterClockwise!!
    }

private var _clockCounterClockwise: ImageVector? = null
