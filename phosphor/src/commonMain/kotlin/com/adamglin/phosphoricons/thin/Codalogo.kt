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

public val ThinGroup.CodaLogo: ImageVector
    get() {
        if (_codaLogo != null) {
            return _codaLogo!!
        }
        _codaLogo = Builder(name = "CodaLogo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(176.0f, 84.0f)
                arcToRelative(43.82f, 43.82f, 0.0f, false, true, 23.69f, 6.73f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 212.0f, 84.0f)
                lineTo(212.0f, 48.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, -12.0f)
                lineTo(56.0f, 36.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 44.0f, 48.0f)
                lineTo(44.0f, 208.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                lineTo(200.0f, 220.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(212.0f, 172.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -12.28f, -6.75f)
                curveToRelative(-8.0f, 5.14f, -14.82f, 7.09f, -23.56f, 6.74f)
                lineTo(176.0f, 171.99f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, true, 0.0f, -88.0f)
                close()
                moveTo(124.0f, 128.0f)
                arcToRelative(52.05f, 52.05f, 0.0f, false, false, 51.92f, 52.0f)
                curveToRelative(10.35f, 0.4f, 18.76f, -2.0f, 28.08f, -8.0f)
                verticalLineToRelative(36.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(56.0f, 212.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                lineTo(52.0f, 48.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                lineTo(200.0f, 44.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                lineTo(204.0f, 84.0f)
                arcToRelative(52.24f, 52.24f, 0.0f, false, false, -80.0f, 44.0f)
                close()
            }
        }
        .build()
        return _codaLogo!!
    }

private var _codaLogo: ImageVector? = null
