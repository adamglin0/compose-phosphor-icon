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

public val ThinGroup.Tshirt: ImageVector
    get() {
        if (_tshirt != null) {
            return _tshirt!!
        }
        _tshirt = Builder(name = "Tshirt", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(245.68f, 64.73f)
                lineTo(193.91f, 36.49f)
                horizontalLineToRelative(0.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 192.0f, 36.0f)
                horizontalLineTo(160.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, -56.0f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.0f)
                horizontalLineTo(64.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -1.9f, 0.5f)
                horizontalLineToRelative(0.0f)
                lineTo(10.32f, 64.73f)
                arcToRelative(11.79f, 11.79f, 0.0f, false, false, -5.0f, 15.89f)
                lineToRelative(19.28f, 36.81f)
                arcToRelative(12.37f, 12.37f, 0.0f, false, false, 11.0f, 6.57f)
                horizontalLineTo(60.0f)
                verticalLineToRelative(84.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                horizontalLineTo(184.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                verticalLineTo(124.0f)
                horizontalLineToRelative(24.33f)
                arcToRelative(12.37f, 12.37f, 0.0f, false, false, 11.0f, -6.57f)
                lineToRelative(19.28f, -36.81f)
                arcTo(11.79f, 11.79f, 0.0f, false, false, 245.68f, 64.73f)
                close()
                moveTo(35.67f, 116.0f)
                arcToRelative(4.46f, 4.46f, 0.0f, false, true, -4.0f, -2.28f)
                lineTo(12.44f, 76.91f)
                arcToRelative(3.79f, 3.79f, 0.0f, false, true, 1.71f, -5.15f)
                lineTo(60.0f, 46.74f)
                verticalLineTo(116.0f)
                close()
                moveTo(188.0f, 208.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                horizontalLineTo(72.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                verticalLineTo(44.0f)
                horizontalLineTo(92.22f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, 71.56f, 0.0f)
                horizontalLineTo(188.0f)
                close()
                moveTo(243.56f, 76.91f)
                lineToRelative(-19.27f, 36.81f)
                arcToRelative(4.46f, 4.46f, 0.0f, false, true, -4.0f, 2.28f)
                horizontalLineTo(196.0f)
                verticalLineTo(46.74f)
                lineToRelative(45.85f, 25.0f)
                arcTo(3.79f, 3.79f, 0.0f, false, true, 243.56f, 76.91f)
                close()
            }
        }
        .build()
        return _tshirt!!
    }

private var _tshirt: ImageVector? = null
