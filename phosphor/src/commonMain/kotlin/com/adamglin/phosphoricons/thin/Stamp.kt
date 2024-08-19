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

public val ThinGroup.Stamp: ImageVector
    get() {
        if (_stamp != null) {
            return _stamp!!
        }
        _stamp = Builder(name = "Stamp", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(220.0f, 224.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(40.0f, 228.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                lineTo(216.0f, 220.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 220.0f, 224.0f)
                close()
                moveTo(220.0f, 144.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                lineTo(48.0f, 196.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, -12.0f)
                lineTo(36.0f, 144.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, -12.0f)
                horizontalLineToRelative(61.37f)
                lineTo(92.63f, 53.87f)
                arcTo(28.0f, 28.0f, 0.0f, false, true, 120.0f, 20.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, 27.38f, 33.87f)
                lineTo(146.63f, 132.0f)
                lineTo(208.0f, 132.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 220.0f, 144.0f)
                close()
                moveTo(117.55f, 132.0f)
                horizontalLineToRelative(20.9f)
                lineToRelative(17.1f, -79.81f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 136.0f, 28.0f)
                lineTo(120.0f, 28.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -19.56f, 24.19f)
                close()
                moveTo(212.0f, 144.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.0f)
                lineTo(48.0f, 140.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                lineTo(208.0f, 188.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                close()
            }
        }
        .build()
        return _stamp!!
    }

private var _stamp: ImageVector? = null
