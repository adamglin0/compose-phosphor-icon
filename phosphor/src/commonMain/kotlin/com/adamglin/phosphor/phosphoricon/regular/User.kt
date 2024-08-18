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

public val RegularGroup.User: ImageVector
    get() {
        if (_user != null) {
            return _user!!
        }
        _user = Builder(name = "User", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(230.92f, 212.0f)
                curveToRelative(-15.23f, -26.33f, -38.7f, -45.21f, -66.09f, -54.16f)
                arcToRelative(72.0f, 72.0f, 0.0f, true, false, -73.66f, 0.0f)
                curveTo(63.78f, 166.78f, 40.31f, 185.66f, 25.08f, 212.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 13.85f, 8.0f)
                curveToRelative(18.84f, -32.56f, 52.14f, -52.0f, 89.07f, -52.0f)
                reflectiveCurveToRelative(70.23f, 19.44f, 89.07f, 52.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 13.85f, -8.0f)
                close()
                moveTo(72.0f, 96.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, true, true, 56.0f, 56.0f)
                arcTo(56.06f, 56.06f, 0.0f, false, true, 72.0f, 96.0f)
                close()
            }
        }
        .build()
        return _user!!
    }

private var _user: ImageVector? = null
