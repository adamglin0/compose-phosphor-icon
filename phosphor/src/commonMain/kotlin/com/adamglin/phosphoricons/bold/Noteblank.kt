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

public val BoldGroup.Noteblank: ImageVector
    get() {
        if (_noteblank != null) {
            return _noteblank!!
        }
        _noteblank = Builder(name = "Noteblank", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 28.0f)
                horizontalLineTo(48.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 28.0f, 48.0f)
                verticalLineTo(208.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                horizontalLineTo(156.69f)
                arcToRelative(19.86f, 19.86f, 0.0f, false, false, 14.14f, -5.86f)
                lineToRelative(51.31f, -51.31f)
                arcTo(19.86f, 19.86f, 0.0f, false, false, 228.0f, 156.69f)
                verticalLineTo(48.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 208.0f, 28.0f)
                close()
                moveTo(52.0f, 52.0f)
                horizontalLineTo(204.0f)
                verticalLineToRelative(92.0f)
                horizontalLineTo(156.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                verticalLineToRelative(48.0f)
                horizontalLineTo(52.0f)
                close()
                moveTo(168.0f, 191.0f)
                verticalLineTo(168.0f)
                horizontalLineToRelative(23.0f)
                close()
            }
        }
        .build()
        return _noteblank!!
    }

private var _noteblank: ImageVector? = null
