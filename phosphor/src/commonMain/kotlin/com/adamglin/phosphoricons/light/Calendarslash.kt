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

public val LightGroup.Calendarslash: ImageVector
    get() {
        if (_calendarslash != null) {
            return _calendarslash!!
        }
        _calendarslash = Builder(name = "Calendarslash", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(52.44f, 36.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 48.0f, 34.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 34.0f, 48.0f)
                verticalLineTo(208.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                horizontalLineTo(208.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 4.44f, -10.0f)
                close()
                moveTo(46.26f, 47.0f)
                lineTo(78.07f, 82.0f)
                horizontalLineTo(46.0f)
                verticalLineTo(48.0f)
                arcTo(2.06f, 2.06f, 0.0f, false, true, 46.26f, 47.0f)
                close()
                moveTo(48.0f, 210.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                verticalLineTo(94.0f)
                horizontalLineTo(89.0f)
                lineTo(194.44f, 210.0f)
                close()
                moveTo(222.0f, 48.0f)
                verticalLineTo(177.23f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -12.0f, 0.0f)
                verticalLineTo(94.0f)
                horizontalLineTo(134.88f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineTo(210.0f)
                verticalLineTo(48.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                horizontalLineTo(182.0f)
                verticalLineTo(56.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                verticalLineTo(46.0f)
                horizontalLineTo(91.25f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineTo(170.0f)
                verticalLineTo(24.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                verticalLineTo(34.0f)
                horizontalLineToRelative(26.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 222.0f, 48.0f)
                close()
            }
        }
        .build()
        return _calendarslash!!
    }

private var _calendarslash: ImageVector? = null
