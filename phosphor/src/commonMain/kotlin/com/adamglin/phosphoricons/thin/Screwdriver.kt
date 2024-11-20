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

public val ThinGroup.Screwdriver: ImageVector
    get() {
        if (_screwdriver != null) {
            return _screwdriver!!
        }
        _screwdriver = Builder(name = "Screwdriver", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(202.83f, 53.15f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 5.66f)
                lineToRelative(-56.0f, 56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.66f, -5.66f)
                lineToRelative(56.0f, -56.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 202.83f, 53.15f)
                close()
                moveTo(244.0f, 58.41f)
                arcToRelative(46.13f, 46.13f, 0.0f, false, true, -13.6f, 32.83f)
                lineToRelative(-53.23f, 53.24f)
                arcToRelative(11.93f, 11.93f, 0.0f, false, true, -8.48f, 3.51f)
                lineTo(152.0f, 147.99f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                verticalLineToRelative(16.83f)
                arcToRelative(12.08f, 12.08f, 0.0f, false, true, -2.44f, 7.25f)
                curveToRelative(-0.11f, 0.14f, -0.23f, 0.28f, -0.35f, 0.41f)
                lineToRelative(-8.0f, 8.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.0f, 0.0f)
                lineTo(98.7f, 163.0f)
                lineTo(18.83f, 242.83f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.66f, -5.66f)
                lineToRelative(79.88f, -79.88f)
                lineTo(71.51f, 135.75f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -17.0f)
                lineToRelative(8.0f, -8.0f)
                arcToRelative(3.62f, 3.62f, 0.0f, false, true, 0.42f, -0.36f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 87.17f, 108.0f)
                lineTo(104.0f, 108.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                lineTo(108.0f, 87.3f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 3.51f, -8.49f)
                lineToRelative(53.24f, -53.23f)
                arcTo(46.43f, 46.43f, 0.0f, false, true, 244.0f, 58.41f)
                close()
                moveTo(236.0f, 58.41f)
                arcToRelative(38.43f, 38.43f, 0.0f, false, false, -65.6f, -27.18f)
                lineTo(117.17f, 84.47f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 116.0f, 87.3f)
                lineTo(116.0f, 104.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                lineTo(87.17f, 116.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.23f, 0.68f)
                lineToRelative(-7.77f, 7.77f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 5.66f)
                lineToRelative(48.72f, 48.72f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.66f, 0.0f)
                lineToRelative(7.77f, -7.77f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.68f, -2.23f)
                lineTo(140.0f, 152.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, -12.0f)
                horizontalLineToRelative(16.69f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.82f, -1.17f)
                lineToRelative(53.24f, -53.24f)
                arcTo(38.21f, 38.21f, 0.0f, false, false, 236.0f, 58.41f)
                close()
            }
        }
        .build()
        return _screwdriver!!
    }

private var _screwdriver: ImageVector? = null
