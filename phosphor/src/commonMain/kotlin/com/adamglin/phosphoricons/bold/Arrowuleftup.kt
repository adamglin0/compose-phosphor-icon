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

public val BoldGroup.Arrowuleftup: ImageVector
    get() {
        if (_arrowuleftup != null) {
            return _arrowuleftup!!
        }
        _arrowuleftup = Builder(name = "Arrowuleftup", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(212.0f, 80.0f)
                verticalLineToRelative(88.0f)
                arcToRelative(68.0f, 68.0f, 0.0f, false, true, -136.0f, 0.0f)
                verticalLineTo(61.0f)
                lineTo(48.49f, 88.49f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.0f, -17.0f)
                lineToRelative(48.0f, -48.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, 0.0f)
                lineToRelative(48.0f, 48.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.0f, 17.0f)
                lineTo(100.0f, 61.0f)
                verticalLineTo(168.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, false, 88.0f, 0.0f)
                verticalLineTo(80.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                close()
            }
        }
        .build()
        return _arrowuleftup!!
    }

private var _arrowuleftup: ImageVector? = null
