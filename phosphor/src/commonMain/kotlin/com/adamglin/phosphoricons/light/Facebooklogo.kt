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

public val LightGroup.Facebooklogo: ImageVector
    get() {
        if (_facebooklogo != null) {
            return _facebooklogo!!
        }
        _facebooklogo = Builder(name = "Facebooklogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 26.0f)
                arcTo(102.0f, 102.0f, 0.0f, true, false, 230.0f, 128.0f)
                arcTo(102.12f, 102.12f, 0.0f, false, false, 128.0f, 26.0f)
                close()
                moveTo(134.0f, 217.8f)
                lineTo(134.0f, 150.0f)
                horizontalLineToRelative(26.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                lineTo(134.0f, 138.0f)
                lineTo(134.0f, 112.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, true, 18.0f, -18.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                lineTo(152.0f, 82.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, false, -30.0f, 30.0f)
                verticalLineToRelative(26.0f)
                lineTo(96.0f, 138.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineToRelative(26.0f)
                verticalLineToRelative(67.8f)
                arcToRelative(90.0f, 90.0f, 0.0f, true, true, 12.0f, 0.0f)
                close()
            }
        }
        .build()
        return _facebooklogo!!
    }

private var _facebooklogo: ImageVector? = null
