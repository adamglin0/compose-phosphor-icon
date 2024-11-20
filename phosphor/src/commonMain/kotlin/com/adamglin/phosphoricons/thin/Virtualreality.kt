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

public val ThinGroup.VirtualReality: ImageVector
    get() {
        if (_virtualReality != null) {
            return _virtualReality!!
        }
        _virtualReality = Builder(name = "VirtualReality", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(119.75f, 97.4f)
                lineToRelative(-24.0f, 64.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -7.5f, 0.0f)
                lineToRelative(-24.0f, -64.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 7.5f, -2.8f)
                lineToRelative(20.25f, 54.0f)
                lineToRelative(20.25f, -54.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 7.5f, 2.8f)
                close()
                moveTo(252.0f, 128.0f)
                arcToRelative(76.08f, 76.08f, 0.0f, false, true, -76.0f, 76.0f)
                lineTo(80.0f, 204.0f)
                arcTo(76.0f, 76.0f, 0.0f, false, true, 80.0f, 52.0f)
                horizontalLineToRelative(96.0f)
                arcTo(76.08f, 76.08f, 0.0f, false, true, 252.0f, 128.0f)
                close()
                moveTo(244.0f, 128.0f)
                arcToRelative(68.07f, 68.07f, 0.0f, false, false, -68.0f, -68.0f)
                lineTo(80.0f, 60.0f)
                arcToRelative(68.0f, 68.0f, 0.0f, false, false, 0.0f, 136.0f)
                horizontalLineToRelative(96.0f)
                arcTo(68.07f, 68.07f, 0.0f, false, false, 244.0f, 128.0f)
                close()
                moveTo(175.5f, 137.06f)
                lineTo(187.5f, 158.06f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -1.49f, 5.45f)
                arcToRelative(3.92f, 3.92f, 0.0f, false, true, -2.0f, 0.53f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.47f, -2.0f)
                lineTo(167.79f, 139.7f)
                arcToRelative(24.85f, 24.85f, 0.0f, false, true, -3.79f, 0.3f)
                lineTo(148.0f, 140.0f)
                verticalLineToRelative(20.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                lineTo(140.0f, 96.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                horizontalLineToRelative(20.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, 11.5f, 45.06f)
                close()
                moveTo(180.0f, 116.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f)
                lineTo(148.0f, 100.0f)
                verticalLineToRelative(32.0f)
                horizontalLineToRelative(16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 180.0f, 116.0f)
                close()
            }
        }
        .build()
        return _virtualReality!!
    }

private var _virtualReality: ImageVector? = null
