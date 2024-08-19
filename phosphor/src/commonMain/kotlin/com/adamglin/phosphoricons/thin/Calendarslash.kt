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

public val ThinGroup.Calendarslash: ImageVector
    get() {
        if (_calendarslash != null) {
            return _calendarslash!!
        }
        _calendarslash = Builder(name = "Calendarslash", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(51.0f, 37.31f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 48.0f, 36.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 36.0f, 48.0f)
                lineTo(36.0f, 208.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                lineTo(208.0f, 220.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.0f, -6.69f)
                close()
                moveTo(46.54f, 44.31f)
                lineTo(82.59f, 84.0f)
                lineTo(44.0f, 84.0f)
                lineTo(44.0f, 48.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 46.5f, 44.29f)
                close()
                moveTo(48.0f, 212.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                lineTo(44.0f, 92.0f)
                lineTo(89.87f, 92.0f)
                lineTo(199.0f, 212.0f)
                close()
                moveTo(220.0f, 48.0f)
                lineTo(220.0f, 177.23f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, -8.0f, 0.0f)
                lineTo(212.0f, 92.0f)
                lineTo(134.88f, 92.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                lineTo(212.0f, 84.0f)
                lineTo(212.0f, 48.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.0f)
                lineTo(180.0f, 44.0f)
                lineTo(180.0f, 56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                lineTo(172.0f, 44.0f)
                lineTo(91.25f, 44.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                lineTo(172.0f, 36.0f)
                lineTo(172.0f, 24.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                lineTo(180.0f, 36.0f)
                horizontalLineToRelative(28.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 220.0f, 48.0f)
                close()
            }
        }
        .build()
        return _calendarslash!!
    }

private var _calendarslash: ImageVector? = null
