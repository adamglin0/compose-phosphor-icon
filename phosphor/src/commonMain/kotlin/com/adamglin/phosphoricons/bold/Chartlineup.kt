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

public val BoldGroup.ChartLineUp: ImageVector
    get() {
        if (_chartLineUp != null) {
            return _chartLineUp!!
        }
        _chartLineUp = Builder(name = "ChartLineUp", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(236.0f, 208.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                horizontalLineTo(32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, -12.0f)
                verticalLineTo(48.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                verticalLineToRelative(99.0f)
                lineToRelative(43.51f, -43.52f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, 0.0f)
                lineTo(128.0f, 127.0f)
                lineToRelative(43.0f, -43.0f)
                horizontalLineTo(160.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                horizontalLineToRelative(40.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, 12.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                verticalLineTo(101.0f)
                lineToRelative(-51.51f, 51.52f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.0f, 0.0f)
                lineTo(96.0f, 129.0f)
                lineTo(44.0f, 181.0f)
                verticalLineToRelative(15.0f)
                horizontalLineTo(224.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 236.0f, 208.0f)
                close()
            }
        }
        .build()
        return _chartLineUp!!
    }

private var _chartLineUp: ImageVector? = null
