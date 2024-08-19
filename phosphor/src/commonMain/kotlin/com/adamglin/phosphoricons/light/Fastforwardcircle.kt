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

public val LightGroup.Fastforwardcircle: ImageVector
    get() {
        if (_fastforwardcircle != null) {
            return _fastforwardcircle!!
        }
        _fastforwardcircle = Builder(name = "Fastforwardcircle", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 26.0f)
                arcTo(102.0f, 102.0f, 0.0f, true, false, 230.0f, 128.0f)
                arcTo(102.12f, 102.12f, 0.0f, false, false, 128.0f, 26.0f)
                close()
                moveTo(128.0f, 218.0f)
                arcToRelative(90.0f, 90.0f, 0.0f, true, true, 90.0f, -90.0f)
                arcTo(90.1f, 90.1f, 0.0f, false, true, 128.0f, 218.0f)
                close()
                moveTo(191.6f, 123.2f)
                lineTo(143.6f, 87.2f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 134.0f, 92.0f)
                verticalLineToRelative(30.0f)
                lineTo(87.6f, 87.2f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 78.0f, 92.0f)
                verticalLineToRelative(72.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 9.6f, 4.8f)
                lineTo(134.0f, 134.0f)
                verticalLineToRelative(30.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 9.6f, 4.8f)
                lineToRelative(48.0f, -36.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -9.6f)
                close()
                moveTo(90.0f, 152.0f)
                lineTo(90.0f, 104.0f)
                lineToRelative(32.0f, 24.0f)
                close()
                moveTo(146.0f, 152.0f)
                lineTo(146.0f, 104.0f)
                lineToRelative(32.0f, 24.0f)
                close()
            }
        }
        .build()
        return _fastforwardcircle!!
    }

private var _fastforwardcircle: ImageVector? = null