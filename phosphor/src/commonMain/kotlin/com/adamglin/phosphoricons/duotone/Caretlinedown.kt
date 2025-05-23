package com.adamglin.phosphoricons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.DuotoneGroup

public val DuotoneGroup.CaretLineDown: ImageVector
    get() {
        if (_caretLineDown != null) {
            return _caretLineDown!!
        }
        _caretLineDown = Builder(name = "CaretLineDown", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(208.0f, 72.0f)
                lineToRelative(-80.0f, 80.0f)
                lineTo(48.0f, 72.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(122.34f, 157.66f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.32f, 0.0f)
                lineToRelative(80.0f, -80.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 208.0f, 64.0f)
                horizontalLineTo(48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -5.66f, 13.66f)
                close()
                moveTo(188.69f, 80.0f)
                lineTo(128.0f, 140.69f)
                lineTo(67.31f, 80.0f)
                close()
                moveTo(216.0f, 192.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                horizontalLineTo(48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineTo(208.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 216.0f, 192.0f)
                close()
            }
        }
        .build()
        return _caretLineDown!!
    }

private var _caretLineDown: ImageVector? = null
