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

public val ThinGroup.Maptrifold: ImageVector
    get() {
        if (_maptrifold != null) {
            return _maptrifold!!
        }
        _maptrifold = Builder(name = "Maptrifold", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(226.46f, 52.85f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.43f, -0.73f)
                lineTo(160.47f, 67.76f)
                lineTo(97.79f, 36.42f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.76f, -0.3f)
                lineToRelative(-64.0f, 16.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 28.0f, 56.0f)
                verticalLineTo(200.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.0f, 3.88f)
                lineToRelative(62.56f, -15.64f)
                lineToRelative(62.68f, 31.34f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.76f, 0.3f)
                lineToRelative(64.0f, -16.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.0f, -3.88f)
                verticalLineTo(56.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 226.46f, 52.85f)
                close()
                moveTo(100.0f, 46.47f)
                lineToRelative(56.0f, 28.0f)
                verticalLineTo(209.53f)
                lineToRelative(-56.0f, -28.0f)
                close()
                moveTo(36.0f, 59.12f)
                lineToRelative(56.0f, -14.0f)
                verticalLineTo(180.88f)
                lineToRelative(-56.0f, 14.0f)
                close()
                moveTo(220.0f, 196.88f)
                lineToRelative(-56.0f, 14.0f)
                verticalLineTo(75.12f)
                lineToRelative(56.0f, -14.0f)
                close()
            }
        }
        .build()
        return _maptrifold!!
    }

private var _maptrifold: ImageVector? = null
