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

public val FillGroup.CaretDoubleLeft: ImageVector
    get() {
        if (_caretDoubleLeft != null) {
            return _caretDoubleLeft!!
        }
        _caretDoubleLeft = Builder(name = "CaretDoubleLeft", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 48.0f)
                verticalLineTo(208.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -13.66f, 5.66f)
                lineTo(128.0f, 147.31f)
                verticalLineTo(208.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -13.66f, 5.66f)
                lineToRelative(-80.0f, -80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -11.32f)
                lineToRelative(80.0f, -80.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 128.0f, 48.0f)
                verticalLineToRelative(60.69f)
                lineToRelative(66.34f, -66.35f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 208.0f, 48.0f)
                close()
            }
        }
        .build()
        return _caretDoubleLeft!!
    }

private var _caretDoubleLeft: ImageVector? = null
