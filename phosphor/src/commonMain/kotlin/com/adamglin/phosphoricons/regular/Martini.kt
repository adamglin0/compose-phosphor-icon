package com.adamglin.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.RegularGroup

public val RegularGroup.Martini: ImageVector
    get() {
        if (_martini != null) {
            return _martini!!
        }
        _martini = Builder(name = "Martini", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(237.66f, 45.66f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 232.0f, 32.0f)
                horizontalLineTo(24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -5.66f, 13.66f)
                lineTo(120.0f, 147.31f)
                verticalLineTo(208.0f)
                horizontalLineTo(88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                horizontalLineTo(136.0f)
                verticalLineTo(147.31f)
                close()
                moveTo(43.31f, 48.0f)
                horizontalLineTo(212.69f)
                lineToRelative(-16.0f, 16.0f)
                horizontalLineTo(59.31f)
                close()
                moveTo(128.0f, 132.69f)
                lineTo(75.31f, 80.0f)
                horizontalLineTo(180.69f)
                close()
            }
        }
        .build()
        return _martini!!
    }

private var _martini: ImageVector? = null
