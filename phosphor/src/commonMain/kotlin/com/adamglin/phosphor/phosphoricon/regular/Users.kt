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

public val RegularGroup.Users: ImageVector
    get() {
        if (_users != null) {
            return _users!!
        }
        _users = Builder(name = "Users", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(117.25f, 157.92f)
                arcToRelative(60.0f, 60.0f, 0.0f, true, false, -66.5f, 0.0f)
                arcTo(95.83f, 95.83f, 0.0f, false, false, 3.53f, 195.63f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 13.4f, 8.74f)
                arcToRelative(80.0f, 80.0f, 0.0f, false, true, 134.14f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 13.4f, -8.74f)
                arcTo(95.83f, 95.83f, 0.0f, false, false, 117.25f, 157.92f)
                close()
                moveTo(40.0f, 108.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, true, true, 44.0f, 44.0f)
                arcTo(44.05f, 44.05f, 0.0f, false, true, 40.0f, 108.0f)
                close()
                moveTo(250.14f, 206.7f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.07f, -2.33f)
                arcTo(79.83f, 79.83f, 0.0f, false, false, 172.0f, 168.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, true, false, -16.34f, -84.87f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -5.94f, -14.85f)
                arcToRelative(60.0f, 60.0f, 0.0f, false, true, 55.53f, 105.64f)
                arcToRelative(95.83f, 95.83f, 0.0f, false, true, 47.22f, 37.71f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 250.14f, 206.7f)
                close()
            }
        }
        .build()
        return _users!!
    }

private var _users: ImageVector? = null
