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

public val RegularGroup.ArrowDown: ImageVector
    get() {
        if (_arrowDown != null) {
            return _arrowDown!!
        }
        _arrowDown = Builder(name = "ArrowDown", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(205.66f, 149.66f)
                lineToRelative(-72.0f, 72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, 0.0f)
                lineToRelative(-72.0f, -72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, -11.32f)
                lineTo(120.0f, 196.69f)
                verticalLineTo(40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                verticalLineTo(196.69f)
                lineToRelative(58.34f, -58.35f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, 11.32f)
                close()
            }
        }
        .build()
        return _arrowDown!!
    }

private var _arrowDown: ImageVector? = null
