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

public val ThinGroup.ChartLine: ImageVector
    get() {
        if (_chartLine != null) {
            return _chartLine!!
        }
        _chartLine = Builder(name = "ChartLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(228.0f, 208.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                horizontalLineTo(32.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                verticalLineTo(48.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                verticalLineTo(151.19f)
                lineTo(93.37f, 101.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.0f, -0.19f)
                lineToRelative(61.41f, 46.05f)
                lineTo(221.37f, 93.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.26f, 6.0f)
                lineToRelative(-64.0f, 56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.0f, 0.19f)
                lineToRelative(-61.41f, -46.0f)
                lineTo(36.0f, 161.81f)
                verticalLineTo(204.0f)
                horizontalLineTo(224.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 228.0f, 208.0f)
                close()
            }
        }
        .build()
        return _chartLine!!
    }

private var _chartLine: ImageVector? = null
