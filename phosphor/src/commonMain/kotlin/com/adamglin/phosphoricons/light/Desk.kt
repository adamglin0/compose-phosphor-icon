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

public val LightGroup.Desk: ImageVector
    get() {
        if (_desk != null) {
            return _desk!!
        }
        _desk = Builder(name = "Desk", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(248.0f, 66.0f)
                lineTo(8.0f, 66.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 8.0f, 78.0f)
                lineTo(18.0f, 78.0f)
                lineTo(18.0f, 192.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(30.0f, 142.0f)
                lineTo(226.0f, 142.0f)
                verticalLineToRelative(50.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(238.0f, 78.0f)
                horizontalLineToRelative(10.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                close()
                moveTo(30.0f, 78.0f)
                horizontalLineToRelative(92.0f)
                verticalLineToRelative(52.0f)
                lineTo(30.0f, 130.0f)
                close()
                moveTo(226.0f, 130.0f)
                lineTo(134.0f, 130.0f)
                lineTo(134.0f, 78.0f)
                horizontalLineToRelative(92.0f)
                close()
                moveTo(94.0f, 104.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                lineTo(64.0f, 110.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                lineTo(88.0f, 98.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 94.0f, 104.0f)
                close()
                moveTo(162.0f, 104.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.0f, -6.0f)
                horizontalLineToRelative(24.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f)
                lineTo(168.0f, 110.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 162.0f, 104.0f)
                close()
            }
        }
        .build()
        return _desk!!
    }

private var _desk: ImageVector? = null
