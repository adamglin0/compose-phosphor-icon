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

public val FillGroup.Calendarslash: ImageVector
    get() {
        if (_calendarslash != null) {
            return _calendarslash!!
        }
        _calendarslash = Builder(name = "Calendarslash", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 48.0f)
                verticalLineTo(187.57f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -7.0f, 2.7f)
                lineTo(116.8f, 80.0f)
                horizontalLineTo(208.0f)
                verticalLineTo(48.0f)
                horizontalLineTo(184.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.52f, 8.0f)
                arcTo(8.18f, 8.18f, 0.0f, false, true, 168.0f, 55.73f)
                verticalLineTo(48.0f)
                horizontalLineTo(87.71f)
                lineToRelative(-8.46f, -9.31f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.0f, -6.69f)
                horizontalLineTo(168.0f)
                verticalLineTo(24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.52f, -8.0f)
                arcTo(8.18f, 8.18f, 0.0f, false, true, 184.0f, 24.27f)
                verticalLineTo(32.0f)
                horizontalLineToRelative(24.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 224.0f, 48.0f)
                close()
                moveTo(213.92f, 210.62f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 208.0f, 224.0f)
                horizontalLineTo(48.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                verticalLineTo(48.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 48.0f, 32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 5.93f, 2.62f)
                close()
                moveTo(73.55f, 80.0f)
                lineTo(48.0f, 51.89f)
                verticalLineTo(80.0f)
                close()
            }
        }
        .build()
        return _calendarslash!!
    }

private var _calendarslash: ImageVector? = null
