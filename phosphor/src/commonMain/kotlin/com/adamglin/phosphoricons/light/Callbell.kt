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

public val LightGroup.Callbell: ImageVector
    get() {
        if (_callbell != null) {
            return _callbell!!
        }
        _callbell = Builder(name = "Callbell", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 182.0f)
                lineTo(232.0f, 182.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                lineTo(222.0f, 170.0f)
                lineTo(222.0f, 152.0f)
                arcToRelative(94.1f, 94.1f, 0.0f, false, false, -88.0f, -93.8f)
                lineTo(134.0f, 38.0f)
                horizontalLineToRelative(18.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                lineTo(104.0f, 26.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineToRelative(18.0f)
                lineTo(122.0f, 58.2f)
                arcTo(94.1f, 94.1f, 0.0f, false, false, 34.0f, 152.0f)
                verticalLineToRelative(18.0f)
                lineTo(24.0f, 170.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                close()
                moveTo(46.0f, 152.0f)
                arcToRelative(82.0f, 82.0f, 0.0f, false, true, 164.0f, 0.0f)
                verticalLineToRelative(18.0f)
                lineTo(46.0f, 170.0f)
                close()
                moveTo(238.0f, 208.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                lineTo(24.0f, 214.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                lineTo(232.0f, 202.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 238.0f, 208.0f)
                close()
            }
        }
        .build()
        return _callbell!!
    }

private var _callbell: ImageVector? = null
