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

public val BoldGroup.Personsimplesnowboard: ImageVector
    get() {
        if (_personsimplesnowboard != null) {
            return _personsimplesnowboard!!
        }
        _personsimplesnowboard = Builder(name = "Personsimplesnowboard", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(168.0f, 80.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, -32.0f, -32.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 168.0f, 80.0f)
                close()
                moveTo(168.0f, 40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -8.0f, 8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 168.0f, 40.0f)
                close()
                moveTo(219.38f, 108.48f)
                lineTo(83.38f, 68.48f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -6.77f, 23.0f)
                lineTo(112.25f, 102.0f)
                lineToRelative(-28.64f, 43.0f)
                lineTo(44.0f, 133.27f)
                arcToRelative(30.79f, 30.79f, 0.0f, false, false, -27.38f, 4.94f)
                arcTo(31.18f, 31.18f, 0.0f, false, false, 4.0f, 163.39f)
                arcTo(31.53f, 31.53f, 0.0f, false, false, 26.43f, 193.5f)
                horizontalLineToRelative(0.0f)
                lineTo(180.0f, 238.71f)
                arcToRelative(31.23f, 31.23f, 0.0f, false, false, 40.0f, -30.11f)
                arcToRelative(31.52f, 31.52f, 0.0f, false, false, -22.44f, -30.11f)
                lineToRelative(-39.74f, -11.7f)
                lineTo(170.0f, 148.68f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -6.62f, -18.21f)
                lineToRelative(-34.56f, -10.0f)
                lineToRelative(7.58f, -11.38f)
                lineToRelative(76.25f, 22.43f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 6.77f, -23.0f)
                close()
                moveTo(196.0f, 208.6f)
                arcToRelative(7.36f, 7.36f, 0.0f, false, true, -3.0f, 6.0f)
                arcToRelative(6.92f, 6.92f, 0.0f, false, true, -6.23f, 1.13f)
                lineTo(33.21f, 170.48f)
                arcTo(7.46f, 7.46f, 0.0f, false, true, 31.0f, 157.42f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, true, 6.23f, -1.13f)
                lineToRelative(153.59f, 45.22f)
                arcTo(7.39f, 7.39f, 0.0f, false, true, 196.0f, 208.6f)
                close()
                moveTo(140.88f, 149.0f)
                lineToRelative(-7.2f, 10.73f)
                lineToRelative(-26.0f, -7.64f)
                lineToRelative(7.1f, -10.64f)
                close()
            }
        }
        .build()
        return _personsimplesnowboard!!
    }

private var _personsimplesnowboard: ImageVector? = null
