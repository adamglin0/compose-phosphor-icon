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

public val FillGroup.ClockCounterClockwise: ImageVector
    get() {
        if (_clockCounterClockwise != null) {
            return _clockCounterClockwise!!
        }
        _clockCounterClockwise = Builder(name = "ClockCounterClockwise", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 128.0f)
                arcTo(96.0f, 96.0f, 0.0f, false, true, 62.11f, 197.82f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 11.0f, -11.64f)
                arcTo(80.0f, 80.0f, 0.0f, true, false, 71.43f, 71.43f)
                curveTo(67.9f, 75.0f, 64.58f, 78.51f, 61.35f, 82.0f)
                lineTo(77.66f, 98.34f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 72.0f, 112.0f)
                horizontalLineTo(32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f)
                verticalLineTo(64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 13.66f, -5.66f)
                lineTo(50.0f, 70.7f)
                curveToRelative(3.22f, -3.49f, 6.54f, -7.0f, 10.06f, -10.55f)
                arcTo(96.0f, 96.0f, 0.0f, false, true, 224.0f, 128.0f)
                close()
                moveTo(128.0f, 72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineToRelative(48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 3.88f, 6.86f)
                lineToRelative(40.0f, 24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 8.24f, -13.72f)
                lineTo(136.0f, 123.47f)
                verticalLineTo(80.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 128.0f, 72.0f)
                close()
            }
        }
        .build()
        return _clockCounterClockwise!!
    }

private var _clockCounterClockwise: ImageVector? = null
