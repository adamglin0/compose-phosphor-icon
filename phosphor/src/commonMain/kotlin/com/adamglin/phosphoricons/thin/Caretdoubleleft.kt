package com.adamglin.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.ThinGroup

public val ThinGroup.CaretDoubleLeft: ImageVector
    get() {
        if (_caretDoubleLeft != null) {
            return _caretDoubleLeft!!
        }
        _caretDoubleLeft = Builder(name = "CaretDoubleLeft", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(202.83f, 205.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.66f, 5.66f)
                lineToRelative(-80.0f, -80.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -5.66f)
                lineToRelative(80.0f, -80.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 5.66f, 5.66f)
                lineTo(125.66f, 128.0f)
                close()
                moveTo(45.66f, 128.0f)
                lineToRelative(77.17f, -77.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.66f, -5.66f)
                lineToRelative(-80.0f, 80.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 5.66f)
                lineToRelative(80.0f, 80.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 5.66f, -5.66f)
                close()
            }
        }
        .build()
        return _caretDoubleLeft!!
    }

private var _caretDoubleLeft: ImageVector? = null
