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

public val LightGroup.Warehouse: ImageVector
    get() {
        if (_warehouse != null) {
            return _warehouse!!
        }
        _warehouse = Builder(name = "Warehouse", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.0f, 186.0f)
                horizontalLineTo(230.0f)
                verticalLineTo(56.28f)
                lineToRelative(11.26f, -2.41f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, -2.52f, -11.74f)
                lineToRelative(-224.0f, 48.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 2.52f, 11.74f)
                lineTo(26.0f, 100.0f)
                verticalLineToRelative(86.0f)
                horizontalLineTo(16.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineTo(240.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                close()
                moveTo(38.0f, 97.42f)
                lineTo(218.0f, 58.85f)
                verticalLineTo(186.0f)
                horizontalLineTo(190.0f)
                verticalLineTo(128.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, -6.0f)
                horizontalLineTo(72.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                verticalLineToRelative(58.0f)
                horizontalLineTo(38.0f)
                close()
                moveTo(178.0f, 154.0f)
                horizontalLineTo(78.0f)
                verticalLineTo(134.0f)
                horizontalLineTo(178.0f)
                close()
                moveTo(78.0f, 166.0f)
                horizontalLineTo(178.0f)
                verticalLineToRelative(20.0f)
                horizontalLineTo(78.0f)
                close()
            }
        }
        .build()
        return _warehouse!!
    }

private var _warehouse: ImageVector? = null
