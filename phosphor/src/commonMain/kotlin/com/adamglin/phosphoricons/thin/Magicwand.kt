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

public val ThinGroup.Magicwand: ImageVector
    get() {
        if (_magicwand != null) {
            return _magicwand!!
        }
        _magicwand = Builder(name = "Magicwand", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(244.0f, 152.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(220.0f, 156.0f)
                verticalLineToRelative(20.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                lineTo(212.0f, 156.0f)
                lineTo(192.0f, 156.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineToRelative(20.0f)
                lineTo(212.0f, 128.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                verticalLineToRelative(20.0f)
                horizontalLineToRelative(20.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 244.0f, 152.0f)
                close()
                moveTo(56.0f, 68.0f)
                lineTo(76.0f, 68.0f)
                lineTo(76.0f, 88.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                lineTo(84.0f, 68.0f)
                horizontalLineToRelative(20.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                lineTo(84.0f, 60.0f)
                lineTo(84.0f, 40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f)
                lineTo(76.0f, 60.0f)
                lineTo(56.0f, 60.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                close()
                moveTo(184.0f, 196.0f)
                lineTo(172.0f, 196.0f)
                lineTo(172.0f, 184.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f)
                verticalLineToRelative(12.0f)
                lineTo(152.0f, 196.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(12.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                lineTo(172.0f, 204.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                close()
                moveTo(216.48f, 77.17f)
                lineTo(77.17f, 216.49f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.0f, 0.0f)
                lineTo(39.51f, 195.8f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -17.0f)
                lineTo(178.83f, 39.51f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, 0.0f)
                lineTo(216.48f, 60.2f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 216.48f, 77.17f)
                close()
                moveTo(170.34f, 112.0f)
                lineTo(144.0f, 85.66f)
                lineTo(45.17f, 184.49f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 5.65f)
                lineToRelative(20.68f, 20.69f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.66f, 0.0f)
                close()
                moveTo(210.83f, 65.86f)
                lineTo(190.14f, 45.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.66f, 0.0f)
                lineTo(149.65f, 80.0f)
                lineTo(176.0f, 106.34f)
                lineToRelative(34.83f, -34.83f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 210.83f, 65.86f)
                close()
            }
        }
        .build()
        return _magicwand!!
    }

private var _magicwand: ImageVector? = null
