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

public val ThinGroup.Images: ImageVector
    get() {
        if (_images != null) {
            return _images!!
        }
        _images = Builder(name = "Images", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 44.0f)
                lineTo(72.0f, 44.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 60.0f, 56.0f)
                lineTo(60.0f, 76.0f)
                lineTo(40.0f, 76.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 28.0f, 88.0f)
                lineTo(28.0f, 200.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                lineTo(184.0f, 212.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(196.0f, 180.0f)
                horizontalLineToRelative(20.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(228.0f, 56.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 216.0f, 44.0f)
                close()
                moveTo(68.0f, 56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                lineTo(216.0f, 52.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                verticalLineToRelative(72.4f)
                lineToRelative(-16.89f, -16.89f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.0f, 0.0f)
                lineToRelative(-22.83f, 22.83f)
                lineTo(116.49f, 87.51f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.0f, 0.0f)
                lineTo(68.0f, 119.0f)
                close()
                moveTo(188.0f, 200.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(40.0f, 204.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                lineTo(36.0f, 88.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                lineTo(60.0f, 84.0f)
                verticalLineToRelative(84.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                lineTo(188.0f, 180.0f)
                close()
                moveTo(216.0f, 172.0f)
                lineTo(72.0f, 172.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                lineTo(68.0f, 130.34f)
                lineToRelative(37.17f, -37.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.66f, 0.0f)
                lineToRelative(49.66f, 49.66f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.65f, 0.0f)
                lineToRelative(25.66f, -25.66f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.66f, 0.0f)
                lineTo(220.0f, 139.71f)
                lineTo(220.0f, 168.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 216.0f, 172.0f)
                close()
                moveTo(164.0f, 84.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 8.0f, 8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 164.0f, 84.0f)
                close()
            }
        }
        .build()
        return _images!!
    }

private var _images: ImageVector? = null
