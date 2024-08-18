package com.adamglin.phosphor.phosphoricon.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphor.phosphoricon.RegularGroup

public val RegularGroup.Tilde: ImageVector
    get() {
        if (_tilde != null) {
            return _tilde!!
        }
        _tilde = Builder(name = "Tilde", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(222.23f, 130.59f)
                curveToRelative(-14.51f, 18.0f, -28.84f, 27.6f, -43.8f, 29.17f)
                arcToRelative(43.0f, 43.0f, 0.0f, false, true, -4.5f, 0.24f)
                curveToRelative(-19.3f, 0.0f, -35.39f, -13.1f, -51.0f, -25.8f)
                curveToRelative(-14.91f, -12.14f, -29.0f, -23.61f, -43.7f, -22.0f)
                curveToRelative(-10.51f, 1.1f, -21.31f, 8.72f, -33.0f, 23.28f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -12.46f, -10.0f)
                curveToRelative(14.51f, -18.0f, 28.84f, -27.6f, 43.8f, -29.17f)
                curveToRelative(21.32f, -2.25f, 38.69f, 11.89f, 55.48f, 25.56f)
                curveToRelative(14.91f, 12.14f, 29.0f, 23.62f, 43.7f, 22.0f)
                curveToRelative(10.51f, -1.1f, 21.31f, -8.72f, 33.0f, -23.28f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 12.46f, 10.0f)
                close()
            }
        }
        .build()
        return _tilde!!
    }

private var _tilde: ImageVector? = null
