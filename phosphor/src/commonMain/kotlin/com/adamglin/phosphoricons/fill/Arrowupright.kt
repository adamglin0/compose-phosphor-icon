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

public val FillGroup.ArrowUpRight: ImageVector
    get() {
        if (_arrowUpRight != null) {
            return _arrowUpRight!!
        }
        _arrowUpRight = Builder(name = "ArrowUpRight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.0f, 64.0f)
                verticalLineTo(168.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -13.66f, 5.66f)
                lineTo(140.0f, 127.31f)
                lineTo(69.66f, 197.66f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, -11.32f)
                lineTo(128.69f, 116.0f)
                lineTo(82.34f, 69.66f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 88.0f, 56.0f)
                horizontalLineTo(192.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 200.0f, 64.0f)
                close()
            }
        }
        .build()
        return _arrowUpRight!!
    }

private var _arrowUpRight: ImageVector? = null
