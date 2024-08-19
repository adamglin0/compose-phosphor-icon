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

public val BoldGroup.Pen: ImageVector
    get() {
        if (_pen != null) {
            return _pen!!
        }
        _pen = Builder(name = "Pen", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(230.15f, 70.54f)
                lineTo(185.46f, 25.86f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -28.28f, 0.0f)
                lineTo(33.86f, 149.17f)
                arcTo(19.86f, 19.86f, 0.0f, false, false, 28.0f, 163.31f)
                verticalLineTo(208.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                horizontalLineTo(92.69f)
                arcToRelative(19.85f, 19.85f, 0.0f, false, false, 14.14f, -5.86f)
                lineToRelative(79.46f, -79.45f)
                lineToRelative(4.16f, 13.89f)
                lineToRelative(-34.93f, 34.93f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.0f, 17.0f)
                lineToRelative(40.0f, -40.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 3.0f, -11.94f)
                lineToRelative(-9.94f, -33.13f)
                lineToRelative(24.59f, -24.59f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 230.15f, 70.54f)
                close()
                moveTo(65.0f, 152.0f)
                lineToRelative(71.0f, -71.0f)
                lineToRelative(39.0f, 39.0f)
                lineToRelative(-71.0f, 71.0f)
                close()
                moveTo(52.0f, 173.0f)
                lineToRelative(31.0f, 31.0f)
                horizontalLineTo(52.0f)
                close()
                moveTo(192.0f, 103.0f)
                lineTo(153.0f, 64.0f)
                lineToRelative(18.34f, -18.34f)
                lineToRelative(39.0f, 39.0f)
                close()
            }
        }
        .build()
        return _pen!!
    }

private var _pen: ImageVector? = null
