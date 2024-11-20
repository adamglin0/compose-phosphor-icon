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

public val ThinGroup.Eject: ImageVector
    get() {
        if (_eject != null) {
            return _eject!!
        }
        _eject = Builder(name = "Eject", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 156.0f)
                lineTo(48.0f, 156.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                lineTo(208.0f, 204.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(220.0f, 168.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 208.0f, 156.0f)
                close()
                moveTo(212.0f, 192.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(48.0f, 196.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                lineTo(44.0f, 168.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                lineTo(208.0f, 164.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                close()
                moveTo(48.23f, 132.0f)
                lineTo(207.77f, 132.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 219.0f, 124.67f)
                arcToRelative(11.68f, 11.68f, 0.0f, false, false, -2.33f, -12.8f)
                lineTo(143.0f, 34.37f)
                arcToRelative(20.75f, 20.75f, 0.0f, false, false, -29.92f, 0.0f)
                lineTo(39.3f, 111.87f)
                arcTo(11.68f, 11.68f, 0.0f, false, false, 37.0f, 124.67f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 48.23f, 132.0f)
                close()
                moveTo(45.1f, 117.39f)
                lineToRelative(73.73f, -77.51f)
                arcToRelative(12.78f, 12.78f, 0.0f, false, true, 18.34f, 0.0f)
                lineToRelative(73.73f, 77.51f)
                arcToRelative(3.66f, 3.66f, 0.0f, false, true, 0.77f, 4.12f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, -3.9f, 2.49f)
                lineTo(48.23f, 124.0f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, -3.9f, -2.49f)
                arcTo(3.66f, 3.66f, 0.0f, false, true, 45.1f, 117.39f)
                close()
            }
        }
        .build()
        return _eject!!
    }

private var _eject: ImageVector? = null
