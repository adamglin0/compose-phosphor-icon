package com.adamglin.phosphoricon.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.RegularGroup

public val RegularGroup.Password: ImageVector
    get() {
        if (_password != null) {
            return _password!!
        }
        _password = Builder(name = "Password", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(48.0f, 56.0f)
                lineTo(48.0f, 200.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(32.0f, 56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                close()
                moveTo(140.0f, 110.5f)
                lineTo(120.0f, 117.0f)
                lineTo(120.0f, 96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                verticalLineToRelative(21.0f)
                lineTo(84.0f, 110.5f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -5.0f, 15.22f)
                lineToRelative(20.0f, 6.49f)
                lineToRelative(-12.34f, 17.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 12.94f, 9.4f)
                lineToRelative(12.34f, -17.0f)
                lineToRelative(12.34f, 17.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 12.94f, -9.4f)
                lineToRelative(-12.34f, -17.0f)
                lineToRelative(20.0f, -6.49f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 140.0f, 110.5f)
                close()
                moveTo(246.0f, 115.64f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 236.0f, 110.5f)
                lineTo(216.0f, 117.0f)
                lineTo(216.0f, 96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                verticalLineToRelative(21.0f)
                lineToRelative(-20.0f, -6.49f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -4.95f, 15.22f)
                lineToRelative(20.0f, 6.49f)
                lineToRelative(-12.34f, 17.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 12.94f, 9.4f)
                lineToRelative(12.34f, -17.0f)
                lineToRelative(12.34f, 17.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 12.94f, -9.4f)
                lineToRelative(-12.34f, -17.0f)
                lineToRelative(20.0f, -6.49f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 246.0f, 115.64f)
                close()
            }
        }
        .build()
        return _password!!
    }

private var _password: ImageVector? = null
