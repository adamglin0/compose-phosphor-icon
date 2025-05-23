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

public val FillGroup.CaretDoubleRight: ImageVector
    get() {
        if (_caretDoubleRight != null) {
            return _caretDoubleRight!!
        }
        _caretDoubleRight = Builder(name = "CaretDoubleRight", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(221.66f, 133.66f)
                lineToRelative(-80.0f, 80.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 128.0f, 208.0f)
                verticalLineTo(147.31f)
                lineTo(61.66f, 213.66f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 48.0f, 208.0f)
                verticalLineTo(48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 13.66f, -5.66f)
                lineTo(128.0f, 108.69f)
                verticalLineTo(48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 13.66f, -5.66f)
                lineToRelative(80.0f, 80.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 221.66f, 133.66f)
                close()
            }
        }
        .build()
        return _caretDoubleRight!!
    }

private var _caretDoubleRight: ImageVector? = null
