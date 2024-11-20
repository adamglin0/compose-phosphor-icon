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

public val LightGroup.UserCircle: ImageVector
    get() {
        if (_userCircle != null) {
            return _userCircle!!
        }
        _userCircle = Builder(name = "UserCircle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 26.0f)
                arcTo(102.0f, 102.0f, 0.0f, true, false, 230.0f, 128.0f)
                arcTo(102.12f, 102.12f, 0.0f, false, false, 128.0f, 26.0f)
                close()
                moveTo(71.44f, 198.0f)
                arcToRelative(66.0f, 66.0f, 0.0f, false, true, 113.12f, 0.0f)
                arcToRelative(89.8f, 89.8f, 0.0f, false, true, -113.12f, 0.0f)
                close()
                moveTo(94.0f, 120.0f)
                arcToRelative(34.0f, 34.0f, 0.0f, true, true, 34.0f, 34.0f)
                arcTo(34.0f, 34.0f, 0.0f, false, true, 94.0f, 120.0f)
                close()
                moveTo(193.51f, 189.64f)
                arcToRelative(77.53f, 77.53f, 0.0f, false, false, -40.0f, -31.38f)
                arcToRelative(46.0f, 46.0f, 0.0f, true, false, -51.0f, 0.0f)
                arcToRelative(77.53f, 77.53f, 0.0f, false, false, -40.0f, 31.38f)
                arcToRelative(90.0f, 90.0f, 0.0f, true, true, 131.0f, 0.0f)
                close()
            }
        }
        .build()
        return _userCircle!!
    }

private var _userCircle: ImageVector? = null
