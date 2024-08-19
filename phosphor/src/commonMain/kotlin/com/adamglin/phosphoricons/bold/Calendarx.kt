package com.adamglin.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.BoldGroup

public val BoldGroup.Calendarx: ImageVector
    get() {
        if (_calendarx != null) {
            return _calendarx!!
        }
        _calendarx = Builder(name = "Calendarx", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(160.49f, 136.49f)
                lineTo(145.0f, 152.0f)
                lineToRelative(15.52f, 15.51f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.0f, 17.0f)
                lineTo(128.0f, 169.0f)
                lineToRelative(-15.51f, 15.52f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.0f, -17.0f)
                lineTo(111.0f, 152.0f)
                lineTo(95.51f, 136.49f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 17.0f, -17.0f)
                lineTo(128.0f, 135.0f)
                lineToRelative(15.51f, -15.52f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 17.0f, 17.0f)
                close()
                moveTo(228.0f, 48.0f)
                verticalLineTo(208.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -20.0f, 20.0f)
                horizontalLineTo(48.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -20.0f, -20.0f)
                verticalLineTo(48.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 48.0f, 28.0f)
                horizontalLineTo(68.0f)
                verticalLineTo(24.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(72.0f)
                verticalLineTo(24.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 228.0f, 48.0f)
                close()
                moveTo(52.0f, 52.0f)
                verticalLineTo(76.0f)
                horizontalLineTo(204.0f)
                verticalLineTo(52.0f)
                horizontalLineTo(188.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                horizontalLineTo(92.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                close()
                moveTo(204.0f, 204.0f)
                verticalLineTo(100.0f)
                horizontalLineTo(52.0f)
                verticalLineTo(204.0f)
                close()
            }
        }
        .build()
        return _calendarx!!
    }

private var _calendarx: ImageVector? = null
