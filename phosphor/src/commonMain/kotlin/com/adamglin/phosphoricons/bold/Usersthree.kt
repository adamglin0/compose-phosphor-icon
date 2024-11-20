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

public val BoldGroup.UsersThree: ImageVector
    get() {
        if (_usersThree != null) {
            return _usersThree!!
        }
        _usersThree = Builder(name = "UsersThree", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(164.38f, 181.1f)
                arcToRelative(52.0f, 52.0f, 0.0f, true, false, -72.76f, 0.0f)
                arcToRelative(75.89f, 75.89f, 0.0f, false, false, -30.0f, 28.89f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 20.78f, 12.0f)
                arcToRelative(53.0f, 53.0f, 0.0f, false, true, 91.22f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 20.78f, -12.0f)
                arcTo(75.89f, 75.89f, 0.0f, false, false, 164.38f, 181.1f)
                close()
                moveTo(100.0f, 144.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, true, 28.0f, 28.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, true, 100.0f, 144.0f)
                close()
                moveTo(247.21f, 153.59f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -16.81f, -2.39f)
                curveToRelative(-8.33f, -11.09f, -19.85f, -19.59f, -29.33f, -21.64f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -1.82f, -22.91f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, false, -24.78f, -28.3f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -21.0f, -11.6f)
                arcToRelative(44.0f, 44.0f, 0.0f, true, true, 73.28f, 48.35f)
                arcToRelative(92.18f, 92.18f, 0.0f, false, true, 22.85f, 21.69f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 247.21f, 153.59f)
                close()
                moveTo(54.93f, 129.59f)
                curveToRelative(-9.48f, 2.05f, -21.0f, 10.55f, -29.33f, 21.65f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 6.41f, 136.79f)
                arcTo(92.37f, 92.37f, 0.0f, false, true, 29.26f, 115.1f)
                arcToRelative(44.0f, 44.0f, 0.0f, true, true, 73.28f, -48.35f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -21.0f, 11.6f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, false, -24.78f, 28.3f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -1.82f, 22.91f)
                close()
            }
        }
        .build()
        return _usersThree!!
    }

private var _usersThree: ImageVector? = null
