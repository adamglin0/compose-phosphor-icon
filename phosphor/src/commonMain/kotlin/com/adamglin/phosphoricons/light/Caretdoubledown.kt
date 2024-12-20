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

public val LightGroup.CaretDoubleDown: ImageVector
    get() {
        if (_caretDoubleDown != null) {
            return _caretDoubleDown!!
        }
        _caretDoubleDown = Builder(name = "CaretDoubleDown", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(212.24f, 131.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 8.48f)
                lineToRelative(-80.0f, 80.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.48f, 0.0f)
                lineToRelative(-80.0f, -80.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 8.48f, -8.48f)
                lineTo(128.0f, 207.51f)
                lineToRelative(75.76f, -75.75f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 212.24f, 131.76f)
                close()
                moveTo(123.76f, 140.24f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.48f, 0.0f)
                lineToRelative(80.0f, -80.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.48f, -8.48f)
                lineTo(128.0f, 127.51f)
                lineTo(52.24f, 51.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.48f, 8.48f)
                close()
            }
        }
        .build()
        return _caretDoubleDown!!
    }

private var _caretDoubleDown: ImageVector? = null
