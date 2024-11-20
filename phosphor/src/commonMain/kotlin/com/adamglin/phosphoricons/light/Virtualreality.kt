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

public val LightGroup.VirtualReality: ImageVector
    get() {
        if (_virtualReality != null) {
            return _virtualReality!!
        }
        _virtualReality = Builder(name = "VirtualReality", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(121.62f, 98.11f)
                lineToRelative(-24.0f, 64.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -11.24f, 0.0f)
                lineToRelative(-24.0f, -64.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 11.24f, -4.22f)
                lineToRelative(18.38f, 49.0f)
                lineToRelative(18.38f, -49.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, 11.24f, 4.22f)
                close()
                moveTo(254.0f, 128.0f)
                arcToRelative(78.09f, 78.09f, 0.0f, false, true, -78.0f, 78.0f)
                lineTo(80.0f, 206.0f)
                arcTo(78.0f, 78.0f, 0.0f, false, true, 80.0f, 50.0f)
                horizontalLineToRelative(96.0f)
                arcTo(78.09f, 78.09f, 0.0f, false, true, 254.0f, 128.0f)
                close()
                moveTo(242.0f, 128.0f)
                arcToRelative(66.08f, 66.08f, 0.0f, false, false, -66.0f, -66.0f)
                lineTo(80.0f, 62.0f)
                arcToRelative(66.0f, 66.0f, 0.0f, false, false, 0.0f, 132.0f)
                horizontalLineToRelative(96.0f)
                arcTo(66.08f, 66.08f, 0.0f, false, false, 242.0f, 128.0f)
                close()
                moveTo(178.2f, 137.76f)
                lineTo(189.2f, 157.02f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -10.42f, 6.0f)
                lineToRelative(-12.07f, -21.12f)
                arcTo(27.06f, 27.06f, 0.0f, false, true, 164.0f, 142.0f)
                lineTo(150.0f, 142.0f)
                verticalLineToRelative(18.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                lineTo(138.0f, 96.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.0f, -6.0f)
                horizontalLineToRelative(20.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, true, 14.2f, 47.76f)
                close()
                moveTo(164.0f, 130.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 0.0f, -28.0f)
                lineTo(150.0f, 102.0f)
                verticalLineToRelative(28.0f)
                close()
            }
        }
        .build()
        return _virtualReality!!
    }

private var _virtualReality: ImageVector? = null
