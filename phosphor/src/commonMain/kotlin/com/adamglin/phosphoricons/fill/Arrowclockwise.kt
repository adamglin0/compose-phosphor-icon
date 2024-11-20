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

public val FillGroup.ArrowClockwise: ImageVector
    get() {
        if (_arrowClockwise != null) {
            return _arrowClockwise!!
        }
        _arrowClockwise = Builder(name = "ArrowClockwise", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.0f, 56.0f)
                verticalLineToRelative(48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                horizontalLineTo(184.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -5.66f, -13.66f)
                lineToRelative(17.0f, -17.0f)
                lineToRelative(-10.55f, -9.65f)
                lineToRelative(-0.25f, -0.24f)
                arcToRelative(80.0f, 80.0f, 0.0f, true, false, -1.67f, 114.78f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 11.0f, 11.63f)
                arcTo(95.44f, 95.44f, 0.0f, false, true, 128.0f, 224.0f)
                horizontalLineToRelative(-1.32f)
                arcTo(96.0f, 96.0f, 0.0f, true, true, 195.75f, 60.0f)
                lineToRelative(10.93f, 10.0f)
                lineTo(226.34f, 50.3f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 240.0f, 56.0f)
                close()
            }
        }
        .build()
        return _arrowClockwise!!
    }

private var _arrowClockwise: ImageVector? = null
