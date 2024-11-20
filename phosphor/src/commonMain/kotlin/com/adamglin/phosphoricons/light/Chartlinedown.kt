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

public val LightGroup.ChartLineDown: ImageVector
    get() {
        if (_chartLineDown != null) {
            return _chartLineDown!!
        }
        _chartLineDown = Builder(name = "ChartLineDown", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(230.0f, 208.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                horizontalLineTo(32.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, -6.0f)
                verticalLineTo(48.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                verticalLineTo(61.52f)
                lineToRelative(58.0f, 58.0f)
                lineToRelative(27.76f, -27.75f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 8.48f, 0.0f)
                lineTo(194.0f, 153.52f)
                verticalLineTo(128.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(5.62f, 5.62f, 0.0f, false, true, -0.11f, 1.1f)
                verticalLineToRelative(0.06f)
                arcToRelative(7.46f, 7.46f, 0.0f, false, true, -0.31f, 1.05f)
                lineToRelative(0.0f, 0.07f)
                arcToRelative(6.13f, 6.13f, 0.0f, false, true, -0.52f, 1.0f)
                lineToRelative(0.0f, 0.06f)
                arcToRelative(6.25f, 6.25f, 0.0f, false, true, -1.68f, 1.68f)
                lineToRelative(-0.06f, 0.0f)
                arcToRelative(6.13f, 6.13f, 0.0f, false, true, -1.0f, 0.52f)
                lineToRelative(-0.07f, 0.0f)
                arcToRelative(7.46f, 7.46f, 0.0f, false, true, -1.05f, 0.31f)
                horizontalLineToRelative(-0.06f)
                arcToRelative(5.62f, 5.62f, 0.0f, false, true, -1.1f, 0.11f)
                horizontalLineTo(160.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineToRelative(25.52f)
                lineTo(128.0f, 104.49f)
                lineToRelative(-27.76f, 27.75f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.48f, 0.0f)
                lineTo(38.0f, 78.48f)
                verticalLineTo(202.0f)
                horizontalLineTo(224.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 230.0f, 208.0f)
                close()
            }
        }
        .build()
        return _chartLineDown!!
    }

private var _chartLineDown: ImageVector? = null
