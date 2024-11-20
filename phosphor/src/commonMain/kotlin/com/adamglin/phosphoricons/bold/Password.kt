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

public val BoldGroup.Password: ImageVector
    get() {
        if (_password != null) {
            return _password!!
        }
        _password = Builder(name = "Password", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(48.0f, 56.0f)
                lineTo(48.0f, 200.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                lineTo(24.0f, 56.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                close()
                moveTo(134.73f, 106.7f)
                lineTo(120.0f, 111.48f)
                lineTo(120.0f, 96.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f)
                verticalLineToRelative(15.48f)
                lineTo(81.27f, 106.7f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, -7.41f, 22.82f)
                lineToRelative(14.72f, 4.79f)
                lineToRelative(-9.1f, 12.52f)
                arcTo(12.0f, 12.0f, 0.0f, true, false, 98.9f, 160.94f)
                lineToRelative(9.1f, -12.52f)
                lineToRelative(9.1f, 12.52f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 19.42f, -14.11f)
                lineToRelative(-9.1f, -12.52f)
                lineToRelative(14.72f, -4.79f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, -7.41f, -22.82f)
                close()
                moveTo(249.85f, 114.4f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -15.12f, -7.7f)
                lineTo(220.0f, 111.48f)
                lineTo(220.0f, 96.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f)
                verticalLineToRelative(15.48f)
                lineToRelative(-14.73f, -4.78f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, -7.41f, 22.82f)
                lineToRelative(14.72f, 4.79f)
                lineToRelative(-9.1f, 12.52f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 19.42f, 14.11f)
                lineToRelative(9.1f, -12.52f)
                lineToRelative(9.1f, 12.52f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 19.42f, -14.11f)
                lineToRelative(-9.1f, -12.52f)
                lineToRelative(14.72f, -4.79f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 249.85f, 114.4f)
                close()
            }
        }
        .build()
        return _password!!
    }

private var _password: ImageVector? = null
