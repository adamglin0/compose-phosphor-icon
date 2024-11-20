package com.adamglin.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.ThinGroup

public val ThinGroup.Certificate: ImageVector
    get() {
        if (_certificate != null) {
            return _certificate!!
        }
        _certificate = Builder(name = "Certificate", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(124.0f, 136.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(72.0f, 140.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineToRelative(48.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 124.0f, 136.0f)
                close()
                moveTo(120.0f, 100.0f)
                lineTo(72.0f, 100.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                close()
                moveTo(228.0f, 159.74f)
                lineTo(228.0f, 224.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -6.0f, 3.47f)
                lineToRelative(-26.0f, -14.86f)
                lineToRelative(-26.0f, 14.86f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -6.0f, -3.47f)
                lineTo(164.0f, 196.0f)
                lineTo(40.0f, 196.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, -12.0f)
                lineTo(28.0f, 56.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 40.0f, 44.0f)
                lineTo(216.0f, 44.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, 12.0f)
                lineTo(228.0f, 88.26f)
                arcToRelative(47.92f, 47.92f, 0.0f, false, true, 0.0f, 71.48f)
                close()
                moveTo(196.0f, 84.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, false, 40.0f, 40.0f)
                arcTo(40.0f, 40.0f, 0.0f, false, false, 196.0f, 84.0f)
                close()
                moveTo(164.0f, 188.0f)
                lineTo(164.0f, 159.74f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, true, 56.0f, -77.28f)
                lineTo(220.0f, 56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.0f)
                lineTo(40.0f, 52.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                lineTo(36.0f, 184.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                close()
                moveTo(220.0f, 165.54f)
                arcToRelative(47.81f, 47.81f, 0.0f, false, true, -48.0f, 0.0f)
                verticalLineToRelative(51.57f)
                lineToRelative(22.0f, -12.58f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 0.0f)
                lineToRelative(22.0f, 12.58f)
                close()
            }
        }
        .build()
        return _certificate!!
    }

private var _certificate: ImageVector? = null
