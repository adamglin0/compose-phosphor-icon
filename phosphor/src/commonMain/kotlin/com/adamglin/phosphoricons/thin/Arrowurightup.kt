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

public val ThinGroup.ArrowURightUp: ImageVector
    get() {
        if (_arrowURightUp != null) {
            return _arrowURightUp!!
        }
        _arrowURightUp = Builder(name = "ArrowURightUp", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(218.83f, 82.83f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.66f, 0.0f)
                lineTo(172.0f, 41.66f)
                verticalLineTo(168.0f)
                arcToRelative(60.0f, 60.0f, 0.0f, false, true, -120.0f, 0.0f)
                verticalLineTo(80.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                verticalLineToRelative(88.0f)
                arcToRelative(52.0f, 52.0f, 0.0f, false, false, 104.0f, 0.0f)
                verticalLineTo(41.66f)
                lineTo(122.83f, 82.83f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.66f, -5.66f)
                lineToRelative(48.0f, -48.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.66f, 0.0f)
                lineToRelative(48.0f, 48.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 218.83f, 82.83f)
                close()
            }
        }
        .build()
        return _arrowURightUp!!
    }

private var _arrowURightUp: ImageVector? = null
