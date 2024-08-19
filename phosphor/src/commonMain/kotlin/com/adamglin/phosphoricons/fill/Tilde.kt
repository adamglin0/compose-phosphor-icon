package com.adamglin.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.FillGroup

public val FillGroup.Tilde: ImageVector
    get() {
        if (_tilde != null) {
            return _tilde!!
        }
        _tilde = Builder(name = "Tilde", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 32.0f)
                lineTo(48.0f, 32.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 32.0f, 48.0f)
                lineTo(32.0f, 208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(208.0f, 224.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(224.0f, 48.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 208.0f, 32.0f)
                close()
                moveTo(198.0f, 131.66f)
                curveToRelative(-13.19f, 15.0f, -25.34f, 20.29f, -36.37f, 20.29f)
                curveToRelative(-14.94f, 0.0f, -27.81f, -9.61f, -38.43f, -17.54f)
                curveToRelative(-19.2f, -14.34f, -31.89f, -23.81f, -53.2f, 0.48f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -12.0f, -10.55f)
                curveToRelative(31.05f, -35.41f, 56.34f, -16.53f, 74.8f, -2.75f)
                curveToRelative(19.2f, 14.34f, 31.89f, 23.81f, 53.2f, -0.48f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 12.0f, 10.55f)
                close()
            }
        }
        .build()
        return _tilde!!
    }

private var _tilde: ImageVector? = null
