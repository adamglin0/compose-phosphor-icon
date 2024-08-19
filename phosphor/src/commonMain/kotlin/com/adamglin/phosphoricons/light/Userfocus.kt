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

public val LightGroup.Userfocus: ImageVector
    get() {
        if (_userfocus != null) {
            return _userfocus!!
        }
        _userfocus = Builder(name = "Userfocus", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(222.0f, 40.0f)
                lineTo(222.0f, 76.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                lineTo(210.0f, 46.0f)
                lineTo(180.0f, 46.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineToRelative(36.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 222.0f, 40.0f)
                close()
                moveTo(216.0f, 174.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                verticalLineToRelative(30.0f)
                lineTo(180.0f, 210.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineToRelative(36.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, -6.0f)
                lineTo(222.0f, 180.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 216.0f, 174.0f)
                close()
                moveTo(76.0f, 210.0f)
                lineTo(46.0f, 210.0f)
                lineTo(46.0f, 180.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f)
                verticalLineToRelative(36.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, 6.0f)
                lineTo(76.0f, 222.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                close()
                moveTo(40.0f, 82.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, -6.0f)
                lineTo(46.0f, 46.0f)
                lineTo(76.0f, 46.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                lineTo(40.0f, 34.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                lineTo(34.0f, 76.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 40.0f, 82.0f)
                close()
                moveTo(176.0f, 174.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -4.8f, -2.4f)
                arcToRelative(54.0f, 54.0f, 0.0f, false, false, -86.4f, 0.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -9.6f, -7.2f)
                arcToRelative(65.65f, 65.65f, 0.0f, false, true, 29.69f, -22.26f)
                arcToRelative(38.0f, 38.0f, 0.0f, true, true, 46.22f, 0.0f)
                arcTo(65.65f, 65.65f, 0.0f, false, true, 180.8f, 164.4f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 176.0f, 174.0f)
                close()
                moveTo(128.0f, 138.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, true, false, -26.0f, -26.0f)
                arcTo(26.0f, 26.0f, 0.0f, false, false, 128.0f, 138.0f)
                close()
            }
        }
        .build()
        return _userfocus!!
    }

private var _userfocus: ImageVector? = null
