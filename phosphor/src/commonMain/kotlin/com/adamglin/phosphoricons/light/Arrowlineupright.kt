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

public val LightGroup.ArrowLineUpRight: ImageVector
    get() {
        if (_arrowLineUpRight != null) {
            return _arrowLineUpRight!!
        }
        _arrowLineUpRight = Builder(name = "ArrowLineUpRight", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(222.0f, 216.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                horizontalLineTo(40.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineTo(216.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 222.0f, 216.0f)
                close()
                moveTo(80.0f, 174.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 4.24f, -1.76f)
                lineTo(186.0f, 70.49f)
                verticalLineTo(152.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                verticalLineTo(56.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, -6.0f)
                horizontalLineTo(96.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineToRelative(81.51f)
                lineTo(75.76f, 163.76f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 80.0f, 174.0f)
                close()
            }
        }
        .build()
        return _arrowLineUpRight!!
    }

private var _arrowLineUpRight: ImageVector? = null
