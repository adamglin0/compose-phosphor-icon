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

public val ThinGroup.Siren: ImageVector
    get() {
        if (_siren != null) {
            return _siren!!
        }
        _siren = Builder(name = "Siren", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(124.0f, 16.0f)
                lineTo(124.0f, 8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                close()
                moveTo(200.0f, 44.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.83f, -1.17f)
                lineToRelative(8.0f, -8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -5.66f, -5.66f)
                lineToRelative(-8.0f, 8.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 200.0f, 44.0f)
                close()
                moveTo(53.17f, 42.83f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.66f, -5.66f)
                lineToRelative(-8.0f, -8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.66f, 5.66f)
                close()
                moveTo(136.66f, 76.05f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -1.32f, 7.9f)
                curveTo(156.24f, 87.45f, 172.0f, 106.39f, 172.0f, 128.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                curveTo(180.0f, 102.53f, 161.37f, 80.2f, 136.66f, 76.05f)
                close()
                moveTo(228.0f, 176.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                lineTo(40.0f, 212.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, -12.0f)
                lineTo(28.0f, 176.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, -12.0f)
                horizontalLineToRelative(4.0f)
                lineTo(44.0f, 128.0f)
                arcToRelative(84.0f, 84.0f, 0.0f, false, true, 84.0f, -84.0f)
                horizontalLineToRelative(0.64f)
                curveToRelative(46.0f, 0.34f, 83.36f, 38.47f, 83.36f, 85.0f)
                verticalLineToRelative(35.0f)
                horizontalLineToRelative(4.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 228.0f, 176.0f)
                close()
                moveTo(52.0f, 164.0f)
                lineTo(204.0f, 164.0f)
                lineTo(204.0f, 129.0f)
                curveToRelative(0.0f, -42.15f, -33.83f, -76.69f, -75.42f, -77.0f)
                arcTo(76.0f, 76.0f, 0.0f, false, false, 52.0f, 128.0f)
                close()
                moveTo(220.0f, 176.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.0f)
                lineTo(40.0f, 172.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                lineTo(216.0f, 204.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                close()
            }
        }
        .build()
        return _siren!!
    }

private var _siren: ImageVector? = null
