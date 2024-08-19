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

public val BoldGroup.Usersound: ImageVector
    get() {
        if (_usersound != null) {
            return _usersound!!
        }
        _usersound = Builder(name = "Usersound", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(152.5f, 164.53f)
                arcToRelative(72.0f, 72.0f, 0.0f, true, false, -89.0f, 0.0f)
                arcToRelative(124.08f, 124.08f, 0.0f, false, false, -48.69f, 35.75f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 18.38f, 15.44f)
                curveTo(46.88f, 199.42f, 71.0f, 180.0f, 108.0f, 180.0f)
                reflectiveCurveToRelative(61.12f, 19.42f, 74.81f, 35.72f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 18.38f, -15.44f)
                arcTo(124.0f, 124.0f, 0.0f, false, false, 152.5f, 164.53f)
                close()
                moveTo(60.0f, 108.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, true, 48.0f, 48.0f)
                arcTo(48.05f, 48.05f, 0.0f, false, true, 60.0f, 108.0f)
                close()
                moveTo(252.0f, 108.0f)
                arcToRelative(143.09f, 143.09f, 0.0f, false, true, -11.61f, 56.73f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -22.0f, -9.46f)
                arcToRelative(120.48f, 120.48f, 0.0f, false, false, 0.0f, -94.54f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 22.0f, -9.46f)
                arcTo(143.09f, 143.09f, 0.0f, false, true, 252.0f, 108.0f)
                close()
                moveTo(207.0f, 64.76f)
                arcToRelative(108.26f, 108.26f, 0.0f, false, true, 0.0f, 86.48f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -22.0f, -9.62f)
                arcToRelative(84.35f, 84.35f, 0.0f, false, false, 0.0f, -67.24f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 22.0f, -9.62f)
                close()
            }
        }
        .build()
        return _usersound!!
    }

private var _usersound: ImageVector? = null
