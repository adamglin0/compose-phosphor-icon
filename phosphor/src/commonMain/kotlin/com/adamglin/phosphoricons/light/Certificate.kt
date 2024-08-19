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

public val LightGroup.Certificate: ImageVector
    get() {
        if (_certificate != null) {
            return _certificate!!
        }
        _certificate = Builder(name = "Certificate", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(126.0f, 136.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                lineTo(72.0f, 142.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineToRelative(48.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 126.0f, 136.0f)
                close()
                moveTo(120.0f, 98.0f)
                lineTo(72.0f, 98.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                close()
                moveTo(230.0f, 160.62f)
                lineTo(230.0f, 224.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -9.0f, 5.21f)
                lineToRelative(-25.0f, -14.3f)
                lineToRelative(-25.0f, 14.3f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -9.0f, -5.21f)
                lineTo(162.0f, 198.0f)
                lineTo(40.0f, 198.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, -14.0f, -14.0f)
                lineTo(26.0f, 56.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 40.0f, 42.0f)
                lineTo(216.0f, 42.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, 14.0f, 14.0f)
                lineTo(230.0f, 87.38f)
                arcToRelative(49.91f, 49.91f, 0.0f, false, true, 0.0f, 73.24f)
                close()
                moveTo(196.0f, 86.0f)
                arcToRelative(38.0f, 38.0f, 0.0f, true, false, 38.0f, 38.0f)
                arcTo(38.0f, 38.0f, 0.0f, false, false, 196.0f, 86.0f)
                close()
                moveTo(162.0f, 186.0f)
                lineTo(162.0f, 160.62f)
                arcToRelative(50.0f, 50.0f, 0.0f, false, true, 56.0f, -81.51f)
                lineTo(218.0f, 56.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                lineTo(40.0f, 54.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                lineTo(38.0f, 184.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                close()
                moveTo(218.0f, 168.89f)
                arcToRelative(49.91f, 49.91f, 0.0f, false, true, -44.0f, 0.0f)
                verticalLineToRelative(44.77f)
                lineToRelative(19.0f, -10.87f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.0f, 0.0f)
                lineToRelative(19.0f, 10.87f)
                close()
            }
        }
        .build()
        return _certificate!!
    }

private var _certificate: ImageVector? = null
