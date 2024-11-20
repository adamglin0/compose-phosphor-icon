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

public val DuotoneGroup.CaretDoubleRight: ImageVector
    get() {
        if (_caretDoubleRight != null) {
            return _caretDoubleRight!!
        }
        _caretDoubleRight = Builder(name = "CaretDoubleRight", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(136.0f, 128.0f)
                lineTo(56.0f, 208.0f)
                verticalLineTo(48.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(141.66f, 122.34f)
                lineToRelative(-80.0f, -80.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 48.0f, 48.0f)
                lineTo(48.0f, 208.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 13.66f, 5.66f)
                lineToRelative(80.0f, -80.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 141.66f, 122.34f)
                close()
                moveTo(64.0f, 188.69f)
                lineTo(64.0f, 67.31f)
                lineTo(124.69f, 128.0f)
                close()
                moveTo(221.66f, 133.69f)
                lineTo(141.66f, 213.69f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, -11.32f)
                lineTo(204.69f, 128.0f)
                lineTo(130.34f, 53.66f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, -11.32f)
                lineToRelative(80.0f, 80.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 221.66f, 133.66f)
                close()
            }
        }
        .build()
        return _caretDoubleRight!!
    }

private var _caretDoubleRight: ImageVector? = null
